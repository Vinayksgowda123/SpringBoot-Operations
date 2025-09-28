package com.example.practice;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.springframework.stereotype.Repository;

import java.util.*;
@Repository
public class deo {
	
	
	
	
	
	public List<Iplteam> getIplteam() throws Exception 
	{
		ArrayList<Iplteam> teams=new ArrayList<>();
		
			Connection con=DBconnection.getconnection();
			Statement st= con.createStatement();
			ResultSet res=st.executeQuery("select * from Iplteams");
			// You can process the ResultSet here
			while(res.next())
			{
				 String teamname=res.getString("teamname");
				 String teamcaptain=res.getString("teamcaptain");
				 String teamwins=res.getString("teamwins");
				 Iplteam team=new Iplteam(teamname,teamcaptain,teamwins);
				 teams.add(team);
			}
			
		
			return teams;
	}
	public String insertiplteam(Iplteam team) throws Exception {
		
			Connection con=DBconnection.getconnection();
			PreparedStatement pst=con.prepareStatement("insert into Iplteams values(?,?,?)");
			
			pst.setString(1,team.getTeamname());
			pst.setString(2,team.getTeamcaptain());
			pst.setString(3,team.getTeamwins());
			pst.executeUpdate();
			
		
			return "Ipl teams inserted successfully";
	
	}
	public String update(String teamname,String teamcaptain) throws Exception
	{
		Connection con=DBconnection.getconnection();
		PreparedStatement pst=con.prepareStatement("update Iplteams set teamcaptain=? where teamname=?");
		pst.setString(1,teamcaptain);
		pst.setString(2,teamname);
		pst.executeUpdate();	
		
		return "update successfully";
	}
	public String deleteteam(String teamname) throws Exception
	{
		Connection con=DBconnection.getconnection();
		PreparedStatement pst=con.prepareStatement("delete from Iplteams where teamname=?");
		pst.setString(1,teamname);
		pst.executeUpdate();
		return "deleted successfully";
	}
}