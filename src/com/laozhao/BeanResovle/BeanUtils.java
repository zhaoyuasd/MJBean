package com.laozhao.BeanResovle;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class BeanUtils {
 private  String errorMessage;
	
public int setProperty(Object to,String property,Object value)
 {
	int result ;//0 陈工 1 类型不匹配  2.方法存在 3 其他错恶 见日志
	try {
		PropertyDescriptor pro=new PropertyDescriptor(property,to.getClass()) ;
		String shouldType= pro.getPropertyType().getSimpleName();
		String realType=value.getClass().getSimpleName();
		if(!shouldType.equals(realType)){
			errorMessage="the type of the value  not fit for the Property "+
		    "should be :"+shouldType +" your is :"+realType;
			return 1;
		}
		Method setValue=pro.getWriteMethod();
		setValue.invoke(to, value);
		 return 0;
	} catch (IntrospectionException e) {
		// TODO Auto-generated catch block
		errorMessage="the set"+property+" method not exist check your bean";
		return 2;
	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalArgumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InvocationTargetException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	return 3;
 }

 public Object  getProperty(Object to,String property)
 {
	
	try {
		PropertyDescriptor pro=new PropertyDescriptor(property,to.getClass()) ;
		Method getProperty=pro.getReadMethod();
		return getProperty.invoke(to, null);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 return property;
 }

}
