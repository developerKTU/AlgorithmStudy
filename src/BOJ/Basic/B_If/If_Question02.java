package BOJ.Basic.B_If;

import java.io.*;

public class If_Question02 {
    public static void main(String[] args) throws IOException {
        /* 문제번호 9498번 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        if(a >= 90 && a <= 100){
            bw.write("A");
        }else if(a >= 80 && a <= 89){
            bw.write("B");
        }else if(a >= 70 && a <= 79){
            bw.write("C");
        }else if(a >= 60 && a <= 69){
            bw.write("D");
        }else{
            bw.write("F");
        }

        bw.close();

    }
}
