package BOJ.CodingTest.Search;

import java.io.*;
import java.util.*;

public class Question05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 데이터셋 개수 초기화
        int N = Integer.parseInt(br.readLine());
        // 데이터셋을 담을 리스트 객체 생성
        List<Integer> dataSet = new ArrayList<Integer>();
        // 데이터 입력을 위한 StringTokenizer 객체 선언
        StringTokenizer st;

        // 데이터셋 생성
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            dataSet.add(Integer.parseInt(st.nextToken()));
        }
        // 데이터셋 오름차순 정렬
        Collections.sort(dataSet);

        // 찾아야할 데이터의 갯수 초기화
        int M = Integer.parseInt(br.readLine());
        // 찾아야할 데이터들의 리스트 객체 생성
        List<Integer> targetArr = new ArrayList<Integer>();


        // 찾아야할 데이터 생성
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++){
            targetArr.add(Integer.parseInt(st.nextToken()));
        }
        
        // 찾아야할 리스트 순회
        for(int i = 0; i < targetArr.size(); i++){
            // 찾아야할 데이터를 리스트에서 하나씩 꺼내어 초기화
            int target = targetArr.get(i);
            // 탐색할 시작 인덱스 초기화
            int start = 0;
            // 탐색할 끝 인덱스 초기화
            int end = dataSet.size() - 1;
            // 찾음 여부를 저장할 변수 초기화
            boolean completeFlag = false;
            
            // 시작 인덱스와 끝 인덱스가 만날때까지 loop
            while(start <= end){
                // 중앙값의 인덱스 초기화
                int midIndex = (start + end) / 2;
                // 중앙값 초기화
                int midValue = dataSet.get(midIndex);
                
                // 중앙값이 타깃보다 크면 타깃이 중앙값 기준 왼쪽에 있으므로
                if(midValue > target){
                    // 탐색할 끝 인덱스를 중앙값 인덱스의 바로 왼쪽까지만 설정
                    end = midIndex - 1;
                // 중앙값이 타깃보다 작으면 타깃이 중앙값 기준 오른쪽에 있으므로
                }else if(midValue < target){
                    // 탐색 시작 인덱스를 중앙값 인덱스의 바로 오른쪽부터 설정
                    start = midIndex + 1;
                }else{
                    // 중앙값과 타깃이 일치하면 타깃을 찾았다는 의미이므로 찾음 여부 true
                    completeFlag = true;
                    // while loop 종료
                    break;
                }
            }
            
            // 찾음여부에 따라 1, 0 출력
            if(completeFlag){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }

    }
}
