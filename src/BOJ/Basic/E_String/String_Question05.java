package BOJ.Basic.E_String;

import java.io.*;
import java.util.StringTokenizer;

public class String_Question05 {
    public static void main(String[] args) throws IOException {
        /* 문제번호 2908번 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        char[] charNum1 = st.nextToken().toCharArray();
        char[] charNum2 = st.nextToken().toCharArray();

        int multiplyNum = 1;
        int idx = 0;
        int num1 = 0;
        while(idx <= 2){
            num1 += (charNum1[idx] - '0') * multiplyNum;
            idx++;
            multiplyNum *= 10;
        }

        multiplyNum = 1;
        idx = 0;
        int num2 = 0;
        while(idx <= 2){
            num2 += (charNum2[idx] - '0') * multiplyNum;
            idx++;
            multiplyNum *= 10;
        }

        if(num1 > num2){
            bw.write(num1+"");
        }else{
            bw.write(num2+"");
        }
        bw.close();
    }
}
