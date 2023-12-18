package BOJ.Basic.A_IO_4BasicOperations.IO;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class IO_Question04 {
    public static void main(String[] args) throws IOException {
        /* 문제번호 10172번 */
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("|\\_/|"+"\n");
        bw.write("|q p|   /}"+"\n");
        bw.write("( 0 )\"\"\"\\"+"\n");
        bw.write("|\"^\"`    |"+"\n");
        bw.write("||_/=\\\\__|");
        bw.close();
    }
}
