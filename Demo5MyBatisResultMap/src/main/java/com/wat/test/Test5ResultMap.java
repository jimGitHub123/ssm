package com.wat.test;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.TransactionIsolationLevel;

import com.wat.bean.User;
import com.wat.mapper.UserMapper;
/**
 * @ClassName:     Test2String.java
 * @Description:   ������ǽ���MyBatis��resultMap����ָ����������������Ӧ.
 * @author         ������������ʦ 
 * @version        jdk8.0  
 * @Date         
                     һ������õ��Ķ������õ�����ɿ��ķ��������������
                     ��������ϰ�,��Ը��Ƹ�����ڵ��Լ���?
 */
public class Test5ResultMap {
       public static void main(String[] args) throws IOException {
    	       //����xml�ļ�
		       InputStream          is=Resources.getResourceAsStream("SlqMapCongfig.xml");
		       //�����Ự����
		       SqlSessionFactory    ssf=new   SqlSessionFactoryBuilder().build(is);
		       //�����Ự����,�ö�����ԶԱ���в���
		       SqlSession           sqlSession=ssf.openSession();   
		       //��ȡUserMapper����
		       UserMapper      userMapper=sqlSession.getMapper(UserMapper.class);
		       
		       //����
		       test1_findById(userMapper);
		       
		       sqlSession.close();
	   }
       public   static  void  test1_findById(UserMapper      userMapper){
	    	   User            user=userMapper.findUserById(6);
		       System.out.println(user.getName()+"   "+user.getMima());
      }
}
