package Chapter04.question;

import java.util.ArrayList;
import java.util.Scanner;

public class PrefixSum01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // 배열 데이터 갯수를 담는 N 변수 선언
        int N = sc.nextInt();
        // 질의 갯수를 담는 QuizNum 변수 선언
        int QuizNum = sc.nextInt();
        // 데이터를 담을 A 배열 선언
        ArrayList<Integer> A = new ArrayList<Integer>();
        // A 배열에 데이터 삽입
        for(int i = 0; i < N; i++){
            A.add(sc.nextInt());
        }
        //구간합 배열 S 선언 및 초기화
        ArrayList<Integer> S = new ArrayList<Integer>();
        S.add(0, 0);
        for(int i = 1; i < A.size()+1; i++){
            S.add(i, S.get(i-1) + A.get(i-1));
        }
        // 구간 입력받을 변수 선언 및 초기화
        int i = 0;
        int j = 0;
        for(int q = 0; q < QuizNum; q++){
            i = sc.nextInt();
            j = sc.nextInt();
            System.out.println(S.get(j) - S.get(i-1));
        }

        sc.close();
    }
}
