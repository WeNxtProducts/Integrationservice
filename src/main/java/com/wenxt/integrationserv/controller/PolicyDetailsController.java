package com.wenxt.integrationserv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.integrationserv.service.PolicyDetailsService;

@RestController
@RequestMapping("/poldetails")
public class PolicyDetailsController {

	@Autowired
	private PolicyDetailsService Poldetailservice;

	@PostMapping("/save")
	public String CreatePolDetails(@RequestBody String payload) {
		return Poldetailservice.CreatePolDetails(payload);

	}
}
