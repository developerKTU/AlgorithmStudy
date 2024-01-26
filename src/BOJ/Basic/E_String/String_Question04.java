package BOJ.Basic.E_String;

import java.io.*;

public class String_Question04 {
    public static void main(String[] args) throws IOException{
        /* 문제번호 10809번 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int[] alphabet = new int[26];

        for(int i = 0; i < alphabet.length; i++){
            alphabet[i] = -1;
        }

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            
            /* 입력받은 문자열의 현재 문자값에서 기준점인 'a'의 아스키코드 값을 뺀 숫자번째의 값이 -1이면 */
            if(alphabet[ch - 'a'] == -1){
                alphabet[ch - 'a'] = i;
            }
        }

        for(int i : alphabet){
            bw.write(i+" ");
        }

        bw.close();
    }
}
