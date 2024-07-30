package BOJ.CodingTest.sort.selectionSort;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Question01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        // 배열 사이즈 입력
        int N = Integer.parseInt(br.readLine());
        // 배열 선언
        List<Integer> arr = new ArrayList<>();
        // 배열 요소 입력
        st = new StringTokenizer(br.readLine());

        // 배열 사이즈만큼 순회하며 요소 배열에 add
        for(int i = 0; i < N; i++){
            arr.add(Integer.parseInt(st.nextToken()));
        }

        // 배열의 모든 요소에 대해 반복 -> 배열 크기의 -1만큼 정렬을 반복함
        for(int i = 0; i < N - 1; i++){
            // 현재 인덱스를 최소값의 인덱스로 초기화
            int minIdx = i;

            // 현재 순회 인덱스보다 한 위치 다음부터 순회
            for(int j = i + 1; j < N; j++){
                // 현재 인덱스 (최소값의 인덱스)보다 그 다음 인덱스가 작으면
                if(arr.get(j) < arr.get(minIdx)){
                    // 다음 인덱스를 최소값 인덱스로 초기화
                    minIdx = j;
                }
            }

            // 현재 인덱스와 그 다음 인덱스끼리 swap
            int temp = arr.get(minIdx);
            arr.set(minIdx, arr.get(i));
            arr.set(i, temp);
        }

        // 출력 빌더에 담음
        for (Integer i : arr) {
            sb.append(i).append(' ');
        }

        //출력 빌드 출력
        System.out.println(sb);
    }
}
