package com.creditcard;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PanDetails")
public class PanScore {
	@Id
	@Column(name="panno")
	private String pannumber;
	@Column(name="score")
	private double creditscore;
	
	public PanScore(){
		
	}

	public String getPannumber() {
		return pannumber;
	}

	public void setPannumber(String pannumber) {
		this.pannumber = pannumber;
	}

	public double getCreditscore() {
		return creditscore;
	}

	public void setCreditscore(double creditscore) {
		this.creditscore = creditscore;
	}
	
	@Override
	public String toString() {
		return pannumber+" "+creditscore;
	}

}
