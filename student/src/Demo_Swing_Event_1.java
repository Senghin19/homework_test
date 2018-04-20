/**
 * <p>
 * �˽Ⲣѧϰ�¼�����
 * </p>
 * {@code} Windows
 * 
 * @author Senghin
 * @version  v 0.1
 * 
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//4.13 Fri afternoon
//Teacher tutor
public class Demo_Swing_Event_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame_Event().load();
	}

}

/**
 * �����ҵĴ�����
 */
class MyFrame_Event extends JFrame{
	JTextField tf;
	JButton b1, b2, b3;
	JPanel p;
	
	MyFrame_Event() {	//����������ʼ����Ա����
		tf = new JTextField(20);	//��ʼ���ı������
		b1 = new JButton("OK");		//��ʼ����ť����
		b2 = new JButton("Order");
		b3 = new JButton("Sum");
		p  = new JPanel();
	}
	
	void load() {
		this.setLayout(new GridLayout(2,1));
		add(tf);
		
		p.add(b1);
		p.add(b2);
		p.add(b3);
		b1.addActionListener(new MyMonitor());		//ע�������
		b2.addActionListener(new MyMonitor2());
		b3.addKeyListener(new MyKeyMonitor());
		this.add(p);
		
		pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
class MyMonitor implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String s = tf.getText();
			JButton b = (JButton)e.getSource();
			String ss = b.getText();
			if (ss.equals("OK"))
				System.out.println(s);
			else {
				int i = Integer.parseInt(s);
				System.out.println( i * i );

			tf.setText("");
		}
		
	}
}
class MyMonitor2 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String s = tf.getText();
		int age = Integer.parseInt(s);
		
		if (age < 18)
			System.out.println("Hello Child!");

		else
			System.out.println("Hello man!");
		System.out.print(age * age);
	}
}

class MyKeyMonitor implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		char c = e.getKeyChar();	//��ü��������
		if ( c > KeyEvent.VK_0 && c <KeyEvent.VK_9) {
			
		}
		else
			e.consume();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
}