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
/*
 * AOP  : Aspect   Oriented   Programming: ���������� ��ͨ��Ԥ���뷽ʽ�������ڶ�̬����ʵ�ֳ����ܵ�ͳһά����һ�ּ�����
 *       ��OOP���������Ǻ���ʽ��̵�һ���������͡�����AOP���Զ�ҵ���߼��ĸ������ֽ��и��룬�Ӷ�ʹ��ҵ���߼���������֮�����϶Ƚ��ͣ����
 *       ����Ŀ������ԣ�ͬʱҲ��Ϊ����߱��Ч�ʡ�
 * OOP  �� Object   Oriented   Programming ���������      
 * 
 * 
 */
public class Test1AOP1 {
         public static void main(String[] args) {
			        ApplicationContext    ac=new   ClassPathXmlApplicationContext("applicationContext.xml");
			       
			        
			        PersonServiceImpl        ps=(PersonServiceImpl) ac.getBean("personService");
//			        ps.save();
			        ps.save1(10);
			        
			        
//			 ���Ƿ������Ա����ز�����ִ�У�������ز��������������ô��������һ����Ҳ�᲻ִ�С�       
//			        ǰ��--> ���ƽ���--> ִ�з���--> �����˳� --> ����֪ͨ--> ����֪ͨ(���쳣)
//			        ǰ��--> ���ƽ���--> ִ�з���--> �쳣֪ͨ--> ����֪ͨ(���쳣)
			        
//			        int   a=0;
//			        try {
//			        	 //ǰ��֪ͨ
			             //���ƽ���
//			        	 //����Ҫִ�е�service����   //Ҫ�ж���û���쳣
			             //�����˳� 
//					} catch (Exception e) {
//			              a=1;
//						 //����֪ͨ
//					}finally{
			             //����֪ͨ
//					}
//			        if(a==0){
//			        	 //����֪ͨ   //ע��:��aop���棬����������û
//			        }
			        
		}
}
