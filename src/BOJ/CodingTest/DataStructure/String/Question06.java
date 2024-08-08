package BOJ.CodingTest.DataStructure.String;

import java.io.*;
import java.util.StringTokenizer;

public class Question06 {
    public static void main(String[] args) throws IOException {
        /* 백준 1120번 문제 https://www.acmicpc.net/problem/1120 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String A = st.nextToken();
        String B = st.nextToken();
        
        // 최솟값을 구하기 위해 문제의 최대 문자열 길이인 50으로 초기화
        int result = 50;

        for(int i = 0; i < B.length() - A.length() + 1; i++){   // A 문자열 길이만큼 B문자열과 비교해야함.
            /* 각 케이스마다 최소값을 구해야함
               ex) ABCD ARGCEF 비교시 ABCD <-> ARGC, ABCD <-> RGCE, ABCD <-> GCEF 비교하여
               각 케이스 중 가장 작은 값(A, B 차이 최소) 추출 */
            int cnt = 0;
            for(int j = 0; j < A.length(); j++){                // A 문자열과 B문자열 비교 (A 문자열과 B 문자열의 차이 만큼 옆으로 이동하면서 비교)
                if(A.charAt(j) != B.charAt(i + j)){             // A 문자열의 문자와 B문자열의 문자가 다르면 cnt++
                    cnt++;
                }
            }
            result = Math.min(cnt, result);
        }
        System.out.println(result);
    }
}
