package Chapter03.StackAndQueue.question;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class StackAndQueueQuestion01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        /* 정답배열 생성 */
        ArrayList<String> result = new ArrayList<>();
        /* 정답배열 출력 여부 */
        boolean answerFlag = true;

        /* 수열의 갯수 n 입력 */
        int n = sc.nextInt();
        /* 수열을 저장할 배열 생성 */
        ArrayList<Integer> su = new ArrayList<>();
        /* 수열 배열에 데이터 입력 */
        for(int i = 0; i < n; i++){
            su.add(i, sc.nextInt());
        }

        sc.close();

        /* 스택 생성 */
        Stack<Integer> stack = new Stack<>();
        /* 자연수 n 초기화 */
        int num = 1;

        for(int i = 0; i < n; i++){
            /* 자연수가 수열보다 작거나 같을때 */
            if( num <= su.get(i) ){
                while(num <= su.get(i)){
                    stack.push(num++);
                    result.add("+");
                }
                stack.pop();
                result.add("-");
            }else{
                int popData = stack.pop();
                /* 스택의 가장 peak 값이 만드려는 수열값 보다 크면 NO출력 후 프로그램 종료. */
                if(su.get(i) < popData){
                    System.out.println("NO");
                    /* 정답배열을 출력하지 않는다. */
                    answerFlag = false;
                    break;
                }
                result.add("-");
            }
        }

        /* 정답배열 출력여부가 true일때 */
        if(answerFlag){
            for(String s : result){
                System.out.println(s);
            }
        }

    }
}
