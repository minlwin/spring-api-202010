package com.jdc.library.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdc.library.model.BaseApi;
import com.jdc.library.model.entity.MemberType;
import com.jdc.library.model.service.MemberTypeService;

@RestController
@RequestMapping("member-type")
public class MemberTypeApi extends BaseApi<MemberType, Integer>{

	@Autowired
	public MemberTypeApi(MemberTypeService service) {
		super(service);
	}

}
