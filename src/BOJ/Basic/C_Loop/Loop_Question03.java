package BOJ.Basic.C_Loop;

import java.io.*;

public class Loop_Question03 {
    public static void main(String[] args) throws IOException {
        /* 문제번호 8393번 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int result = 0;

        for(int i = 1; i <= N; i++){
            result += i;
        }

        bw.write(String.valueOf(result));
        bw.close();
    }
}
