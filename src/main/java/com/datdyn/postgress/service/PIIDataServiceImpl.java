package com.datdyn.postgress.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.datdyn.postgress.PII.PIIData;
@Component
public class PIIDataServiceImpl implements PIIData{
	@Resource 
	PIIData piidata;
	@Override
	public List<PIIData> findAll() {
		return piidata.findAll();
	}
	@Override
	public void insertPIIData(PIIData pii) {
		piidata.insertPIIData(pii);
		
	}
	@Override
	public void updatePIIData(PIIData pii) {
		piidata.updatePIIData(pii);
		
	}
	@Override
	public void executeUpdatePIIData(PIIData pii) {
		piidata.executeUpdatePIIData(pii);
		
	}

	@Override
	public void deletePIIData(PIIData pii) {
		piidata.deletePIIData(pii);
		
	}
}
