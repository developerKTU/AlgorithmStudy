package DoitAlgorithm.Chapter03.A_ArrayAndList.question;

import java.io.*;
import java.util.StringTokenizer;

/* 백준 - 1546번 문제 */
public class ArrayAndList02 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        /* 과목 수 입력 */
        int N = Integer.parseInt(br.readLine());
        int[] scoreArr = new int[N];
        int M = 0;
        int tot = 0;

        /* 점수 입력 받기. */
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            scoreArr[i] = Integer.parseInt(st.nextToken());
            tot += scoreArr[i];
        }

        /* 최댓값 M 구하기 */
        for(int i : scoreArr){
            if(i > M){
                M = i;
            }
        }

        bw.write(String.valueOf((double)(tot * 100)/M/N));
        bw.close();

    }
}
