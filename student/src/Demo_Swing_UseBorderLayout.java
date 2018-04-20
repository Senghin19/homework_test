import java.awt.*;
import javax.swing.*;

public class Demo_Swing_UseBorderLayout {
	public static void main(String[] args) {
		JFrame frm = new JFrame("ʹ�ñ߽粼�ֹ�����");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//���ñ߽粼�ֹ�����
		frm.setLayout(new BorderLayout());
		
		//���������ǩ�����������ˮƽ��ʽ
		JButton northLabel = new JButton("����������NORTH��");
		northLabel.setHorizontalAlignment(JButton.HORIZONTAL);
		JButton southLabel = new JButton("�����ײ���SOUTH��");
		southLabel.setHorizontalAlignment(JButton.HORIZONTAL);
		JButton westLabel = new JButton("������ࣨWEST��");
		westLabel.setHorizontalAlignment(JButton.HORIZONTAL);
		JButton eastLabel = new JButton("�����ҲࣨEAST��");
		eastLabel.setHorizontalAlignment(JButton.HORIZONTAL);
		JButton centerLabel = new JButton("�������ģ�CENTER��");
		centerLabel.setHorizontalAlignment(JButton.HORIZONTAL);
		
		frm.add(northLabel,BorderLayout.NORTH);
		frm.add(southLabel, BorderLayout.SOUTH);
		frm.add(westLabel, BorderLayout.WEST);
		frm.add(eastLabel, BorderLayout.EAST);
		frm.add(centerLabel, BorderLayout.CENTER);
		
		//���ô���λ�����С����ʾ
		frm.setBounds(450,230,400,200);
		frm.setVisible(true);
	}
}
