package com.example.practice;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;

@org.springframework.stereotype.Service
public class service {

	@Autowired
	deo deo;
	public List<Iplteam> getteams() throws Exception
	{
		
		List<Iplteam> teams=deo.getIplteam();
		return teams;
	}
	public String saveIplteam(Iplteam team) throws Exception
	{
		 String message=deo.insertiplteam(team);
		 return message;
	}
	
	public String updatecaptain(String teamname,String teamcaptain) throws Exception
	{
		String message=deo.update(teamname,teamcaptain);
		return message;
	}
	
	public String deleteam(String teamname) throws Exception
	{
		String message=deo.deleteteam(teamname);
		return message;
	}
	

}
