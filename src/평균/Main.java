package 평균;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //시험 본 과목 개수
		int[] score = new int[N]; //각 과목 점수
		int max = 0; //기존 점수 최댓값
		double sum = 0; //변환 점수 합계
		double avg; //변환 점수 평균
		
		for(int i=0; i<N; i++) {
			score[i] = sc.nextInt();
			if(max<=score[i]) {
				max=score[i];
			}
		}
		
		double[] scoreN = new double[N]; //각 과목 변환 점수
		
		for(int i=0; i<N; i++) {
			scoreN[i] = (double)score[i]/max*100;
			sum += scoreN[i];
		}
		
		avg = sum/N;
		
		System.out.println(avg);
		
		
		sc.close();
	}

}
