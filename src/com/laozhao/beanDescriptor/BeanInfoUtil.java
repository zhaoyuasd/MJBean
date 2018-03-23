package com.laozhao.beanDescriptor;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

import com.laozhao.bean.UserBean;

public class BeanInfoUtil {
	 // 设置bean的某个属性值  
    public static void setProperty(UserBean userInfo, String name) throws Exception {  
        // 获取bean的某个属性的描述符  
        PropertyDescriptor propDesc = new PropertyDescriptor(name, UserBean.class);  
        // 获得用于写入属性值的方法  
        Method methodSetUserName = propDesc.getWriteMethod();  
        System.out.println(propDesc.getPropertyType().getSimpleName());
        // 写入属性值  
        methodSetUserName.invoke(userInfo, "wong");  
        System.out.println("set userName:" + userInfo.getName());  
    }  

    // 获取bean的某个属性值  
    public static void getProperty(UserBean userInfo, String userName) throws Exception {  
        // 获取Bean的某个属性的描述符 userName 是类的参数名称 此处可可以是name isAdult age  
        PropertyDescriptor proDescriptor = new PropertyDescriptor(userName, UserBean.class);  
        // 获得用于读取属性值的方法  
        Method methodGetUserName = proDescriptor.getReadMethod();  
        // 读取属性值  
        Object objUserName = methodGetUserName.invoke(userInfo);  
        System.out.println("get userName:" + objUserName.toString());  
    }  
}
