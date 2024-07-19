package com.wenxt.integrationserv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.integrationserv.dto.ProcedureRequest;
import com.wenxt.integrationserv.service.ProcessDataService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/common")
public class ProcessDataController {

	@Autowired
	private ProcessDataService service;

	@PostMapping("/invokeProcedure")
	public String invokeProcedure(@RequestBody ProcedureRequest request, HttpServletRequest httpRequest) {
		try {
			return service.invokeProcedure(request.getProcedureName(), request.getPackageName(),
					request.getProcedureInput(), httpRequest);
		} catch (Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}
	}

}