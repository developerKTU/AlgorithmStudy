package BOJ.Basic.A_IO_4BasicOperations.BasicOperations;

import java.io.*;
import java.util.StringTokenizer;

public class BasicOperations07 {
    public static void main(String[] args) throws IOException{
        /* 문제번호 11382 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long a = Long.parseLong(st.nextToken()); /* 숫자 범위 잘 확인 하자... (자료형 꼭 신경쓰기) */
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());

        bw.write(String.valueOf(a+b+c));
        bw.close();
    }
}
