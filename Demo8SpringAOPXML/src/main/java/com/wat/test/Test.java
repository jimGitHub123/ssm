package com.wat.test;

public class Test {
      public static void main(String[] args) {
	        int   a=0;
	        try {
	        	 System.out.println("ǰ��֪ͨ");
	        	 System.out.println("���ƽ���");
	        	 
	        	 //û���쳣��
//	        	 System.out.println("����Ҫִ�е�service����");
//	        	 int  a=10/1;
	        	 
	        	 //���쳣��
	        	 System.out.println("����Ҫִ�е�service����");
//	        	 int  a=10/0;
	        	 
	        	 System.out.println("�����˳� ");
			} catch (Exception e) {
	              a=1;
				  System.out.println("����֪ͨ");
			}finally{
	              System.out.println("����֪ͨ");
			}
	        if(a==0){
	        	   System.out.println("����֪ͨ");   //ע��:��aop���棬����������û
	        }
	}
}
