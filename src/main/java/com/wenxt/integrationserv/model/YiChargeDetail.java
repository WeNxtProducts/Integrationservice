package com.wenxt.integrationserv.model;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "YI_CHARGE_DETAIL")
public class YiChargeDetail {

	@Column(name = "CHARGE_CODE",nullable = false)
	private String chargeCode;

	@Column(name = "SERVICE_ID")
	private String serviceId;

	@Column(name = "QUOTATION_POLICY_NO")
	private String quotationPolicyNo;

	@Column(name = "SERVICE_ACTION")
	private String serviceAction;

	@Column(name = "CHG_ID")
	private Long chgId;

	@Column(name = "INDEX_NO")
	private String indexNo;

	@Column(name = "CHARGE_RATE")
	private Double chargeRate;

	@Column(name = "RATE_MODIFIED_YN")
	private String rateModifiedYn;

	@Column(name = "CHARGE_AMOUNT")
	private Double chargeAmount;

	@Column(name = "CHARGE_MODIFIED_YN", length = 15)
	private String chargeModifiedYn;

	@Id
	@Column(name = "REQUESTREFERENCENO", length = 45, nullable = false)
	private String requestReferenceNo;

	@Column(name = "PROD_CODE", length = 36)
	private String prodCode;

	@Column(name = "P_WS_RESPONSE_TYPE", length = 150)
	private String pWsResponseType;

	@Column(name = "P_WS_ERROR", length = 1000)
	private String pWsError;

	@Column(name = "REQUEST_TIME")
	private Timestamp requestTime;

	@Column(name = "RESPONSE_TIME")
	private Timestamp responseTime;

	@Column(name = "STATUS", length = 30)
	private String status;

	public String getChargeCode() {
		return chargeCode;
	}

	public void setChargeCode(String chargeCode) {
		this.chargeCode = chargeCode;
	}

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getQuotationPolicyNo() {
		return quotationPolicyNo;
	}

	public void setQuotationPolicyNo(String quotationPolicyNo) {
		this.quotationPolicyNo = quotationPolicyNo;
	}

	public String getServiceAction() {
		return serviceAction;
	}

	public void setServiceAction(String serviceAction) {
		this.serviceAction = serviceAction;
	}

	public Long getChgId() {
		return chgId;
	}

	public void setChgId(Long chgId) {
		this.chgId = chgId;
	}

	public String getIndexNo() {
		return indexNo;
	}

	public void setIndexNo(String indexNo) {
		this.indexNo = indexNo;
	}

	public Double getChargeRate() {
		return chargeRate;
	}

	public void setChargeRate(Double chargeRate) {
		this.chargeRate = chargeRate;
	}

	public String getRateModifiedYn() {
		return rateModifiedYn;
	}

	public void setRateModifiedYn(String rateModifiedYn) {
		this.rateModifiedYn = rateModifiedYn;
	}

	public Double getChargeAmount() {
		return chargeAmount;
	}

	public void setChargeAmount(Double chargeAmount) {
		this.chargeAmount = chargeAmount;
	}

	public String getChargeModifiedYn() {
		return chargeModifiedYn;
	}

	public void setChargeModifiedYn(String chargeModifiedYn) {
		this.chargeModifiedYn = chargeModifiedYn;
	}

	public String getRequestReferenceNo() {
		return requestReferenceNo;
	}

	public void setRequestReferenceNo(String requestReferenceNo) {
		this.requestReferenceNo = requestReferenceNo;
	}

	public String getProdCode() {
		return prodCode;
	}

	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
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


}
