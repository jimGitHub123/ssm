package com.wat.test;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wat.bean.User;
import com.wat.dao.UserDAO;
/**
 * @ClassName:     Test2String.java
 * @Description:   �������ܹ���� JdbcTemplate ���������ݿ�
 * @author         ������������ʦ 
 * @version        jdk8.0  
 * @Date         
                     һ������õ��Ķ������õ�����ɿ��ķ��������������
                     ��������ϰ�,��Ը��Ƹ�����ڵ��Լ���?
 */
public class Test11JdbcTemplate {
        public static void main(String[] args) {
			    ApplicationContext    ac=new   ClassPathXmlApplicationContext("applicationContext.xml");
			    UserDAO              userDAO=(UserDAO) ac.getBean("userDAO");
			    
			    //�������
//			    User  user=new User();
//			    user.setUsername("aaaa");
//			    user.setPassword("a");
//			    int    num=userDAO.save(user);
//			    System.out.println("num="+num);
			    
			    //���Բ�ѯ
//			    int  id=1;
//			    User    user=userDAO.findById(id);
//			    System.out.println(""+user.getUsername()+"   "+user.getPassword());
			    
			    //���Բ�ѯ����
			    List<User>   list=userDAO.findAll();
			    System.out.println(list.size());
		}
}
