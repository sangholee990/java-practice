package no04;
import java.util.Scanner;


public class no04 {
	public static void main(String[] arg) {
		Scanner s = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		
		String alp = s.next();
		
		char c = alp.charAt(0);
		  for(int i=0; i<=c-'a';i++) {
			  for(char j= 'a'; j<= c-i; j++) {
				  System.out.print(j);
			  }
			  System.out.println();
		  }
	}
}
