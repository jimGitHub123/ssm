package com.jim.util;

import java.beans.PropertyEditorSupport;
import java.util.Date;
/*
 * Date:��Calendar���滻�ö෽��
 */
public class MyDateEditorCharacter  extends       PropertyEditorSupport{
	    /*
	     * text:���������Ե�ֵ
	     * (non-Javadoc)
	     * @see java.beans.PropertyEditorSupport#setAsText(java.lang.String)
	     */
	    public void setAsText(String text) throws IllegalArgumentException {
	    	Character   sex='Ů';
	    	this.setValue(sex);
	    }
}
