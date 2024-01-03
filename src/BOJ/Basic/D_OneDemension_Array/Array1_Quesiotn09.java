package BOJ.Basic.D_OneDemension_Array;

import java.io.*;
import java.util.StringTokenizer;

public class Array1_Quesiotn09 {
    public static void main(String[] args) throws IOException{
        /* 문제번호 10811번 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        for(int inp = 0; inp < arr.length; inp++){
            arr[inp] = inp+1;
        }

        int i, j, temp;

        for(int t = 0; t < M; t++){
            st = new StringTokenizer(br.readLine());
            i = Integer.parseInt(st.nextToken());
            j = Integer.parseInt(st.nextToken());

            /* i, j 변수를 둘 다 활용해야 하므로 while문 사용. */
            while(i < j){
                temp = arr[i-1];
                arr[i-1] = arr[j-1];
                arr[j-1] = temp;
                i++;
                j--;
            }
        }

        for(int res : arr){
            bw.write(res + " ");
        }
        bw.close();
    }
}
