package com.temple.database.beans;

import java.sql.Date;
import java.util.Calendar;


public class SevaBean {
	
	public SevaBean() {
		
	}
	
	public SevaBean(String sevaName, String sevaDetail, int sevaAmounnt, int isSplSeva) {
		this.sevaName = sevaName;
		this.sevaDetails = sevaDetail;
		this.sevaAmount = sevaAmounnt;
		this.isSplSeva = isSplSeva;
		
		noOfPersonsAllowed = 0;
		sevaPrasadametails = "";
		long time = Calendar.getInstance().getTimeInMillis();
		lastModdifieddate = new java.sql.Date(time) ;
		lastModifiedBy = "";
		modificationReason = "";
		isSevaActive = 1;
	}
	
	public SevaBean(String sevaName, String sevaDetail, int sevaAmounnt, int isSplSeva,
			int noOfPersns, String sevaPrasadamDetails,Date date, String userName) {
		this.sevaName = sevaName;
		this.sevaDetails = sevaDetail;
		this.sevaAmount = sevaAmounnt;
		this.isSplSeva = isSplSeva;
		
		this.noOfPersonsAllowed = noOfPersns;
		this.sevaPrasadametails = sevaPrasadamDetails;
		//long time = Calendar.getInstance().getTimeInMillis();
		this.lastModdifieddate = date ;
		this.lastModifiedBy = userName;
		this.modificationReason = "";
		this.isSevaActive = 1;
	}
	
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
	public Date getLastModdifieddate() {
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

}
