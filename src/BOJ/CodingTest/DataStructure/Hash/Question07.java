package BOJ.CodingTest.DataStructure.Hash;

import java.io.*;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;

public class Question07 {
    public static void main(String[] args) throws IOException {
        /* 백준 14425번 문제 https://www.acmicpc.net/problem/14425 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        /* 배열말고 해시맵으로 풀어보기 */
        Map<String, Integer> map = new HashMap<String, Integer>();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for(int i = 0; i < N; i++){
            map.put(br.readLine(), 0);
        }

        int result = 0;
        for(int i = 0; i < M; i++){
            if(map.containsKey(br.readLine())){
                result++;
            }
        }

        System.out.println(result);
    }


}
