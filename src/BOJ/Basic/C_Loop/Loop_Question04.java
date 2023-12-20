package BOJ.Basic.C_Loop;

import java.io.*;
import java.util.StringTokenizer;

public class Loop_Question04 {
    public static void main(String[] args) throws IOException {
        /* 문제번호 26304번 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int total = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sumVal = 0;

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            sumVal += ( Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken()) );
        }

        if(total == sumVal){
            bw.write("Yes");
        }else {
            bw.write("No");
        }

        bw.close();
    }
}
