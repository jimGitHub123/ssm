package com.jim.service.impl;

import com.jim.service.PersonService;

public class PersonServiceBean  implements    PersonService {
    public void init() {
		 System.out.println("��ʼ��");
	}
    public PersonServiceBean() {
	     System.out.println("ʵ��������");
	}
	public void save() {
		 System.out.println("��������");
	}
    public void  destroy() {
		 System.out.println("�رմ򿪵���Դ");
	}
}
