

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
 * ѧϰ�˽�static���δ�*/
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
 * ѧϰ�˽ⴴ���ӿ�*/
interface interfaceStudyLearn{
	public static final int num = 12;
	public abstract void m(); //�ӿ��б�����abstract�������Σ���ʵ�ֽӿ�ʱҪʵ�ַ���
}

/**
 * ʵ�ֽӿ�*/
class interfaceTest implements interfaceStudyLearn {
	public  void m() {
		System.out.println("Hello!");
	}
}