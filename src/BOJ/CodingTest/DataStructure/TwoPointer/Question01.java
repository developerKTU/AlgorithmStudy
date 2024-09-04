package BOJ.CodingTest.DataStructure.TwoPointer;

import java.io.*;

public class Question01 {
    public int solution(int N){
        // 만약 N이 15일때 숫자 15 하나인 경우를 미리 고려하여 1로 초기화
        int count = 1;
        // 자연수 1로 시작하므로, 초기 sum값도 1로 초기화
        int sum = 1;
        // 시작 위치를 숫자 1부터 시작 (배열의 인덱스가 아님)
        int startIdx = 1;
        // 끝 위치를 숫자 1부터 시작 (배열의 인덱스가 아님)
        int endIdx = 1;

        // 끝 위치가 주어진 숫자가 아닐 동안만 loop
        while(endIdx != N){
            // sum값이 주어진 수보다 작으면
            if(sum < N){
                // endIdx를 1증가하여 탐색할 범위를 늘린다.
                endIdx++;
                sum = sum + endIdx;
            }else if(sum > N){ // sum값이 주어진 수보다 크면
                // sum값을 줄여야 하므로, sum값에서 시작위치 값을 뺀다.
                sum = sum - startIdx;
                // startIdx를 1증가하여 탐색할 범위를 줄인다.
                startIdx++;
            }else{  // sum 값과 주어진수가 같아지면
                // 정답 카운트를 1 늘린다.
                count++;
                // 다음 경우의 수를 찾기 위해 탐색 범위를 늘린다.
                endIdx++;
                // 다음 탐색을 위해 sum값을 누접합.
                sum = sum + endIdx;
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Question01 q1 = new Question01();
        int N = Integer.parseInt(br.readLine());

        int result = q1.solution(N);

        System.out.println(result);
    }
}
