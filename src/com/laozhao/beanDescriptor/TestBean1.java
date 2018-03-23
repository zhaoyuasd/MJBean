package com.laozhao.beanDescriptor;

import com.laozhao.BeanResovle.BeanUtils;
import com.laozhao.bean.UserBean;

public class TestBean1 {
 
	
	public static void main(String[] args) throws Exception {
	  UserBean ub=new UserBean();
	  //BeanInfoUtil.setProperty(ub, "name"); 
	  //System.out.println(ub);
	  
	  
	  BeanUtils bb=new BeanUtils();
	  bb.setProperty(ub, "name", "laozhao");
	  
	  System.out.println(bb.getProperty(ub, "name"));
}
}
