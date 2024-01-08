package BOJ.Basic.D_OneDemension_Array;

import java.io.*;
import java.util.StringTokenizer;

public class Array1_Quesiotn10 {
    public static void main(String[] args) throws IOException {
        /* 문제번호 1546번 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        double[] score = new double[N];

        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        /* 배열값 넣기 */
        for(int i = 0; i < N; i++){
            score[i] = Integer.parseInt(st.nextToken());
        }

        /* 최대값 구하기 */
        double max = score[0];
        for(double i : score){
            if(max < i){
                max = i;
            }
        }

        double result = 0;
        for(double i : score){
            result += (i/max)*100;
        }

        bw.write(result/N+"");
        bw.close();
    }
}
