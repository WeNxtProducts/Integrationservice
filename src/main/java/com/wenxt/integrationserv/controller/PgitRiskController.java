package com.wenxt.integrationserv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.integrationserv.service.PgitRiskService;

@RestController
@RequestMapping("/pgit")
public class PgitRiskController {

	@Autowired
	private PgitRiskService Pgitservice;

	@PostMapping("/risk-save")
	public String savePgitRisk(@RequestBody String payload) {
		return Pgitservice.savePgitRisk(payload);

	}
}
