/*
 * ������һ��������Fruit*/
package fruit;

abstract class Fruit {
	protected int number;		//����ˮ������
	public Fruit() {
		number = 5;		//���췽����ʼ����Ա����
	}
	abstract void eat();	//���󷽷�
}
