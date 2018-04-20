package fruit;

class Banana extends Fruit {
	void eat() {
		if (super.number > 0) {
			System.out.println("°şÁËÆ¤³Ô");
			super.number--;
		}else
			System.out.println("Ïã½¶³ÔÍêÁË£¡");
	}
}
