package com.study;


public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int court = 1;
		//求100内的所有能被3整除的数输出，一行输出五个，并进行统计
		for (int i = 1 ; i <= 100 ; i++ ) { 
			if (i % 3 == 0) {
				//System.out.print(i);
				if (court % 5 == 0 ) {
					System.out.println();
				}
				System.out.print(i + "  ");
				court++;
			}
		}
		System.out.println(court);
	}
	
}
