package Programmers.Lv2;

/* 프로그래머스 - 타겟넘버 */
public class Question02 {
    int count = 0;

    void DFS(int[] numbers, int depth, int target, int result){
        // DFS 종료조건
        if(numbers.length == depth){
            if(result == target){
                count++;
            }
            return;
        }

        // 이전 노드의 값에 현재 노드의 값을 +
        int plus = result + numbers[depth];
        // 이전 노드의 값에 현재 노드의 값을 -
        int minus = result - numbers[depth];

        DFS(numbers, depth+1, target, plus);
        DFS(numbers, depth+1, target, minus);
    }

    public int solution(int[] numbers, int target){
        int answer = 0;

        DFS(numbers, 0, target, 0);
        answer = count;

        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {4, 1, 2, 1};
        int target = 4;

        Question02 q2 = new Question02();
        int result = q2.solution(numbers, target);

        System.out.println(result);
    }
}
