package com.temple.database;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import com.temple.dao.DAO;
import com.temple.database.beans.DevoteeBean;
import com.temple.database.beans.DevoteeSevaBean;
import com.temple.database.beans.DevoteeSevaDetailsBean;

public class DevoteeSevaDetails {

	
	Connection connection;
	PreparedStatement pstmt;
	ResultSet result = null;
	String sql = "";
	ResultSet rs;
	
	
	public int addNewDevoteeSeva(DevoteeSevaDetailsBean devotee) {
		try {
			connection = DAO.getConnection();
			sql = "INSERT INTO `temple`.`devotee_seva_details` " +
			"(`Devotee_Seva_Details_Id`, `Seva_Id`, `Devotee_Id`, `Devotee_Seva_Date`, `Devotee_Seva_Onbehalf`, `Devotee_Name`, " +
			"`Devotee_Gotra`, `Devotee_Nakshatra`, `Advance_Amount`, `Amount_Due`) VALUES(" + 
			devotee.getDevotee_Id() + "," + devotee.getSeva_Id() + "," + devotee.getDevotee_Id() + ",'"  + devotee.getDevotee_Seva_Date() +"','" + devotee.getDevotee_Seva_Onbehalf() + "','" +devotee.getDevotee_Name() +"','" +
			devotee.getDevotee_Gotra() + "','"  + devotee.getDevotee_Nakshatra() +"'," + devotee.getAdvance_Amount() + "," + devotee.getAmount_Due() + ")";
			System.out.println("SQL: " + sql);
			pstmt = connection.prepareStatement( sql );
			pstmt.executeUpdate();
			connection.close();
			return 1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
	}
	
	public int updateDevoteeSeva(DevoteeSevaDetailsBean devotee) {
		try {
			connection = DAO.getConnection();
			sql = "UPDATE `temple`.`devotee_seva_details` SET " + 
			"Seva_Id = " + devotee.getSeva_Id() + ", Devotee_Id=" + devotee.getDevotee_Id() + ",Devotee_Seva_Date='" + devotee.getDevotee_Seva_Date() + "', Devotee_Seva_Onbehalf = '" + devotee.getDevotee_Seva_Onbehalf() + "',Devotee_Name = '" +devotee.getDevotee_Name() +"'," +
			"Devotee_Gotra  = '" +	devotee.getDevotee_Gotra() + "', Devotee_Nakshatra='"  + devotee.getDevotee_Nakshatra() +"', Advance_Amount=" + devotee.getAdvance_Amount() + ", Amount_Due = " + devotee.getAmount_Due() + " WHERE Devotee_Seva_Details_Id = " + devotee.getDevotee_Seva_Details_Id(); 
			
			System.out.println("SQL: " + sql);
			pstmt = connection.prepareStatement( sql );
			pstmt.executeUpdate();
			connection.close();
			return 1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
	}
	
	public Vector<DevoteeSevaBean> getDevoteeSevaDetails() {
		try {
			connection = DAO.getConnection();
			sql = "SELECT * FROM temple.Devotee_Seva_Details, temple.devotee_master, temple.seva_master " +
					"where temple.Devotee_Seva_Details.Seva_Id =  temple.seva_master.Seva_ID and" +
					"temple.Devotee_Seva_Details.Devotee_Id = temple.devotee_master.devotee_id";
			
			System.out.println("SQL: " + sql);
			pstmt = connection.prepareStatement( sql );
			result = pstmt.executeQuery();
			Vector<DevoteeSevaBean> sevaList = new Vector<DevoteeSevaBean>();
			//Convert from result set to Bean classes
			DevoteeSevaBean devoteeDetails = null;
			while(result.next()) {
				devoteeDetails = new DevoteeSevaBean();
				
//				Set Devotee Seva Details
				devoteeDetails.setDevotee_Seva_Details_Id(result.getInt("Devotee_Seva_Details_Id"));
				devoteeDetails.setSevaId(result.getInt("Seva_Id"));
				devoteeDetails.setDevotee_Id(result.getInt("Devotee_Id"));
				devoteeDetails.setDevotee_Seva_Date(result.getDate("Devotee_Seva_Date"));
				devoteeDetails.setDevotee_Seva_Onbehalf(result.getString("Devotee_Seva_Onbehalf"));
				devoteeDetails.setDevotee_Name(result.getString("Devotee_Name"));
				devoteeDetails.setDevotee_Gotra(result.getString("Devotee_Gotra"));
				devoteeDetails.setDevotee_Nakshatra(result.getString("Devotee_Nakshatra"));
				devoteeDetails.setAdvance_Amount(result.getInt("Advance_Amount"));
				devoteeDetails.setAmount_Due(result.getInt("Amount_Due"));
//				Set Devotee Details
				devoteeDetails.setDevotee_Id(result.getInt("Devotee_Id"));
				devoteeDetails.setDevotee_Surname(result.getString("Devotee_Surname"));
				devoteeDetails.setDevotee_Nakshatra(result.getString("Devotee_Name"));
				devoteeDetails.setDevotee_Address(result.getString("Devotee_Address"));
				devoteeDetails.setDevotee_City(result.getString("Devotee_City"));
				devoteeDetails.setDevotee_Phone(result.getString("Devotee_Phone"));
				devoteeDetails.setDevotee_Email(result.getString("Devotee_Email"));
				devoteeDetails.setDevotee_Gotra(result.getString("Devotee_Gotra"));
				devoteeDetails.setDevotee_Nakshatra(result.getString("Devotee_Nakshatra"));
				devoteeDetails.setDevotee_IsCommitteeMember(result.getString("Devotee_IsCommitteeMember"));
				devoteeDetails.setDevotee_IsLifeMember(result.getString("Devotee_IsLifeMember"));
				devoteeDetails.setDevotee_IsContributedInBuildingFund(result.getString("Devotee_IsContributedInBuildingFund"));
				devoteeDetails.setDevotee_Alternate_ContactNumber(result.getString("Devotee_Alternate_ContactNumber"));
				
//				Add Seva Details
				
				devoteeDetails.setSevaName(result.getString("Seva_Name"));
				devoteeDetails.setSevaDetails(result.getString("Seva_Details"));
				devoteeDetails.setSevaAmount(result.getInt("Seva_Amount"));
				devoteeDetails.setIsSplSeva(result.getInt("Is_Spl_Seva"));
				devoteeDetails.setNoOfPersonsAllowed(result.getInt("Persons_Allowed"));
				devoteeDetails.setSevaPrasadametails(result.getString("Seva_Prasadam_Details"));
				devoteeDetails.setLastModdifieddate(result.getDate("Last_modified_date"));
				devoteeDetails.setLastModifiedBy(result.getString("Last_modifiedBy"));
				devoteeDetails.setModificationReason(result.getString("Modified_Reason"));
				devoteeDetails.setIsSevaActive(result.getInt("Is_seva_active"));
				devoteeDetails.setSuggestions(result.getString("suggestions"));
							
				System.out.println("Added seva details bean to vector list: " + devoteeDetails.toString());
				sevaList.add(devoteeDetails);
				System.out.println("Fetched seva master id:" + result.getInt("Seva_ID"));
			}
			connection.close();
			return sevaList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public DevoteeSevaBean getDevoteeSevaDetails(int id) {
		try {
			connection = DAO.getConnection();
			sql = "SELECT * FROM temple.Devotee_Seva_Details, temple.devotee_master, temple.seva_master " +
			"where temple.Devotee_Seva_Details.Seva_Id =  temple.seva_master.Seva_ID and" +
			"temple.Devotee_Seva_Details.Devotee_Id = temple.devotee_master.devotee_id and" +
			"Devotee_Seva_Details_Id=" + id;
	
			System.out.println("SQL: " + sql);
			pstmt = connection.prepareStatement( sql );
			result = pstmt.executeQuery();
//			Vector<DevoteeSevaDetailsBean> sevaList = new Vector<DevoteeSevaDetailsBean>();
			//Convert from result set to Bean classes
			DevoteeSevaBean devoteeDetails = new DevoteeSevaBean();;
//			while(result.next()) {
//			Set Devotee Seva Details
			devoteeDetails.setDevotee_Seva_Details_Id(result.getInt("Devotee_Seva_Details_Id"));
			devoteeDetails.setSevaId(result.getInt("Seva_Id"));
			devoteeDetails.setDevotee_Id(result.getInt("Devotee_Id"));
			devoteeDetails.setDevotee_Seva_Date(result.getDate("Devotee_Seva_Date"));
			devoteeDetails.setDevotee_Seva_Onbehalf(result.getString("Devotee_Seva_Onbehalf"));
			devoteeDetails.setDevotee_Name(result.getString("Devotee_Name"));
			devoteeDetails.setDevotee_Gotra(result.getString("Devotee_Gotra"));
			devoteeDetails.setDevotee_Nakshatra(result.getString("Devotee_Nakshatra"));
			devoteeDetails.setAdvance_Amount(result.getInt("Advance_Amount"));
			devoteeDetails.setAmount_Due(result.getInt("Amount_Due"));
//			Set Devotee Details
			devoteeDetails.setDevotee_Id(result.getInt("Devotee_Id"));
			devoteeDetails.setDevotee_Surname(result.getString("Devotee_Surname"));
			devoteeDetails.setDevotee_Nakshatra(result.getString("Devotee_Name"));
			devoteeDetails.setDevotee_Address(result.getString("Devotee_Address"));
			devoteeDetails.setDevotee_City(result.getString("Devotee_City"));
			devoteeDetails.setDevotee_Phone(result.getString("Devotee_Phone"));
			devoteeDetails.setDevotee_Email(result.getString("Devotee_Email"));
			devoteeDetails.setDevotee_Gotra(result.getString("Devotee_Gotra"));
			devoteeDetails.setDevotee_Nakshatra(result.getString("Devotee_Nakshatra"));
			devoteeDetails.setDevotee_IsCommitteeMember(result.getString("Devotee_IsCommitteeMember"));
			devoteeDetails.setDevotee_IsLifeMember(result.getString("Devotee_IsLifeMember"));
			devoteeDetails.setDevotee_IsContributedInBuildingFund(result.getString("Devotee_IsContributedInBuildingFund"));
			devoteeDetails.setDevotee_Alternate_ContactNumber(result.getString("Devotee_Alternate_ContactNumber"));
			
//			Add Seva Details
			
			devoteeDetails.setSevaName(result.getString("Seva_Name"));
			devoteeDetails.setSevaDetails(result.getString("Seva_Details"));
			devoteeDetails.setSevaAmount(result.getInt("Seva_Amount"));
			devoteeDetails.setIsSplSeva(result.getInt("Is_Spl_Seva"));
			devoteeDetails.setNoOfPersonsAllowed(result.getInt("Persons_Allowed"));
			devoteeDetails.setSevaPrasadametails(result.getString("Seva_Prasadam_Details"));
			devoteeDetails.setLastModdifieddate(result.getDate("Last_modified_date"));
			devoteeDetails.setLastModifiedBy(result.getString("Last_modifiedBy"));
			devoteeDetails.setModificationReason(result.getString("Modified_Reason"));
			devoteeDetails.setIsSevaActive(result.getInt("Is_seva_active"));
			devoteeDetails.setSuggestions(result.getString("suggestions"));
				System.out.println("Added seva bean to vector list: " + devoteeDetails.toString());
//				sevaList.add(devoteeDetails);
				System.out.println("Fetched seva master id:" + result.getInt("Seva_ID"));
//			}
			connection.close();
			return devoteeDetails;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

//	public Vector<DevoteeSevaDetailsBean> getDevoteeSevaDetails(String query) {
//		try {
//			connection = DAO.getConnection();
//			sql = "SELECT * FROM Devotee_Seva_Details_Id WHERE ";
//			
//			System.out.println("SQL: " + sql);
//			pstmt = connection.prepareStatement( sql );
//			result = pstmt.executeQuery();
//			Vector<DevoteeSevaDetailsBean> sevaList = new Vector<DevoteeSevaDetailsBean>();
//			//Convert from result set to Bean classes
//			DevoteeSevaDetailsBean devoteeDetails = null;
//			while(result.next()) {
//				devoteeDetails = new DevoteeSevaDetailsBean();
//				devoteeDetails.setDevotee_Seva_Details_Id(result.getInt("Devotee_Seva_Details_Id"));
//				devoteeDetails.setSeva_Id(result.getInt("Seva_Id"));
//				devoteeDetails.setDevotee_Id(result.getInt("Devotee_Id"));
//				devoteeDetails.setDevotee_Seva_Date(result.getDate("Devotee_Seva_Date"));
//				devoteeDetails.setDevotee_Seva_Onbehalf(result.getString("Devotee_Seva_Onbehalf"));
//				devoteeDetails.setDevotee_Name(result.getString("Devotee_Name"));
//				devoteeDetails.setDevotee_Gotra(result.getString("Devotee_Gotra"));
//				devoteeDetails.setDevotee_Nakshatra(result.getString("Devotee_Nakshatra"));
//				devoteeDetails.setAdvance_Amount(result.getInt("Advance_Amount"));
//				devoteeDetails.setAmount_Due(result.getInt("Amount_Due"));
//				System.out.println("Added seva bean to vector list: " + devoteeDetails.toString());
//				sevaList.add(devoteeDetails);
//				System.out.println("Fetched seva master id:" + result.getInt("Seva_ID"));
//			}
//			connection.close();
//			return sevaList;
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			return null;
//		}
//	}
//	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DevoteeSevaDetails dsd = new DevoteeSevaDetails();
//		DevoteeSevaDetailsBean dsb = new DevoteeSevaDetailsBean(2,3,new Date(System.currentTimeMillis()), "NO");
		DevoteeSevaDetailsBean dsb = new DevoteeSevaDetailsBean(2,3,new Date(System.currentTimeMillis()), "YES","Sumadhwa Vijay", "Saunaka", "Swathi", 500,100);
		dsb.setDevotee_Seva_Details_Id(3);
//		dsd.addNewDevoteeSeva(dsb);
		dsd.updateDevoteeSeva(dsb);

	}

}
