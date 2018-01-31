package com.psl.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.psl.beans.Admin;
import com.psl.beans.Donor;

@Repository
public class DonDaoImpl implements IEmpDAO {

	@Autowired
	private JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public void createEmp(Donor d) {
		// TODO Auto-generated method stub

//		System.out.println(d.getBg()+" "+d.getPhone()+" "+d.getName());
//		template.update("insert into donor values(" + d.getName() + ",'"
//				+ d.getPhone() + "'," + d.getBg() + ")");

		template.update("insert into donor values('" + d.getName() + "',"
				+ d.getPhone() + ",'" + d.getBg() + "')");
	}

	@Override
	public List<Donor> getAllDonor() {
		// TODO Auto-generated method stub

		return template.query("select * from donor", new RowMapper<Donor>() {

			@Override
			public Donor mapRow(ResultSet rs, int rownum) throws SQLException {
				// TODO Auto-generated method stub
				Donor d = new Donor();

				d.setName(rs.getString("name"));
				d.setPhone(rs.getInt("phone"));
				d.setBg(rs.getString("bg"));

				return d;
			}

		});
	}
	
	
	@Override
	public List<Admin> getAllAdmins() {
		// TODO Auto-generated method stub

		return template.query("select * from admin", new RowMapper<Admin>() {

			@Override
			public Admin mapRow(ResultSet rs, int rownum) throws SQLException {
				// STODO Auto-generated method stub
				Admin a = new Admin();

				a.setUname(rs.getString("uname"));
				a.setPass(rs.getString("password"));

				return a;
			}

		});
	}

	// @Override
	// public void updateEmployee(int phone, String name) {
	// // TODO Auto-generated method stub
	// template.update("update donor set name='"+name+"' where id="+name);
	//
	// }

	@Override
	public void deleteEmployee(String name) {
		// TODO Auto-generated method stub
		template.update("delete from donor where id=" + name);
	}

}
