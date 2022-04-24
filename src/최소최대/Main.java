package 최소최대;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] tArray = new int[n];
		
		tArray[0] = sc.nextInt();
		int min= tArray[0];
		int max= tArray[0];
		for(int i=1; i<tArray.length; i++) {
			tArray[i] = sc.nextInt();
			if(min>=tArray[i]) {
				min=tArray[i];
			}else {
				max=tArray[i];
			}
			
		}
		
		System.out.print(min+" ");
		System.out.println(max);
		
		sc.close();
	}
}
