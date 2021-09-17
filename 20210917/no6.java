package no06;
import java.util.Scanner;

public class no06 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("금액을 입력하시오>>");
		int money = s.nextInt();
		
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		for(int i=0; i<unit.length; i++) {
			int n = money/unit[i];
			if(n != 0)
				System.out.println(unit[i] + "원 짜리:" + n + "개");
			money -= unit[i]*n;
		}
	}

}
