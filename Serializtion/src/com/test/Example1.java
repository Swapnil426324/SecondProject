package com.test;

public class Example1 {

	public static void main(String[] args) {
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=9;j++) {
				if(j==1||j==2||j==3)
					System.out.print("* ");
				else if(j==4||j==5||j==6)
					System.out.print("# ");
				else if(j>6)
					System.out.print(j-6+" ");
			}
			System.out.println();
		}

	}

}
