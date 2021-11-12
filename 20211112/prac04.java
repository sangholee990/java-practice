package prac04;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class prac04 extends JFrame {
	public prac04() {
		setTitle("Rotate by Left Key"); // 제목 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 종료 시 프로그램 종료
		setSize(300, 300); // 크기 설정
		setVisible(true); // 창 보이기
		Container c = getContentPane(); // 컨텐트팬 생성
		c.setLayout(new FlowLayout()); // flow 레이아웃 설정
		JLabel la = new JLabel("Love java"); // label의 텍스트는 Love java
		c.add(la); // 컨텐트팬에 부착
		la.setFocusable(true);
		la.requestFocus();
		la.addKeyListener(new KeyAdapter() { // 익명 리스너
			public void keyPressed(KeyEvent e) { // 키가 눌리면 이벤트 발생
				if (e.getKeyCode() == KeyEvent.VK_LEFT) { // 입력된 키가 왼쪽 화살표면
					JLabel label = (JLabel) e.getSource(); // 이벤트 발생 시 레퍼런스 리턴
//수정이 용이한 StringBuffer 객체 생성. label의 텍스트를 받음
					StringBuffer text = new StringBuffer(label.getText());
//현재 text의 첫 문자를 text의 끝에 추가
					text = text.append(text.substring(0, 1));
//첫 문자를 지우고 String객체로 바꾸어 label의 text로 설정
					label.setText(text.deleteCharAt(0).toString());
				}
			}
		});
//포커스 설정
	}

	public static void main(String[] args) {
		new prac04();
	}
}
