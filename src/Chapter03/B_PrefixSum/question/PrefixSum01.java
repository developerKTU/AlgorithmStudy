package Chapter03.B_PrefixSum.question;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

/* 백준 - 11659번 문제 */
public class PrefixSum01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 배열 데이터 갯수를 담는 N 변수 선언
        int N = Integer.parseInt(st.nextToken());
        // 질의 갯수를 담는 QuizNum 변수 선언
        int QuizNum = Integer.parseInt(st.nextToken());
        // 데이터를 담을 A 배열 선언
        ArrayList<Integer> A = new ArrayList<Integer>();
        // A 배열에 데이터 삽입
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            A.add(Integer.parseInt(st.nextToken()));
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
            st = new StringTokenizer(br.readLine());
            i = Integer.parseInt(st.nextToken());
            j = Integer.parseInt(st.nextToken());
            bw.write(String.valueOf(S.get(j) - S.get(i-1))+"\n");
        }
        bw.close();
    }
}
