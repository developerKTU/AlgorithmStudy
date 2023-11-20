package Chapter03.StackAndQueue.example;

import java.util.ArrayList;

/* 큐 직접 구현 */
public class QueueExample01 {

    /* 큐 배열에 데이터를 삽입하는 함수 */
    static void qAdd(ArrayList<Integer> arr, int n){
        arr.add(n);
    }

    /* front영역의 데이터 삭제하고 그 데이터를 가져오는 함수 */
    static int poll(ArrayList<Integer> arr){
        int result = 0;
        if(arr.isEmpty()){
            return -1;
        }else{
            result = arr.get(0);
            arr.remove(0);
        }
        return result;
    }

    /* front 영역의 데이터 확인하는 함수 */
    static int peek(ArrayList<Integer> arr){
        if(arr.isEmpty()){
            return -1;
        }else{
            return arr.get(0);
        }
    }

    /* rear 영역의 데이터 확인 */
    static int rear(ArrayList<Integer> arr){
        if(arr.isEmpty()){
            return -1;
        }else{
            return arr.get(arr.size()-1);
        }
    }

    public static void main(String[] args){
        /*배열선언*/
        ArrayList<Integer> queueArr = new ArrayList<>();
        int front = peek(queueArr);
        int rear = rear(queueArr);

        /* front 영역의 데이터 확인 */
        System.out.println("현재 빈 배열의 front영역의 데이터 : " + front);
        /* rear 영역의 데이터 확인 */
        System.out.println("현재 빈 배열의 rear영역의 데이터 : " + rear);
        System.out.println();



        /* 큐 배열에 데이터 add */
        qAdd(queueArr, 10);
        qAdd(queueArr, 17);
        qAdd(queueArr, 21);
        front = peek(queueArr);
        rear = rear(queueArr);

        /* add 후 front 영역의 데이터 확인 */
        System.out.println("add 후 현재 front영역의 데이터 : " + front);
        /* add 후 rear 영역의 데이터 확인 */
        System.out.println("add 후 현재 rear영역의 데이터 : " + rear);
        System.out.println();



        /* front 영역의 데이터 poll */
        int pollData = poll(queueArr);
        front = peek(queueArr);
        rear = rear(queueArr);

        /* poll 데이터 확인 */
        System.out.println("poll 데이터 : " + pollData);
        /* poll 후 front 영역의 데이터 확인 */
        System.out.println("poll 후 현재 front영역의 데이터 : " + front);
        /* poll 후 rear 영역의 데이터 확인 */
        System.out.println("poll 후 현재 rear영역의 데이터 : " + rear);
    }
}
