package com.wat.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.wat.bean.Product;
/**
 * @ClassName:     Test2String.java
 * @Description:   ������ǽ�����bean�����Դ�ֵ
 * @author         ������������ʦ 
 * @version        jdk8.0  
 * @Date         
                     һ������õ��Ķ������õ�����ɿ��ķ��������������
                     ��������ϰ�,��Ը��Ƹ�����ڵ��Լ���?
 */
public class Test3Setter {
         public static void main(String[] args) {
        	    test1_set();
		}
        public  static   void  test1_set(){  //����set��ֵ
        	  ApplicationContext   ac=new   ClassPathXmlApplicationContext("applicationContext.xml");
	          Product     product=(Product) ac.getBean("product");//��̬���ӿ�����ָ��ʵ�������
	          System.out.println("name="+product.getName());
        }
}
