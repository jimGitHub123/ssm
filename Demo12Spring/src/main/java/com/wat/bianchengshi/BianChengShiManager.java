package com.wat.bianchengshi;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

public class BianChengShiManager {
        private     PlatformTransactionManager   transactionManager;
        private     TransactionTemplate          transactionTemplate;
        private     JdbcTemplate                 jdbcTemplate;
		public PlatformTransactionManager getTransactionManager() {
			return transactionManager;
		}
		public void setTransactionManager(PlatformTransactionManager transactionManager) {
			this.transactionManager = transactionManager;
		}
		public TransactionTemplate getTransactionTemplate() {
			return transactionTemplate;
		}
		public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
			this.transactionTemplate = transactionTemplate;
		}
		public JdbcTemplate getJdbcTemplate() {
			return jdbcTemplate;
		}
		public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
			this.jdbcTemplate = jdbcTemplate;
		}
		public  void  test(){
			      //transactionTemplate����һ������
			try {
				  
				  transactionTemplate.execute(
						  //new��һ������ʵ�������
						  new  TransactionCallback<Object>() {
								public Object doInTransaction(TransactionStatus transactionStatus) {
								
									try {
										String  sql="insert  into   tb_user(username,password) values('mike3','a3')";
										jdbcTemplate.update(sql);  //��ǰ����һ����
										
										String  sql3="insert  into   tb_user(username,password) values('mike33','a33')";
										jdbcTemplate.update(sql3);  //��ǰ����һ����
										
										int   a=10/0;  //����Ūһ���쳣
										
										String  sql2="insert  into   tb_user(username,password) values('mike3333','a3333')";
										jdbcTemplate.update(sql2);  
										
									} catch (Exception e) {
									     transactionManager.rollback(transactionStatus);  //����ع�����������������ع�����һ���Ĳ�����ʧЧ����
									     System.out.println(e.getMessage());
									}
									return null;
								}
				          }
				 );
			} catch (Exception e) {
				   System.out.println("������쳣:"+e.getMessage());
			}
					      
		}
		
}
