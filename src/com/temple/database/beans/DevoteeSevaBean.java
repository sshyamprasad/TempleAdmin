package com.temple.database.beans;

import java.sql.Date;

public class DevoteeSevaBean {

	int Devotee_Id;
	String Devotee_Surname;
	String Devotee_Name;
	String Devotee_Address;
	String Devotee_City;
	String Devotee_Phone;
	String Devotee_Email;
	String Devotee_Gotra;
	String Devotee_Nakshatra;
	String Devotee_IsCommitteeMember;
	String Devotee_IsLifeMember;
	String Devotee_IsContributedInBuildingFund;
	String Devotee_Alternate_ContactNumber;

	int sevaId;
	String sevaName;
	String sevaDetails;
	int sevaAmount;
	int isSplSeva;
	int noOfPersonsAllowed;
	String sevaPrasadametails;
	java.sql.Date lastModdifieddate;
	String lastModifiedBy;
	String modificationReason;
	int isSevaActive;
	String suggestions;

	int devotee_Seva_Details_Id;
	Date devotee_Seva_Date;
	String devotee_Seva_Onbehalf;
	String devotee_Name;
	String devotee_Gotra;
	String devotee_Nakshatra;
	int advance_Amount;
	int amount_Due;

	public int getDevotee_Seva_Details_Id() {
		return devotee_Seva_Details_Id;
	}

	public void setDevotee_Seva_Details_Id(int devoteeSevaDetailsId) {
		devotee_Seva_Details_Id = devoteeSevaDetailsId;
	}

	Date getDevotee_Seva_Date() {
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

	// enum devotee_Seva_Onbehalf_Values {YES, NO};

	public int getSevaId() {
		return sevaId;
	}

	public void setSevaId(int sevaId) {
		this.sevaId = sevaId;
	}

	public String getSevaName() {
		return sevaName;
	}

	public void setSevaName(String sevaName) {
		this.sevaName = sevaName;
	}

	public String getSevaDetails() {
		return sevaDetails;
	}

	public void setSevaDetails(String sevaDetails) {
		this.sevaDetails = sevaDetails;
	}

	public int getSevaAmount() {
		return sevaAmount;
	}

	public void setSevaAmount(int sevaAmount) {
		this.sevaAmount = sevaAmount;
	}

	public int getIsSplSeva() {
		return isSplSeva;
	}

	public void setIsSplSeva(int isSplSeva) {
		this.isSplSeva = isSplSeva;
	}

	public int getNoOfPersonsAllowed() {
		return noOfPersonsAllowed;
	}

	public void setNoOfPersonsAllowed(int noOfPersonsAllowed) {
		this.noOfPersonsAllowed = noOfPersonsAllowed;
	}

	public String getSevaPrasadametails() {
		return sevaPrasadametails;
	}

	public void setSevaPrasadametails(String sevaPrasadametails) {
		this.sevaPrasadametails = sevaPrasadametails;
	}

	public java.sql.Date getLastModdifieddate() {
		return lastModdifieddate;
	}

	public void setLastModdifieddate(java.sql.Date lastModdifieddate) {
		this.lastModdifieddate = lastModdifieddate;
	}

	public String getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public String getModificationReason() {
		return modificationReason;
	}

	public void setModificationReason(String modificationReason) {
		this.modificationReason = modificationReason;
	}

	public int getIsSevaActive() {
		return isSevaActive;
	}

	public void setIsSevaActive(int isSevaActive) {
		this.isSevaActive = isSevaActive;
	}

	public String getSuggestions() {
		return suggestions;
	}

	public void setSuggestions(String suggestions) {
		this.suggestions = suggestions;
	}

	// public DevoteeBean() {
	//		
	// }
	//	
	// public DevoteeBean(String name) {
	// this.Devotee_Name = name;
	//		
	// this.Devotee_IsCommitteeMember = "NO";
	// this.Devotee_IsContributedInBuildingFund = "NO";
	// this.Devotee_IsLifeMember = "NO";
	// }

	// public DevoteeBean( String surname, String name, String address, String
	// city, String phone, String email, String gotra,
	// String nakshatra, String isCommMember, String isLifeMember, String
	// isContBuildFund, String altContNumber) {
	//		 
	// this.Devotee_Surname = surname;
	// this.Devotee_Name = name;
	// this.Devotee_Address = address;
	// this.Devotee_City =city;
	// this.Devotee_Phone = phone;
	// this.Devotee_Email = email;
	// this.Devotee_Gotra = gotra;
	// this.Devotee_Nakshatra = nakshatra;
	// this.Devotee_IsCommitteeMember = isCommMember;
	// this.Devotee_IsLifeMember = isLifeMember;
	// this.Devotee_IsContributedInBuildingFund = isContBuildFund;
	// this.Devotee_Alternate_ContactNumber = altContNumber;
	//
	// }
	//	
	public int getDevotee_Id() {
		return Devotee_Id;
	}

	public void setDevotee_Id(int devoteeId) {
		Devotee_Id = devoteeId;
	}

	public String getDevotee_Surname() {
		return Devotee_Surname;
	}

	public void setDevotee_Surname(String devoteeSurname) {
		Devotee_Surname = devoteeSurname;
	}

	public String getDevotee_Name() {
		return Devotee_Name;
	}

	public void setDevotee_Name(String devoteeName) {
		Devotee_Name = devoteeName;
	}

	public String getDevotee_Address() {
		return Devotee_Address;
	}

	public void setDevotee_Address(String devoteeAddress) {
		Devotee_Address = devoteeAddress;
	}

	public String getDevotee_City() {
		return Devotee_City;
	}

	public void setDevotee_City(String devoteeCity) {
		Devotee_City = devoteeCity;
	}

	public String getDevotee_Phone() {
		return Devotee_Phone;
	}

	public void setDevotee_Phone(String devoteePhone) {
		Devotee_Phone = devoteePhone;
	}

	public String getDevotee_Email() {
		return Devotee_Email;
	}

	public void setDevotee_Email(String devoteeEmail) {
		Devotee_Email = devoteeEmail;
	}

	public String getDevotee_Gotra() {
		return Devotee_Gotra;
	}

	public void setDevotee_Gotra(String devoteeGotra) {
		Devotee_Gotra = devoteeGotra;
	}

	public String getDevotee_Nakshatra() {
		return Devotee_Nakshatra;
	}

	public void setDevotee_Nakshatra(String devoteeNakshatra) {
		Devotee_Nakshatra = devoteeNakshatra;
	}

	public String getDevotee_IsCommitteeMember() {
		return Devotee_IsCommitteeMember;
	}

	public void setDevotee_IsCommitteeMember(String devoteeIsCommitteeMember) {
		Devotee_IsCommitteeMember = devoteeIsCommitteeMember;
	}

	public String getDevotee_IsLifeMember() {
		return Devotee_IsLifeMember;
	}

	public void setDevotee_IsLifeMember(String devoteeIsLifeMember) {
		Devotee_IsLifeMember = devoteeIsLifeMember;
	}

	public String getDevotee_IsContributedInBuildingFund() {
		return Devotee_IsContributedInBuildingFund;
	}

	public void setDevotee_IsContributedInBuildingFund(
			String devoteeIsContributedInBuildingFund) {
		Devotee_IsContributedInBuildingFund = devoteeIsContributedInBuildingFund;
	}

	public String getDevotee_Alternate_ContactNumber() {
		return Devotee_Alternate_ContactNumber;
	}

	public void setDevotee_Alternate_ContactNumber(
			String devoteeAlternateContactNumber) {
		Devotee_Alternate_ContactNumber = devoteeAlternateContactNumber;
	}

}
