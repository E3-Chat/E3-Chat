package com.ado.echat.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface RowMapper {
	public abstract Object getObjectMapper(ResultSet rs) throws SQLException;
}
