package BOJ.Basic.E_String;

import java.io.*;

public class String_Question03 {
    public static void main(String[] args) throws IOException{
        /* 문제번호 9086번 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        String s;
        char[] sArray;
        int firstIdx = 0;
        int lastIdx = 0;

        for(int i = 0; i < t; i++){
            s = br.readLine();
            sArray = s.toCharArray();
            lastIdx = sArray.length-1;

            bw.write(sArray[firstIdx] + "" + sArray[lastIdx] + "\n");
            bw.flush();
        }

        bw.close();
    }
}
