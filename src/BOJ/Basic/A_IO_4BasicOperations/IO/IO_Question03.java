package BOJ.Basic.A_IO_4BasicOperations.IO;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class IO_Question03 {
    public static void main(String[] args) throws IOException {
        /* 문제번호 10171번 */
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("\\    /\\"+"\n");
        bw.write(" )  ( \')"+"\n");
        bw.write("(  /  )"+"\n");
        bw.write(" \\(__)|");
        bw.close();
    }
}
