package DoitAlgorithm.Chapter03.D_Deque;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class DequeExample01 {

    /* 배열 사이즈 선언 */
    static final int MAX = 11;

    /* 원소를 담을 큰 배열 선언 */
    static int[] arr = new int[2*MAX+1];

    /* 덱은 양쪽 끝에서 연산을 수행할 수 있으므로 head와 tail 변수 선언 */
    static int head = MAX, tail = MAX;

    public static void push_front(int x){
        arr[--head] = x;
    }

    public static void pop_front(){
        head++;
    }

    public static void push_back(int x){
        arr[tail++] = x;
    }

    public static void pop_back(){
        tail--;
    }

    public static int front(){
        return arr[head];
    }

    public static int back(){
        return arr[tail-1];
    }

    public static void show ()throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i : arr){
            bw.write(i + " ");
        }
        bw.newLine();
        bw.flush();
    }

    public static void main(String[] args) throws IOException {

        /* 덱은 양쪽 모두 삽입이 가능. 즉 여의봉처럼 양쪽으로 확장해야함.
         시작지점을 0으로 뒀을 경우, 왼쪽으로 확장할 수 없음.
         대신 시작지점을 배열의 중간으로 둬야함. 중간으로 두면 양쪽으로 확장 가능.
         그래서 배열의 크기를 2*MAX+1 로 잡는 것. */

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("현재 head 포인터 위치 : "+head+"\n");
        bw.flush();

        push_front(1);
        bw.write("push_front 함수 수행 후 head 위치 : "+String.valueOf(head)+"\n");
        bw.flush();
        show();
        bw.newLine();




        bw.write("현재 tail 포인터 위치 : "+tail+"\n");
        bw.flush();

        push_back(2);
        bw.write("push_back 함수 수행 후 tail 위치 : "+String.valueOf(tail)+"\n");
        bw.flush();
        show();
        bw.newLine();



        pop_front();
        bw.write("pop_front 함수 수행 후 head 위치 : "+String.valueOf(head)+"\n");
        bw.flush();
        show();
        bw.newLine();
    }
}
