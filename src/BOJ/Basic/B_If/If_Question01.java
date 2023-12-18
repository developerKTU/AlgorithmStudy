package BOJ.Basic.B_If;

import java.io.*;
import java.util.StringTokenizer;

public class If_Question01 {
    public static void main(String[] args) throws IOException {
        /* 문제번호 1330번 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if(a > b){
            bw.write(">");
        }else if(a < b){
            bw.write("<");
        }else{
            bw.write("==");
        }

        bw.close();
    }
}
