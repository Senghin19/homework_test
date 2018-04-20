package com.study;

public class Demo_ZhengzeExc {
/**
 * 这个程序是为了了解并学习正则表达式
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regex = "\\p{Upper}\\p{Lower}\\p{Lower}\\p{Lower}\\p{Lower}\\d\\d\\d";
		String message1 = "Hello123";
		String message2 = "hello123";
		
		boolean result1 = message1.matches(regex);
		boolean result2 = message2.matches(regex);
		
		if(result1) {
			System.out.println(message1 + "它是合法的数据");
		}else {
			System.out.println(message1 + "它不是合法的数据");
		}
		
		if(result2) {
			System.out.println(message2 + "它是合法的数据");
		}else {
			System.out.println(message2 + "它不是合法的数据");
		}
	}

}
