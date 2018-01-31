package com.psl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psl.beans.Admin;
import com.psl.beans.Donor;
import com.psl.dao.IEmpDAO;

@Service
public class DonorService {

	@Autowired
private IEmpDAO dao;
	
	public IEmpDAO getDao() {
		return dao;
	}

	public void setDao(IEmpDAO dao) {
		this.dao = dao;
	}

	public void createEmployee(Donor e) {
		dao.createEmp(e);
		
	}

	public void deleteEmployee(String name) {
		dao.deleteEmployee(name);
		
	}
	
	public List<Donor> getAllDonor() {
		return dao.getAllDonor();
		
	}

	public List<Admin> getAllAdmins() {
		// TODO Auto-generated method stub
		return dao.getAllAdmins();
	}
	
}

