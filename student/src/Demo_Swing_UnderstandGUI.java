import java.awt.*;
import javax.swing.*;

public class Demo_Swing_UnderstandGUI {

	public static void main(String[] args) {
		//��������
		JFrame frm = new JFrame();
		
		//���ñ���
		frm.setTitle("���GUI���");
		
		//���ò���
		frm.setLayout(new BorderLayout());
		
		//���ð�ť���
		JButton myBtn = new JButton("��ť");
		
		//����ť���������ӵ�������
		frm.add(myBtn);
		
		//��ʾ��δ����¼�
		
		//���ô����ʼλ�ô�С����ʾ
		frm.setBounds(700,500,300,100);
		//���ô���رշ�ʽ
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//�ô�����ʾ
		frm.setVisible(true);
		
	}

}
