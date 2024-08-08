package Programmers.Lv1;

import java.util.*;

/* 프로그래머스 - 같은 숫자는 싫어! */
public class Question01 {

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

        // ArrayList에서 array로 변환! -> 플머에선 리턴타입이 array인 경우가 많으므로 외우기!
        answer = answerList.stream().mapToInt(Integer::new).toArray();

        return answer;
    }

    public static void main(String[] args){
        int[] arr = {4, 4, 4, 3, 3};

        Question01 q = new Question01();

        int[] answer = q.solution(arr);

        for (int i : answer) {
            System.out.println(i);
        }

    }

}
