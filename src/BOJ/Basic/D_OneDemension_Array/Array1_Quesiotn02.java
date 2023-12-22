package BOJ.Basic.D_OneDemension_Array;

import java.io.*;
import java.util.StringTokenizer;

public class Array1_Quesiotn02 {
    public static void main(String[] args) throws IOException {
        /* 문제번호 10871번 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(x > arr[i]){
                bw.write(arr[i]+" ");
            }
        }
        bw.close();
    }
}
