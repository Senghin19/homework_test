package fruit;

class Apple extends Fruit {
	void eat() {
		if (super.number > 0) {
			System.out.println("削了皮吃");
			super.number--;
		}else
			System.out.println("苹果吃完了！");
	}
}
