package BOJ.Basic.D_OneDemension_Array;

import java.io.*;

public class Array1_Quesiotn04 {
    final static int ARRAY_SIZE = 9;
    public static void main(String[] args) throws IOException{
        /* 문제번호 2562번 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[ARRAY_SIZE];

        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int max = arr[0];
        int idx = 0;
        for(int i = 0; i <arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
                idx = i;
            }
        }

        bw.write(max+"\n"+String.valueOf(idx+1));
        bw.close();
    }
}
