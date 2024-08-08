package BOJ.CodingTest.DataStructure.Stack;

import java.io.*;
import java.util.Stack;

public class Question02 {
    public static void main(String[] args) throws IOException {
        /* 백준 10773번 문제 https://www.acmicpc.net/problem/10773 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int result = 0;

        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < T; i ++){
            int n = Integer.parseInt(br.readLine());

            if(n == 0){
                if(stack.isEmpty()){    // 스택이 비어있다면 pop할 요소가 없으므로 break
                    break;
                }else{
                    stack.pop();        // 스택이 비어있지 않다면, 0은 가장 최근 요소를 빼는 의미이므로 pop 수행
                }
            }else{
                stack.push(n);          // 0 이외의 숫자가 들어온다면 push
            }
        }
        for(int i : stack){
            result += i;
        }

        System.out.println(result);
    }
}
