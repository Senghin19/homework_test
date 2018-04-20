import java.awt.*;
import javax.swing.*;

public class Demo_Swing_UseBorderLayout {
	public static void main(String[] args) {
		JFrame frm = new JFrame("使用边界布局管理器");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//设置边界布局管理器
		frm.setLayout(new BorderLayout());
		
		//创建五个标签并设置其对齐水平方式
		JButton northLabel = new JButton("容器顶部（NORTH）");
		northLabel.setHorizontalAlignment(JButton.HORIZONTAL);
		JButton southLabel = new JButton("容器底部（SOUTH）");
		southLabel.setHorizontalAlignment(JButton.HORIZONTAL);
		JButton westLabel = new JButton("容器左侧（WEST）");
		westLabel.setHorizontalAlignment(JButton.HORIZONTAL);
		JButton eastLabel = new JButton("容器右侧（EAST）");
		eastLabel.setHorizontalAlignment(JButton.HORIZONTAL);
		JButton centerLabel = new JButton("容器中心（CENTER）");
		centerLabel.setHorizontalAlignment(JButton.HORIZONTAL);
		
		frm.add(northLabel,BorderLayout.NORTH);
		frm.add(southLabel, BorderLayout.SOUTH);
		frm.add(westLabel, BorderLayout.WEST);
		frm.add(eastLabel, BorderLayout.EAST);
		frm.add(centerLabel, BorderLayout.CENTER);
		
		//设置窗体位置与大小并显示
		frm.setBounds(450,230,400,200);
		frm.setVisible(true);
	}
}
