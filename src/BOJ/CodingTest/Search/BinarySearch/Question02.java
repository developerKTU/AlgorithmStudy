package BOJ.CodingTest.Search.BinarySearch;

import java.io.*;
import java.util.*;

public class Question02 {

    // target값 이상이 처음으로 나타나는 위치(start)를 찾는 함수
    static int lowerBound(List<Integer> dataSet, int target){
        // 시작 위치
        int start = 0;
        // lowerBound에서는 특정값의 '경계'를 찾는 함수이므로, 일반적인 이분탐색과는 달리 -1을 하지 않는다.
        int end = dataSet.size();

        // start와 end가 같아지면 특정값 이상의 시작 위치를 찾았다는 의미이므로 while 종료
        while(start < end){
            // 중앙값의 인덱스 초기화
            int midIdx = (start + end) / 2;
            // 중앙값 초기화
            int midVal = dataSet.get(midIdx);

            // 타겟값이 중앙값보다 작거나 같으면 (타겟값 이상의 시작값을 찾아야 하므로)
            // 상한값을 중앙값으로 줄임.
            if(target <= midVal){
                end = midIdx;
            // 타겟값이 중앙값보다 크면 하한값을 중앙값 다음 위치로 초기화
            }else{
                start = midIdx + 1;
            }
        }
        // target 값이 처음 등장하는 인덱스값을 반환
        return start;
    }

    // target보다 큰 값이 처음으로 나타나는 위치(start)를 찾는 함수
    static int upperBound(List<Integer> dataSet, int target){
        // 시작 위치
        int start = 0;
        // upperBound에서는 특정값의 '경계'를 찾는 함수이므로, 일반적인 이분탐색과는 달리 -1을 하지 않는다.
        int end = dataSet.size();

        // start와 end가 같아지면 특정값 이상의 시작 위치를 찾았다는 의미이므로 while 종료
        while(start < end){
            // 중앙값의 인덱스 초기화
            int midIdx = (start + end) / 2;
            // 중앙값 초기화
            int midVal = dataSet.get(midIdx);

            // 타겟값이 중앙값보다 작으면 (타겟값을 초과한 시작값을 찾아야 하므로)
            // 상한값을 중앙값으로 줄임.
            if(target < midVal){
                end = midIdx;
            // 타겟값이 중앙값보다 크거나 같으면 하한값을 중앙값 다음 위치로 초기화
            }else{
                start = midIdx + 1;
            }
        }
        // target값 보다 바로 다음 위치의 시작 인덱스를 반환
        return start;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        List<Integer> dataSet = new ArrayList<>();

        for(int i = 0; i < N; i++){
            dataSet.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(dataSet);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        List<Integer> targetArr = new ArrayList<>();

        for(int i = 0; i < M; i++){
            targetArr.add(Integer.parseInt(st.nextToken()));
        }

        for(int i = 0; i < targetArr.size(); i++){
            int target = targetArr.get(i);

            sb.append(upperBound(dataSet, target) - lowerBound(dataSet, target)).append(' ');
        }
        System.out.println(sb);
    }
}
