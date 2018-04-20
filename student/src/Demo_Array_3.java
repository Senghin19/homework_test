
public class Demo_Array_3 {
	public static void main(String[] args) {
		int j, k , m , aH = 2,aL = 3,bL = 4;
		int a[][],b[][],c[][];
		a = new int[aH][aL];
		b = new int[aL][bL];
		c = new int[aH][bL];
		
		//利用随机数对a,b进行数组初始化
		for ( j = 0 ; j < aH ; j++ ) {
			for (k = 0 ; k < aL ; k++) {
				a[j][k] = (int)(Math.random() * 10);
			}
		}
		
		
		for ( j = 0 ; j < aL ; j++ ) {
			for (k = 0 ; k < bL ; k++) {
				b[j][k] = (int)(Math.random() * 10);
			}
		}
		
		System.out.println("a 矩阵如下：");
		for(j = 0 ; j < aH ; j++) {
			for (k = 0 ; k < aL ; k++) {
				System.out.print( a[j][k] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("b 矩阵如下：");
		for(j = 0 ; j < aL ; j++) {
			for (k = 0 ; k < bL ; k++) {
				System.out.print( b[j][k] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("求出的矩阵(c=axb)矩阵元素如下：");
		for( j = 0 ; j < aH ; j++) {
			for ( m = 0 ; m < bL ; m++) {
				for ( k = 0 ; k < aL ; k++) {
					c[j][m] = c[j][m] + a[j][k] * b[k][m];		//矩阵计算
					System.out.print(c[j][m] + "\t\t");
				}
				System.out.println();
			}
		}
	}
}
