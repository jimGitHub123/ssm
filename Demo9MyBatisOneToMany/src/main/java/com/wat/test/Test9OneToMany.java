package com.wat.test;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.wat.bean.Customer;
import com.wat.bean.Ticket;
import com.wat.mapper.CustomerTicketMapper;
/**
 * @ClassName:     Test2String.java
 * @Description:   ������ǽ���һ�Զ�
 * @author         ������������ʦ 
 * @version        jdk8.0  
 * @Date         
                     һ������õ��Ķ������õ�����ɿ��ķ��������������
                     ��������ϰ�,��Ը��Ƹ�����ڵ��Լ���?
 */
public class Test9OneToMany {
       public static void main(String[] args) throws IOException {
    	       //����xml�ļ�
		       InputStream          is=Resources.getResourceAsStream("SlqMapCongfig.xml");
		       //�����Ự����
		       SqlSessionFactory    ssf=new   SqlSessionFactoryBuilder().build(is);
		       //�����Ự����,�ö�����ԶԱ���в���
		       SqlSession           sqlSession=ssf.openSession();   
		       //��ȡUserMapper����
		       CustomerTicketMapper      customerTicketMapper=sqlSession.getMapper(CustomerTicketMapper.class);
		       
		       //����
		       Customer    ct=customerTicketMapper.findBycustomerName("С��");
		       System.out.println(ct.getCustomerTel()+"   "+ct.getCustomerName()+"  "+ct.getCustomerId());
		       
		       List<Ticket>    lists=ct.getLists();
		       for(Ticket   tt:  lists){
		    	        System.out.println(tt.getTicketAddress()+"    "+tt.getTicketPrice());
		       }
		       sqlSession.close();
	   }
}
