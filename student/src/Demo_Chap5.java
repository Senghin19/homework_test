
public class Demo_Chap5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle();
		c1.setRadius(2.3);
		System.out.println("圆的半径是：" + c1.getRadius());
		System.out.println("圆的面积是：" + c1.area());
		System.out.println("圆的周长是：" + c1.length());
	}

}

class Circle {
	private double radius = 0;
	private double pi = 3.1415;
	
	public double setRadius(double radius) {
		this.radius = radius;
		return radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	 public double area() {
		 double area = this.pi * this.radius * this.radius;
		 return area;
	 }
	 
	 public double length() {
		 double length = 2 * this.pi * this.radius;
		 return length;
	 }
}
