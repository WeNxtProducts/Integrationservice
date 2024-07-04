package com.wenxt.integrationserv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.integrationserv.service.YiSectionService;

@RestController
@RequestMapping("/YiSection")
public class YiSectionController {

	@Autowired
	private YiSectionService yisectionservice;

	@PostMapping("/save")
	public String YiSectionCreate(@RequestBody String payload) {
		return yisectionservice.YiSectionCreate(payload);

	}
}
