package BOJ.DataStructure;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Question03 {
    public static void main(String[] args) throws IOException{
        /* 문제번호 2164 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 1; i < n+1; i++){
            queue.add(i);
        }

        while(queue.size() != 1){
            queue.poll();            // 가장 먼저 들어온 요소 빼옴
            queue.add(queue.poll()); // 그 다음 가장 먼저 들어온 요소를 큐의 최상단에 add
        }

        System.out.println(queue.peek()); // 큐의 가장 상위 값을 출력 (어처피 큐 사이즈는 1임)
    }
}
