package BOJ.CodingTest.sort.bubbleSort;

import java.io.*;
import java.util.*;

public class Question01 {
    public static void main(String[] args) throws IOException{
        /* 직접 만든 버블소트 문제 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        // 대상 배열 선언
        List<Integer> arr = new ArrayList<>();

        // 대상 배열 초기화
        for(int i = 0; i < N; i++){
            arr.add(Integer.parseInt(st.nextToken()));
        }

        // 배열의 모든 요소에 대해 반복 -> 배열 크기의 -1만큼 정렬을 반복함
        // ex) 배열의 크기가 3일때 2번의 과정으로 정렬함.
        //     배열의 크기가 5일때 4번의 과정으로 정렬함.
        for(int i = 0; i < N - 1; i++){
            // 각 배열 과정에서 마지막 요소는 정렬됨. -> 첫번째 과정에선 정렬이 아예 안되어 있으므로 배열을 모두 순회함.
                                                // ㄴ (N - 1) == (N - 0 - 1)
            for(int j = 0; j < N - i - 1; j++){
                // 다음 요소가 전 요소보다 크면
                if(arr.get(j) > arr.get(j + 1)){
                    // 오름차순 정렬이므로 SWAP
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }

        for (Integer i : arr) {
            sb.append(i).append(' ');
        }

        System.out.println(sb);
    }
}
