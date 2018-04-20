import java.awt.*;
import javax.swing.*;

public class Demo_Swing_UnderstandGUI {

	public static void main(String[] args) {
		//创建容器
		JFrame frm = new JFrame();
		
		//设置标题
		frm.setTitle("理解GUI编程");
		
		//设置布局
		frm.setLayout(new BorderLayout());
		
		//设置按钮组件
		JButton myBtn = new JButton("按钮");
		
		//将按钮组件对象添加到容器中
		frm.add(myBtn);
		
		//该示例未添加事件
		
		//设置窗体初始位置大小并显示
		frm.setBounds(700,500,300,100);
		//设置窗体关闭方式
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//让窗体显示
		frm.setVisible(true);
		
	}

}
