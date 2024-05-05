package com.example.aplikasilogindanregister.Login;

import com.google.gson.annotations.SerializedName;

public class Data{

	@SerializedName("name")
	private String name;

	@SerializedName("user_id")
	private String userId;

	@SerializedName("username")
	private String username;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setuserId(String userId){
		this.userId = userId;
	}

	public String getUserId(){
		return userId;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getUsername(){
		return username;
	}
}