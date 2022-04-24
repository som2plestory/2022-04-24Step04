package 나머지;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] nArr = new int[10];
		int[] rArr = new int[42];
		for(int i=0; i<10; i++) {
			nArr[i] = sc.nextInt();
			rArr[nArr[i]%42]++;
		}
		sc.close();
		
		int n_r=0;
		for(int i=0; i<rArr.length; i++) {
			if(rArr[i]!=0) {
				n_r++;
			}
		}
		System.out.println(n_r);
		
	}
}
