package com.wat.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wat.dao.ProductDAO;
import com.wat.dao.impl.ProductDAOImpl;
/**
 * 
 * @ClassName:     Test2String.java
 * @Description:   ������ǽ���Spring���Եĵ�һ������
 * @author         jim��ʦ 
 * @version        jdk8.0  
 * @Date         
                     һ������õ��Ķ������õ�����ɿ��ķ��������������
                     ��������ϰ�,��Ը��Ƹ�����ڵ��Լ���?
 */
public class Test1Spring {
         public static void main(String[] args) {
        	      //����xml�ļ�  ��̬   �ӿ�����ָ����ʵ�������
        	      ApplicationContext   ac=new   ClassPathXmlApplicationContext("applicationContext.xml");
        	      //��ȡ����  CGLIB����      JDK����
        	      //��̬�ı��ʣ�  ���뿴���   ���п��ұ�
		          ProductDAOImpl    productDAOImpl=(ProductDAOImpl) ac.getBean("productDAOImpl");//��̬���ӿ�����ָ��ʵ�������
		          int               num=productDAOImpl.addProduct();
		          System.out.println("num="+num);
		          
		}
}
