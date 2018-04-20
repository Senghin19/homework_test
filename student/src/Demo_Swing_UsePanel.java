import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.accessibility.AccessibleAction;
import javax.swing.*;

public class Demo_Swing_UsePanel {

	public static void main(String[] args) {
		// �������岢���ô������
		JFrame frm = new JFrame("ʹ��JPanel");
		//���ô���رշ�ʽ
		frm.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

		//������岢���ڴ�����ϰ벿��
		JPanel topPanel = new JPanel();
		frm.add(topPanel,BorderLayout.NORTH);
		//������ʾ��ǩ��������ʾ��Ϣ
		JLabel show = new JLabel();
		show.setText("������������");
		//�������������Ϊ�ɱ༭��������룬20��
		JTextField input = new JTextField();
		input.setEditable(true);
		input.setHorizontalAlignment(SwingConstants.LEFT);
		input.setColumns(20);
		//�����ύ��ť
		JButton myBtn = new JButton("�ύ");
		//������ť�ļ�������ע�ᣬ����Ϊ�¼������ߵĶ���
		MyMonitor myBtnHandler = new MyMonitor();
		myBtn.addActionListener(myBtnHandler);
		//�����ʾ��ǩ�������Ͱ�ť
		topPanel.add(show);
		topPanel.add(input);
		topPanel.add(myBtn);

		//������岢�����ڴ�����°벿��
		JPanel bottomPanel = new JPanel();
		frm.add(bottomPanel,BorderLayout.CENTER);
		//������ʾ��ǩ��������ʾ��Ϣ
		JLabel againshow = new JLabel();
		againshow.setText("��ʾ�������������");
		//������������ò�Ϊ�ɱ༭��5��32��
		JTextArea output = new JTextArea();
		output.setEditable(false);
		output.setRows(5);
		output.setColumns(32);
		//�����ʾ��ǩ�������
		bottomPanel.add(againshow);
		bottomPanel.add(output);
		
		//���ô����С����ʾ
		frm.setBounds(700,500,400,200);
		frm.setVisible(true);

	}

}

//��д��ť���¼������ߣ���ʵ��ActionLister�ӿڣ������ӿڡ���ֻ�������ͳ��󷽷�����Ҫ�Լ�ʵ�ַ���
class MyMonitor implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Clicked");
	}

}
	
