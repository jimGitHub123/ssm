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
/*
 * Exception in thread "main" java.lang.NullPointerException
	at com.sun.proxy.$Proxy10.add(Unknown Source)
	at com.wat.test.Test1AOP1.main(Test1AOP1.java:22)
	˵������֪ͨ���з���ֵ���������null,�ͱ������쳣��
 */
public class Test1AOP1 {
         public static void main(String[] args) {
			        ApplicationContext    ac=new   ClassPathXmlApplicationContext("applicationContext.xml");
			        PersonService        ps=(PersonService) ac.getBean("personService");
//			        ps.save();
//			        ps.update(10);
			        int   a=ps.add();
			        System.out.println("a="+a);
			        
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
