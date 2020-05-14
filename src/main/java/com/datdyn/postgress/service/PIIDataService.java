package com.datdyn.postgress.service;

import java.util.List;

import com.datdyn.postgress.entity.PIIData;

public interface PIIDataService {
	
	List<PIIData> findAll();

	void insertPIIData(PIIData pii);

	void updatePIIData(PIIData pii);

	void executeUpdatePIIData(PIIData pii);

	void deletePIIData(PIIData pii);

}
