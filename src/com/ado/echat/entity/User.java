package com.ado.echat.entity;


import java.util.List;

public class User {
private String userName;
private String passWord;	


private String fakeName;	
private int age;
private String sex;


private   List<String > friendList;
private   List<String> hobbyList;
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassWord() {
	return passWord;
}
public void setPassWord(String passWord) {
	this.passWord = passWord;
}

public void  addFriendID(String id){
	     friendList.add(id);
	
	
}
public  List<String> getFriendID(){

	return friendList;	
}

public void addHobby(String hobby){
	
	hobbyList.add(hobby);
	
}
public String getFakeName() {
	return fakeName;
}
public void setFakeName(String fakeName) {
	this.fakeName = fakeName;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public List<String> getFriendIDList() {
	return friendList;
}
public void setFriendIDList(List<String> friendList) {
	this.friendList = friendList;
}
public List<String> getHobbyList() {
	return hobbyList;
}
public void setHobbyList(List<String> hobbyList) {
	this.hobbyList = hobbyList;
}
	
}
