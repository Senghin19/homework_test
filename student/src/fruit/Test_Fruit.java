/**
 * 定义了一个抽象类Fruit，三个子类Apple，Banana，Coconut
 * */
package fruit;

import java.util.Scanner;
public class Test_Fruit {
	public static void main(String[] args) {
		Scanner str = new Scanner(System.in);
		System.out.println("Please input fruit:");
		String fruit =str.nextLine();
		str.close();

		if(fruit.equals("Apple") || fruit.equals("苹果")) {
			Apple apple = new Apple();
			apple.eat();
		}else if (fruit.equals("Banana") || fruit.equals("香蕉")) {
			Banana banana = new Banana();
			banana.eat();
		}else if (fruit.equals("Coconut") || fruit.equals("椰子")) {
			Coconut coconut = new Coconut();
			coconut.eat();
		}else {
			System.out.println("None!");
		}
		
	}
	}

