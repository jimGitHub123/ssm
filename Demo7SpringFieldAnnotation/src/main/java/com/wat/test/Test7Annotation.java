package com.wat.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wat.bean.Product;
import com.wat.dao.ProductDao;
/**
 * @ClassName:     Test2String.java
 * @Description:   ������ǽ�����bean�����Դ�ֵ
 * @author         ������������ʦ 
 * @version        jdk8.0  
 * @Date         
                     һ������õ��Ķ������õ�����ɿ��ķ��������������
                     ��������ϰ�,��Ը��Ƹ�����ڵ��Լ���?
 */
public class Test7Annotation {
         public static void main(String[] args) {
        	  ApplicationContext   ac=new   ClassPathXmlApplicationContext("applicationContext.xml");
              ProductDao  pd=(ProductDao) ac.getBean("productDao");
              pd.find();
         }
}
