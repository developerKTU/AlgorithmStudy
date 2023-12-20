package BOJ.Basic.C_Loop;

import java.io.*;
import java.util.StringTokenizer;

public class Loop_Question08 {
    public static void main(String[] args) throws IOException {
        /* 문제번호 11022번 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        int A, B;
        StringTokenizer st;
        for(int i = 1; i <= T; i++){
            st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());

            bw.write("Case #" + i + ": " + A + " + " + B + " = " + (A + B) + "\n");
        }

        bw.close();
    }
}
