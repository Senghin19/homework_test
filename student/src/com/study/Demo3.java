package com.study;

/**
 * 与素数有关的
 */
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 2 ; i <= 100 ; i++) {	//2,3,
		sum += new Prime_12().ifPrime(i);
	}
		System.out.println("素数之和为：" + ( sum + 2 ) );
		
	}
}


  class Prime_12 {
	static int l ;
	static String str;
	 
	Prime_12 ()  {}
	 
	boolean isPrime(int n) {
		boolean flag = true;
		for (int i = 2 ; i < n ; i++) {
			if ( n % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	
	 int ifPrime(int n) {
		int num = 0;
		for (int i = 2 ; i < n ; i++) {
			if ( n % i == 0) {
				break;
			}else {
				num = n;
			}
		}
		return num;
	}

}
