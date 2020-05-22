package com.datdyn.postgress.controller;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.datdyn.postgress.entity.PIIData;
import com.datdyn.postgress.service.PIIDataService;

@RestController
@RequestMapping("/postgressApp")
public class ApplicationController {

	@Resource 
	PIIDataService piiDataService;
	
	@GetMapping(value = "/piidataList")
	public List<PIIData> getPIIData() {
		return piiDataService.findAll();
	
	}
	
	@PostMapping(value = "/createPiiData")
	public String createPIIData(@RequestBody PIIData pii) {
		piiDataService.insertPIIData(pii);
		return "Data has been stored into PIIDATA table successfully..!";
	
	}
	@PutMapping(value = "/updatePiiData")
	public String updatePIIData(@RequestBody PIIData pii) {
		piiDataService.updatePIIData(pii);
		return "data has been updated successfully..!";
	
	}
	@PutMapping(value = "/executeUpdatePiiData")
	public String executeUpdatePIIData(@RequestBody PIIData pii) {
		piiDataService.executeUpdatePIIData(pii);
		return "Data Modified and updated into PIIDATA table successfully..!";
	
	}
	
	@DeleteMapping(value = "/deletePiiDataById")
	public String deletePIIData(@RequestBody PIIData pii) {
		piiDataService.deletePIIData(pii);
		return "Data has been deleted successfully..!";
	
	}
	
	
}
