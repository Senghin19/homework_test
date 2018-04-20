package com.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo1 {
/**
 * 输入一个数
 * 输出圆的面积
 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Please input radius:");
		
		String s = br.readLine();
		float r2 = Float.parseFloat(s);			//字符型转化为浮点型
		
		float c = 3.14f * 2 * r2;
		
		System.out.println(c);
		}
}
