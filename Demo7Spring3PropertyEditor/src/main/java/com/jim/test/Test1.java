package com.jim.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jim.bean.UserInfo;

/**
 * ������ǽ����Զ������Ա༭��
 * @author Administrator
 */
public class Test1 {
    public static void main(String[] args) {
	   ApplicationContext    applicationContext=new   ClassPathXmlApplicationContext("applicationContext.xml");
	   UserInfo      userInfo=(UserInfo)applicationContext.getBean("user1");
	   userInfo.printInfo();
	}
}
