package org.jnit.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository//better exception handling for database exceptions
public class ClerkDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void createClerk(Clerk clerk){
		String sql = "insert into clerk(ssn,name,joinedDate,terminationDate,active)values(?,?,?,?,?)";
		int noOfRows = jdbcTemplate.update(sql, new Object[]{clerk.getSsn(),clerk.getName(),clerk.getJoinedDate(),clerk.getTerminationDate(), clerk.isActive() ? 1 : 0});
		System.out.println(noOfRows);
	}
	
	public Clerk readClerk(String ssn){
		String sql = "select * from clerk where ssn = ?";
		return jdbcTemplate.queryForObject(sql, new Object[]{ssn}, new ClerkRowMapper());
	}
	
	public List<Clerk>readAll(){
		String sql = "select * from clerk";
		return jdbcTemplate.query(sql, new ClerkRowMapper());
	}
	
	public void updateClerk(String name, String ssn){
		String sql = "update clerk set name = ? where ssn = ?";
		jdbcTemplate.update(sql, new Object[]{name,ssn});
	}
	
	public void deleteClerk(String ssn){
		jdbcTemplate.update("delete from clerk where ssn = ?", new Object[]{ssn});
	}
}
