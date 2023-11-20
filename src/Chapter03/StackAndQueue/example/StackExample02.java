package Chapter03.StackAndQueue.example;

import java.util.Stack;

/* 스택 라이브러리 사용 */
public class StackExample02 {
    public static void main(String[] args){

        /* 스택 선언 */
        Stack<Integer> stack = new Stack<>();
        /* 스택 공간에 데이터 삽입 */
        for(int i = 1; i < 11; i++){
            stack.push(i);
        }

        /* 현재 스택 출력 */
        System.out.println("현재 스택 출력 : " + stack);
        System.out.println();

        /* stack pop 연산 수행 */
        int popData = stack.pop();
        /* pop된 데이터 출력 */
        System.out.println("pop된 데이터 출력 : "+popData);
        /* pop 후 스택 출력 */
        System.out.println("pop 후 스택 출력 : " + stack);

    }
}
