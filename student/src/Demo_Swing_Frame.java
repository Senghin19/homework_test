/*了解并学习swing组件
 	1,GUI编程
 	2,容器与布局
 		* 容器用于放置组件
 			* awt：面板类Panel类，窗口类Windows，结构类Frame，对话框类Dialog
 			* swing：顶层容器（可独立存在），中间容器，特殊容器
 		* 布局是用来控制组件排列顺序和位置
 	3,事件处理
 	4,swing组件
 	
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