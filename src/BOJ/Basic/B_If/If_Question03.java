package BOJ.Basic.B_If;

import java.io.*;

public class If_Question03 {
    public static void main(String[] args) throws IOException {
        /* 문제번호 2753번 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int year = Integer.parseInt(br.readLine());

        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            bw.write("1");
        }else{
            bw.write("0");
        }

        bw.close();
    }
}
