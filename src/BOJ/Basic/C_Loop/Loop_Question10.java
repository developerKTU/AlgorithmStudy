package BOJ.Basic.C_Loop;

import java.io.*;

public class Loop_Question10 {
    public static void main(String[] args) throws IOException {
        /* 문제번호 2439번 -> 별찍기 약함... */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for(int i = N; i >= 1; i--){
            for(int j = i-1; j > 0; j--){
                bw.write(" ");
            }
            for(int k = 0 ; k <= N-i; k++){
                bw.write("*");
            }

            bw.newLine();
        }

        bw.close();
    }
}
