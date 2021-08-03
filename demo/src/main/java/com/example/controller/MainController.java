package com.example.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@PostMapping(path = "/publish/message/utility/API" , consumes = "application/json")
	public FulfillmentOutcomeManagerBean publishToMessagePrepareUtilityAPI(@RequestBody FulfillmentOutcomeManagerBean fulfillMnetBean) {
		System.out.println("fulfillMnetBean : "+fulfillMnetBean);
		return fulfillMnetBean;
	}
}
