package BOJ.Deep;

import java.io.*;
import java.util.StringTokenizer;

public class DeepQuestion06 {
    public static void main(String[] args) throws IOException {
        /* 문제번호 2941 : String 클래스의 메소드를 잘 활용하자! (contains, replace 등..) */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String [] strArr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        String str = br.readLine();

        for(int i = 0; i < strArr.length; i++){
            if(str.contains(strArr[i])){
                str = str.replace(strArr[i], "*");
            }
        }

        bw.write(str.length()+"");



        bw.close();
    }
}
