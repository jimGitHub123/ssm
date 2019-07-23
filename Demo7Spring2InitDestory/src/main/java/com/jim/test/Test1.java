package com.jim.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.jim.service.PersonService;
/**
 * ������ǽ�����bean�����⴦��
 * @author Administrator
 *
 */

/*
 *--�ӿ�ApplicationContext 
 *    --�ӿڣ�ConfigurableApplicationContext
 *       --��AbstractApplicationContext
 */
public class Test1 {
        public static void main(String[] args) {
        	 AbstractApplicationContext    applicationContext=new  ClassPathXmlApplicationContext("applicationContext.xml");
        	 //Ĭ��ִ�й��캯����init����
        	 PersonService     personService=(PersonService) applicationContext.getBean("personservice");
//        	 personService.save();
        	 System.out.println(123);
        	 //Ĭ��ȥִ��destroy����
        	 applicationContext.close();
		}
}
