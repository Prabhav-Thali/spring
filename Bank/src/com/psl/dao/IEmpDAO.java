package com.psl.dao;

import java.util.List;



import com.psl.beans.Transaction;
import com.psl.beans.User;

public interface IEmpDAO {

	void createEmp(Transaction e);
//
	List<Transaction> getAllEmployees();
//
//	void updateEmployee(int id, String name);
//
//	void deleteEmployee(int id);
	void withdraw(int id,int newa);
	
	void deposit(int id,int newa);
}
