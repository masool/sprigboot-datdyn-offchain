package com.datdyn.postgress.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.datdyn.postgress.entity.PIIData;

public class PIIDataRowMapper implements RowMapper<PIIData> {

	@Override
	public PIIData mapRow(ResultSet rs, int arg1) throws SQLException {
		PIIData pii = new PIIData();
		pii.setPIIDataId(rs.getString("id"));
		pii.setPIIDataName(rs.getString("name"));
		pii.setPIIDataAddress(rs.getString("address"));
		pii.setPIIDataEmail(rs.getString("email"));
		pii.setPIIDataMobileno(rs.getString("mobileno"));
		pii.setPIIDataGender(rs.getString("gender"));
		pii.setPIIDataDOB(rs.getString("dob"));
		pii.setPIIDataProfession(rs.getString("profession"));
		
        return pii;
	}


}
