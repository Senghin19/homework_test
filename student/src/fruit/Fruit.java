/*
 * 定义了一个抽象类Fruit*/
package fruit;

abstract class Fruit {
	protected int number;		//控制水果数量
	public Fruit() {
		number = 5;		//高造方法初始化成员变量
	}
	abstract void eat();	//抽象方法
}
