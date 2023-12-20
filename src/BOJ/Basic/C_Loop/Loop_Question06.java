package BOJ.Basic.C_Loop;

import java.io.*;
import java.util.StringTokenizer;

public class Loop_Question06 {
    public static void main(String[] args) throws IOException {
        /* 문제번호 15552번 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for(int i = 0; i < T; i ++){
            st = new StringTokenizer(br.readLine());

            if(i == T-1){
                bw.write( Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())+"" );
            }else{
                bw.write( Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())+"\n" );
            }
        }

        bw.close();
    }
}
