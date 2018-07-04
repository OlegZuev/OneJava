package com.onejava.lesson2.robot;

public class JaegerTest {
	public static void main(String[] args) {
		Jaeger jaeger1 = new Jaeger();
		Jaeger jaeger2 = new Jaeger("Saber Athena", "Mark-7", "Destroyed", "Ionic Twinblades and N-16 Particle Charger", 252);
		jaeger1.setName("November Ajax");
		jaeger1.setMark("Mark-6");
		jaeger1.setStatus("Active");
		jaeger1.setWeapon("Grappling Hook Cables");
		jaeger1.setHeight(259);
		System.out.println("Name: " + jaeger1.getName() + "\n" +
						   "Mark: " + jaeger1.getMark() + "\n" +
						   "Status: " + jaeger1.getStatus() + "\n" +
						   "Weapon: " + jaeger1.getWeapon() + "\n" +
						   "Height: " + jaeger1.getHeight());
		System.out.println("Name: " + jaeger2.getName() + "\n" +
						   "Mark: " + jaeger2.getMark() + "\n" +
						   "Status: " + jaeger2.getStatus() + "\n" +
						   "Weapon: " + jaeger2.getWeapon() + "\n" +
						   "Height: " + jaeger2.getHeight());
	}
}