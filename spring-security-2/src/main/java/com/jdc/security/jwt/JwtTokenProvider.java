package com.jdc.security.jwt;

import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import javax.crypto.SecretKey;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@Service
public class JwtTokenProvider {
	
	private SecretKey key = Keys.secretKeyFor(SignatureAlgorithm.HS512);

	public String generate(String name, Collection<? extends GrantedAuthority> authorities) {
		
		Calendar expireAt = Calendar.getInstance();
		expireAt.add(Calendar.MINUTE, 10);
		
		return Jwts.builder()
				.setSubject(name)
				.setIssuer("JDC Angular Class")
				.setIssuedAt(new Date())
				.setExpiration(expireAt.getTime())
				.claim("rol", authorities.stream().map(a -> a.getAuthority()).collect(Collectors.toList()))
				.signWith(key)
				.compact();
	}

	@SuppressWarnings("unchecked")
	public Authentication authenticate(String token) {
		
		if(StringUtils.hasLength(token)) {
			Jws<Claims> jws = Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(token);
			List<String> list = (List<String>) jws.getBody().get("rol");
			return new UsernamePasswordAuthenticationToken(
					jws.getBody().getSubject(), 
					null,  
					list.stream().map(SimpleGrantedAuthority::new).collect(Collectors.toList()));
		}
		
		return null;
	}

}
