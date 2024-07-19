package com.wenxt.integrationserv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.integrationserv.dto.ProcedureInput;
import com.wenxt.integrationserv.service.ProcessDataService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/common")
public class ProcessDataController {
	
	@Autowired
	private ProcessDataService service;
	
	@PostMapping("/invokeProcedure")
	public String invokeProcedure(@RequestParam String procedureName, @RequestParam(required = false)String packageName, @RequestBody ProcedureInput procedureInput, HttpServletRequest request) {
		try {
			return service.invokeProcedure(procedureName, packageName, procedureInput, request);
			}catch(Exception e) {
				e.printStackTrace();
				return e.getMessage();
			}
	}
}