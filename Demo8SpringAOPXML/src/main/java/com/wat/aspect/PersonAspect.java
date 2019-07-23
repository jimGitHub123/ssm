package com.wat.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

public class PersonAspect {
        public   void   anyMethod(){
        	      System.out.println("ִ���������!");
        }   
        public    void    doAccessCheck(){             //���ط���������int�Ͳ����ĺ�����add��save��������
        	      System.out.println("ǰ��֪ͨ");
        }
        public   void     doAfterReturing(){
        	      System.out.println("����֪ͨ");
        }
        public  void      doAfter(){
	  	      System.out.println("����֪ͨ");
	    }
        public  void      doAfter1(int  p){
        	      System.out.println("p="+p);
        	      System.out.println("����֪ͨ");
        }
        public   void     doAfterThrowing(){
        	      System.out.println("����֪ͨ");
        }
        public     Object    doAround(ProceedingJoinPoint    pip) throws Throwable{
        	      System.out.println("���뷽����");
        	      //��ȡ��Ӧ�����ķ���ֵ������ִ�����ǵĴ���ķ���
        	      Object   resObject=pip.proceed();    //ִ�д���ķ���   resObject������ֵ

        	      System.out.println("�˳���������"+resObject);
        	      return resObject;
        }
}
