package com.datdyn.postgress.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.datdyn.postgress.entity.PIIData;

public class PIIDataRowMapper implements RowMapper<PIIData> {

	@Override
	public PIIData mapRow(ResultSet rs, int arg1) throws SQLException {
		PIIData pii = new PIIData();
		pii.setPIIDataId(rs.getString("piiid"));
		pii.setPIIDataName(rs.getString("piiName"));
		pii.setPIIDataAddress(rs.getString("piiAddress"));
		pii.setPIIDataEmail(rs.getString("piiEmail"));
		pii.setPIIDataMobileno(rs.getString("piiMobileno"));
		pii.setPIIDataGender(rs.getString("piiGender"));
		pii.setPIIDataDOB(rs.getString("piiDOB"));
		pii.setPIIDataProfession(rs.getString("piiProfession"));
		
        return pii;
	}


}
