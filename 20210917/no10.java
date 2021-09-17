package no10;
import java.util.Scanner;

public class no10 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int array[][] = new int[4][4];
		int a[] = new int[10];
		int b[] = new int[10];
		a[0] = -1; 
		b[0] = -1;
		
		int i,j=0;

		
		for(i=0; i<10; i++) {
			j = 0;
			int a_n = (int)(Math.random()*4);
			int b_n = (int)(Math.random()*4);
			int n = (int)(Math.random()*10 + 1);
			
			for(;j<=i;j++) {
				if(a[j] == a_n && b[j] == b_n){
					i--;
					break;
				}
				if(j == i) {
					a[i] = a_n;
					b[i] = b_n;
					array[a_n][b_n] = n;
				}
			}
		}
		for(i=0; i<4; i++) {
			for(j=0; j<4; j++) 
				System.out.print(array[i][j]+" ");
			System.out.println();
		 
	    }
	}
}
