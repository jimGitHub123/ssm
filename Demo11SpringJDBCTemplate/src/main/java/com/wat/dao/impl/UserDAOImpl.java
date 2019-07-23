package com.wat.dao.impl;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.wat.bean.User;
import com.wat.dao.UserDAO;
public class UserDAOImpl implements    UserDAO{
	private    JdbcTemplate     jdbcTemplate;
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int save(User user) {
//		System.out.println("ִ����save����");
		String    sql="insert  into   tb_user(username,password) values(?,?)"; 
		Object[]  object=new  Object[]{user.getUsername(),user.getPassword()};//���ǲ�����ֵ������ֵ
		int[]     in=new int[]{java.sql.Types.VARCHAR,java.sql.Types.VARCHAR};//���ǲ��������ͣ���������
		int    num=jdbcTemplate.update(sql, object, in);
		return num;
	}
	public User findById(int id) {
		String   sql="select   *  from  tb_user  where  id=?";
		Object[] objects=new Object[]{id};
		int[]    is=new int[]{java.sql.Types.INTEGER};
		User   user=(User) jdbcTemplate.queryForObject(sql,objects,is, new   UserRowMapper());
		return user;
	}
	public List<User> findAll() {
		List<User>   list=jdbcTemplate.query("select  *  from  tb_user", new UserRowMapper());
		return list;
	}
	public List<User> findByPage(int page) { 
		//query����
		//mysql   select  *  from    tb_user  limit   (page-1)*5,5
		//oracle  select  *  from  (select  A.*  ,ROWNUM   rn  from   (select  *  from  tb_user)  A .......)
		return null;
	}
	public int update(User user, int oldId) {
		//update����
		
		return 0;
	}
	public int delete(int id) {
		//update����    
		return 0;
	}

}
