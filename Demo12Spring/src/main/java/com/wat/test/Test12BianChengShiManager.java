package com.wat.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wat.bianchengshi.BianChengShiManager;
/**
 * @ClassName:     Test2String.java
 * @Description:   ������ǽ������ʽ���������
 * @author         ������������ʦ 
 * @version        jdk8.0  
 * @Date         
                     һ������õ��Ķ������õ�����ɿ��ķ��������������
                     ��������ϰ�,��Ը��Ƹ�����ڵ��Լ���?
 */
public class Test12BianChengShiManager { 
          public static void main(String[] args) {
			         ApplicationContext ac=new  ClassPathXmlApplicationContext("applicationContext.xml");
			         BianChengShiManager     bcsm=(BianChengShiManager) ac.getBean("bianChengShiManager");
			         bcsm.test();
		}
}
