package com.test;
// 1 11 111 1111 111 11 1
public class Series3 {

	public static void main(String[] args) {

		for (int i = 1; i <= 1111; i = i*11) {
			System.out.print(i + " ");
		}
		for (int i = 1111; i >= 1; i=i/11) {
			System.out.print(i + " ");
		}

	}

}
