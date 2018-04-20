package fruit;

class Coconut extends Fruit {
	void eat() {
		if (super.number > 0) {
			System.out.println("钻一个孔来喝");
			super.number--;
		}else
			System.out.println("椰子吃完了！");
	}
}
