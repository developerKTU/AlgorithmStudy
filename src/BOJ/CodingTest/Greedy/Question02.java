package BOJ.CodingTest.Greedy;

import java.io.*;
import java.util.*;

public class Question02 {
    public static void main(String[] args) throws IOException {
        /* 문제번호 2839번 문제 https://www.acmicpc.net/problem/2839 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int[] VINYL = {3, 5};
        int N = Integer.parseInt(br.readLine());

        int result = 0;

        // 설탕봉지 조건이 유동적이므로 (3KG면 3KG 조건으로 종결되는 것이 아닌 3KG, 5KG 조건이 유동적임) for대신 while 사용
        while(N > 0){
            // N이 5의 배수이면 가장 용량이 큰 봉지로만 나누면 되니까 몫 누접합 후 break
            if(N % 5 == 0){
                result += N / 5;
                // 설탕 총량은 5KG 봉지로 나눴을 시 다 담아지므로 총량을 0KG로 초기화
                N = 0;
                break;
            }

            // N이 5의 배수가 아니면 일단 먼저 3KG짜리 봉지에 담는다.
            result++;
            // 그 후 총 설탕무게에서 3KG를 빼준다. 다음 loop에서 5의 배수라면 5KG 봉지로만 담으면 최소 봉지 갯수임.
            N -= 3;
        }

        // loop 종료 후 N이 0보다 작다면 3KG, 5KG 조합으로 봉지를 만들 수 없으므로 -1 출력
        if(N < 0){
            System.out.println(-1);
        }else{ // loop종료 후 N이 0이면 3KG, 5KG 봉지 조합으로 다 담아지므로 최소갯수 출력
            System.out.println(result);
        }
    }
}
