package com.wat.dao.impl;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import com.wat.dao.UserDAO;
public class UserDAOImpl  extends   JdbcDaoSupport   implements   UserDAO {
	public void add() {
				  String   sql="insert  into  tb_user(username,password)values('Jik9','a9')";
			      JdbcTemplate      jdbcTemplate=this.getJdbcTemplate();
			      jdbcTemplate.execute(sql);
			      
			      int   a=10/1;       //�����ع������������Ĵ��붼����ִ�С�
			      
			      
			      String   sql2="insert  into  tb_user(username,password)values('Jik99','a99')";
			      jdbcTemplate.execute(sql2);
	}
}

/*��һ�������
                  String   sql="insert  into  tb_user(username,password)values('Jik9','a9')";
			      JdbcTemplate      jdbcTemplate=this.getJdbcTemplate();
			      jdbcTemplate.execute(sql);
			      
			      int   a=10/0;       //�����ع������������Ĵ��붼����ִ�С�
			      
			      
			      String   sql2="insert  into  tb_user(username,password)values('Jik99','a99')";
			      jdbcTemplate.execute(sql2);
			      
 �ڶ��������
                  String   sql="insert  into  tb_user(username,password)values('Jik9','a9')";
			      JdbcTemplate      jdbcTemplate=this.getJdbcTemplate();
			      jdbcTemplate.execute(sql);
			      try {
			    	  int   a=10/0;       //���񲻻�ع�����������������붼ִ�С�
				  } catch (Exception e) {
					  
				  }
			      
			      String   sql2="insert  into  tb_user(username,password)values('Jik99','a99')";
			      jdbcTemplate.execute(sql2);
  �����֣�
                   try {
					      String   sql="insert  into  tb_user(username,password)values('Jik9','a9')";
					      JdbcTemplate      jdbcTemplate=this.getJdbcTemplate();
					      jdbcTemplate.execute(sql);
					      
					      int   a=10/0;       //��ȷ������Ĵ��벻��ִ�У����񲻻�ع�������Ĵ����ִ�С�
					      
					      String   sql2="insert  into  tb_user(username,password)values('Jik99','a99')";
					      jdbcTemplate.execute(sql2);
		      
				   } catch (Exception e) {
					   
				   }
*/