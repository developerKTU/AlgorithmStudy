package BOJ.CodingTest.DataStructure.Stack;

import java.util.*;

/* 프로그래머스 - 같은 숫자는 싫어! */
public class Question03 {

    public int[] solution(int[] arr){
        int[] answer = {};
        Stack<Integer> stack = new Stack<>();
        List<Integer> answerList = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            int num = arr[i];

            if(stack.isEmpty()){
                stack.push(num);
            }else{
                int peek = stack.peek();

                if(num != peek){
                    stack.push(num);
                }
            }
        }

        for(int i : stack){
            answerList.add(i);
        }

        answer = answerList.stream().mapToInt(Integer::new).toArray();

        return answer;
    }

    public static void main(String[] args){
        int[] arr = {4, 4, 4, 3, 3};

        Question03 q = new Question03();

        int[] answer = q.solution(arr);

        for (int i : answer) {
            System.out.println(i);
        }

    }

}
