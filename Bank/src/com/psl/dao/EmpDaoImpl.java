 package com.psl.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.psl.beans.Transaction;
import com.psl.beans.User;


public class EmpDaoImpl extends JdbcDaoSupport implements IEmpDAO{
	User u=new User();
	Transaction t=new Transaction();
	@Override
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false,noRollbackFor={org.springframework.jdbc.BadSqlGrammarException.class})
	public void withdraw(int id, int newa) {
		// TODO Auto-generated method stub
		System.out.println("amount "+u.getInitamt());
		u.setInitamt(u.getInitamt()-newa);
		System.out.println(u.getInitamt());
		getJdbcTemplate().update("update transaction set amount='"+(u.getInitamt()-newa)+"' where id="+id);
		
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false,noRollbackFor={org.springframework.jdbc.BadSqlGrammarException.class})
	public void deposit(int id, int newa) {
		// TODO Auto-generated method stub
		getJdbcTemplate().update("update transaction set amount='"+(t.getAmount()+newa)+"' where id="+id);
	}

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
	public void createEmp(Transaction e) {
		// TODO Auto-generated method stub
//		String sql="insert into employee values("+e.getId()+",'"+e.getName()+"','"+e.getEmail()+"')";
//		System.out.println(sql);
		 getJdbcTemplate().update("insert into transaction values("+e.getId()+",'"+e.getType()+"','"+e.getAmount()+"')");
	}
//
	@Override
	public List<Transaction> getAllEmployees() {
		// TODO Auto-generated method stub
	
		return getJdbcTemplate().query("select * from transaction", new RowMapper<Transaction>(){

			@Override
			public Transaction mapRow(ResultSet rs, int rownum)
					throws SQLException {
				// TODO Auto-generated method stub
				Transaction t=new Transaction();
				t.setId(rs.getInt("id"));
				t.setType(rs.getString("type"));
				t.setAmount(rs.getInt("amount"));
				return t;
				
			}

			
			
		});
	}
	
	
//
//	@Override
//	public void updateEmployee(int id, String name) {
//		// TODO Auto-generated method stub
//		getJdbcTemplate().update("update employee set name='"+name+"' where id="+id);
//		
//	}
//
//	@Override
//	public void deleteEmployee(int id) {
//		// TODO Auto-generated method stub
//		getJdbcTemplate().update("delete from employee where id="+id);
//	}

}
