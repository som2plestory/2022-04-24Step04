package 평균은넘겠지;

import java.util.Scanner;

public class Main_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int C=sc.nextInt();	//C : 반(케이스) 수
		int sum;	//반 학생들의 점수 합계
		double mean=0;
		int overN=0;
		int[] studentN = new int[C]; //(반별 학생수)
		for(int i=0; i<C; i++) { //반별 계산 
			sum=0;
			studentN[i] = sc.nextInt(); //반 학생수
			int[] scoreN = new int[studentN[i]]; // (학생별 점수)
			for(int j=0; j<scoreN.length; j++) { //  
				scoreN[j] = sc.nextInt(); //학생별 점수
				sum=sum+scoreN[j]; //학생들 점수 합
			}
			mean = (double)sum/studentN[i]; //학생들 평균 점수
			for(int j=0; j<studentN[i]; j++) { //학생마다 
				if(scoreN[j]>mean) { //학생별 점수가 평균이상인지
					overN++; //평균이상인 학생수 체크
				}
			}
	        double studentR = (double)overN/studentN[i]; // 비율 : 평균이상학생수/학생수
	        double percent = studentR*100; //위 비율을 백분율로 환산
	        System.out.println(String.format("%.3f",percent+0.000001)+ "%");
		}
		
		sc.close();
	}
}