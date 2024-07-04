package com.wenxt.integrationserv.model;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "PGIT_POL_RISK_ADDL_INFO")
public class PGIT_POL_RISK_ADDL_INFO {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "PRAI_SYS_ID")
private Long praiSysId;

@Column(name = "PRAI_POL_SYS_ID")
private Long praiPolSysId;

@Column(name = "PRAI_END_NO_IDX")
private Integer praiEndNoIdx;

@Column(name = "PRAI_END_SR_NO")
private Integer praiEndSrNo;

@Column(name = "PRAI_PSEC_SYS_ID")
private Long praiPsecSysId;

@Column(name = "PRAI_RISK_LVL_NO")
private Integer praiRiskLvlNo;

@Column(name = "PRAI_LVL1_SYS_ID")
private Long praiLvl1SysId;

@Column(name = "PRAI_LVL1_SR_NO")
private Integer praiLvl1SrNo;

@Column(name = "PRAI_LVL2_SYS_ID")
private Long praiLvl2SysId;

@Column(name = "PRAI_LVL2_SR_NO")
private Integer praiLvl2SrNo;

@Column(name = "PRAI_LVL3_SYS_ID")
private Long praiLvl3SysId;

@Column(name = "PRAI_LVL3_SR_NO")
private Integer praiLvl3SrNo;

@Column(name = "PRAI_LVL4_SYS_ID")
private Long praiLvl4SysId;

@Column(name = "PRAI_LVL4_SR_NO")
private Integer praiLvl4SrNo;

@Column(name = "PRAI_LVL5_SYS_ID")
private Long praiLvl5SysId;

@Column(name = "PRAI_LVL5_SR_NO")
private Integer praiLvl5SrNo;

@Column(name = "PRAI_SI_CURR_CODE")
private String praiSiCurrCode;

@Column(name = "PRAI_PREM_CURR_CODE")
private String praiPremCurrCode;

@Column(name = "PRAI_SI_FC")
private BigDecimal praiSiFc;

@Column(name = "PRAI_SI_LC_1")
private BigDecimal praiSiLc1;

@Column(name = "PRAI_SI_LC_2")
private BigDecimal praiSiLc2;

@Column(name = "PRAI_SI_LC_3")
private BigDecimal praiSiLc3;

@Column(name = "PRAI_ORG_SI_FC")
private BigDecimal praiOrgSiFc;

@Column(name = "PRAI_ORG_SI_LC_1")
private BigDecimal praiOrgSiLc1;

@Column(name = "PRAI_ORG_SI_LC_2")
private BigDecimal praiOrgSiLc2;

@Column(name = "PRAI_ORG_SI_LC_3")
private BigDecimal praiOrgSiLc3;

@Column(name = "PRAI_PREM_FC")
private BigDecimal praiPremFc;

@Column(name = "PRAI_PREM_LC_1")
private BigDecimal praiPremLc1;

@Column(name = "PRAI_PREM_LC_2")
private BigDecimal praiPremLc2;

@Column(name = "PRAI_PREM_LC_3")
private BigDecimal praiPremLc3;

@Column(name = "PRAI_ORG_PREM_FC")
private BigDecimal praiOrgPremFc;

@Column(name = "PRAI_ORG_PREM_LC_1")
private BigDecimal praiOrgPremLc1;

@Column(name = "PRAI_ORG_PREM_LC_2")
private BigDecimal praiOrgPremLc2;

@Column(name = "PRAI_ORG_PREM_LC_3")
private BigDecimal praiOrgPremLc3;

@Column(name = "PRAI_CUM_BONUS_PERC")
private BigDecimal praiCumBonusPerc;

@Column(name = "PRAI_CUM_BONUS_FC")
private BigDecimal praiCumBonusFc;

@Column(name = "PRAI_CUM_BONUS_LC_1")
private BigDecimal praiCumBonusLc1;

@Column(name = "PRAI_CUM_BONUS_LC_2")
private BigDecimal praiCumBonusLc2;

@Column(name = "PRAI_CUM_BONUS_LC_3")
private BigDecimal praiCumBonusLc3;

@Column(name = "PRAI_SILENT_YN")
private String praiSilentYn;

@Column(name = "PRAI_SILENT_FM_DT")
@Temporal(TemporalType.DATE)
private Date praiSilentFmDt;

@Column(name = "PRAI_SILENT_TO_DT")
@Temporal(TemporalType.DATE)
private Date praiSilentToDt;

@Column(name = "PRAI_SERVICE_TAX_YN")
private String praiServiceTaxYn;

@Column (name="PRAI_RISK_SR_NO")
private Integer praiRiskSrno;

@Column(name = "PRAI_REC_TYPE")
private String praiRecType;

@Column(name = "PRAI_EFF_FM_DT")
@Temporal(TemporalType.DATE)
private Date praiEffFmDt;

@Column(name = "PRAI_EFF_TO_DT")
@Temporal(TemporalType.DATE)
private Date praiEffToDt;

@Column(name = "PRAI_END_EFF_FM_DT")
@Temporal(TemporalType.DATE)
private Date praiEndEffFmDt;

@Column(name = "PRAI_CODE_01")
private String praiCode01;

@Column(name = "PRAI_CODE_02")
private String praiCode02;

@Column(name = "PRAI_CODE_03")
private String praiCode03;

@Column(name = "PRAI_CODE_04")
private String praiCode04;

@Column(name = "PRAI_CODE_05")
private String praiCode05;

@Column(name = "PRAI_CODE_06")
private String praiCode06;

@Column(name = "PRAI_CODE_07")
private String praiCode07;

@Column(name = "PRAI_CODE_08")
private String praiCode08;

@Column(name = "PRAI_CODE_09")
private String praiCode09;

@Column(name = "PRAI_CODE_10")
private String praiCode10;

@Column(name = "PRAI_CODE_11")
private String praiCode11;

@Column(name = "PRAI_CODE_12")
private String praiCode12;

@Column(name = "PRAI_CODE_13")
private String praiCode13;

@Column(name = "PRAI_CODE_14")
private String praiCode14;

@Column(name = "PRAI_CODE_15")
private String praiCode15;

@Column(name = "PRAI_CODE_16")
private String praiCode16;

@Column(name = "PRAI_CODE_17")
private String praiCode17;

@Column(name = "PRAI_CODE_18")
private String praiCode18;

@Column(name = "PRAI_CODE_19")
private String praiCode19;

@Column(name = "PRAI_CODE_20")
private String praiCode20;

@Column(name = "PRAI_YN_01")
private String praiYn01;

@Column(name = "PRAI_YN_02")
private String praiYn02;

@Column(name = "PRAI_YN_03")
private String praiYn03;

@Column(name = "PRAI_YN_04")
private String praiYn04;

@Column(name = "PRAI_YN_05")
private String praiYn05;

@Column(name = "PRAI_YN_06")
private String praiYn06;

@Column(name = "PRAI_YN_07")
private String praiYn07;

@Column(name = "PRAI_YN_08")
private String praiYn08;

@Column(name = "PRAI_YN_09")
private String praiYn09;

@Column(name = "PRAI_YN_10")
private String praiYn10;

@Column(name = "PRAI_DATE_01")
@Temporal(TemporalType.DATE)
private Date praiDate01;

@Column(name = "PRAI_DATE_02")
@Temporal(TemporalType.DATE)
private Date praiDate02;

@Column(name = "PRAI_DATE_03")
@Temporal(TemporalType.DATE)
private Date praiDate03;

@Column(name = "PRAI_DATE_04")
@Temporal(TemporalType.DATE)
private Date praiDate04;

@Column(name = "PRAI_DATE_05")
@Temporal(TemporalType.DATE)
private Date praiDate05;

@Column(name = "PRAI_DATE_06")
@Temporal(TemporalType.DATE)
private Date praiDate06;

@Column(name = "PRAI_DATE_07")
@Temporal(TemporalType.DATE)
private Date praiDate07;

@Column(name = "PRAI_DATE_08")
@Temporal(TemporalType.DATE)
private Date praiDate08;

@Column(name = "PRAI_DATE_09")
@Temporal(TemporalType.DATE)
private Date praiDate09;

@Column(name = "PRAI_DATE_10")
@Temporal(TemporalType.DATE)
private Date praiDate10;

@Column(name = "PRAI_AMT_01")
private BigDecimal praiAmt01;

@Column(name = "PRAI_AMT_02")
private BigDecimal praiAmt02;

@Column(name = "PRAI_AMT_03")
private BigDecimal praiAmt03;

@Column(name = "PRAI_AMT_04")
private BigDecimal praiAmt04;

@Column(name = "PRAI_AMT_05")
private BigDecimal praiAmt05;

@Column(name = "PRAI_AMT_06")
private BigDecimal praiAmt06;

@Column(name = "PRAI_AMT_07")
private BigDecimal praiAmt07;

@Column(name = "PRAI_AMT_08")
private BigDecimal praiAmt08;

@Column(name = "PRAI_AMT_09")
private BigDecimal praiAmt09;

@Column(name = "PRAI_AMT_10")
private BigDecimal praiAmt10;

@Column(name = "PRAI_FEE_01")
private BigDecimal praiFee01;

@Column(name = "PRAI_FEE_02")
private BigDecimal praiFee02;

@Column(name = "PRAI_FEE_03")
private BigDecimal praiFee03;

@Column(name = "PRAI_FEE_04")
private BigDecimal praiFee04;

@Column(name = "PRAI_FEE_05")
private BigDecimal praiFee05;

@Column(name = "PRAI_FEE_06")
private BigDecimal praiFee06;

@Column(name = "PRAI_FEE_07")
private BigDecimal praiFee07;

@Column(name = "PRAI_FEE_08")
private BigDecimal praiFee08;

@Column(name = "PRAI_FEE_09")
private BigDecimal praiFee09;

@Column(name = "PRAI_FEE_10")
private BigDecimal praiFee10;

@Column(name = "PRAI_TEXT_01")
private String praiText01;

@Column(name = "PRAI_TEXT_02")
private String praiText02;

@Column(name = "PRAI_TEXT_03")
private String praiText03;

@Column(name = "PRAI_TEXT_04")
private String praiText04;

@Column(name = "PRAI_TEXT_05")
private String praiText05;

@Column(name = "PRAI_TEXT_06")
private String praiText06;

@Column(name = "PRAI_TEXT_07")
private String praiText07;

@Column(name = "PRAI_TEXT_08")
private String praiText08;

@Column(name = "PRAI_TEXT_09")
private String praiText09;

@Column(name = "PRAI_TEXT_10")
private String praiText10;

@Column(name = "PRAI_TEXT_11")
private String praiText11;

@Column(name = "PRAI_TEXT_12")
private String praiText12;

@Column(name = "PRAI_TEXT_13")
private String praiText13;

@Column(name = "PRAI_TEXT_14")
private String praiText14;

@Column(name = "PRAI_TEXT_15")
private String praiText15;

@Column(name = "PRAI_TEXT_16")
private String praiText16;

@Column(name = "PRAI_TEXT_17")
private String praiText17;

@Column(name = "PRAI_TEXT_18")
private String praiText18;

@Column(name = "PRAI_TEXT_19")
private String praiText19;

@Column(name = "PRAI_TEXT_20")
private String praiText20;

@Column(name = "PRAI_BLOB_01")
private byte[] praiBlob01;

@Column(name = "PRAI_BLOB_02")
private byte[] praiBlob02;

@Column(name = "PRAI_BLOB_03")
private byte[] praiBlob03;

@Column(name = "PRAI_BLOB_04")
private byte[] praiBlob04;

@Column(name = "PRAI_BLOB_05")
private byte[] praiBlob05;

@Column(name = "PRAI_BLOB_06")
private byte[] praiBlob06;

@Column(name = "PRAI_BLOB_07")
private byte[] praiBlob07;

@Column(name = "PRAI_BLOB_08")
private byte[] praiBlob08;

@Column(name = "PRAI_BLOB_09")
private byte[] praiBlob09;

@Column(name = "PRAI_BLOB_10")
private byte[] praiBlob10;



public Integer getPraiRiskSrno() {
	return praiRiskSrno;
}

public void setPraiRiskSrno(Integer praiRiskSrno) {
	this.praiRiskSrno = praiRiskSrno;
}

public Long getPraiSysId() {
	return praiSysId;
}

public void setPraiSysId(Long praiSysId) {
	this.praiSysId = praiSysId;
}

public Long getPraiPolSysId() {
	return praiPolSysId;
}

public void setPraiPolSysId(Long praiPolSysId) {
	this.praiPolSysId = praiPolSysId;
}

public Integer getPraiEndNoIdx() {
	return praiEndNoIdx;
}

public void setPraiEndNoIdx(Integer praiEndNoIdx) {
	this.praiEndNoIdx = praiEndNoIdx;
}

public Integer getPraiEndSrNo() {
	return praiEndSrNo;
}

public void setPraiEndSrNo(Integer praiEndSrNo) {
	this.praiEndSrNo = praiEndSrNo;
}

public Long getPraiPsecSysId() {
	return praiPsecSysId;
}

public void setPraiPsecSysId(Long praiPsecSysId) {
	this.praiPsecSysId = praiPsecSysId;
}

public Integer getPraiRiskLvlNo() {
	return praiRiskLvlNo;
}

public void setPraiRiskLvlNo(Integer praiRiskLvlNo) {
	this.praiRiskLvlNo = praiRiskLvlNo;
}

public Long getPraiLvl1SysId() {
	return praiLvl1SysId;
}

public void setPraiLvl1SysId(Long praiLvl1SysId) {
	this.praiLvl1SysId = praiLvl1SysId;
}

public Integer getPraiLvl1SrNo() {
	return praiLvl1SrNo;
}

public void setPraiLvl1SrNo(Integer praiLvl1SrNo) {
	this.praiLvl1SrNo = praiLvl1SrNo;
}

public Long getPraiLvl2SysId() {
	return praiLvl2SysId;
}

public void setPraiLvl2SysId(Long praiLvl2SysId) {
	this.praiLvl2SysId = praiLvl2SysId;
}

public Integer getPraiLvl2SrNo() {
	return praiLvl2SrNo;
}

public void setPraiLvl2SrNo(Integer praiLvl2SrNo) {
	this.praiLvl2SrNo = praiLvl2SrNo;
}

public Long getPraiLvl3SysId() {
	return praiLvl3SysId;
}

public void setPraiLvl3SysId(Long praiLvl3SysId) {
	this.praiLvl3SysId = praiLvl3SysId;
}

public Integer getPraiLvl3SrNo() {
	return praiLvl3SrNo;
}

public void setPraiLvl3SrNo(Integer praiLvl3SrNo) {
	this.praiLvl3SrNo = praiLvl3SrNo;
}

public Long getPraiLvl4SysId() {
	return praiLvl4SysId;
}

public void setPraiLvl4SysId(Long praiLvl4SysId) {
	this.praiLvl4SysId = praiLvl4SysId;
}

public Integer getPraiLvl4SrNo() {
	return praiLvl4SrNo;
}

public void setPraiLvl4SrNo(Integer praiLvl4SrNo) {
	this.praiLvl4SrNo = praiLvl4SrNo;
}

public Long getPraiLvl5SysId() {
	return praiLvl5SysId;
}

public void setPraiLvl5SysId(Long praiLvl5SysId) {
	this.praiLvl5SysId = praiLvl5SysId;
}

public Integer getPraiLvl5SrNo() {
	return praiLvl5SrNo;
}

public void setPraiLvl5SrNo(Integer praiLvl5SrNo) {
	this.praiLvl5SrNo = praiLvl5SrNo;
}

public String getPraiSiCurrCode() {
	return praiSiCurrCode;
}

public void setPraiSiCurrCode(String praiSiCurrCode) {
	this.praiSiCurrCode = praiSiCurrCode;
}

public String getPraiPremCurrCode() {
	return praiPremCurrCode;
}

public void setPraiPremCurrCode(String praiPremCurrCode) {
	this.praiPremCurrCode = praiPremCurrCode;
}

public BigDecimal getPraiSiFc() {
	return praiSiFc;
}

public void setPraiSiFc(BigDecimal praiSiFc) {
	this.praiSiFc = praiSiFc;
}

public BigDecimal getPraiSiLc1() {
	return praiSiLc1;
}

public void setPraiSiLc1(BigDecimal praiSiLc1) {
	this.praiSiLc1 = praiSiLc1;
}

public BigDecimal getPraiSiLc2() {
	return praiSiLc2;
}

public void setPraiSiLc2(BigDecimal praiSiLc2) {
	this.praiSiLc2 = praiSiLc2;
}

public BigDecimal getPraiSiLc3() {
	return praiSiLc3;
}

public void setPraiSiLc3(BigDecimal praiSiLc3) {
	this.praiSiLc3 = praiSiLc3;
}

public BigDecimal getPraiOrgSiFc() {
	return praiOrgSiFc;
}

public void setPraiOrgSiFc(BigDecimal praiOrgSiFc) {
	this.praiOrgSiFc = praiOrgSiFc;
}

public BigDecimal getPraiOrgSiLc1() {
	return praiOrgSiLc1;
}

public void setPraiOrgSiLc1(BigDecimal praiOrgSiLc1) {
	this.praiOrgSiLc1 = praiOrgSiLc1;
}

public BigDecimal getPraiOrgSiLc2() {
	return praiOrgSiLc2;
}

public void setPraiOrgSiLc2(BigDecimal praiOrgSiLc2) {
	this.praiOrgSiLc2 = praiOrgSiLc2;
}

public BigDecimal getPraiOrgSiLc3() {
	return praiOrgSiLc3;
}

public void setPraiOrgSiLc3(BigDecimal praiOrgSiLc3) {
	this.praiOrgSiLc3 = praiOrgSiLc3;
}

public BigDecimal getPraiPremFc() {
	return praiPremFc;
}

public void setPraiPremFc(BigDecimal praiPremFc) {
	this.praiPremFc = praiPremFc;
}

public BigDecimal getPraiPremLc1() {
	return praiPremLc1;
}

public void setPraiPremLc1(BigDecimal praiPremLc1) {
	this.praiPremLc1 = praiPremLc1;
}

public BigDecimal getPraiPremLc2() {
	return praiPremLc2;
}

public void setPraiPremLc2(BigDecimal praiPremLc2) {
	this.praiPremLc2 = praiPremLc2;
}

public BigDecimal getPraiPremLc3() {
	return praiPremLc3;
}

public void setPraiPremLc3(BigDecimal praiPremLc3) {
	this.praiPremLc3 = praiPremLc3;
}

public BigDecimal getPraiOrgPremFc() {
	return praiOrgPremFc;
}

public void setPraiOrgPremFc(BigDecimal praiOrgPremFc) {
	this.praiOrgPremFc = praiOrgPremFc;
}

public BigDecimal getPraiOrgPremLc1() {
	return praiOrgPremLc1;
}

public void setPraiOrgPremLc1(BigDecimal praiOrgPremLc1) {
	this.praiOrgPremLc1 = praiOrgPremLc1;
}

public BigDecimal getPraiOrgPremLc2() {
	return praiOrgPremLc2;
}

public void setPraiOrgPremLc2(BigDecimal praiOrgPremLc2) {
	this.praiOrgPremLc2 = praiOrgPremLc2;
}

public BigDecimal getPraiOrgPremLc3() {
	return praiOrgPremLc3;
}

public void setPraiOrgPremLc3(BigDecimal praiOrgPremLc3) {
	this.praiOrgPremLc3 = praiOrgPremLc3;
}

public BigDecimal getPraiCumBonusPerc() {
	return praiCumBonusPerc;
}

public void setPraiCumBonusPerc(BigDecimal praiCumBonusPerc) {
	this.praiCumBonusPerc = praiCumBonusPerc;
}

public BigDecimal getPraiCumBonusFc() {
	return praiCumBonusFc;
}

public void setPraiCumBonusFc(BigDecimal praiCumBonusFc) {
	this.praiCumBonusFc = praiCumBonusFc;
}

public BigDecimal getPraiCumBonusLc1() {
	return praiCumBonusLc1;
}

public void setPraiCumBonusLc1(BigDecimal praiCumBonusLc1) {
	this.praiCumBonusLc1 = praiCumBonusLc1;
}

public BigDecimal getPraiCumBonusLc2() {
	return praiCumBonusLc2;
}

public void setPraiCumBonusLc2(BigDecimal praiCumBonusLc2) {
	this.praiCumBonusLc2 = praiCumBonusLc2;
}

public BigDecimal getPraiCumBonusLc3() {
	return praiCumBonusLc3;
}

public void setPraiCumBonusLc3(BigDecimal praiCumBonusLc3) {
	this.praiCumBonusLc3 = praiCumBonusLc3;
}

public String getPraiSilentYn() {
	return praiSilentYn;
}

public void setPraiSilentYn(String praiSilentYn) {
	this.praiSilentYn = praiSilentYn;
}

public Date getPraiSilentFmDt() {
	return praiSilentFmDt;
}

public void setPraiSilentFmDt(Date praiSilentFmDt) {
	this.praiSilentFmDt = praiSilentFmDt;
}

public Date getPraiSilentToDt() {
	return praiSilentToDt;
}

public void setPraiSilentToDt(Date praiSilentToDt) {
	this.praiSilentToDt = praiSilentToDt;
}

public String getPraiServiceTaxYn() {
	return praiServiceTaxYn;
}

public void setPraiServiceTaxYn(String praiServiceTaxYn) {
	this.praiServiceTaxYn = praiServiceTaxYn;
}

public String getPraiRecType() {
	return praiRecType;
}

public void setPraiRecType(String praiRecType) {
	this.praiRecType = praiRecType;
}

public Date getPraiEffFmDt() {
	return praiEffFmDt;
}

public void setPraiEffFmDt(Date praiEffFmDt) {
	this.praiEffFmDt = praiEffFmDt;
}

public Date getPraiEffToDt() {
	return praiEffToDt;
}

public void setPraiEffToDt(Date praiEffToDt) {
	this.praiEffToDt = praiEffToDt;
}

public Date getPraiEndEffFmDt() {
	return praiEndEffFmDt;
}

public void setPraiEndEffFmDt(Date praiEndEffFmDt) {
	this.praiEndEffFmDt = praiEndEffFmDt;
}

public String getPraiCode01() {
	return praiCode01;
}

public void setPraiCode01(String praiCode01) {
	this.praiCode01 = praiCode01;
}

public String getPraiCode02() {
	return praiCode02;
}

public void setPraiCode02(String praiCode02) {
	this.praiCode02 = praiCode02;
}

public String getPraiCode03() {
	return praiCode03;
}

public void setPraiCode03(String praiCode03) {
	this.praiCode03 = praiCode03;
}

public String getPraiCode04() {
	return praiCode04;
}

public void setPraiCode04(String praiCode04) {
	this.praiCode04 = praiCode04;
}

public String getPraiCode05() {
	return praiCode05;
}

public void setPraiCode05(String praiCode05) {
	this.praiCode05 = praiCode05;
}

public String getPraiCode06() {
	return praiCode06;
}

public void setPraiCode06(String praiCode06) {
	this.praiCode06 = praiCode06;
}

public String getPraiCode07() {
	return praiCode07;
}

public void setPraiCode07(String praiCode07) {
	this.praiCode07 = praiCode07;
}

public String getPraiCode08() {
	return praiCode08;
}

public void setPraiCode08(String praiCode08) {
	this.praiCode08 = praiCode08;
}

public String getPraiCode09() {
	return praiCode09;
}

public void setPraiCode09(String praiCode09) {
	this.praiCode09 = praiCode09;
}

public String getPraiCode10() {
	return praiCode10;
}

public void setPraiCode10(String praiCode10) {
	this.praiCode10 = praiCode10;
}

public String getPraiCode11() {
	return praiCode11;
}

public void setPraiCode11(String praiCode11) {
	this.praiCode11 = praiCode11;
}

public String getPraiCode12() {
	return praiCode12;
}

public void setPraiCode12(String praiCode12) {
	this.praiCode12 = praiCode12;
}

public String getPraiCode13() {
	return praiCode13;
}

public void setPraiCode13(String praiCode13) {
	this.praiCode13 = praiCode13;
}

public String getPraiCode14() {
	return praiCode14;
}

public void setPraiCode14(String praiCode14) {
	this.praiCode14 = praiCode14;
}

public String getPraiCode15() {
	return praiCode15;
}

public void setPraiCode15(String praiCode15) {
	this.praiCode15 = praiCode15;
}

public String getPraiCode16() {
	return praiCode16;
}

public void setPraiCode16(String praiCode16) {
	this.praiCode16 = praiCode16;
}

public String getPraiCode17() {
	return praiCode17;
}

public void setPraiCode17(String praiCode17) {
	this.praiCode17 = praiCode17;
}

public String getPraiCode18() {
	return praiCode18;
}

public void setPraiCode18(String praiCode18) {
	this.praiCode18 = praiCode18;
}

public String getPraiCode19() {
	return praiCode19;
}

public void setPraiCode19(String praiCode19) {
	this.praiCode19 = praiCode19;
}

public String getPraiCode20() {
	return praiCode20;
}

public void setPraiCode20(String praiCode20) {
	this.praiCode20 = praiCode20;
}

public String getPraiYn01() {
	return praiYn01;
}

public void setPraiYn01(String praiYn01) {
	this.praiYn01 = praiYn01;
}

public String getPraiYn02() {
	return praiYn02;
}

public void setPraiYn02(String praiYn02) {
	this.praiYn02 = praiYn02;
}

public String getPraiYn03() {
	return praiYn03;
}

public void setPraiYn03(String praiYn03) {
	this.praiYn03 = praiYn03;
}

public String getPraiYn04() {
	return praiYn04;
}

public void setPraiYn04(String praiYn04) {
	this.praiYn04 = praiYn04;
}

public String getPraiYn05() {
	return praiYn05;
}

public void setPraiYn05(String praiYn05) {
	this.praiYn05 = praiYn05;
}

public String getPraiYn06() {
	return praiYn06;
}

public void setPraiYn06(String praiYn06) {
	this.praiYn06 = praiYn06;
}

public String getPraiYn07() {
	return praiYn07;
}

public void setPraiYn07(String praiYn07) {
	this.praiYn07 = praiYn07;
}

public String getPraiYn08() {
	return praiYn08;
}

public void setPraiYn08(String praiYn08) {
	this.praiYn08 = praiYn08;
}

public String getPraiYn09() {
	return praiYn09;
}

public void setPraiYn09(String praiYn09) {
	this.praiYn09 = praiYn09;
}

public String getPraiYn10() {
	return praiYn10;
}

public void setPraiYn10(String praiYn10) {
	this.praiYn10 = praiYn10;
}

public Date getPraiDate01() {
	return praiDate01;
}

public void setPraiDate01(Date praiDate01) {
	this.praiDate01 = praiDate01;
}

public Date getPraiDate02() {
	return praiDate02;
}

public void setPraiDate02(Date praiDate02) {
	this.praiDate02 = praiDate02;
}

public Date getPraiDate03() {
	return praiDate03;
}

public void setPraiDate03(Date praiDate03) {
	this.praiDate03 = praiDate03;
}

public Date getPraiDate04() {
	return praiDate04;
}

public void setPraiDate04(Date praiDate04) {
	this.praiDate04 = praiDate04;
}

public Date getPraiDate05() {
	return praiDate05;
}

public void setPraiDate05(Date praiDate05) {
	this.praiDate05 = praiDate05;
}

public Date getPraiDate06() {
	return praiDate06;
}

public void setPraiDate06(Date praiDate06) {
	this.praiDate06 = praiDate06;
}

public Date getPraiDate07() {
	return praiDate07;
}

public void setPraiDate07(Date praiDate07) {
	this.praiDate07 = praiDate07;
}

public Date getPraiDate08() {
	return praiDate08;
}

public void setPraiDate08(Date praiDate08) {
	this.praiDate08 = praiDate08;
}

public Date getPraiDate09() {
	return praiDate09;
}

public void setPraiDate09(Date praiDate09) {
	this.praiDate09 = praiDate09;
}

public Date getPraiDate10() {
	return praiDate10;
}

public void setPraiDate10(Date praiDate10) {
	this.praiDate10 = praiDate10;
}

public BigDecimal getPraiAmt01() {
	return praiAmt01;
}

public void setPraiAmt01(BigDecimal praiAmt01) {
	this.praiAmt01 = praiAmt01;
}

public BigDecimal getPraiAmt02() {
	return praiAmt02;
}

public void setPraiAmt02(BigDecimal praiAmt02) {
	this.praiAmt02 = praiAmt02;
}

public BigDecimal getPraiAmt03() {
	return praiAmt03;
}

public void setPraiAmt03(BigDecimal praiAmt03) {
	this.praiAmt03 = praiAmt03;
}

public BigDecimal getPraiAmt04() {
	return praiAmt04;
}

public void setPraiAmt04(BigDecimal praiAmt04) {
	this.praiAmt04 = praiAmt04;
}

public BigDecimal getPraiAmt05() {
	return praiAmt05;
}

public void setPraiAmt05(BigDecimal praiAmt05) {
	this.praiAmt05 = praiAmt05;
}

public BigDecimal getPraiAmt06() {
	return praiAmt06;
}

public void setPraiAmt06(BigDecimal praiAmt06) {
	this.praiAmt06 = praiAmt06;
}

public BigDecimal getPraiAmt07() {
	return praiAmt07;
}

public void setPraiAmt07(BigDecimal praiAmt07) {
	this.praiAmt07 = praiAmt07;
}

public BigDecimal getPraiAmt08() {
	return praiAmt08;
}

public void setPraiAmt08(BigDecimal praiAmt08) {
	this.praiAmt08 = praiAmt08;
}

public BigDecimal getPraiAmt09() {
	return praiAmt09;
}

public void setPraiAmt09(BigDecimal praiAmt09) {
	this.praiAmt09 = praiAmt09;
}

public BigDecimal getPraiAmt10() {
	return praiAmt10;
}

public void setPraiAmt10(BigDecimal praiAmt10) {
	this.praiAmt10 = praiAmt10;
}

public BigDecimal getPraiFee01() {
	return praiFee01;
}

public void setPraiFee01(BigDecimal praiFee01) {
	this.praiFee01 = praiFee01;
}

public BigDecimal getPraiFee02() {
	return praiFee02;
}

public void setPraiFee02(BigDecimal praiFee02) {
	this.praiFee02 = praiFee02;
}

public BigDecimal getPraiFee03() {
	return praiFee03;
}

public void setPraiFee03(BigDecimal praiFee03) {
	this.praiFee03 = praiFee03;
}

public BigDecimal getPraiFee04() {
	return praiFee04;
}

public void setPraiFee04(BigDecimal praiFee04) {
	this.praiFee04 = praiFee04;
}

public BigDecimal getPraiFee05() {
	return praiFee05;
}

public void setPraiFee05(BigDecimal praiFee05) {
	this.praiFee05 = praiFee05;
}

public BigDecimal getPraiFee06() {
	return praiFee06;
}

public void setPraiFee06(BigDecimal praiFee06) {
	this.praiFee06 = praiFee06;
}

public BigDecimal getPraiFee07() {
	return praiFee07;
}

public void setPraiFee07(BigDecimal praiFee07) {
	this.praiFee07 = praiFee07;
}

public BigDecimal getPraiFee08() {
	return praiFee08;
}

public void setPraiFee08(BigDecimal praiFee08) {
	this.praiFee08 = praiFee08;
}

public BigDecimal getPraiFee09() {
	return praiFee09;
}

public void setPraiFee09(BigDecimal praiFee09) {
	this.praiFee09 = praiFee09;
}

public BigDecimal getPraiFee10() {
	return praiFee10;
}

public void setPraiFee10(BigDecimal praiFee10) {
	this.praiFee10 = praiFee10;
}

public String getPraiText01() {
	return praiText01;
}

public void setPraiText01(String praiText01) {
	this.praiText01 = praiText01;
}

public String getPraiText02() {
	return praiText02;
}

public void setPraiText02(String praiText02) {
	this.praiText02 = praiText02;
}

public String getPraiText03() {
	return praiText03;
}

public void setPraiText03(String praiText03) {
	this.praiText03 = praiText03;
}

public String getPraiText04() {
	return praiText04;
}

public void setPraiText04(String praiText04) {
	this.praiText04 = praiText04;
}

public String getPraiText05() {
	return praiText05;
}

public void setPraiText05(String praiText05) {
	this.praiText05 = praiText05;
}

public String getPraiText06() {
	return praiText06;
}

public void setPraiText06(String praiText06) {
	this.praiText06 = praiText06;
}

public String getPraiText07() {
	return praiText07;
}

public void setPraiText07(String praiText07) {
	this.praiText07 = praiText07;
}

public String getPraiText08() {
	return praiText08;
}

public void setPraiText08(String praiText08) {
	this.praiText08 = praiText08;
}

public String getPraiText09() {
	return praiText09;
}

public void setPraiText09(String praiText09) {
	this.praiText09 = praiText09;
}

public String getPraiText10() {
	return praiText10;
}

public void setPraiText10(String praiText10) {
	this.praiText10 = praiText10;
}

public String getPraiText11() {
	return praiText11;
}

public void setPraiText11(String praiText11) {
	this.praiText11 = praiText11;
}

public String getPraiText12() {
	return praiText12;
}

public void setPraiText12(String praiText12) {
	this.praiText12 = praiText12;
}

public String getPraiText13() {
	return praiText13;
}

public void setPraiText13(String praiText13) {
	this.praiText13 = praiText13;
}

public String getPraiText14() {
	return praiText14;
}

public void setPraiText14(String praiText14) {
	this.praiText14 = praiText14;
}

public String getPraiText15() {
	return praiText15;
}

public void setPraiText15(String praiText15) {
	this.praiText15 = praiText15;
}

public String getPraiText16() {
	return praiText16;
}

public void setPraiText16(String praiText16) {
	this.praiText16 = praiText16;
}

public String getPraiText17() {
	return praiText17;
}

public void setPraiText17(String praiText17) {
	this.praiText17 = praiText17;
}

public String getPraiText18() {
	return praiText18;
}

public void setPraiText18(String praiText18) {
	this.praiText18 = praiText18;
}

public String getPraiText19() {
	return praiText19;
}

public void setPraiText19(String praiText19) {
	this.praiText19 = praiText19;
}

public String getPraiText20() {
	return praiText20;
}

public void setPraiText20(String praiText20) {
	this.praiText20 = praiText20;
}

public byte[] getPraiBlob01() {
	return praiBlob01;
}

public void setPraiBlob01(byte[] praiBlob01) {
	this.praiBlob01 = praiBlob01;
}

public byte[] getPraiBlob02() {
	return praiBlob02;
}

public void setPraiBlob02(byte[] praiBlob02) {
	this.praiBlob02 = praiBlob02;
}

public byte[] getPraiBlob03() {
	return praiBlob03;
}

public void setPraiBlob03(byte[] praiBlob03) {
	this.praiBlob03 = praiBlob03;
}

public byte[] getPraiBlob04() {
	return praiBlob04;
}

public void setPraiBlob04(byte[] praiBlob04) {
	this.praiBlob04 = praiBlob04;
}

public byte[] getPraiBlob05() {
	return praiBlob05;
}

public void setPraiBlob05(byte[] praiBlob05) {
	this.praiBlob05 = praiBlob05;
}

public byte[] getPraiBlob06() {
	return praiBlob06;
}

public void setPraiBlob06(byte[] praiBlob06) {
	this.praiBlob06 = praiBlob06;
}

public byte[] getPraiBlob07() {
	return praiBlob07;
}

public void setPraiBlob07(byte[] praiBlob07) {
	this.praiBlob07 = praiBlob07;
}

public byte[] getPraiBlob08() {
	return praiBlob08;
}

public void setPraiBlob08(byte[] praiBlob08) {
	this.praiBlob08 = praiBlob08;
}

public byte[] getPraiBlob09() {
	return praiBlob09;
}

public void setPraiBlob09(byte[] praiBlob09) {
	this.praiBlob09 = praiBlob09;
}

public byte[] getPraiBlob10() {
	return praiBlob10;
}

public void setPraiBlob10(byte[] praiBlob10) {
	this.praiBlob10 = praiBlob10;
}


//
//	@Id
//	@Column(name = "PRAI_SYS_ID")
//	private Long praiSysId;
//
//	@Column(name = "PRAI_POL_SYS_ID")
//	private Long praiPolSysId;
//
//	@Column(name = "PRAI_END_NO_IDX")
//	private Integer praiEndNoIdx;
//
//	@Column(name = "PRAI_END_SR_NO")
//	private Integer praiEndSrNo;
//
//	@Column(name = "PRAI_PSEC_SYS_ID")
//	private Long praiPsecSysId;
//
//	@Column(name = "PRAI_RISK_LVL_NO")
//	private Integer praiRiskLvlNo;
//
//	@Column(name = "PRAI_LVL1_SYS_ID")
//	private Long praiLvl1SysId;
//
//	@Column(name = "PRAI_LVL1_SR_NO")
//	private Integer praiLvl1SrNo;
//
//	@Column(name = "PRAI_LVL2_SYS_ID")
//	private Long praiLvl2SysId;
//
//	@Column(name = "PRAI_LVL2_SR_NO")
//	private Integer praiLvl2SrNo;
//
//	@Column(name = "PRAI_LVL3_SYS_ID")
//	private Long praiLvl3SysId;
//
//	@Column(name = "PRAI_LVL3_SR_NO")
//	private Integer praiLvl3SrNo;
//
//	@Column(name = "PRAI_LVL4_SYS_ID")
//	private Long praiLvl4SysId;
//
//	@Column(name = "PRAI_LVL4_SR_NO")
//	private Integer praiLvl4SrNo;
//
//	@Column(name = "PRAI_LVL5_SYS_ID")
//	private Long praiLvl5SysId;
//
//	@Column(name = "PRAI_LVL5_SR_NO")
//	private Integer praiLvl5SrNo;
//
//	@Column(name = "PRAI_SI_CURR_CODE")
//	private String praiSiCurrCode;
//
//	@Column(name = "PRAI_PREM_CURR_CODE")
//	private String praiPremCurrCode;
//
//	@Column(name = "PRAI_SI_FC")
//	private Double praiSiFc;
//
//	@Column(name = "PRAI_SI_LC_1")
//	private Double praiSiLc1;
//
//	@Column(name = "PRAI_SI_LC_2")
//	private Double praiSiLc2;
//
//	@Column(name = "PRAI_SI_LC_3")
//	private Double praiSiLc3;
//
//	@Column(name = "PRAI_ORG_SI_FC")
//	private Double praiOrgSiFc;
//
//	@Column(name = "PRAI_ORG_SI_LC_1")
//	private Double praiOrgSiLc1;
//
//	@Column(name = "PRAI_ORG_SI_LC_2")
//	private Double praiOrgSiLc2;
//
//	@Column(name = "PRAI_ORG_SI_LC_3")
//	private Double praiOrgSiLc3;
//
//	@Column(name = "PRAI_PREM_FC")
//	private Double praiPremFc;
//
//	@Column(name = "PRAI_PREM_LC_1")
//	private Double praiPremLc1;
//
//	@Column(name = "PRAI_PREM_LC_2")
//	private Double praiPremLc2;
//
//	@Column(name = "PRAI_PREM_LC_3")
//	private Double praiPremLc3;
//
//	@Column(name = "PRAI_ORG_PREM_FC")
//	private Double praiOrgPremFc;
//
//	@Column(name = "PRAI_ORG_PREM_LC_1")
//	private Double praiOrgPremLc1;
//
//	@Column(name = "PRAI_ORG_PREM_LC_2")
//	private Double praiOrgPremLc2;
//
//	@Column(name = "PRAI_ORG_PREM_LC_3")
//	private Double praiOrgPremLc3;
//
//	@Column(name = "PRAI_CUM_BONUS_PERC")
//	private Double praiCumBonusPerc;
//
//	@Column(name = "PRAI_CUM_BONUS_FC")
//	private Double praiCumBonusFc;
//
//	@Column(name = "PRAI_CUM_BONUS_LC_1")
//	private Double praiCumBonusLc1;
//
//	@Column(name = "PRAI_CUM_BONUS_LC_2")
//	private Double praiCumBonusLc2;
//
//	@Column(name = "PRAI_CUM_BONUS_LC_3")
//	private Double praiCumBonusLc3;
//
//	@Column(name = "PRAI_SILENT_YN")
//	private String praiSilentYn;
//
//	@Column(name = "PRAI_SILENT_FM_DT")
//	private Date praiSilentFmDt;
//
//	@Column(name = "PRAI_SILENT_TO_DT")
//	private Date praiSilentToDt;
//
//	@Column(name = "PRAI_SERVICE_TAX_YN")
//	private String praiServiceTaxYn;
//

//
//	@Column(name = "PRAI_EFF_FM_DT")
//	private Date praiEffFmDt;
//
//	@Column(name = "PRAI_EFF_TO_DT")
//	private Date praiEffToDt;
//
//	@Column(name = "PRAI_END_EFF_FM_DT")
//	private Date praiEndEffFmDt;
//
//	@Column(name = "PRAI_CODE_01")
//	private String praiCode01;
//
//	@Column(name = "PRAI_CODE_02")
//	private String praiCode02;
//
//	@Column(name = "PRAI_CODE_03")
//	private String praiCode03;
//
//	@Column(name = "PRAI_CODE_04")
//	private String praiCode04;
//
//	@Column(name = "PRAI_CODE_05")
//	private String praiCode05;
//
//	@Column(name = "PRAI_CR_UID")
//	private String praiCrUid;
//
//	@Column(name = "PRAI_CR_DT")
//	private Date praiCrDt;
//
//	@Column(name = "PRAI_UPD_UID")
//	private String praiUpdUid;
//
//	@Column(name = "PRAI_RISK_ID")
//	private String praiRiskId;
//
//	@Column(name = "PRAI_PERIOD_UNIT")
//	private String praiPeriodUnit;
//
//	@Column(name = "PRAI_UPD_DT")
//	private Date praiUpdDt;
//
//	@Column(name = "PRAI_PML_AMT_FC")
//	private Double praiPmlAmtFc;
//
//	@Column(name = "PRAI_PML_AMT_LC_1")
//	private Double praiPmlAmtLc1;
//
//	@Column(name = "PRAI_PML_AMT_LC_2")
//	private Double praiPmlAmtLc2;
//
//	@Column(name = "PRAI_PML_AMT_LC_3")
//	private Double praiPmlAmtLc3;
//
//	@Column(name = "PRAI_PML_PERC")
//	private Double praiPmlPerc;
//
//	// ... continue with all other columns
//
//	@Column(name = "PRAI_REMARKS_06")
//	private String praiRemarks06;
//
//	@Column(name = "PRAI_REMARKS_07")
//	private String praiRemarks07;
//
//	@Column(name = "PRAI_REMARKS_08")
//	private String praiRemarks08;
//
//	@Column(name = "PRAI_REMARKS_09")
//	private String praiRemarks09;
//
//	@Column(name = "PRAI_REMARKS_10")
//	private String praiRemarks10;
//
//	// ... continue with all other columns
//
//	@Column(name = "PRAI_ORG_CUM_BONUS_FC")
//	private Double praiOrgCumBonusFc;
//
//	@Column(name = "PRAI_ORG_CUM_BONUS_LC_1")
//	private Double praiOrgCumBonusLc1;
//
//	@Column(name = "PRAI_ORG_CUM_BONUS_LC_2")
//	private Double praiOrgCumBonusLc2;
//
//	@Column(name = "PRAI_ORG_CUM_BONUS_LC_3")
//	private Double praiOrgCumBonusLc3;
//
//	// ... continue with all other columns
//
//	@Column(name = "PRAI_DATE_21")
//	private Date praiDate21;
//
//	@Column(name = "PRAI_DATE_22")
//	private Date praiDate22;
//
//	@Column(name = "PRAI_DATE_23")
//	private Date praiDate23;
//
//	@Column(name = "PRAI_DATE_24")
//	private Date praiDate24;
//
//	@Column(name = "PRAI_DATE_25")
//	private Date praiDate25;
//
//	public Long getPraiSysId() {
//		return praiSysId;
//	}
//
//	public void setPraiSysId(Long praiSysId) {
//		this.praiSysId = praiSysId;
//	}
//
//	public Long getPraiPolSysId() {
//		return praiPolSysId;
//	}
//
//	public void setPraiPolSysId(Long praiPolSysId) {
//		this.praiPolSysId = praiPolSysId;
//	}
//
//	public Integer getPraiEndNoIdx() {
//		return praiEndNoIdx;
//	}
//
//	public void setPraiEndNoIdx(Integer praiEndNoIdx) {
//		this.praiEndNoIdx = praiEndNoIdx;
//	}
//
//	public Integer getPraiEndSrNo() {
//		return praiEndSrNo;
//	}
//
//	public void setPraiEndSrNo(Integer praiEndSrNo) {
//		this.praiEndSrNo = praiEndSrNo;
//	}
//
//	public Long getPraiPsecSysId() {
//		return praiPsecSysId;
//	}
//
//	public void setPraiPsecSysId(Long praiPsecSysId) {
//		this.praiPsecSysId = praiPsecSysId;
//	}
//
//	public Integer getPraiRiskLvlNo() {
//		return praiRiskLvlNo;
//	}
//
//	public void setPraiRiskLvlNo(Integer praiRiskLvlNo) {
//		this.praiRiskLvlNo = praiRiskLvlNo;
//	}
//
//	public Long getPraiLvl1SysId() {
//		return praiLvl1SysId;
//	}
//
//	public void setPraiLvl1SysId(Long praiLvl1SysId) {
//		this.praiLvl1SysId = praiLvl1SysId;
//	}
//
//	public Integer getPraiLvl1SrNo() {
//		return praiLvl1SrNo;
//	}
//
//	public void setPraiLvl1SrNo(Integer praiLvl1SrNo) {
//		this.praiLvl1SrNo = praiLvl1SrNo;
//	}
//
//	public Long getPraiLvl2SysId() {
//		return praiLvl2SysId;
//	}
//
//	public void setPraiLvl2SysId(Long praiLvl2SysId) {
//		this.praiLvl2SysId = praiLvl2SysId;
//	}
//
//	public Integer getPraiLvl2SrNo() {
//		return praiLvl2SrNo;
//	}
//
//	public void setPraiLvl2SrNo(Integer praiLvl2SrNo) {
//		this.praiLvl2SrNo = praiLvl2SrNo;
//	}
//
//	public Long getPraiLvl3SysId() {
//		return praiLvl3SysId;
//	}
//
//	public void setPraiLvl3SysId(Long praiLvl3SysId) {
//		this.praiLvl3SysId = praiLvl3SysId;
//	}
//
//	public Integer getPraiLvl3SrNo() {
//		return praiLvl3SrNo;
//	}
//
//	public void setPraiLvl3SrNo(Integer praiLvl3SrNo) {
//		this.praiLvl3SrNo = praiLvl3SrNo;
//	}
//
//	public Long getPraiLvl4SysId() {
//		return praiLvl4SysId;
//	}
//
//	public void setPraiLvl4SysId(Long praiLvl4SysId) {
//		this.praiLvl4SysId = praiLvl4SysId;
//	}
//
//	public Integer getPraiLvl4SrNo() {
//		return praiLvl4SrNo;
//	}
//
//	public void setPraiLvl4SrNo(Integer praiLvl4SrNo) {
//		this.praiLvl4SrNo = praiLvl4SrNo;
//	}
//
//	public Long getPraiLvl5SysId() {
//		return praiLvl5SysId;
//	}
//
//	public void setPraiLvl5SysId(Long praiLvl5SysId) {
//		this.praiLvl5SysId = praiLvl5SysId;
//	}
//
//	public Integer getPraiLvl5SrNo() {
//		return praiLvl5SrNo;
//	}
//
//	public void setPraiLvl5SrNo(Integer praiLvl5SrNo) {
//		this.praiLvl5SrNo = praiLvl5SrNo;
//	}
//
//	public String getPraiSiCurrCode() {
//		return praiSiCurrCode;
//	}
//
//	public void setPraiSiCurrCode(String praiSiCurrCode) {
//		this.praiSiCurrCode = praiSiCurrCode;
//	}
//
//	public String getPraiPremCurrCode() {
//		return praiPremCurrCode;
//	}
//
//	public void setPraiPremCurrCode(String praiPremCurrCode) {
//		this.praiPremCurrCode = praiPremCurrCode;
//	}
//
//	public Double getPraiSiFc() {
//		return praiSiFc;
//	}
//
//	public void setPraiSiFc(Double praiSiFc) {
//		this.praiSiFc = praiSiFc;
//	}
//
//	public Double getPraiSiLc1() {
//		return praiSiLc1;
//	}
//
//	public void setPraiSiLc1(Double praiSiLc1) {
//		this.praiSiLc1 = praiSiLc1;
//	}
//
//	public Double getPraiSiLc2() {
//		return praiSiLc2;
//	}
//
//	public void setPraiSiLc2(Double praiSiLc2) {
//		this.praiSiLc2 = praiSiLc2;
//	}
//
//	public Double getPraiSiLc3() {
//		return praiSiLc3;
//	}
//
//	public void setPraiSiLc3(Double praiSiLc3) {
//		this.praiSiLc3 = praiSiLc3;
//	}
//
//	public Double getPraiOrgSiFc() {
//		return praiOrgSiFc;
//	}
//
//	public void setPraiOrgSiFc(Double praiOrgSiFc) {
//		this.praiOrgSiFc = praiOrgSiFc;
//	}
//
//	public Double getPraiOrgSiLc1() {
//		return praiOrgSiLc1;
//	}
//
//	public void setPraiOrgSiLc1(Double praiOrgSiLc1) {
//		this.praiOrgSiLc1 = praiOrgSiLc1;
//	}
//
//	public Double getPraiOrgSiLc2() {
//		return praiOrgSiLc2;
//	}
//
//	public void setPraiOrgSiLc2(Double praiOrgSiLc2) {
//		this.praiOrgSiLc2 = praiOrgSiLc2;
//	}
//
//	public Double getPraiOrgSiLc3() {
//		return praiOrgSiLc3;
//	}
//
//	public void setPraiOrgSiLc3(Double praiOrgSiLc3) {
//		this.praiOrgSiLc3 = praiOrgSiLc3;
//	}
//
//	public Double getPraiPremFc() {
//		return praiPremFc;
//	}
//
//	public void setPraiPremFc(Double praiPremFc) {
//		this.praiPremFc = praiPremFc;
//	}
//
//	public Double getPraiPremLc1() {
//		return praiPremLc1;
//	}
//
//	public void setPraiPremLc1(Double praiPremLc1) {
//		this.praiPremLc1 = praiPremLc1;
//	}
//
//	public Double getPraiPremLc2() {
//		return praiPremLc2;
//	}
//
//	public void setPraiPremLc2(Double praiPremLc2) {
//		this.praiPremLc2 = praiPremLc2;
//	}
//
//	public Double getPraiPremLc3() {
//		return praiPremLc3;
//	}
//
//	public void setPraiPremLc3(Double praiPremLc3) {
//		this.praiPremLc3 = praiPremLc3;
//	}
//
//	public Double getPraiOrgPremFc() {
//		return praiOrgPremFc;
//	}
//
//	public void setPraiOrgPremFc(Double praiOrgPremFc) {
//		this.praiOrgPremFc = praiOrgPremFc;
//	}
//
//	public Double getPraiOrgPremLc1() {
//		return praiOrgPremLc1;
//	}
//
//	public void setPraiOrgPremLc1(Double praiOrgPremLc1) {
//		this.praiOrgPremLc1 = praiOrgPremLc1;
//	}
//
//	public Double getPraiOrgPremLc2() {
//		return praiOrgPremLc2;
//	}
//
//	public void setPraiOrgPremLc2(Double praiOrgPremLc2) {
//		this.praiOrgPremLc2 = praiOrgPremLc2;
//	}
//
//	public Double getPraiOrgPremLc3() {
//		return praiOrgPremLc3;
//	}
//
//	public void setPraiOrgPremLc3(Double praiOrgPremLc3) {
//		this.praiOrgPremLc3 = praiOrgPremLc3;
//	}
//
//	public Double getPraiCumBonusPerc() {
//		return praiCumBonusPerc;
//	}
//
//	public void setPraiCumBonusPerc(Double praiCumBonusPerc) {
//		this.praiCumBonusPerc = praiCumBonusPerc;
//	}
//
//	public Double getPraiCumBonusFc() {
//		return praiCumBonusFc;
//	}
//
//	public void setPraiCumBonusFc(Double praiCumBonusFc) {
//		this.praiCumBonusFc = praiCumBonusFc;
//	}
//
//	public Double getPraiCumBonusLc1() {
//		return praiCumBonusLc1;
//	}
//
//	public void setPraiCumBonusLc1(Double praiCumBonusLc1) {
//		this.praiCumBonusLc1 = praiCumBonusLc1;
//	}
//
//	public Double getPraiCumBonusLc2() {
//		return praiCumBonusLc2;
//	}
//
//	public void setPraiCumBonusLc2(Double praiCumBonusLc2) {
//		this.praiCumBonusLc2 = praiCumBonusLc2;
//	}
//
//	public Double getPraiCumBonusLc3() {
//		return praiCumBonusLc3;
//	}
//
//	public void setPraiCumBonusLc3(Double praiCumBonusLc3) {
//		this.praiCumBonusLc3 = praiCumBonusLc3;
//	}
//
//	public String getPraiSilentYn() {
//		return praiSilentYn;
//	}
//
//	public void setPraiSilentYn(String praiSilentYn) {
//		this.praiSilentYn = praiSilentYn;
//	}
//
//	public Date getPraiSilentFmDt() {
//		return praiSilentFmDt;
//	}
//
//	public void setPraiSilentFmDt(Date praiSilentFmDt) {
//		this.praiSilentFmDt = praiSilentFmDt;
//	}
//
//	public Date getPraiSilentToDt() {
//		return praiSilentToDt;
//	}
//
//	public void setPraiSilentToDt(Date praiSilentToDt) {
//		this.praiSilentToDt = praiSilentToDt;
//	}
//
//	public String getPraiServiceTaxYn() {
//		return praiServiceTaxYn;
//	}
//
//	public void setPraiServiceTaxYn(String praiServiceTaxYn) {
//		this.praiServiceTaxYn = praiServiceTaxYn;
//	}
//
//	public String getPraiRecType() {
//		return praiRecType;
//	}
//
//	public void setPraiRecType(String praiRecType) {
//		this.praiRecType = praiRecType;
//	}
//
//	public Date getPraiEffFmDt() {
//		return praiEffFmDt;
//	}
//
//	public void setPraiEffFmDt(Date praiEffFmDt) {
//		this.praiEffFmDt = praiEffFmDt;
//	}
//
//	public Date getPraiEffToDt() {
//		return praiEffToDt;
//	}
//
//	public void setPraiEffToDt(Date praiEffToDt) {
//		this.praiEffToDt = praiEffToDt;
//	}
//
//	public Date getPraiEndEffFmDt() {
//		return praiEndEffFmDt;
//	}
//
//	public void setPraiEndEffFmDt(Date praiEndEffFmDt) {
//		this.praiEndEffFmDt = praiEndEffFmDt;
//	}
//
//	public String getPraiCode01() {
//		return praiCode01;
//	}
//
//	public void setPraiCode01(String praiCode01) {
//		this.praiCode01 = praiCode01;
//	}
//
//	public String getPraiCode02() {
//		return praiCode02;
//	}
//
//	public void setPraiCode02(String praiCode02) {
//		this.praiCode02 = praiCode02;
//	}
//
//	public String getPraiCode03() {
//		return praiCode03;
//	}
//
//	public void setPraiCode03(String praiCode03) {
//		this.praiCode03 = praiCode03;
//	}
//
//	public String getPraiCode04() {
//		return praiCode04;
//	}
//
//	public void setPraiCode04(String praiCode04) {
//		this.praiCode04 = praiCode04;
//	}
//
//	public String getPraiCode05() {
//		return praiCode05;
//	}
//
//	public void setPraiCode05(String praiCode05) {
//		this.praiCode05 = praiCode05;
//	}
//
//	public String getPraiCrUid() {
//		return praiCrUid;
//	}
//
//	public void setPraiCrUid(String praiCrUid) {
//		this.praiCrUid = praiCrUid;
//	}
//
//	public Date getPraiCrDt() {
//		return praiCrDt;
//	}
//
//	public void setPraiCrDt(Date praiCrDt) {
//		this.praiCrDt = praiCrDt;
//	}
//
//	public String getPraiUpdUid() {
//		return praiUpdUid;
//	}
//
//	public void setPraiUpdUid(String praiUpdUid) {
//		this.praiUpdUid = praiUpdUid;
//	}
//
//	public String getPraiRiskId() {
//		return praiRiskId;
//	}
//
//	public void setPraiRiskId(String praiRiskId) {
//		this.praiRiskId = praiRiskId;
//	}
//
//	public String getPraiPeriodUnit() {
//		return praiPeriodUnit;
//	}
//
//	public void setPraiPeriodUnit(String praiPeriodUnit) {
//		this.praiPeriodUnit = praiPeriodUnit;
//	}
//
//	public Date getPraiUpdDt() {
//		return praiUpdDt;
//	}
//
//	public void setPraiUpdDt(Date praiUpdDt) {
//		this.praiUpdDt = praiUpdDt;
//	}
//
//	public Double getPraiPmlAmtFc() {
//		return praiPmlAmtFc;
//	}
//
//	public void setPraiPmlAmtFc(Double praiPmlAmtFc) {
//		this.praiPmlAmtFc = praiPmlAmtFc;
//	}
//
//	public Double getPraiPmlAmtLc1() {
//		return praiPmlAmtLc1;
//	}
//
//	public void setPraiPmlAmtLc1(Double praiPmlAmtLc1) {
//		this.praiPmlAmtLc1 = praiPmlAmtLc1;
//	}
//
//	public Double getPraiPmlAmtLc2() {
//		return praiPmlAmtLc2;
//	}
//
//	public void setPraiPmlAmtLc2(Double praiPmlAmtLc2) {
//		this.praiPmlAmtLc2 = praiPmlAmtLc2;
//	}
//
//	public Double getPraiPmlAmtLc3() {
//		return praiPmlAmtLc3;
//	}
//
//	public void setPraiPmlAmtLc3(Double praiPmlAmtLc3) {
//		this.praiPmlAmtLc3 = praiPmlAmtLc3;
//	}
//
//	public Double getPraiPmlPerc() {
//		return praiPmlPerc;
//	}
//
//	public void setPraiPmlPerc(Double praiPmlPerc) {
//		this.praiPmlPerc = praiPmlPerc;
//	}
//
//	public String getPraiRemarks06() {
//		return praiRemarks06;
//	}
//
//	public void setPraiRemarks06(String praiRemarks06) {
//		this.praiRemarks06 = praiRemarks06;
//	}
//
//	public String getPraiRemarks07() {
//		return praiRemarks07;
//	}
//
//	public void setPraiRemarks07(String praiRemarks07) {
//		this.praiRemarks07 = praiRemarks07;
//	}
//
//	public String getPraiRemarks08() {
//		return praiRemarks08;
//	}
//
//	public void setPraiRemarks08(String praiRemarks08) {
//		this.praiRemarks08 = praiRemarks08;
//	}
//
//	public String getPraiRemarks09() {
//		return praiRemarks09;
//	}
//
//	public void setPraiRemarks09(String praiRemarks09) {
//		this.praiRemarks09 = praiRemarks09;
//	}
//
//	public String getPraiRemarks10() {
//		return praiRemarks10;
//	}
//
//	public void setPraiRemarks10(String praiRemarks10) {
//		this.praiRemarks10 = praiRemarks10;
//	}
//
//	public Double getPraiOrgCumBonusFc() {
//		return praiOrgCumBonusFc;
//	}
//
//	public void setPraiOrgCumBonusFc(Double praiOrgCumBonusFc) {
//		this.praiOrgCumBonusFc = praiOrgCumBonusFc;
//	}
//
//	public Double getPraiOrgCumBonusLc1() {
//		return praiOrgCumBonusLc1;
//	}
//
//	public void setPraiOrgCumBonusLc1(Double praiOrgCumBonusLc1) {
//		this.praiOrgCumBonusLc1 = praiOrgCumBonusLc1;
//	}
//
//	public Double getPraiOrgCumBonusLc2() {
//		return praiOrgCumBonusLc2;
//	}
//
//	public void setPraiOrgCumBonusLc2(Double praiOrgCumBonusLc2) {
//		this.praiOrgCumBonusLc2 = praiOrgCumBonusLc2;
//	}
//
//	public Double getPraiOrgCumBonusLc3() {
//		return praiOrgCumBonusLc3;
//	}
//
//	public void setPraiOrgCumBonusLc3(Double praiOrgCumBonusLc3) {
//		this.praiOrgCumBonusLc3 = praiOrgCumBonusLc3;
//	}
//
//	public Date getPraiDate21() {
//		return praiDate21;
//	}
//
//	public void setPraiDate21(Date praiDate21) {
//		this.praiDate21 = praiDate21;
//	}
//
//	public Date getPraiDate22() {
//		return praiDate22;
//	}
//
//	public void setPraiDate22(Date praiDate22) {
//		this.praiDate22 = praiDate22;
//	}
//
//	public Date getPraiDate23() {
//		return praiDate23;
//	}
//
//	public void setPraiDate23(Date praiDate23) {
//		this.praiDate23 = praiDate23;
//	}
//
//	public Date getPraiDate24() {
//		return praiDate24;
//	}
//
//	public void setPraiDate24(Date praiDate24) {
//		this.praiDate24 = praiDate24;
//	}
//
//	public Date getPraiDate25() {
//		return praiDate25;
//	}
//
//	public void setPraiDate25(Date praiDate25) {
//		this.praiDate25 = praiDate25;
//	}
//
}
