package com.wat.test;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
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
public class Test6If {
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
//		       test2_findByName(userMapper);
		       test1_findUserCount(userMapper);
		       
		       sqlSession.close();
	   }
       public   static  void  test2_findByName(UserMapper      userMapper){
    	       //��jsp��ȡ��user��Ϣ
    	       UserInfo    uif=new   UserInfo();
    	       uif.setUsername("e");
    	       uif.setPassword("e");
    	   
    	       UserQueryVo     uqv=new   UserQueryVo();
    	       uqv.setUserInfo(uif);
	    	   User            user=userMapper.findUserByName(uqv);
		       System.out.println(user.getId()+"    "+user.getUsername()+"   "+user.getPassword());
	   }
       public   static  void  test1_findUserCount(UserMapper      userMapper){
	    	   UserInfo    uif=new   UserInfo();
		       uif.setUsername("����");
		       uif.setPassword("����");
		       
		       UserQueryVo     uqv=new   UserQueryVo();
    	       uqv.setUserInfo(uif);
    	   
	    	   int      num=userMapper.findUserCount(uqv);
		       System.out.println(num);
      }
}
