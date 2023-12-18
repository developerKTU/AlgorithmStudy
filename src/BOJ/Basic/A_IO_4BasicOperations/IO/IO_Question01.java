package BOJ.Basic.A_IO_4BasicOperations.IO;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class IO_Question01 {
    public static void main(String[] args) throws IOException {
        /* 문제번호 2557 */
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("Hello World!");
        bw.close();
    }
}
