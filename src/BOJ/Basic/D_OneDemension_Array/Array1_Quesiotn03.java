package BOJ.Basic.D_OneDemension_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Array1_Quesiotn03 {
    public static void main(String[] args) throws IOException {
        /* 문제번호 10818번 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] arr = new int[N];

        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = arr[0];
        for(int i : arr){
            if(max < i){
                max = i;
            }
        }

        int min = arr[0];
        for(int i : arr){
            if(min > i){
                min = i;
            }
        }

        System.out.println(min + " " + max);
    }
}
