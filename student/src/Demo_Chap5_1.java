

public class Demo_Chap5_1 {

	public static void main(String[] args) {
		System.out.println(staticTestFunction.addUp());
	}
	Apple cl = new Apple();
	//Apple.Orange o1 = new Apple.Orange();
	class Apple {
		String color;
		
		class Orange {
			String color;
		}
	}

}
/**
 * 学习了解static修饰词*/
class staticTestFunction {
	static int x;
	static int y;
	public staticTestFunction() {
	}
	
	public static int addUp() {
		x = 12;
		y = 31;
		int sum = x + y;
		return sum;
	}
}

/**
 * 学习了解创建接口*/
interface interfaceStudyLearn{
	public static final int num = 12;
	public abstract void m(); //接口中必须用abstract方法修饰，在实现接口时要实现方法
}

/**
 * 实现接口*/
class interfaceTest implements interfaceStudyLearn {
	public  void m() {
		System.out.println("Hello!");
	}
}