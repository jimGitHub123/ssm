package com.wat.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wat.dao.UserDAO;
/**
 * @ClassName:     Test2String.java
 * @Description:   ������ǽ�������ʽ�������
 * @author         ������������ʦ 
 * @version        jdk8.0  
 * @Date         
                     һ������õ��Ķ������õ�����ɿ��ķ��������������
                     ��������ϰ�,��Ը��Ƹ�����ڵ��Լ���?
 */
public class Test13 {
        public static void main(String[] args) {
			       ApplicationContext    ac=new   ClassPathXmlApplicationContext("applicationContext.xml");
			       UserDAO      userDAO=(UserDAO) ac.getBean("transactionProxy");
			       userDAO.add();
		}
}
