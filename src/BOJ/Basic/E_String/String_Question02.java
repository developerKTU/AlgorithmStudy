package BOJ.Basic.E_String;

import java.io.*;

public class String_Question02 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();
        char[] sArray = S.toCharArray();

        bw.write(sArray.length+"");
        bw.close();
    }
}
