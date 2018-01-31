package com.psl.dao;

import java.util.List;

import com.psl.beans.Admin;
import com.psl.beans.Donor;

public interface IEmpDAO {

	void createEmp(Donor e);

	void deleteEmployee(String name);

	List<Donor> getAllDonor();

	List<Admin> getAllAdmins();
}
