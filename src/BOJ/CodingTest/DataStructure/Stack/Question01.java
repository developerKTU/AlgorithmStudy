package BOJ.CodingTest.DataStructure.Stack;

import java.io.*;
import java.util.Stack;

public class Question01 {
    public static void main(String[] args) throws IOException{
        /* 백준 9012번 문제 https://www.acmicpc.net/problem/9012 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            String inputString = br.readLine();
            Stack<Character> stack = new Stack<>();

            for(int j = 0; j < inputString.length(); j++){
                char c = inputString.charAt(j);

                if(c == '('){
                    stack.push(c);  // '(' 가 기준 문자이므로 들어왔을때 무조건 push
                }else{
                    if(stack.isEmpty()){ // ')'가 들어왔을때 스택이 비어있으면 괄호가 쌍을 이루고있는 상태이거나 첫문자
                        stack.push(c);   // 첫 문자가 ')'이면 VPS문자를 만족하지 못하므로 push 후 break
                        break; // 현재 소속된 for문에서 빠져나옴.
                    }else{
                        stack.pop(); // 스택이 비어있지 않다면 '(' 문자가 있는것임 -> ')' 문자가 들어왔을때 쌍을 이루므로 스택을 비움 (쌍을 이룬상태)
                    }
                }
            }

            if(stack.isEmpty()){ // 스택이 비어있으면 ()쌍을 다 이루었다는 의미
                bw.write("YES");
            }else {             // 스택에 값이 존재하면 쌍을 이룬상태에서 첫문자가 ')' 이므로 VPS문자 성립x
                bw.write("NO");
            }
            bw.newLine();
        }
        bw.close();
    }
}
