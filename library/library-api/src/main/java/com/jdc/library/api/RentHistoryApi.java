package com.jdc.library.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdc.library.model.BaseApi;
import com.jdc.library.model.entity.RentHistory;
import com.jdc.library.model.service.RentService;

@RestController
@RequestMapping("rent")
public class RentHistoryApi extends BaseApi<RentHistory, Long>{

	public RentHistoryApi(RentService service) {
		super(service);
	}

}
