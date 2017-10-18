package com.manulife.hk.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "REFNO_TX_LOG")
public class TransactionEntity {

	@Id	
	@Column(name="tx_code")
	private String tx_code;
	
	private String id;
	
	@Column(name="ref_no")
	private String ref_no;
	
	private String gproupNumber;
	private String subGroupNumber;
	private String gpCertificateNumber;
	private String sysCode;

	public String getGproupNumber() {
		return gproupNumber;
	}

	public void setGproupNumber(String gproupNumber) {
		this.gproupNumber = gproupNumber;
	}

	public String getSubGroupNumber() {
		return subGroupNumber;
	}

	public void setSubGroupNumber(String subGroupNumber) {
		this.subGroupNumber = subGroupNumber;
	}

	public String getGpCertificateNumber() {
		return gpCertificateNumber;
	}

	public void setGpCertificateNumber(String gpCertificateNumber) {
		this.gpCertificateNumber = gpCertificateNumber;
	}

	public String getSysCode() {
		return sysCode;
	}

	public void setSysCode(String sysCode) {
		this.sysCode = sysCode;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRef_no() {
		return ref_no;
	}

	public void setRef_no(String ref_no) {
		this.ref_no = ref_no;
	}

	public String getTx_code() {
		return tx_code;
	}

	public void setTx_code(String tx_code) {
		this.tx_code = tx_code;
	}

	
	

}
