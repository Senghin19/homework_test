/**
 * 泛型类的学习
 */
public class Demo_Chap5_2 {
	public static void main(String[] args) {
/*		Student3 stu = new Student3() {
			void say() {
				System.out.println("Hello");
				}
		};
		Teacher st = new Teacher() {
			void speak() {
				System.out.println("I'm a teacher.");
			}
		};
*/
		Speak<Earth,Fruit> str = new Speak<Earth,Fruit>();
		str.makeChorust(new Earth(), new Fruit());
	}
}
/**
 * 定义一个抽象类Student3
 */
abstract class Student3 {
	abstract void say();		//说话
}

/**
 * 定义一个泛型类
 */
class Speak<E,F> {
	void makeChorust(E person,F yueqi) {
		((Earth) person).say();
		((Fruit) yueqi).say();
	}
}
class Earth {
	public void say() {
		System.out.println("Helllo Earth");
	}
}
class Fruit {
	public void say() {
		System.out.println("Hello Fruit");
	}
}
