package com.wat.service.impl;
import com.wat.service.PersonService;
public class PersonServiceImpl  implements   PersonService{
        public void  save(){
        	    System.out.println("ִ����save����");
        }
		public void update(int a) {
			System.out.println("ִ����update����  a:"+a);
		}
		public int add() {
			System.out.println("ִ����add����");
			return 0;
		}
		
}
