package fruit;

class Banana extends Fruit {
	void eat() {
		if (super.number > 0) {
			System.out.println("����Ƥ��");
			super.number--;
		}else
			System.out.println("�㽶�����ˣ�");
	}
}
