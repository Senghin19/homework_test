/*�˽Ⲣѧϰswing���
 	1,GUI���
 	2,�����벼��
 		* �������ڷ������
 			* awt�������Panel�࣬������Windows���ṹ��Frame���Ի�����Dialog
 			* swing�������������ɶ������ڣ����м���������������
 		* ���������������������˳���λ��
 	3,�¼�����
 	4,swing���
 	
 */

import javax.swing.*;
import java.awt.*;

public class Demo_Swing_Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyFrame f1 = new MyFrame("MyFrame");
		f1.init();
	}

}


class MyFrame extends JFrame{
	JButton bt;
	JTextField tf;
	MyFrame(String t) {
		super(t);
		bt = new JButton("click");
		tf = new JTextField(20);
		
	}
	
	void init() {
		this.setLayout(new FlowLayout());
		add(bt);
		add(tf);
		
		this.pack();
		this.setLocationRelativeTo(null);
		
		this.setVisible(true);
	}
}