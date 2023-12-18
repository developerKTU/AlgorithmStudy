package DoitAlgorithm.Chapter03.C_StackAndQueue.example;

import java.util.ArrayList;

/* 스택 직접 구현 */
public class StackExample01 {

    /* top 위치 조회하는 함수 */
    /*TODO : 인덱스를 의미하는지 알아보기*/
    static int top(ArrayList<Integer> arr){
        if(arr.isEmpty()){
            return -1;
        }else {
            return arr.size() - 1;
        }
    }

    /* top 위치에 있는 데이터를 조회하는 함수 */
    static int peek(ArrayList<Integer> arr){
        if(arr.isEmpty()){
            return -1;
        }else {
            return arr.get(arr.size() - 1);
        }
    }

    /* 리스트 top 위치에 새로운 데이터 삽입 */
    static void push(ArrayList<Integer> arr, int n){
        arr.add(n);
    }

    /* top 위치에 있는 데이터를 삭제하고 그 데이터를 가져오는 함수 */
    static int pop(ArrayList<Integer> arr){
        int result = 0;
        if(arr.isEmpty()){
            return -1;
        }else{
            result = arr.get(arr.size()-1);
            arr.remove(arr.size()-1);
        }

        return result;
    }

    public static void main(String[] args){
        /* 배열선언 */
//        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> stackArr = new ArrayList<Integer>();

        /* 배열요소 삽입 */
        push(stackArr, 7);

        /* 현재 top의 위치 확인 */
        int top = top(stackArr);
        /* 현재 top 위치의 데이터 확인 */
        int topData = peek(stackArr);
        System.out.println("현재 top 위치(index) : " + top);
        System.out.println("현재 top 위치의 데이터 : " + topData);
        System.out.println();


        /* 리스트에 새로운 데이터 삽입 */
        push(stackArr, 10);
        /* push 후 현재 top의 위치 확인 */
        top = top(stackArr);
        /* push 후 현재 top 위치의 데이터 확인 */
        topData = peek(stackArr);
        System.out.println("현재 top 위치(index) : " + top);
        System.out.println("현재 top 위치(index) : " + topData);
        System.out.println();


        int pop = pop(stackArr);
        top = top(stackArr);
        topData = peek(stackArr);
        System.out.println("pop된 데이터 : " + pop);
        System.out.println("현재 top 위치(index) : " + top);
        System.out.println("현재 top 위치의 데이터 : " + topData);
    }
}
