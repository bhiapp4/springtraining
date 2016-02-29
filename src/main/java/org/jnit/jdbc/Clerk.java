package org.jnit.jdbc;

import java.util.Date;

public class Clerk {

	private String ssn;
	private Date joinedDate;
	private Date terminationDate;
	private String name;
	
	private boolean active;
	
	public Clerk(){
		
	}
	
	public Clerk(String ssn, Date joinedDate, Date terminationDate, String name, boolean active) {
		super();
		this.ssn = ssn;
		this.joinedDate = joinedDate;
		this.terminationDate = terminationDate;
		this.name = name;
		this.active = active;
	}



	public String getSsn() {
		return ssn;
	}
	
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public Date getJoinedDate() {
		return joinedDate;
	}

	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}

	public Date getTerminationDate() {
		return terminationDate;
	}

	public void setTerminationDate(Date terminationDate) {
		this.terminationDate = terminationDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
	
}
