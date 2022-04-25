package OX퀴즈;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testN = sc.nextInt(); //케이스의 개수
		char[] anArr = new char[80];
		
		for(int i=0; i<testN; i++) {
			int score = 0; //점수 초기값
			int sum = 0; //점수 합계
			String nArr = sc.next(); // 케이스별 답안
			for(int j=0; j<nArr.length(); j++) {
				anArr[j] = nArr.charAt(j); //입력받는 OX문자열을 문자배열에 쪼개 넣기
			}
			for(int j=0; j<nArr.length(); j++) {
				if(anArr[j]=='O') {
					score++;
					sum+=score;
				}else if(anArr[j]=='X') {
					score = 0;
				}
			}
			System.out.println(sum);
		}
		
		sc.close();
	}
}
