package 평균은넘겠지;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();//개수 C
        for(int i =0; i < C; i++){
            int sum = 0;//합
            int cnt = 0;//점수넘은 사람 수
            float avg = 0f;//평균
            float percent = 0;
            float studentRatio = 0f;//넘은 학생 비율
            int N = sc.nextInt();//점수 개수 N
            int[] arr = new int[N];
            for(int j = 0; j < N ; j++){
                arr[j] = sc.nextInt();
                sum +=arr[j];
                avg = sum/N;
            }
            for(int k = 0; k< arr.length; k++) {
                if (avg < arr[k]) {//평균보다 점수가 높을경우
                    cnt++;//카운트를 1올린다.
                }
            }
            studentRatio = (float) cnt / N;
            percent = studentRatio*100;
            System.out.println(String.format("%.3f",percent)+ "%");
            //String.format("%.3f"(반올림할자릿수), percent(출력할 변수)
        }
        sc.close();
    }
}