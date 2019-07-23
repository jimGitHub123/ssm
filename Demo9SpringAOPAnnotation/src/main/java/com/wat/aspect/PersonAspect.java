package com.wat.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PersonAspect {
        @Pointcut("execution(*  com.wat.service.impl.PersonServiceImpl.*(..))")
        public   void   anyMethod(){}   /*
                                              Pointcut:����һ�������
                                              execution:ִ�е���˼��ִ�д�������������
                                              *       �������ķ���ֵ����
                                              *       ��������    �������PersonServiceImpl�����еķ���
                                              ..      : ��������������κβ���
                                         */
        @Before("anyMethod()")
        public    void    doAccessCheck(){
        	      System.out.println("ǰ��֪ͨ");
        }
        @AfterReturning("anyMethod()")
        public   void     doAfterReturing(){
        	      System.out.println("����֪ͨ");
        }
        @After("anyMethod()")
        public  void      doAfter(){
        	      System.out.println("����֪ͨ");
        }
        @AfterThrowing("anyMethod()")
        public   void     doAfterThrowing(){
        	      System.out.println("����֪ͨ");
        }
        @Around("anyMethod()")
        public     Object    doAround(ProceedingJoinPoint    pip) throws Throwable{
        	      Object   resObject=pip.proceed();    //ִ�д���ķ���   resObject������ֵ
        	      return null;
        }
}
