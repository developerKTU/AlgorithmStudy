package BOJ.CodingTest.DataStructure;

import java.io.*;
import java.util.StringTokenizer;

public class Question06 {
    public static void main(String[] args) throws IOException {
        /* 문제번호 1120번 문제 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String A = st.nextToken();
        String B = st.nextToken();

        int result = 50;

        for(int i = 0; i < B.length() - A.length() + 1; i++){   // A 문자열 길이만큼 B문자열과 비교해야함.
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
