package BOJ.CodingTest.DataStructure.PrefixSum;

import java.io.*;
import java.util.*;

public class Question01 {
    /* 백준 11659번 문제 https://www.acmicpc.net/problem/11659 */
    public static int[] twoPointer(int[] A, int[][] command){

        int[] copyA = new int[A.length + 1];
        int[] answer = new int[command.length];

        copyA[0] = 0;
        for(int i = 1; i < copyA.length; i++){
            copyA[i] = A[i - 1];
        }

        // 합배열 S 구하기
        int[] S = new int[copyA.length];
        S[0] = copyA[0];
        for(int i = 1; i < copyA.length; i++){
            S[i] = S[i - 1] + copyA[i];
        }

        // 구간합 구하기
        for(int t = 0; t < command.length; t++){
            int i = command[t][0];
            int j = command[t][1];

            answer[t] = S[j] - S[i - 1];
        }

        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[][] command = new int[M][2];

        for(int x = 0; x < command.length; x++){
            st = new StringTokenizer(br.readLine());
            for(int y = 0; y < command[y].length; y++){
                command[x][y] = Integer.parseInt(st.nextToken());
            }
        }

        int[] result = twoPointer(arr, command);

        for (int i : result) {
            System.out.println(i);
        }
    }
}