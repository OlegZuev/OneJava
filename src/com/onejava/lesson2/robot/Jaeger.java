package com.onejava.lesson2.robot;

public class Jaeger {
	private String name;
	private String mark;
	private String status;
	private String weapon;
	private int height;

	public Jaeger() {}

	public Jaeger(String name, String mark, String status, String weapon, int height) {
		this.name = name;
		this.mark = mark;
		this.status = status;
		this.weapon = weapon;
		this.height = height;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getWeapon() {
		return weapon;
	}
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
}