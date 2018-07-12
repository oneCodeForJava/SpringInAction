
package com.hbue.spring.C4.xmlAspect;

import java.util.Date;

public class User {
	private String name;
	private int age;
	private boolean play;
	private Date playTime;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isPlay() {
		return play;
	}
	public void setPlay(boolean play) {
		this.play = play;
	}
	public Date getPlayTime() {
		return playTime;
	}
	public void setPlayTime(Date playTime) {
		this.playTime = playTime;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", play=" + play + ", playTime=" + playTime + "]";
	}
	
}
