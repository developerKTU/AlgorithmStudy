package BOJ.Basic.E_String;

import java.io.*;

public class String_Question01 {
    public static void main(String[] args) throws IOException{
        /* 문제번호 27866번 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();
        int i = Integer.parseInt(br.readLine());

        char[] sArray = S.toCharArray();

        bw.write(sArray[i-1]);
        bw.close();
    }
}
