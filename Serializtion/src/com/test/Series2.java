package com.test;
//1 10 100 1000 100 10 1
public class Series2 {

	public static void main(String[] args) {
		int a = 1;
		for (int i = 1; i < 1000; i = i*10) {
			System.out.print(i + " ");
		}
		for (int i = 1000; i >= 1; i=i/10) {
	
			System.out.print(i + " ");
		}
	}

}
