package com.wat.dao.impl;
import com.wat.util.ProductUtil;
/*
 * �ֲ�����û��Ĭ��ֵ
 *  ��Ա��������Ĭ��ֵ��  String��null      boolean:false  int:0
 *                 ����������������Ĭ��ֵ����null,Integer,Boolean
 */
public class ProductDAOImpl {
	private    ProductUtil   productUtil;//ProductUtil   productUtil=xtz=new   ProductUtil();
	public ProductUtil getProductUtil() {
		return productUtil;
	}
	public void setProductUtil(ProductUtil productUtil){
		this.productUtil = productUtil;
	}
	public void addProduct() {
		     //null.close()
		     productUtil.close();
	}
}
