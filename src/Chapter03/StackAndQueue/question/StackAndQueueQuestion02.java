package Chapter03.StackAndQueue.question;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

/* 백준 - 2164번 문제 */
public class StackAndQueueQuestion02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        /* 정수 N 입력 */
        int N = Integer.parseInt(br.readLine());
        /* 큐 생성 */
        Queue<Integer> queue = new LinkedList<>();
        /* 큐에 데이터 삽입 */
        for(int i = 1; i < N+1; i++){
            queue.add(i);
        }

        /* poll된 데이터를 담을 변수 p 선언 */
        int p = 0;

        /* 로직수행 */
        while (true){
            queue.poll();
            p = queue.poll();
            queue.add(p);
            if(queue.size() == 1){
                break;
            }
        }

        bw.write(String.valueOf(queue.peek()));
        bw.close();
    }
}
