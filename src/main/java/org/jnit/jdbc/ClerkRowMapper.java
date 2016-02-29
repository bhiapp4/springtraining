package org.jnit.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ClerkRowMapper implements RowMapper<Clerk>{

	@Override
	public Clerk mapRow(ResultSet rs, int arg1) throws SQLException {
		return new Clerk(rs.getString("ssn"),rs.getDate("joinedDate"),rs.getDate("terminationDate"),rs.getString("name"), rs.getInt("active") == 1 ? true : false);
	}
}
