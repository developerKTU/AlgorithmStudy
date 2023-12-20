package BOJ.Basic.C_Loop;

import java.io.*;
import java.util.StringTokenizer;

public class Loop_Question02 {
    public static void main(String[] args) throws IOException {
        /* 문제번호 10950번 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            if(i == N-1){
                bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())+"");
            }else{
                bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())+"\n");
            }

        }

        bw.close();
    }
}
