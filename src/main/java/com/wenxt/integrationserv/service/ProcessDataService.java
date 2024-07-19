package com.wenxt.integrationserv.service;

import com.wenxt.integrationserv.dto.ProcedureInput;

import jakarta.servlet.http.HttpServletRequest;

public interface ProcessDataService {

	public String invokeProcedure(String procedureName, String packageName, ProcedureInput procedureInput,
			HttpServletRequest request);

}