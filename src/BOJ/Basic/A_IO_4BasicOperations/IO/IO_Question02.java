package BOJ.Basic.A_IO_4BasicOperations.IO;

import java.io.*;

public class IO_Question02 {
    public static void main(String[] args) throws IOException{
        /* 문제번호 10926번 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(br.readLine()+"??!");
        bw.close();
    }
}
