package BOJ.Basic.A_IO_4BasicOperations.BasicOperations;

import java.io.*;
import java.util.StringTokenizer;

public class BasicOperations06 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        String b = br.readLine();
        char[] c = b.toCharArray();

        for(int i = c.length-1; i >=0 ; i--){
            bw.write(String.valueOf(a * Integer.parseInt(String.valueOf(c[i])))+"\n");
            bw.flush();
        }
        bw.write(String.valueOf( a * Integer.parseInt(b)));
        bw.close();
    }
}
