package com.wenxt.integrationserv.model;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "YI_COVER_DETAIL")
public class YiCoverDetail {

	@Id
	@Column(name = "QUOTATION_POLICY_NO", length = 100, nullable = false)
	private String quotationPolicyNo;

	@Column(name = "SERVICE_ID", length = 100)
	private String serviceId;

	@Column(name = "SERVICE_ACTION", length = 100)
	private String serviceAction;

	@Column(name = "SEC_CODE", length = 100)
	private String secCode;

	@Column(name = "L1S1_ID")
	private Double l1s1Id;

	@Column(name = "CVR_ID", nullable = false)
	private Double cvrId;

	@Column(name = "COVER_CODE", length = 100)
	private String coverCode;

	@Column(name = "SUM_INSURED")
	private Double sumInsured;

	@Column(name = "ITERATION_NO", length = 100)
	private String iterationNo;

	@Column(name = "SI_MODIFIED_YN", length = 1)
	private String siModifiedYn;

	@Column(name = "RATE")
	private Double rate;

	@Column(name = "RATE_MODIFIED_YN", length = 1)
	private String rateModifiedYn;

	@Column(name = "PREMIUM")
	private Double premium;

	@Column(name = "PREMIUM_MODIFIED_YN", length = 1)
	private String premiumModifiedYn;

	@Column(name = "REQUEST_TIME")
	private Timestamp requestTime;

	@Column(name = "RESPONSE_TIME")
	private Timestamp responseTime;

	@Column(name = "STATUS", length = 10)
	private String status;

	@Column(name = "P_WS_RESPONSE_TYPE", length = 100)
	private String pWsResponseType;

	@Column(name = "P_WS_ERROR", length = 1000)
	private String pWsError;

	@Column(name = "REQUESTREFERENCENO", length = 15)
	private String requestReferenceNo;

	@Column(name = "RENEWAL_POLICY_NO", length = 100)
	private String renewalPolicyNo;

	@Column(name = "RENEWAL_CURRENT_STATUS", length = 100)
	private String renewalCurrentStatus;

	@Column(name = "PROD_CODE", length = 50)
	private String prodCode;

	@Column(name = "SERVICE_TYPE", length = 100)
	private String serviceType;

	@Column(name = "COVER_DESC", length = 255)
	private String coverDesc;

	@Column(name = "RISK_ID", nullable = false)
	private Long riskId;

	public String getQuotationPolicyNo() {
		return quotationPolicyNo;
	}

	public void setQuotationPolicyNo(String quotationPolicyNo) {
		this.quotationPolicyNo = quotationPolicyNo;
	}

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

	public String getSecCode() {
		return secCode;
	}

	public void setSecCode(String secCode) {
		this.secCode = secCode;
	}

	public Double getL1s1Id() {
		return l1s1Id;
	}

	public void setL1s1Id(Double l1s1Id) {
		this.l1s1Id = l1s1Id;
	}

	public Double getCvrId() {
		return cvrId;
	}

	public void setCvrId(Double cvrId) {
		this.cvrId = cvrId;
	}

	public String getCoverCode() {
		return coverCode;
	}

	public void setCoverCode(String coverCode) {
		this.coverCode = coverCode;
	}

	public Double getSumInsured() {
		return sumInsured;
	}

	public void setSumInsured(Double sumInsured) {
		this.sumInsured = sumInsured;
	}

	public String getIterationNo() {
		return iterationNo;
	}

	public void setIterationNo(String iterationNo) {
		this.iterationNo = iterationNo;
	}

	public String getSiModifiedYn() {
		return siModifiedYn;
	}

	public void setSiModifiedYn(String siModifiedYn) {
		this.siModifiedYn = siModifiedYn;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public String getRateModifiedYn() {
		return rateModifiedYn;
	}

	public void setRateModifiedYn(String rateModifiedYn) {
		this.rateModifiedYn = rateModifiedYn;
	}

	public Double getPremium() {
		return premium;
	}

	public void setPremium(Double premium) {
		this.premium = premium;
	}

	public String getPremiumModifiedYn() {
		return premiumModifiedYn;
	}

	public void setPremiumModifiedYn(String premiumModifiedYn) {
		this.premiumModifiedYn = premiumModifiedYn;
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

	public String getRenewalPolicyNo() {
		return renewalPolicyNo;
	}

	public void setRenewalPolicyNo(String renewalPolicyNo) {
		this.renewalPolicyNo = renewalPolicyNo;
	}

	public String getRenewalCurrentStatus() {
		return renewalCurrentStatus;
	}

	public void setRenewalCurrentStatus(String renewalCurrentStatus) {
		this.renewalCurrentStatus = renewalCurrentStatus;
	}

	public String getProdCode() {
		return prodCode;
	}

	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getCoverDesc() {
		return coverDesc;
	}

	public void setCoverDesc(String coverDesc) {
		this.coverDesc = coverDesc;
	}

	public Long getRiskId() {
		return riskId;
	}

	public void setRiskId(Long riskId) {
		this.riskId = riskId;
	}



}
