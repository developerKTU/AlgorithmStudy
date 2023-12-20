package BOJ.Basic.C_Loop;

import java.io.*;

public class Loop_Question09 {
    public static void main(String[] args) throws IOException {
        /* 문제번호 2438번 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            for(int j = 0; j <= i; j++){
                bw.write("*");
            }
            bw.newLine();
        }

        bw.close();
    }
}
