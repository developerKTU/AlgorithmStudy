package Programmers.Lv0;

import java.util.*;

/* 프로그래머스 - 분수의 덧셈 */
public class Question01 {

    public int[] solution(int numer1, int denom1, int numer2, int denom2){
        int[] answer = {};

        int totalDenom = 0;

        if(denom1 > denom2){
            if(denom1 % denom2 == 0){
                totalDenom = denom1;
            }else{
                totalDenom = denom1 * denom2;
            }
        }else{
            if(denom2 % denom1 == 0){
                totalDenom = denom2;
            }else{
                totalDenom = denom1 * denom2;
            }
        }

        int totalNum = (numer1 * (totalDenom / denom1)) + (numer2 * (totalDenom / denom2));

        int max = 1;
        for(int i = 1; i <= totalNum && i <= totalDenom; i++){
            if(totalNum % i == 0 && totalDenom % i == 0){
                max = i;
            }
        }

        List<Integer> arr = new ArrayList<>();
        arr.add(totalNum / max);
        arr.add(totalDenom / max);

        answer = arr.stream().mapToInt(Integer::new).toArray();

        return answer;
    }

    public static void main(String[] args){
        int numer1 = 2;
        int denom1 = 4;
        int numer2 = 8;
        int denom2 = 6;

        Question01 q = new Question01();
        int[] result = q.solution(numer1, denom1, numer2, denom2);

        for (int i : result) {
            System.out.println(i);
        }
    }
}
