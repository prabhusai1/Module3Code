package com.cg.income.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "tds_master")
@Component
public class TDSMaster {

	@Id
	int id;

	@Column(name = "deductor_name")
	String deductorName;

	@Column(name = "deductor_pan")
	String deductorPan;

	@Column(name = "tds_deposited")
	int tdsDeposited;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDeductorName() {
		return deductorName;
	}

	public void setDeductorName(String deductorName) {
		this.deductorName = deductorName;
	}

	public String getDeductorPan() {
		return deductorPan;
	}

	public void setDeductorPan(String deductorPan) {
		this.deductorPan = deductorPan;
	}

	public int getTdsDeposited() {
		return tdsDeposited;
	}

	public void setTdsDeposited(int tdsDeposited) {
		this.tdsDeposited = tdsDeposited;
	}

	@Override
	public String toString() {
		return "TDSMaster [id=" + id + ", deductorName=" + deductorName + ", deductorPan=" + deductorPan
				+ ", tdsDeposited=" + tdsDeposited + "]";
	}
	
	

}
