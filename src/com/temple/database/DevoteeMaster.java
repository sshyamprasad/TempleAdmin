package com.temple.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import com.temple.dao.DAO;
import com.temple.database.beans.DevoteeBean;

public class DevoteeMaster {

	
	Connection connection;
	PreparedStatement pstmt;
	ResultSet result = null;
	String sql = "";
	ResultSet rs;
	
	public int addNewDevotee(DevoteeBean devotee) {
		try {
			connection = DAO.getConnection();
			sql = "INSERT INTO `temple`.`devotee_master` " +
			"(`Devotee_Id`, `Devotee_Surname`, `Devotee_Name`, `Devotee_Address`, `Devotee_City`, `Devotee_Phone`, " +
			"`Devotee_Email`, `Devotee_Gotra`, `Devotee_Nakshatra`, `Devotee_IsCommitteeMember`, " +
			"`Devotee_IsLifeMember`,`Devotee_IsContributedInBuildingFund`, `Devotee_Alternate_ContactNumber`) VALUES(" + 
			devotee.getDevotee_Id() + ",'" + devotee.getDevotee_Surname() + "','" + devotee.getDevotee_Name() + "','"  + devotee.getDevotee_Address() +"','" + devotee.getDevotee_City() + "','" +devotee.getDevotee_Phone() +"','" +
			devotee.getDevotee_Email() + "','"  + devotee.getDevotee_Gotra() +"','" + devotee.getDevotee_Nakshatra() + "','" + devotee.getDevotee_IsCommitteeMember() + "','" +
			devotee.getDevotee_IsLifeMember() + "','"  + devotee.getDevotee_IsContributedInBuildingFund()+"','"  + devotee.getDevotee_Alternate_ContactNumber() + "')";
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
	
	public int updateDevotee(DevoteeBean devotee) {
		try {
			connection = DAO.getConnection();
			sql = "UPDATE `temple`.`devotee_master` SET" + 
			"`Devotee_Surname` = '" + devotee.getDevotee_Surname() + "', `Devotee_Name`=" + "'" + devotee.getDevotee_Name() + "',`Devotee_Address`='" + devotee.getDevotee_Address() + "', `Devotee_City` = '" + devotee.getDevotee_City() + "',`Devotee_Phone` = '" +devotee.getDevotee_Phone() +"'," +
			"`Devotee_Email` = '" +	devotee.getDevotee_Email() + "', `Devotee_Gotra`='"  + devotee.getDevotee_Gotra() +"', `Devotee_Nakshatra`='" + devotee.getDevotee_Nakshatra() + "', `Devotee_IsCommitteeMember` = '" + devotee.getDevotee_IsCommitteeMember() + "', " +
			"`Devotee_IsLifeMember`='" +devotee.getDevotee_IsLifeMember() + "',`Devotee_IsContributedInBuildingFund`='"  + devotee.getDevotee_IsContributedInBuildingFund()+"', `Devotee_Alternate_ContactNumber`='" + devotee.getDevotee_Alternate_ContactNumber() + "' WHERE `Devotee_Id` = " + devotee.getDevotee_Id(); 
			
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
	
	public Vector<DevoteeBean> getDevoteeMaster() {
		try {
			connection = DAO.getConnection();
			sql = "SELECT * FROM DEVOTEE";
			
			System.out.println("SQL: " + sql);
			pstmt = connection.prepareStatement( sql );
			result = pstmt.executeQuery();
			Vector<DevoteeBean> sevaList = new Vector<DevoteeBean>();
			//Convert from result set to Bean classes
			DevoteeBean devoteeDetails = null;
			while(result.next()) {
				devoteeDetails = new DevoteeBean();
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
				System.out.println("Added seva bean to vector list: " + devoteeDetails.toString());
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
	
	public DevoteeBean getDevoteeMaster(int devoteeID) {
		try {
			connection = DAO.getConnection();
			sql = "SELECT * FROM DEVOTEE WHERE Devotee_Id = " + devoteeID;
			
			System.out.println("SQL: " + sql);
			pstmt = connection.prepareStatement( sql );
			result = pstmt.executeQuery();
//			Vector<DevoteeBean> sevaList = new Vector<DevoteeBean>();
			//Convert from result set to Bean classes
			DevoteeBean devoteeDetails = null;
//			while(result.next()) {
				devoteeDetails = new DevoteeBean();
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
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DevoteeMaster dm = new DevoteeMaster();
		DevoteeBean db = new DevoteeBean("Suswaram","Sudha Ramy", "Palamaner" ,"Palamaner","8147312112", "sudha.bojji91@gmail.com", "", "" , "","","","");
		db.setDevotee_Id(5);
		dm.updateDevotee(db);
//		dm.addNewDevotee(db);
		

	}

}
