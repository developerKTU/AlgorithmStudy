package BOJ.Basic.A_IO_4BasicOperations.BasicOperations;

import java.io.*;
import java.util.StringTokenizer;

public class BasicOperations02 {
    public static void main(String[] args) throws IOException {
        /* 문제번호 1008 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        bw.write(String.valueOf((double) a/b));
        bw.close();
    }
}
