package com.heima.test;

public class User {
	//属性
	private String username;
	private String password;
	private String email;
	private String gender;
	private int age;
	
	//空参构造
	public User() {}
	
	//带全部参数的构造
	public User(String username, String password, String email, String gender, int age) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.gender = gender;
		this.age = age;
	}
	//get和set
	//10个
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getUsername() {
		return username;
	}
	
	//快捷键： alt + shift + s （get 和set）
	//插件 PTG 
	
}
