package BOJ.Basic.B_If;

import java.io.*;
import java.util.StringTokenizer;

public class If_Question07 {
    public static void main(String[] args) throws IOException {
        /* 문제번호 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int result = 0;

        if((a==b)&&(b==c)&&(a==c)){
            result = 10000 + (a * 1000);
        }
        else if(a==b || a==c || b==c){
            if(a==b){
                result = 1000 + (a*100);
            }else if(b==c){
                result = 1000 + (b*100);
            }else{
                result = 1000 + (c*100);
            }
        }else{
                if(a > b && a > c){
                    result = a * 100;
                }else if( a < b && b > c){
                    result = b * 100;
                }else{
                    result = c * 100;
                }
        }

        bw.write(String.valueOf(result));
        bw.close();
    }
}
