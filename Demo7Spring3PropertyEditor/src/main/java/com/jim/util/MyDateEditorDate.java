package com.jim.util;

import java.beans.PropertyEditorSupport;
import java.util.Date;
/*
 * Date:��Calendar���滻�ö෽��
 */
public class MyDateEditorDate  extends       PropertyEditorSupport{
	    /*
	     * text:���������Ե�ֵ
	     * (non-Javadoc)
	     * @see java.beans.PropertyEditorSupport#setAsText(java.lang.String)
	     */
	    public void setAsText(String text) throws IllegalArgumentException {
    	    System.out.println("text="+text);
    	    Date    date=new  Date(text);
    	    
    	    
    	    //date����  this���������    setValue���Ǹ���ķ���    ��bean����Date���͵����Ը�ֵ
    	    Date  date2=new  Date();
	    	this.setValue(date2);
	    }
}
