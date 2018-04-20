package com.study;

public class Demo_Throws_1 {
	public static void main(String[] args) {
		String[] str = {"One","Two","Three"};
		int i = 0;
		try{
			for( i = 0 ; i <= 3 ; i++) {
			System.out.println(str[i]);
	}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("The array index is error");
		}finally {
			System.out.println("i = " + i);
		}
	System.out.println("The program is end normally!");
	}
}
