package 최댓값;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] mArray = new int[9];

		int i;
		for(i=0; i<mArray.length; i++) {
			mArray[i]=sc.nextInt();
		}
		
		int max=mArray[0];
		for(i=0; i<mArray.length; i++) {
			if(mArray[i]>=max) {
				max=mArray[i];
			}
		}
		System.out.println(max);
		
		for(i=0; i<mArray.length; i++) {
			if(max==mArray[i]) {
				System.out.println(i+1);
			}
		}
		sc.close();
	}
}
