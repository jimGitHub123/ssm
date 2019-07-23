package com.wat.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.wat.ssm.po.Idcard;

public class IdcardController1  implements   Controller {
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		    System.out.println("������handleRequest����");
		    List<Idcard>    list=new  ArrayList<Idcard>();
		    
		    Idcard     idcard=new  Idcard();
		    idcard.setId(1);
		    idcard.setIdcardcode("66666");
		    idcard.setPic("666.png");
		    
		    Idcard     idcard2=new  Idcard();
		    idcard2.setId(2);
		    idcard2.setIdcardcode("88888");
		    idcard2.setPic("888888.png");
		    
		    list.add(idcard);
		    list.add(idcard2);
		    
		    //����modelAndview����׼��������ݣ�������ͼ
		    ModelAndView     mav=new   ModelAndView();
		    mav.addObject("idcardList",list);     //�����ݸ�jsp
		    mav.setViewName("IdcardList");//��ת��jsp
	     	return mav;          /*���ؽ����DispatcherServlet*/
	}
}
