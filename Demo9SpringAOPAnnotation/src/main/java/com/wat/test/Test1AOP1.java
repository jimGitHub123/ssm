package com.wat.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wat.service.PersonService;
import com.wat.service.impl.PersonServiceImpl;
/**
 * @ClassName:     Test2String.java
 * @Description:   ������ǽ�������������
 * @author         ������������ʦ 
 * @version        jdk8.0  
 * @Date         
                     һ������õ��Ķ������õ�����ɿ��ķ��������������
                     ��������ϰ�,��Ը��Ƹ�����ڵ��Լ���?
 */
public class Test1AOP1 {
         public static void main(String[] args) {
			        ApplicationContext    ac=new   ClassPathXmlApplicationContext("applicationContext.xml");
			        PersonService        ps=(PersonService) ac.getBean("personService");
			        ps.save();
			        
			        
//			        try {
//			        	 //ǰ��֪ͨ
//			        	 //�쳣�Ĵ���
//						 //����֪ͨ
//					} catch (Exception e) {
//						 //����֪ͨ
//					}finally{
//						 //����֪ͨ
//					}
			        
		}
}
