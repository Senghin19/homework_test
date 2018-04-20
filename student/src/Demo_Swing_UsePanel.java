import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.accessibility.AccessibleAction;
import javax.swing.*;

public class Demo_Swing_UsePanel {

	public static void main(String[] args) {
		// 创建窗体并设置窗体标题
		JFrame frm = new JFrame("使用JPanel");
		//设置窗体关闭方式
		frm.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

		//创建面板并放在窗体的上半部分
		JPanel topPanel = new JPanel();
		frm.add(topPanel,BorderLayout.NORTH);
		//创建提示标签并设置显示信息
		JLabel show = new JLabel();
		show.setText("请输入姓名：");
		//创建输入框，设置为可编辑，左侧输入，20列
		JTextField input = new JTextField();
		input.setEditable(true);
		input.setHorizontalAlignment(SwingConstants.LEFT);
		input.setColumns(20);
		//创建提交按钮
		JButton myBtn = new JButton("提交");
		//创建按钮的监听器并注册，参数为事件处理者的对象
		MyMonitor myBtnHandler = new MyMonitor();
		myBtn.addActionListener(myBtnHandler);
		//添加显示标签，输入框和按钮
		topPanel.add(show);
		topPanel.add(input);
		topPanel.add(myBtn);

		//创建面板并放置在窗体的下半部分
		JPanel bottomPanel = new JPanel();
		frm.add(bottomPanel,BorderLayout.CENTER);
		//创建提示标签并设置显示信息
		JLabel againshow = new JLabel();
		againshow.setText("显示所有输入的姓名");
		//创建输出框，设置不为可编辑，5行32列
		JTextArea output = new JTextArea();
		output.setEditable(false);
		output.setRows(5);
		output.setColumns(32);
		//添加提示标签和输出框
		bottomPanel.add(againshow);
		bottomPanel.add(output);
		
		//设置窗体大小并显示
		frm.setBounds(700,500,400,200);
		frm.setVisible(true);

	}

}

//编写按钮的事件处理者，即实现ActionLister接口，，，接口——只含常量和抽象方法，需要自己实现方法
class MyMonitor implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Clicked");
	}

}
	
