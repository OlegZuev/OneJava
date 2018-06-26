package com.onejava.lesson1.unicodeview;

public class UnicodeView{
	public static void main(String[]args){
		
		/*
		В цикле отобразить символы Unicode на экран в диапозоне (30, 129)
		 */
		
		for (int i = 30; i < 130; i++) {
			System.out.print((char) i);
		}
	}
}