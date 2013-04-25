package com.temple.database.beans;

import java.sql.Date;

public class DevoteeSevaDetailsBean {
	
	public int getDevotee_Seva_Details_Id() {
		return devotee_Seva_Details_Id;
	}

	public void setDevotee_Seva_Details_Id(int devoteeSevaDetailsId) {
		devotee_Seva_Details_Id = devoteeSevaDetailsId;
	}

	public int getSeva_Id() {
		return seva_Id;
	}

	public void setSeva_Id(int sevaId) {
		seva_Id = sevaId;
	}

	public int getDevotee_Id() {
		return devotee_Id;
	}

	public void setDevotee_Id(int devoteeId) {
		devotee_Id = devoteeId;
	}

	public Date getDevotee_Seva_Date() {
		return devotee_Seva_Date;
	}

	public void setDevotee_Seva_Date(Date devoteeSevaDate) {
		devotee_Seva_Date = devoteeSevaDate;
	}

	public String getDevotee_Seva_Onbehalf() {
		return devotee_Seva_Onbehalf;
	}

	public void setDevotee_Seva_Onbehalf(String devoteeSevaOnbehalf) {
		devotee_Seva_Onbehalf = devoteeSevaOnbehalf;
	}

	public String getDevotee_Name() {
		return devotee_Name;
	}

	public void setDevotee_Name(String devoteeName) {
		devotee_Name = devoteeName;
	}

	public String getDevotee_Gotra() {
		return devotee_Gotra;
	}

	public void setDevotee_Gotra(String devoteeGotra) {
		devotee_Gotra = devoteeGotra;
	}

	public String getDevotee_Nakshatra() {
		return devotee_Nakshatra;
	}

	public void setDevotee_Nakshatra(String devoteeNakshatra) {
		devotee_Nakshatra = devoteeNakshatra;
	}

	public int getAdvance_Amount() {
		return advance_Amount;
	}

	public void setAdvance_Amount(int advanceAmount) {
		advance_Amount = advanceAmount;
	}

	public int getAmount_Due() {
		return amount_Due;
	}

	public void setAmount_Due(int amountDue) {
		amount_Due = amountDue;
	}

	int devotee_Seva_Details_Id; 
	int seva_Id; 
	int devotee_Id;
	Date devotee_Seva_Date;
//	enum  devotee_Seva_Onbehalf_Values {YES, NO}; 
	String devotee_Seva_Onbehalf;
	String devotee_Name; 
	String devotee_Gotra; 
	String devotee_Nakshatra; 
	int advance_Amount; 
	int amount_Due;
	
	public DevoteeSevaDetailsBean(){
		
	}
	
	public DevoteeSevaDetailsBean(int sevaId, int devoteeId, Date date, String onbehalf) {
//		this.devotee_Seva_Details_Id = id; 
		this.seva_Id = sevaId; 
		this.devotee_Id = devoteeId;
		this.devotee_Seva_Date = date;
		this.devotee_Seva_Onbehalf = onbehalf;
	}
	
	public DevoteeSevaDetailsBean(int sevaId, int devoteeId, Date date, String onbehalf,
								String name, String gotra, String nakshatra, int advAmnt, int dueAmnt) {
//		this.devotee_Seva_Details_Id = id; 
		this.seva_Id = sevaId; 
		this.devotee_Id = devoteeId;
		this.devotee_Seva_Date = date;
		this.devotee_Seva_Onbehalf = onbehalf;
		
		this.devotee_Name = name;
		this.devotee_Gotra = gotra;
		this.devotee_Nakshatra = nakshatra;
		this.advance_Amount = advAmnt;
		this.amount_Due = dueAmnt;
	}
	
	
	
	
}
