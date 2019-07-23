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

import com.wat.ssm.mapper.IdcardMapper;
import com.wat.ssm.po.Idcard;
/**
 * 
 * @ClassName:     Test2String.java
 * @Description:   ������ǽ����������򹤳�
 * @author         ������������ʦ 
 * @version        jdk8.0  
 * @Date         
                     һ������õ��Ķ������õ�����ɿ��ķ��������������
                     ��������ϰ�,��Ը��Ƹ�����ڵ��Լ���?
 */
public class Test11NiXiang {
       public static void main(String[] args) throws IOException {
    	       //����xml�ļ�
		       InputStream          is=Resources.getResourceAsStream("SlqMapCongfig.xml");
		       //�����Ự����
		       SqlSessionFactory    ssf=new   SqlSessionFactoryBuilder().build(is);
		       //�����Ự����,�ö�����ԶԱ���в���
		       SqlSession           sqlSession=ssf.openSession();   
		       //��ȡUserMapper����
		       IdcardMapper     idcardMapper=sqlSession.getMapper(IdcardMapper.class);
		      
		       //��ѯ
//		       Idcard     idcard=idcardMapper.selectByPrimaryKey(2);
//		       System.out.println(idcard.getId()+"   "+idcard.getIdcardcode()+"   "+idcard.getPic());
		       
		       //���
//		       Idcard   idcard=new  Idcard();
//		       idcard.setIdcardcode("999999");
//		       idcard.setPic("9999.png");
//		       idcardMapper.insert(idcard);
		       
		       //ɾ��
//		       int  id=2;
//		       int    num=idcardMapper.deleteByPrimaryKey(id);
		       
		       //�޸�
		       Idcard     idcard=idcardMapper.selectByPrimaryKey(3);
		       idcard.setIdcardcode("8888888");
		       idcard.setPic("888888.png");
		       int     num=idcardMapper.updateByPrimaryKey(idcard);
		       
		       sqlSession.commit();
		       sqlSession.close();
	   }
}
