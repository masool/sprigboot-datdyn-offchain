package com.datdyn.postgress.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.datdyn.postgress.entity.PIIData;
import com.datdyn.postgress.mapper.PIIDataRowMapper;
import com.datdyn.postgress.service.PIIDataService;
@Repository
public class PIIDataImpl implements PIIDataService{
	
	public PIIDataImpl(NamedParameterJdbcTemplate template) {  
        this.template = template;  
}  
	NamedParameterJdbcTemplate template;  
	@Override
	public List<PIIData> findAll() {
		return template.query("select * from employee", new PIIDataRowMapper());
	}
	@Override
	public void insertPIIData(PIIData pii) {
		 final String sql = "insert into piidata(id,NAME,ADDRESS,EMAIL,MOBILENO,GENDER,DOB,PROFESSION) values(:piiId,:piiName,:piiAddress,:piiEmail,:piiMobileno,:piiGender,:piiDOB,:piiProfession)";
		 
	        KeyHolder holder = new GeneratedKeyHolder();
	        SqlParameterSource param = new MapSqlParameterSource()
					.addValue("piiId", pii.getPiiId()) //changes Employee as Pii for all fields
					.addValue("piiName", pii.getPiiName())
					.addValue("piiAddress", pii.getPiiAddress())
					.addValue("piiEmail", pii.getPiiEmail())
	                .addValue("piiMobileno", pii.getPiiMobileno())
	                .addValue("piiGender", pii.getPiiGender())
	                .addValue("piiDOB", pii.getPiiDOB())
	                .addValue("piiProfession", pii.getPiiProfession());
	        template.update(sql,param, holder);
	 
	}
	@Override
	public void updatePIIData(PIIData pii) {
		 final String sql = "update piidata set Name=:piiName, Address=:piiAddress, Email=:piiEmail, Mobileno=:piiMobileno, Gender=:piiGender, DOB=:piiDOB, Profession=:piiProfession where id=:piiId";
		 
	        KeyHolder holder = new GeneratedKeyHolder();
	        SqlParameterSource param = new MapSqlParameterSource()
					.addValue("piiId", pii.getPiiId()) //changes Employee as Pii for all fields
					.addValue("piiName", pii.getPiiName())
					.addValue("piiAddress", pii.getPiiAddress())
					.addValue("piiEmail", pii.getPiiEmail())
	                .addValue("piiMobileno", pii.getPiiMobileno())
	                .addValue("piiGender", pii.getPiiGender())
	                .addValue("piiDOB", pii.getPiiDOB())
	                .addValue("piiProfession", pii.getPiiProfession());
	        template.update(sql,param, holder);
	 
	}
	@Override
	public void executeUpdatePIIData(PIIData pii) {
		 final String sql = "update piidata set Name=:piiName, Address=:piiAddress, Email=:piiEmail, Mobileno=:piiMobileno, Gender=:piiGender, DOB=:piiDOB, Profession=:piiProfession where id=:piiId";
			 

		 Map<String,Object> map=new HashMap<String,Object>();  
		 map.put("piiId", pii.getPiiId()); //changes Employee as Pii for all fields
		 map.put("piiName", pii.getPiiName());
		 map.put("piiAddress", pii.getPiiAddress());
		 map.put("piiEmail", pii.getPiiEmail());
         map.put("piiMobileno", pii.getPiiMobileno());
         map.put("piiGender", pii.getPiiGender());
         map.put("piiDOB", pii.getPiiDOB());
         map.put("piiProfession", pii.getPiiProfession());;
	
		 template.execute(sql,map,new PreparedStatementCallback<Object>() {  
			    @Override  
			    public Object doInPreparedStatement(PreparedStatement ps)  
			            throws SQLException, DataAccessException {  
			        return ps.executeUpdate();  
			    }  
			});  

	 
	}
	@Override
	public void deletePIIData(PIIData pii) {
		 final String sql = "delete from piidata where id=:piiId";
			 

		 Map<String,Object> map=new HashMap<String,Object>();  
		 map.put("piiId", pii.getPiiId());
	
		 template.execute(sql,map,new PreparedStatementCallback<Object>() {  
			    @Override  
			    public Object doInPreparedStatement(PreparedStatement ps)  
			            throws SQLException, DataAccessException {  
			        return ps.executeUpdate();  
			    }  
			});  

	 
	}
	
}
