package com.laozhao.bean;

public class UserBean {

	private String name;
	private Integer age;
	private Boolean  isAdult;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Boolean getIsAdult() {
		return isAdult;
	}
	public void setIsAdult(Boolean isAdult) {
		this.isAdult = isAdult;
	}
	@Override
	public String toString() {
		return "UserBean [name=" + name + ", age=" + age + ", isAdult=" + isAdult + "]";
	}
}
