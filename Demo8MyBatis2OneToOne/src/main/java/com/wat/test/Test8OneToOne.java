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

import com.wat.bean.IdcardCustom;
import com.wat.mapper.IdcardCustomerMapper;
/**
 * 
 * @ClassName:     Test2String.java
 * @Description:   ������ǽ��������������������
 * @author         ������������ʦ 
 * @version        jdk8.0  
 * @Date         
                     һ������õ��Ķ������õ�����ɿ��ķ��������������
                     ��������ϰ�,��Ը��Ƹ�����ڵ��Լ���?
 */

public class Test8OneToOne {
       public static void main(String[] args) throws IOException {
    	       //����xml�ļ�
		       InputStream          is=Resources.getResourceAsStream("SlqMapCongfig.xml");
		       //�����Ự����
		       SqlSessionFactory    ssf=new   SqlSessionFactoryBuilder().build(is);
		       //�����Ự����,�ö�����ԶԱ���в���
		       SqlSession           sqlSession=ssf.openSession();   
		       //��ȡUserMapper����
		       IdcardCustomerMapper      idcardCustomMapper=sqlSession.getMapper(IdcardCustomerMapper.class);
		       
		       //����
		       List<IdcardCustom>        list=idcardCustomMapper.findIdCardPeople("����");
		       for(IdcardCustom   ic:   list){
		    	        System.out.println(ic.getId()+"    "+ic.getName()+"    "+ic.getSex()+"    "+ic.getAge()+" "
		                                   +ic.getIdcardcode()+"   "+ic.getPic()
		    	        		           );
		       }
		       sqlSession.close();
	   }
}
