package com.wat.dao;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.wat.bean.Product;
import com.wat.bean.User;

/*
 * @Autowired:�����ͣ���������id����һ��û��ϵ
 * @Autowired@Qualifier("product1"):�����ͣ�product1�����idһ��
 * 
 * 
 * @Resource��������/id���ƣ�������Ʋ�һ��Ҳû��ϵ�������ٰ�����
 * @Resource(name="user1"):user1�����idһ�¡�
 */
public class ProductDao {
//	     @Autowired
//	     Product  product;//null
	     
		 @Autowired@Qualifier("product1")
	     Product  product;//null
	
//	     @Resource
//        User     user;
         
	     @Resource(name="user1")
         User     user;
         
	     public    void find(){
        	      String  name=product.getName();
        	      System.out.println("name="+name);
        	      
        	      System.out.println("user="+user);
         }
         
}
