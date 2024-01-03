package BOJ.Basic.D_OneDemension_Array;

import java.io.*;

public class Array1_Quesiotn08 {

    final static int MAX = 1000;
    final static int INPUT_NUM = 10;

    public static void main(String[] args) throws IOException{
        /* 문제번호 3052 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Boolean[] arr = new Boolean[MAX];

        int cnt = 0;

        for(int i = 0; i < 1000; i++){
            arr[i] = false;
        }

        for(int i = 0; i < INPUT_NUM; i++){
            arr[Integer.parseInt(br.readLine())%42] = true;
        }

        for(boolean res : arr){
            if(res){
                cnt++;
            }
        }

        bw.write(cnt+"");
        bw.close();
    }

}
