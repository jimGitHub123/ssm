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
        @Before("anyMethod()  &&  args(n)")
        public    void    doAccessCheck(int n){             //���ط���������int�Ͳ����ĺ�����add��save��������
        	      System.out.println("ǰ��֪ͨ  n:"+n);
        }
        @AfterReturning(pointcut="anyMethod()",returning="result")   //��������int�ͷ���ֵ�ĺ�����update��save��������
        public   void     doAfterReturing(int   result){
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
        	      System.out.println("���뷽����");
        	      Object   resObject=pip.proceed();    //ִ�д���ķ���   resObject������ֵ
        	      System.out.println("�˳�������");
        	      return resObject;
        }
}
