package com.wenxt.integrationserv.model;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "YI_POLICY_DETAIL")
public class YiPolicyDetail {

	@Id
	@Column(name = "SERVICE_ID", length = 120)
	private String serviceId;

	@Column(name = "SERVICE_ACTION", length = 120)
	private String serviceAction;

	@Column(name = "QUOTATION_POLICY_NO", length = 180)
	private String quotationPolicyNo;

	@Column(name = "INDEX_NO", length = 15)
	private String indexNo;

	@Column(name = "DIVISION_CODE", length = 36)
	private String divisionCode;

	@Column(name = "PRODUCT", length = 36)
	private String product;

	@Column(name = "POLICY_TYPE", length = 36)
	private String policyType;

	@Column(name = "BUSINESS_TYPE", length = 36)
	private String businessType;

	@Column(name = "CUSTOMER", length = 300)
	private String customer;

	@Column(name = "SOURCE_TYPE", length = 100)
	private String sourceType;

	@Column(name = "SOURCE_CODE", length = 36)
	private String sourceCode;

	@Column(name = "DEPARTMENT", length = 36)
	private String department;

	@Column(name = "POLICY_ISSUE_DT")
	private Timestamp policyIssueDt;

	@Column(name = "PERIOD_FROM")
	private Timestamp periodFrom;

	@Column(name = "PERIOD_TO")
	private Timestamp periodTo;

	@Column(name = "DUR_TYPE", length = 36)
	private String durType;

	@Column(name = "CIVIL_ID", length = 180)
	private String civilId;

	@Column(name = "CONTACT_EMAIL_ID", length = 720)
	private String contactEmailId;

	@Column(name = "CONTACT_NUMBER", length = 720)
	private String contactNumber;

	@Column(name = "CONTACT_PER_NAME", length = 720)
	private String contactPerName;

	@Column(name = "COVER_NOTE_NO", length = 180)
	private String coverNoteNo;

	@Column(name = "PREM_CURR", length = 36)
	private String premCurr;

	@Column(name = "QUOTE_RECEIVED_DT")
	private Timestamp quoteReceivedDt;

	@Column(name = "RA_ALLOCATION_AT", length = 36)
	private String raAllocationAt;

	@Column(name = "RA_APPL_YN", length = 3)
	private String raApplYn;

	@Column(name = "RENEWAL_RECORD_YN", length = 3)
	private String renewalRecordYn;

	@Column(name = "SI_CURR", length = 36)
	private String siCurr;

	@Column(name = "SIC_CODE", length = 36)
	private String sicCode;

	@Column(name = "SIC_GROUP", length = 36)
	private String sicGroup;

	@Column(name = "TERR_ACCEPTED_YN", length = 3)
	private String terrAcceptedYn;

	@Column(name = "TERRITORYJURISDICTION", length = 720)
	private String territoryJurisdiction;

	@Column(name = "TERRORISM_FOR_ALL_RISK", length = 36)
	private String terrorismForAllRisk;

	@Column(name = "CN_ISSUE_DATE")
	private Timestamp cnIssueDate;

	@Column(name = "DONOTRENEWYN", length = 3)
	private String doNotRenewYn;

	@Column(name = "ADVICE_DATE", length = 3)
	private String adviceDate;

	@Column(name = "BOOK_ID")
	private Long bookId;

	@Column(name = "BROKER_REF_NO", length = 180)
	private String brokerRefNo;

	@Column(name = "BROKING_SLIP", length = 720)
	private String brokingSlip;

	@Column(name = "ADDRESS_LINE1", length = 720)
	private String addressLine1;

	@Column(name = "ADDRESS_LINE2", length = 720)
	private String addressLine2;

	@Column(name = "ADDRESS_LINE3", length = 720)
	private String addressLine3;

	@Column(name = "STATE", length = 36)
	private String state;

	@Column(name = "CITY", length = 36)
	private String city;

	@Column(name = "COUNTRY", length = 100)
	private String country;

	@Column(name = "CUST_REF", length = 4000)
	private String custRef;

	@Column(name = "ISSUED_AT", length = 720)
	private String issuedAt;

	@Column(name = "METHOD", length = 36)
	private String method;

	@Column(name = "MODE_OF_PAYMENT", length = 36)
	private String modeOfPayment;

	@Column(name = "FAC_YN", length = 3)
	private String facYn;

	@Column(name = "HYPOTHECATION_YN", length = 100)
	private String hypothecationYn;

	@Column(name = "INSTALLMENT_YN", length = 3)
	private String installmentYn;

	@Column(name = "POLICY_PERIOD", length = 300)
	private String policyPeriod;

	@Column(name = "PRE_INSP_REQ_YN", length = 3)
	private String preInspReqYn;

	@Column(name = "PREM_CALC_TYPE", length = 36)
	private String premCalcType;

	@Column(name = "INSURED_FIRSTNAME", length = 720)
	private String insuredFirstName;

	@Column(name = "INSURED_MIDDLENAME", length = 720)
	private String insuredMiddleName;

	@Column(name = "INSURED_LASTNAME", length = 720)
	private String insuredLastName;

	@Column(name = "INSURED_PHONE_NUMBER", length = 720)
	private String insuredPhoneNumber;

	@Column(name = "INSURED_EMAILID", length = 720)
	private String insuredEmailId;

	@Column(name = "INSURED_OCCUPATION", length = 100)
	private String insuredOccupation;

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

	@Column(name = "REQUESTREFERENCENO", length = 45)
	private String requestReferenceNo;

	@Column(name = "CURRENT_STATUS", length = 150)
	private String currentStatus;

	@Column(name = "CLAIM_INTM_DAYS")
	private Double claimIntmDays;

	@Column(name = "CN_NO_AS_POLICY_NO_YN", length = 30)
	private String cnNoAsPolicyNoYn;

	@Column(name = "INSURED", length = 300)
	private String insured;

	@Column(name = "INTEG_STATUS", length = 300)
	private String integStatus;

	@Column(name = "QUOTATION_TYPE", length = 36)
	private String quotationType;

	@Column(name = "OLD_POLICY_NO", length = 180)
	private String oldPolicyNo;

	@Column(name = "QUOTATION_ISSUE_DT")
	private Timestamp quotationIssueDt;

	@Column(name = "VALIDITY_PERIOD", length = 300)
	private String validityPeriod;

	@Column(name = "UW_ID", length = 300)
	private String uwId;

	@Column(name = "PREM_WARRENTY_YN", length = 15)
	private String premWarrentyYn;

	@Column(name = "EXCESS_OF_LOSS_INDICATOR", length = 30)
	private String excessOfLossIndicator;

	@Column(name = "INDIVIDUAL_AC_NO", length = 180)
	private String individualAcNo;

	@Column(name = "SEC_CODE", length = 150)
	private String secCode;

	@Column(name = "POL_FLEET_YN", length = 150)
	private String polFleetYn;

	@Column(name = "PAY_MODE", length = 30)
	private String payMode;

	@Column(name = "BANK_NAME", length = 600)
	private String bankName;

	@Column(name = "BRANCH_NAME", length = 600)
	private String branchName;

	@Column(name = "DATE_OF_COLLECTION")
	private Timestamp dateOfCollection;

	@Column(name = "CHEQUE_NO", length = 300)
	private String chequeNo;

	@Column(name = "CHEQUE_DATE")
	private Timestamp chequeDate;

	@Column(name = "CREDIT_CARD_NO", length = 300)
	private String creditCardNo;

	@Column(name = "CARD_TYPE", length = 150)
	private String cardType;

	@Column(name = "AUTHORIZATION_CODE", length = 150)
	private String authorizationCode;

	@Column(name = "TRANSACTION_ID", length = 180)
	private String transactionId;

	@Column(name = "TRANSACTION_DATE")
	private Timestamp transactionDate;

	@Column(name = "REQUEST_USER_ID", length = 39)
	private String requestUserId;

	@Column(name = "NET_PREMIUM", length = 150)
	private String netPremium;

	@Column(name = "INSURED_WILAYAT", length = 750)
	private String insuredWilayat;

	@Column(name = "INSURED_VISA_STATUS", length = 750)
	private String insuredVisaStatus;

	@Column(name = "PROMOCODE", length = 150)
	private String promoCode;

	@Column(name = "POL_CUST_CODE", length = 50)
	private String polCustCode;

	@Column(name = "POL_NO_RISK")
	private Long polNoRisk;

	@Column(name = "ASSR_CODE_YN")
	private Integer assrCodeYn;

	@Column(name = "NET_PREMIUM_FC")
	private Double netPremiumFc;

	@Column(name = "COMPANY_ID", length = 50)
	private String companyId;

	@Column(name = "DS_TYPE", length = 12)
	private String dsType;

	@Column(name = "DS_CODE", length = 12)
	private String dsCode;

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

	public String getIndexNo() {
		return indexNo;
	}

	public void setIndexNo(String indexNo) {
		this.indexNo = indexNo;
	}

	public String getDivisionCode() {
		return divisionCode;
	}

	public void setDivisionCode(String divisionCode) {
		this.divisionCode = divisionCode;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getPolicyType() {
		return policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	public String getBusinessType() {
		return businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getSourceType() {
		return sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

	public String getSourceCode() {
		return sourceCode;
	}

	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Timestamp getPolicyIssueDt() {
		return policyIssueDt;
	}

	public void setPolicyIssueDt(Timestamp policyIssueDt) {
		this.policyIssueDt = policyIssueDt;
	}

	public Timestamp getPeriodFrom() {
		return periodFrom;
	}

	public void setPeriodFrom(Timestamp periodFrom) {
		this.periodFrom = periodFrom;
	}

	public Timestamp getPeriodTo() {
		return periodTo;
	}

	public void setPeriodTo(Timestamp periodTo) {
		this.periodTo = periodTo;
	}

	public String getDurType() {
		return durType;
	}

	public void setDurType(String durType) {
		this.durType = durType;
	}

	public String getCivilId() {
		return civilId;
	}

	public void setCivilId(String civilId) {
		this.civilId = civilId;
	}

	public String getContactEmailId() {
		return contactEmailId;
	}

	public void setContactEmailId(String contactEmailId) {
		this.contactEmailId = contactEmailId;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getContactPerName() {
		return contactPerName;
	}

	public void setContactPerName(String contactPerName) {
		this.contactPerName = contactPerName;
	}

	public String getCoverNoteNo() {
		return coverNoteNo;
	}

	public void setCoverNoteNo(String coverNoteNo) {
		this.coverNoteNo = coverNoteNo;
	}

	public String getPremCurr() {
		return premCurr;
	}

	public void setPremCurr(String premCurr) {
		this.premCurr = premCurr;
	}

	public Timestamp getQuoteReceivedDt() {
		return quoteReceivedDt;
	}

	public void setQuoteReceivedDt(Timestamp quoteReceivedDt) {
		this.quoteReceivedDt = quoteReceivedDt;
	}

	public String getRaAllocationAt() {
		return raAllocationAt;
	}

	public void setRaAllocationAt(String raAllocationAt) {
		this.raAllocationAt = raAllocationAt;
	}

	public String getRaApplYn() {
		return raApplYn;
	}

	public void setRaApplYn(String raApplYn) {
		this.raApplYn = raApplYn;
	}

	public String getRenewalRecordYn() {
		return renewalRecordYn;
	}

	public void setRenewalRecordYn(String renewalRecordYn) {
		this.renewalRecordYn = renewalRecordYn;
	}

	public String getSiCurr() {
		return siCurr;
	}

	public void setSiCurr(String siCurr) {
		this.siCurr = siCurr;
	}

	public String getSicCode() {
		return sicCode;
	}

	public void setSicCode(String sicCode) {
		this.sicCode = sicCode;
	}

	public String getSicGroup() {
		return sicGroup;
	}

	public void setSicGroup(String sicGroup) {
		this.sicGroup = sicGroup;
	}

	public String getTerrAcceptedYn() {
		return terrAcceptedYn;
	}

	public void setTerrAcceptedYn(String terrAcceptedYn) {
		this.terrAcceptedYn = terrAcceptedYn;
	}

	public String getTerritoryJurisdiction() {
		return territoryJurisdiction;
	}

	public void setTerritoryJurisdiction(String territoryJurisdiction) {
		this.territoryJurisdiction = territoryJurisdiction;
	}

	public String getTerrorismForAllRisk() {
		return terrorismForAllRisk;
	}

	public void setTerrorismForAllRisk(String terrorismForAllRisk) {
		this.terrorismForAllRisk = terrorismForAllRisk;
	}

	public Timestamp getCnIssueDate() {
		return cnIssueDate;
	}

	public void setCnIssueDate(Timestamp cnIssueDate) {
		this.cnIssueDate = cnIssueDate;
	}

	public String getDoNotRenewYn() {
		return doNotRenewYn;
	}

	public void setDoNotRenewYn(String doNotRenewYn) {
		this.doNotRenewYn = doNotRenewYn;
	}

	public String getAdviceDate() {
		return adviceDate;
	}

	public void setAdviceDate(String adviceDate) {
		this.adviceDate = adviceDate;
	}

	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public String getBrokerRefNo() {
		return brokerRefNo;
	}

	public void setBrokerRefNo(String brokerRefNo) {
		this.brokerRefNo = brokerRefNo;
	}

	public String getBrokingSlip() {
		return brokingSlip;
	}

	public void setBrokingSlip(String brokingSlip) {
		this.brokingSlip = brokingSlip;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getAddressLine3() {
		return addressLine3;
	}

	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCustRef() {
		return custRef;
	}

	public void setCustRef(String custRef) {
		this.custRef = custRef;
	}

	public String getIssuedAt() {
		return issuedAt;
	}

	public void setIssuedAt(String issuedAt) {
		this.issuedAt = issuedAt;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getModeOfPayment() {
		return modeOfPayment;
	}

	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}

	public String getFacYn() {
		return facYn;
	}

	public void setFacYn(String facYn) {
		this.facYn = facYn;
	}

	public String getHypothecationYn() {
		return hypothecationYn;
	}

	public void setHypothecationYn(String hypothecationYn) {
		this.hypothecationYn = hypothecationYn;
	}

	public String getInstallmentYn() {
		return installmentYn;
	}

	public void setInstallmentYn(String installmentYn) {
		this.installmentYn = installmentYn;
	}

	public String getPolicyPeriod() {
		return policyPeriod;
	}

	public void setPolicyPeriod(String policyPeriod) {
		this.policyPeriod = policyPeriod;
	}

	public String getPreInspReqYn() {
		return preInspReqYn;
	}

	public void setPreInspReqYn(String preInspReqYn) {
		this.preInspReqYn = preInspReqYn;
	}

	public String getPremCalcType() {
		return premCalcType;
	}

	public void setPremCalcType(String premCalcType) {
		this.premCalcType = premCalcType;
	}

	public String getInsuredFirstName() {
		return insuredFirstName;
	}

	public void setInsuredFirstName(String insuredFirstName) {
		this.insuredFirstName = insuredFirstName;
	}

	public String getInsuredMiddleName() {
		return insuredMiddleName;
	}

	public void setInsuredMiddleName(String insuredMiddleName) {
		this.insuredMiddleName = insuredMiddleName;
	}

	public String getInsuredLastName() {
		return insuredLastName;
	}

	public void setInsuredLastName(String insuredLastName) {
		this.insuredLastName = insuredLastName;
	}

	public String getInsuredPhoneNumber() {
		return insuredPhoneNumber;
	}

	public void setInsuredPhoneNumber(String insuredPhoneNumber) {
		this.insuredPhoneNumber = insuredPhoneNumber;
	}

	public String getInsuredEmailId() {
		return insuredEmailId;
	}

	public void setInsuredEmailId(String insuredEmailId) {
		this.insuredEmailId = insuredEmailId;
	}

	public String getInsuredOccupation() {
		return insuredOccupation;
	}

	public void setInsuredOccupation(String insuredOccupation) {
		this.insuredOccupation = insuredOccupation;
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

	public String getCurrentStatus() {
		return currentStatus;
	}

	public void setCurrentStatus(String currentStatus) {
		this.currentStatus = currentStatus;
	}

	public Double getClaimIntmDays() {
		return claimIntmDays;
	}

	public void setClaimIntmDays(Double claimIntmDays) {
		this.claimIntmDays = claimIntmDays;
	}

	public String getCnNoAsPolicyNoYn() {
		return cnNoAsPolicyNoYn;
	}

	public void setCnNoAsPolicyNoYn(String cnNoAsPolicyNoYn) {
		this.cnNoAsPolicyNoYn = cnNoAsPolicyNoYn;
	}

	public String getInsured() {
		return insured;
	}

	public void setInsured(String insured) {
		this.insured = insured;
	}

	public String getIntegStatus() {
		return integStatus;
	}

	public void setIntegStatus(String integStatus) {
		this.integStatus = integStatus;
	}

	public String getQuotationType() {
		return quotationType;
	}

	public void setQuotationType(String quotationType) {
		this.quotationType = quotationType;
	}

	public String getOldPolicyNo() {
		return oldPolicyNo;
	}

	public void setOldPolicyNo(String oldPolicyNo) {
		this.oldPolicyNo = oldPolicyNo;
	}

	public Timestamp getQuotationIssueDt() {
		return quotationIssueDt;
	}

	public void setQuotationIssueDt(Timestamp quotationIssueDt) {
		this.quotationIssueDt = quotationIssueDt;
	}

	public String getValidityPeriod() {
		return validityPeriod;
	}

	public void setValidityPeriod(String validityPeriod) {
		this.validityPeriod = validityPeriod;
	}

	public String getUwId() {
		return uwId;
	}

	public void setUwId(String uwId) {
		this.uwId = uwId;
	}

	public String getPremWarrentyYn() {
		return premWarrentyYn;
	}

	public void setPremWarrentyYn(String premWarrentyYn) {
		this.premWarrentyYn = premWarrentyYn;
	}

	public String getExcessOfLossIndicator() {
		return excessOfLossIndicator;
	}

	public void setExcessOfLossIndicator(String excessOfLossIndicator) {
		this.excessOfLossIndicator = excessOfLossIndicator;
	}

	public String getIndividualAcNo() {
		return individualAcNo;
	}

	public void setIndividualAcNo(String individualAcNo) {
		this.individualAcNo = individualAcNo;
	}

	public String getSecCode() {
		return secCode;
	}

	public void setSecCode(String secCode) {
		this.secCode = secCode;
	}

	public String getPolFleetYn() {
		return polFleetYn;
	}

	public void setPolFleetYn(String polFleetYn) {
		this.polFleetYn = polFleetYn;
	}

	public String getPayMode() {
		return payMode;
	}

	public void setPayMode(String payMode) {
		this.payMode = payMode;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public Timestamp getDateOfCollection() {
		return dateOfCollection;
	}

	public void setDateOfCollection(Timestamp dateOfCollection) {
		this.dateOfCollection = dateOfCollection;
	}

	public String getChequeNo() {
		return chequeNo;
	}

	public void setChequeNo(String chequeNo) {
		this.chequeNo = chequeNo;
	}

	public Timestamp getChequeDate() {
		return chequeDate;
	}

	public void setChequeDate(Timestamp chequeDate) {
		this.chequeDate = chequeDate;
	}

	public String getCreditCardNo() {
		return creditCardNo;
	}

	public void setCreditCardNo(String creditCardNo) {
		this.creditCardNo = creditCardNo;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getAuthorizationCode() {
		return authorizationCode;
	}

	public void setAuthorizationCode(String authorizationCode) {
		this.authorizationCode = authorizationCode;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public Timestamp getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Timestamp transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getRequestUserId() {
		return requestUserId;
	}

	public void setRequestUserId(String requestUserId) {
		this.requestUserId = requestUserId;
	}

	public String getNetPremium() {
		return netPremium;
	}

	public void setNetPremium(String netPremium) {
		this.netPremium = netPremium;
	}

	public String getInsuredWilayat() {
		return insuredWilayat;
	}

	public void setInsuredWilayat(String insuredWilayat) {
		this.insuredWilayat = insuredWilayat;
	}

	public String getInsuredVisaStatus() {
		return insuredVisaStatus;
	}

	public void setInsuredVisaStatus(String insuredVisaStatus) {
		this.insuredVisaStatus = insuredVisaStatus;
	}

	public String getPromoCode() {
		return promoCode;
	}

	public void setPromoCode(String promoCode) {
		this.promoCode = promoCode;
	}

	public String getPolCustCode() {
		return polCustCode;
	}

	public void setPolCustCode(String polCustCode) {
		this.polCustCode = polCustCode;
	}

	public Long getPolNoRisk() {
		return polNoRisk;
	}

	public void setPolNoRisk(Long polNoRisk) {
		this.polNoRisk = polNoRisk;
	}

	public Integer getAssrCodeYn() {
		return assrCodeYn;
	}

	public void setAssrCodeYn(Integer assrCodeYn) {
		this.assrCodeYn = assrCodeYn;
	}

	public Double getNetPremiumFc() {
		return netPremiumFc;
	}

	public void setNetPremiumFc(Double netPremiumFc) {
		this.netPremiumFc = netPremiumFc;
	}

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getDsType() {
		return dsType;
	}

	public void setDsType(String dsType) {
		this.dsType = dsType;
	}

	public String getDsCode() {
		return dsCode;
	}

	public void setDsCode(String dsCode) {
		this.dsCode = dsCode;
	}

}