package com.datdyn.postgress.dao;

import java.util.List;

public interface PIIData {

	List<PIIData> findAll();

	void insertPIIData(PIIData pii);

	void updatePIIData(PIIData pii);

	void executeUpdatePIIData(PIIData pii);
	
	public void deletePIIData(PIIData pii);
}
