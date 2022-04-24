package 평균은넘겠지;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum=0;
		int mean=0;
		int overN=0;
		int[] studentN = new int[sc.nextInt()];
		for(int i=0; i<studentN.length; i++) {
			studentN[i] = sc.nextInt();
			int[] scoreN = new int[studentN[i]];
			for(int j=0; j<scoreN.length; j++) {
				scoreN[j] = sc.nextInt();
				sum+=scoreN[j];
			}
			mean = sum/scoreN.length;
			for(int j=0; j<scoreN.length; j++) {
				if(scoreN[j]>mean) {
					overN++;
				}
			}
			System.out.println(overN/studentN[i]);
		}
		
		
		
		sc.close();
	}
}
