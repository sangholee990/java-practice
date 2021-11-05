package prac906;

import java.awt.*;
import javax.swing.*;

public class Chapter9_6 extends JFrame {
	Chapter9_6() {
		setTitle("Random Labels");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);
		for (int i = 0; i < 20; i++) {
			JLabel label = new JLabel();
			int x = (int) (Math.random() * 200) + 50; // 50~250
			int y = (int) (Math.random() * 200) + 50; // 50~250
			label.setLocation(x, y); // label을 (x,y)에 배치
			label.setBackground(Color.BLUE);
			label.setSize(10, 10); // label 크기를 10*10으로 설정
			c.add(label);
			label.setOpaque(true); // label에 배경색이 보이게 함
		}
		setSize(300, 300);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Chapter9_6();
	}

}
