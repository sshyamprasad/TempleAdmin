package com.temple.database;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import com.temple.dao.DAO;
import com.temple.database.beans.SevaBean;

public class SevaMaster {
	
	Connection connection;
	PreparedStatement pstmt;
	ResultSet result = null;
	String sql = "";
	ResultSet rs;
	
	public int addNewSeva(SevaBean seva) {
		try {
			connection = DAO.getConnection();
			sql = "INSERT INTO `temple`.`seva_master` " +
			"(`Seva_ID`, `Seva_Name`, `Seva_Details`, `Seva_Amount`, `Is_Spl_Seva`, `Persons_Allowed`, " +
			"`Seva_Prasadam_Details`, `Last_modified_date`, `Last_modifiedBy`, `Modified_reason`, " +
			"`Is_seva_active`) VALUES(" + 
			seva.getSevaId() + ",'" + seva.getSevaName() + "','" + seva.getSevaDetails() + "',"  + seva.getSevaAmount() +"," + seva.getIsSevaActive() + "," +seva.getNoOfPersonsAllowed() +",'" +
			seva.getSevaPrasadametails() + "','"  + seva.getLastModdifieddate() +"','" + seva.getLastModifiedBy() + "','" + seva.getModificationReason() + "'," +
			seva.getIsSevaActive() + ")";
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
	
	public int updateSeva(SevaBean seva) {
		try {
			connection = DAO.getConnection();
			sql = "UPDATE `temple`.`seva_master` SET" +
			"`Seva_Name` = '" + seva.getSevaName() + "', `Seva_Details` = '" + seva.getSevaDetails() + "',"  + "`Seva_Amount` = " + seva.getSevaAmount() +"," + 
			"`Is_Spl_Seva` = " + seva.getIsSevaActive() + ", `Persons_Allowed` = " + seva.getNoOfPersonsAllowed() + "," +
			"`Seva_Prasadam_Details` = '" + seva.getSevaPrasadametails() + "', `Last_modified_date` = '"  + seva.getLastModdifieddate() +"'," + 
			"`Last_modifiedBy` = '" + seva.getLastModifiedBy() + "',`Modified_reason` = '" + seva.getModificationReason() + "'," +
			"`Is_seva_active` = " + seva.getIsSevaActive() + " WHERE `Seva_ID` = " + seva.getSevaId();
			
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
	
	public Vector<SevaBean> getSevaMaster() {
		try {
			connection = DAO.getConnection();
			sql = "SELECT * FROM SEVA_MASTER";
			
			System.out.println("SQL: " + sql);
			pstmt = connection.prepareStatement( sql );
			result = pstmt.executeQuery();
			Vector<SevaBean> sevaList = new Vector<SevaBean>();
			//Convert from result set to Bean classes
			SevaBean sevaDetails = null;
			while(result.next()) {
				sevaDetails = new SevaBean();
				sevaDetails.setSevaId(result.getInt("Seva_ID"));
				sevaDetails.setSevaName(result.getString("Seva_Name"));
				sevaDetails.setSevaDetails(result.getString("Seva_Details"));
				sevaDetails.setSevaAmount(result.getInt("Seva_Amount"));
				sevaDetails.setIsSplSeva(result.getInt("Is_Spl_Seva"));
				sevaDetails.setNoOfPersonsAllowed(result.getInt("Persons_Allowed"));
				sevaDetails.setSevaPrasadametails(result.getString("Seva_Prasadam_Details"));
				sevaDetails.setLastModdifieddate(result.getDate("Last_modified_date"));
				sevaDetails.setLastModifiedBy(result.getString("Last_modifiedBy"));
				sevaDetails.setModificationReason(result.getString("Modified_Reason"));
				sevaDetails.setIsSevaActive(result.getInt("Is_seva_active"));
				System.out.println("Added seva bean to vector list: " + sevaDetails.toString());
				sevaList.add(sevaDetails);
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
	
	public SevaBean getSevaMaster(int sevaID) {
		try {
			connection = DAO.getConnection();
			sql = "SELECT * FROM SEVA_MASTER WHERE SEVA_ID = " + sevaID;
			
			System.out.println("SQL: " + sql);
			pstmt = connection.prepareStatement( sql );
			result = pstmt.executeQuery();
			//Convert from result set to Bean classes
			SevaBean sevaDetails = null;
			sevaDetails = new SevaBean();
			sevaDetails.setSevaId(result.getInt("Seva_ID"));
			sevaDetails.setSevaName(result.getString("Seva_Name"));
			sevaDetails.setSevaDetails(result.getString("Seva_Details"));
			sevaDetails.setSevaAmount(result.getInt("Seva_Amount"));
			sevaDetails.setIsSplSeva(result.getInt("Is_Spl_Seva"));
			sevaDetails.setNoOfPersonsAllowed(result.getInt("Persons_Allowed"));
			sevaDetails.setSevaPrasadametails(result.getString("Seva_Prasadam_Details"));
			sevaDetails.setLastModdifieddate(result.getDate("Last_modified_date"));
			sevaDetails.setLastModifiedBy(result.getString("Last_modifiedBy"));
			sevaDetails.setModificationReason(result.getString("Modified_Reason"));
			sevaDetails.setIsSevaActive(result.getInt("Is_seva_active"));
			System.out.println("Added seva bean to vector list: " + sevaDetails.toString());
			System.out.println("Fetched seva master id:" + result.getInt("Seva_ID"));
			connection.close();
			return sevaDetails;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public static void main(String args[]) {
		SevaMaster sm = new SevaMaster();
		///SevaBean sb = new SevaBean("Pooja", "Pooja details", 100 , 0);
		
		SevaBean sb = new SevaBean("Abhisheka Seva", "Abhisheka Seva", 50, 1, 2, "Rayara Anugraha",new Date(System.currentTimeMillis()), "Shyam");
		sm.addNewSeva(sb);
		//sb.setSevaId(1);
		//sm.updateSeva(sb);
		Vector<SevaBean> results= sm.getSevaMaster();
		for(int result=0; result<results.size(); result++) {
			SevaBean seva = results.get(result);
			System.out.println(seva.getSevaId() );
		}
		
	}
}
