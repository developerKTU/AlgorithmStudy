package BOJ.Basic.A_IO_4BasicOperations.BasicOperations;

import java.io.*;

public class BasicOperations04 {
    public static void main(String[] args) throws IOException{
        /* 문제번호 18108번 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write( String.valueOf(Integer.parseInt(br.readLine())-543));
        bw.close();
    }
}
