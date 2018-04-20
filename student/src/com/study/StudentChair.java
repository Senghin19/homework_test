package com.study;

import java.util.*;

public class StudentChair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chair.show();
	}

}

class Chair {
	private static String[][] map = new String[5][5];
	
	public void indefalutChair() {
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ;j < 5 ; j++) {
				Chair.map[i][j] = "None";
			}
		}
	}
	
	public static void show() {
		for(int i = 0 ; i <5 ; i++) {
			for(int j = 0 ;j < 5 ; j++ ) {
				System.out.print("\t" + map[i][j]);
			}
			System.out.println();
		}
	}
}