package BOJ.Basic.B_If;

import java.io.*;
import java.util.StringTokenizer;

public class If_Question06 {
    public static void main(String[] args) throws IOException {
        /* 문제번호 2525번 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int addTime = Integer.parseInt(br.readLine());

        if((M + addTime) >= 60){
            H += (M + addTime)/60;
            if(H >= 24){
                H = H%24;
            }
            M = (M + addTime)%60;
        }else{
            M += addTime;
        }

        bw.write(H+" "+M);
        bw.close();

    }
}
