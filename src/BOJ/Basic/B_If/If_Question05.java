package BOJ.Basic.B_If;

import java.io.*;
import java.util.StringTokenizer;

public class If_Question05 {
    public static void main(String[] args) throws IOException {
        /* 문제번호 14681번 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if(M < 45){
            if(H == 0){
                H = 23;
            }else{
                H--;
            }
            M+=60;
        }

        bw.write(String.valueOf(H)+" "+String.valueOf(M-45));
        bw.close();
    }
}
