package com.psl.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.psl.beans.Employee;

public class EmpDaoImpl extends JdbcDaoSupport implements IEmpDAO{

//	private JdbcTemplate template;
//	
//	public JdbcTemplate getTemplate() {
//		return template;
//	}
//
//	public void setTemplate(JdbcTemplate template) {
//		this.template = template;
//	}

	@Override
	public void createEmp(Employee e) {
		// TODO Auto-generated method stub
//		String sql="insert into employee values("+e.getId()+",'"+e.getName()+"','"+e.getEmail()+"')";
//		System.out.println(sql);
		 getJdbcTemplate().update("insert into employee values("+e.getId()+",'"+e.getName()+"','"+e.getEmail()+"')");
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
	
		return getJdbcTemplate().query("select * from employee", new RowMapper<Employee>(){

			@Override
			public Employee mapRow(ResultSet rs, int rownum)
					throws SQLException {
				// TODO Auto-generated method stub
				Employee e=new Employee();
				e.setId(rs.getInt("id"));
				e.setName(rs.getString("name"));
				e.setEmail(rs.getString("email"));
				
				return e ;
			}
			
		});
	}

	@Override
	public void updateEmployee(int id, String name) {
		// TODO Auto-generated method stub
		getJdbcTemplate().update("update employee set name='"+name+"' where id="+id);
		
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		getJdbcTemplate().update("delete from employee where id="+id);
	}

}
