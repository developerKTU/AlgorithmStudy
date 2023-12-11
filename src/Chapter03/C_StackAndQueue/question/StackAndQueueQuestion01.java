package Chapter03.C_StackAndQueue.question;

import java.io.*;
import java.util.ArrayList;
import java.util.Stack;

/* 백준 - 1874번 문제 */
public class StackAndQueueQuestion01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        /* 정답배열 생성 */
        ArrayList<String> result = new ArrayList<>();
        /* 정답배열 출력 여부 */
        boolean answerFlag = true;

        /* 수열의 갯수 n 입력 */
        int n = Integer.parseInt(br.readLine());
        /* 수열을 저장할 배열 생성 */
        ArrayList<Integer> su = new ArrayList<>();
        /* 수열 배열에 데이터 입력 */
        for(int i = 0; i < n; i++){
            su.add(i, Integer.parseInt(br.readLine()));
        }

        /* 스택 생성 */
        Stack<Integer> stack = new Stack<>();
        /* 자연수 num 초기화 */
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
                /* 이 문제는 push될 때, 연속된 자연수가 오름차순으로 push됨.
                   그리고 수열과 자연수가 같아질때 해당 자연수를 push 직후 바로 pop하고, 다음 수열로 넘어간다.

                   다음 수열로 넘어간 후 자연수보다 그 수열이 작을때,
                   수열과 스택에서 pop된 숫자가 같다면, 숫자가 오름차순으로 push됐고, 후입선출도 성립됐다는 의미
                   그리고, 오름차순으로 자연수를 넣을 수 없으니 pop연산 후 다음 수열로 넘어간다.

                   이 경우는 이전 과정에서 peak값이 pop된 것이 아니라 peak가 아닌 데이터가 pop이 된다는 의미이므로
                   스택의 후입선출 개념에 위배됨. */
                if(su.get(i) != popData){
                    bw.write("NO");
                    bw.flush();
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
                bw.write(s+"\n");
            }
        }

        bw.close();

    }
}
