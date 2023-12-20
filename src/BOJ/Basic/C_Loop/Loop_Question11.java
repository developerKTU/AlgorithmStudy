package BOJ.Basic.C_Loop;

import java.io.*;
import java.util.StringTokenizer;

public class Loop_Question11 {
    public static void main(String[] args) throws IOException {
        /* 문제번호 10952번 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        int A, B;

        while(true){
            st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            if( A == 0 && B == 0 ){
                break;
            }
            bw.write(A + B + "\n");
            bw.flush();
        }
        bw.close();
    }
}
