package Chapter03.C_StackAndQueue.example;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

/* 큐 라이브러리 사용 */
public class QueueExample02 {
    public static void main(String[] args) throws IOException {
        /* 출력 객체 생성 */
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        /* 큐 라이브러리 객체 생성 */
        Queue<Integer> queue = new LinkedList<>();
        /* 큐 공간에 데이터 삽입 */
        for(int i = 1; i < 11; i++){
            queue.offer(i);
        }
        /* 현재 큐 출력 */
        bw.write("현재 큐 출력 : " + queue.toString() + "\n");
        bw.newLine();

        /* 큐 poll 연산 수행 */
        bw.write("poll 데이터 출력 : " + String.valueOf(queue.poll())+"\n");
        /* peak 데이터 확인 */
        bw.write("peak 데이터 출력 : " + String.valueOf(queue.peek())+"\n");
        bw.write("현재 큐 출력 : " + queue.toString());
        bw.close();
    }
}
