package com.example.practice;

import org.springframework.stereotype.Component;

@Component
public class Iplteam {

	String teamname;
	String teamcaptain;
	String teamwins;
	public Iplteam(String teamname, String teamcaptain, String teamwins) {
		super();
		this.teamname = teamname;
		this.teamcaptain = teamcaptain;
		this.teamwins = teamwins;
	}
	public Iplteam() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public String getTeamcaptain() {
		return teamcaptain;
	}
	public void setTeamcaptain(String teamcaptain) {
		this.teamcaptain = teamcaptain;
	}
	public String getTeamwins() {
		return teamwins;
	}
	public void setTeamwins(String teamwins) {
		this.teamwins = teamwins;
	}
	

}
