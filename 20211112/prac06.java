package prac06;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class prac06 extends JFrame {
	public prac06() {
		setTitle("RandomC"); // 제목 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 종료 시 프로그램 종료
		setSize(300, 300); // 크기 설정
		setVisible(true); // 창 보이기
		Container c = getContentPane(); // 컨텐트팬 생성
		c.setLayout(null);
		JLabel la = new JLabel("C");
		la.setSize(10, 10);
		la.setLocation(100, 100);
		c.add(la);
		la.setFocusable(true);
		la.requestFocus();
		la.addMouseListener(new MouseAdapter() { // 익명 리스너
			public void mouseClicked(MouseEvent e) { // 키가 눌리면 이벤트 발생
				JLabel label = (JLabel) e.getSource(); // 이벤트 발생 시 레퍼런스 리턴
				label.setLocation((int) (Math.random() * 250), (int) (Math.random() * 250));
			}
		});
	}

	public static void main(String[] args) {
		new prac06();
	}
}
