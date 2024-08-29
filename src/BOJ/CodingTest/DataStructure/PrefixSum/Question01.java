package BOJ.CodingTest.DataStructure.PrefixSum;

import java.io.*;
import java.util.*;

public class Question01 {
    public static void main(String[] args) throws IOException{
        /* 백준 11659번 문제 https://www.acmicpc.net/problem/11659 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 주어진 수를 담을 배열 A선언
        int[] A = new int[N + 1];
        // 합 배열을 저장할 배열 S 선언
        int[] S = new int[A.length];

        // 배열 A 초기화
        st = new StringTokenizer(br.readLine());
        A[0] = 0;
        for(int i = 1; i < A.length; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        // 합 배열 S 초기화
        S[0] = A[0];
        for(int i = 1; i < A.length; i++){
            S[i] = S[i - 1] + A[i];
        }

        for(int t = 0; t < M; t++){
            st = new StringTokenizer(br.readLine());
            // 인덱스는 0부터 시작하지만 구간 합은 시작이 1부터 시작이라 -1 처리하지 않음.
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            System.out.println(S[j] - S[i - 1]);
        }

    }
}
