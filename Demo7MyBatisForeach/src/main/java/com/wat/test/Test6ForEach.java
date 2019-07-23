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

import com.wat.bean.User;
import com.wat.bean.UserInfo;
import com.wat.bean.UserQueryVo;
import com.wat.mapper.UserMapper;
/**
 * @ClassName:     Test2String.java
 * @Description:   ������ǽ���MyBatis�д���Mapper�Ա����crud.
 * @author         ������������ʦ 
 * @version        jdk8.0  
 * @Date         
                     һ������õ��Ķ������õ�����ɿ��ķ��������������
                     ��������ϰ�,��Ը��Ƹ�����ڵ��Լ���?
 */
public class Test6ForEach {
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
               List<Integer>    lists=new  ArrayList<Integer>();
               lists.add(1);
               lists.add(5);
               lists.add(6);
               
               UserQueryVo    uqv=new  UserQueryVo();
               uqv.setLists(lists);
               
               List<UserInfo>   lists2=userMapper.findUserByList(uqv);
               System.out.println(lists2.size());
		       
		       sqlSession.close();
	   }
}
