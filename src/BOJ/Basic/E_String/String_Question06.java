package BOJ.Basic.E_String;

import java.io.*;
import java.util.StringTokenizer;

public class String_Question06 {
    public static void main(String[] args) throws IOException{
        /* 문제번호 1152번 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        bw.write(st.countTokens()+"");
        bw.close();
    }
}
