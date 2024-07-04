package com.wenxt.integrationserv.model;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "YI_SECTION_DETAIL", schema = "PHOENIX_SW_P11")
public class YiSectionDetail {

    @Column(name = "SERVICE_ID", length = 300)
    private String serviceId;

    @Column(name = "SERVICE_ACTION", length = 300)
    private String serviceAction;

    @Column(name = "QUOTATION_POLICY_NO", length = 300)
    private String quotationPolicyNo;

    @Column(name = "SR_NO")
    private Double srNo;

    @Column(name = "SECTION_CODE", length = 300)
    private String sectionCode;

    @Column(name = "ITERATION_NO", length = 60)
    private String iterationNo;

    @Column(name = "REQUEST_TIME")
    private Timestamp requestTime;

    @Column(name = "RESPONSE_TIME")
    private Timestamp responseTime;

    @Column(name = "STATUS", length = 30)
    private String status;

    @Column(name = "P_WS_RESPONSE_TYPE", length = 300)
    private String pWsResponseType;

    @Column(name = "P_WS_ERROR", length = 1000)
    private String pWsError;

    @Id
    @Column(name = "REQUESTREFERENCENO", length = 45)
    private String requestReferenceNo;

    @Column(name = "PRODUCT_CODE", length = 150)
    private String productCode;

    @Column(name = "SCHEME_DESC", length = 150)
    private String schemeDesc;

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getServiceAction() {
		return serviceAction;
	}

	public void setServiceAction(String serviceAction) {
		this.serviceAction = serviceAction;
	}

	public String getQuotationPolicyNo() {
		return quotationPolicyNo;
	}

	public void setQuotationPolicyNo(String quotationPolicyNo) {
		this.quotationPolicyNo = quotationPolicyNo;
	}

	public Double getSrNo() {
		return srNo;
	}

	public void setSrNo(Double srNo) {
		this.srNo = srNo;
	}

	public String getSectionCode() {
		return sectionCode;
	}

	public void setSectionCode(String sectionCode) {
		this.sectionCode = sectionCode;
	}

	public String getIterationNo() {
		return iterationNo;
	}

	public void setIterationNo(String iterationNo) {
		this.iterationNo = iterationNo;
	}

	public Timestamp getRequestTime() {
		return requestTime;
	}

	public void setRequestTime(Timestamp requestTime) {
		this.requestTime = requestTime;
	}

	public Timestamp getResponseTime() {
		return responseTime;
	}

	public void setResponseTime(Timestamp responseTime) {
		this.responseTime = responseTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getpWsResponseType() {
		return pWsResponseType;
	}

	public void setpWsResponseType(String pWsResponseType) {
		this.pWsResponseType = pWsResponseType;
	}

	public String getpWsError() {
		return pWsError;
	}

	public void setpWsError(String pWsError) {
		this.pWsError = pWsError;
	}

	public String getRequestReferenceNo() {
		return requestReferenceNo;
	}

	public void setRequestReferenceNo(String requestReferenceNo) {
		this.requestReferenceNo = requestReferenceNo;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getSchemeDesc() {
		return schemeDesc;
	}

	public void setSchemeDesc(String schemeDesc) {
		this.schemeDesc = schemeDesc;
	}

    
}
