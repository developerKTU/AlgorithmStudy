package BOJ.Deep;

import java.io.*;

public class DeepQuestion04 {
    public static void main(String[] args) throws IOException {
        /* 문제번호 10988번 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int result = 1;

        char [] normalArr = s.toCharArray();
        char [] reverseArr = new char[normalArr.length];

        int idx = normalArr.length;
        for(int i = normalArr.length; i >= 1; i--){
            reverseArr[idx-i] = normalArr[i-1];
        }


        for(int i = 0; i < normalArr.length; i++){
            if(normalArr[i] == reverseArr[i]){
                continue;
            }else{
                result = 0;
            }
        }

        bw.write(result+"");
        bw.close();
    }
}
