package BOJ.Basic.C_Loop;

import java.io.*;
import java.util.StringTokenizer;

public class Loop_Question12 {
    public static void main(String[] args) throws IOException {
        /* 문제번호 10952번 */
        /* EOF : 파일의 끝에서 입력받을 데이터가 존재하지 않으면 알아서 종료 시키는 것임. */
        /* IDE나 터미널에서 입력할 경우 공백이나 엔터를 쳐도 입력으로 인식하기 때문에
           EOF를 입력하려면 ctrl + z 또는 ctrl + d 를 해주면 EOF로 인식함. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        String str;
        int A, B;

        while((str = br.readLine()) != null){
            st = new StringTokenizer(str, " ");
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            bw.write(A + B + "\n");
            bw.flush();
        }
        bw.close();
    }
}
