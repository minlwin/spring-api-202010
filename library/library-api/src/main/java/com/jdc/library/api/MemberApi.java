package com.jdc.library.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdc.library.model.BaseApi;
import com.jdc.library.model.entity.Member;
import com.jdc.library.model.service.MemberService;

@RestController
@RequestMapping("member")
public class MemberApi extends BaseApi<Member, Integer>{

	public MemberApi(MemberService service) {
		super(service);
	}

}
