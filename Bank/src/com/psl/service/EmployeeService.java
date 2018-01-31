package com.psl.service;

import java.util.List;



import com.psl.beans.Transaction;
import com.psl.beans.User;
import com.psl.dao.IEmpDAO;

public class EmployeeService {

	private IEmpDAO dao;
	
	public IEmpDAO getDao() {
		return dao;
	}

	public void setDao(IEmpDAO dao) {
		this.dao = dao;
	}

	public void createEmployee(Transaction e) {
		dao.createEmp(e);
		
	}
//	public void updateEmployee(int id,String name) {
//		// TODO Auto-generated method stub
//		dao.updateEmployee(id, name);
//	}
//	public void deleteEmployee(int id) {
//		dao.deleteEmployee(id);
//		
//	}
//	
	public List<Transaction> getAllEmployees() {
		return dao.getAllEmployees();
		
	}

	public void withdraw(int id,int newa){
		dao.withdraw(id, newa);
		
	}
	public void desposit(int id,int newa){
		dao.deposit(id, newa);
	}
}
