package BOJ.Basic.D_OneDemension_Array;

import java.io.*;
import java.util.StringTokenizer;

public class Array1_Quesiotn01 {
    public static void main(String [] args) throws IOException {
        /* 문제번호 10807번 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        int v = Integer.parseInt(br.readLine());
        int result = 0;


        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i] == v){
                result++;
            }
        }

        bw.write(result+"");
        bw.close();
    }
}
