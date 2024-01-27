package BOJ.Basic.E_String;

import java.io.*;
import java.util.StringTokenizer;

public class String_Question05 {
    public static void main(String[] args) throws IOException {
        /* 문제번호 2675번 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++){
            st = new StringTokenizer(br.readLine());
            int loopStr = Integer.parseInt(st.nextToken());
            String s = st.nextToken();

            /* 문자열의 길이 만큼 돌면서 반복횟수만큼 또 loop 돌면서 각 문자열의 문자를 반복 */
            for(int j = 0; j < s.length(); j++){
                for(int k = 0; k < loopStr; k++){
                    bw.write(s.charAt(j));
                }
            }
            bw.newLine();
            bw.flush();
        }

        bw.close();
    }
}
