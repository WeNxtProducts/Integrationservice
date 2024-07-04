package com.wenxt.integrationserv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.integrationserv.service.YiCoverService;



@RestController
@RequestMapping("/YiCover")
public class YiCoverController {
	@Autowired
	private YiCoverService coverservice;

	@PostMapping("/save")
	public String saveAll(@RequestBody String payload) {
		return coverservice.saveAllCover(payload);

	}
}