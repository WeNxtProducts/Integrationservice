package com.wenxt.integrationserv.dto;

public class ProcedureRequest {
	private String procedureName;
	private String packageName;
	private ProcedureInput procedureInput;

	// Getters and setters
	public String getProcedureName() {
		return procedureName;
	}

	public void setProcedureName(String procedureName) {
		this.procedureName = procedureName;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public ProcedureInput getProcedureInput() {
		return procedureInput;
	}

	public void setProcedureInput(ProcedureInput procedureInput) {
		this.procedureInput = procedureInput;
	}
}
