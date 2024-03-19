package BOJ.Deep;

import java.io.*;
import java.util.StringTokenizer;

public class DeepQuestion02 {

    private static int CHESSCOUNT = 6;
    public static void main(String[] args) throws IOException {
        /* 문제번호 3003번 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int [] normalArr = {1, 1, 2, 2, 2, 8};
        int [] resultArr = new int[CHESSCOUNT];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < CHESSCOUNT; i++){
            resultArr[i] = normalArr[i] - Integer.parseInt(st.nextToken());
        }

        for(int i : resultArr){
            bw.write(i+" ");
        }

        bw.close();
    }
}
