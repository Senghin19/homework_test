package fruit;

class Coconut extends Fruit {
	void eat() {
		if (super.number > 0) {
			System.out.println("��һ��������");
			super.number--;
		}else
			System.out.println("Ҭ�ӳ����ˣ�");
	}
}
