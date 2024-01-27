package BOJ.Basic.E_String;

import java.io.*;

public class String_Question07 {
    public static void main(String[] args) throws IOException {
        /* 문제번호 1654번 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        bw.write((int)s.charAt(0)+"");
        bw.close();
    }
}
