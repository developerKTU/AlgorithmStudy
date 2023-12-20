package BOJ.Basic.C_Loop;

import java.io.*;

public class Loop_Question05 {

    final static int BYTEVAL = 4;
    public static void main(String[] args) throws IOException {
        /* 문제번호 25314번 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int loopVal = N/BYTEVAL;

        for(int i = 0; i < loopVal; i++){
            bw.write("long ");
        }
        bw.write("int");
        bw.close();
    }
}
