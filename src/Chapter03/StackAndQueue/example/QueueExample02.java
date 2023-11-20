package Chapter03.StackAndQueue.example;

import java.util.LinkedList;
import java.util.Queue;

/* 큐 라이브러리 사용 */
public class QueueExample02 {
    public static void main(String[] args){
        /* 큐 라이브러리 객체 생성 */
        Queue<Integer> queue = new LinkedList<>();
        /* 큐 공간에 데이터 삽입 */
        for(int i = 1; i < 11; i++){
            queue.offer(i);
        }
        /* 현재 큐 출력 */
        System.out.println("현재 큐 출력 : " + queue);
        System.out.println();

        /* 큐 poll 연산 수행 */
        int pollData = queue.poll();
        System.out.println("poll 데이터 출력 : " + pollData);
        /* peak 데이터 확인 */
        int peakData = queue.peek();
        System.out.println("peak 데이터 출력 : " + peakData);
        System.out.println("현재 큐 출력 : " + queue);
    }
}
