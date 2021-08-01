package com.Company;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="teamreport")
public class Teamreport {
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="ID")
	private int tokenid;
	
	@Column(name="teamname")
	private String teamname;
	
	@Column(name="noofcandidate")
	private int noofcandidate;
	
	@Column(name="hours")
	private String hours;
	
	@Column(name="status")
	private String status;
	
	@Column(name="date")
	private String date;
	
	@Column(name="taskname")
	private String taskname;
	
	public Teamreport() {
	}

	public Teamreport(String teamname, int noofcandidate, String hours, String status, String date,
			String taskname) {
		this.teamname = teamname;
		this.noofcandidate = noofcandidate;
		this.hours = hours;
		this.status = status;
		this.date = date;
		this.taskname = taskname;
	}

	public int getTokenid() {
		return tokenid;
	}

	public void setTokenID(int tokenid) {
		this.tokenid = tokenid;
	}

	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String team_name) {
		this.teamname = team_name;
	}

	public int getNoofcandidate() {
		return noofcandidate;
	}

	public void setNoofcandidate(int noofcandidate) {
		this.noofcandidate = noofcandidate;
	}

	public String getHours() {
		return hours;
	}

	public void setHours(String hours) {
		this.hours = hours;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTaskname() {
		return taskname;
	}

	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}
}
