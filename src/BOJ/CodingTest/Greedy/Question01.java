package BOJ.CodingTest.Greedy;

import java.io.*;
import java.util.*;

public class Question01 {
    public static void main(String[] args) throws IOException{
        /* 문제번호 11047번 문제 - https://www.acmicpc.net/problem/11047 */ /* ★ */
        /* 그리디 알고리즘 : 현재상태에서 가장 BEST해를 가정하여 해를 찾는 방법 */
        /* 이 문제에서는 거스름돈의 최소 동전 갯수를 구해야 하므로 '최대한 큰 금액의 돈으로 거슬러줘야함' <- BEST! */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int result = 0;
        for(int i = N - 1; i >= 0; i--){
            /* 금액 배열을 순회하며 K원을 해당 금액으로 나눴을 때 그 몫이 1이상인 값을 찾는다 -> K원이 해당 금액보다 커야하므로 */
            if((K / arr[i]) >= 1){
                /* K원을 나눌 수 있는 가장 큰 금액순으로 나눈 몫을 누적합한다. */
                result += (K / arr[i]);
                /* 그 후 남은돈으로 다시 나눠야 하므로 K는 나머지 값으로 변수에 저장된다. */
                K = (K % arr[i]);
            }
        }

        // 결과 출력
        System.out.println(result);
    }
}
