package BOJ.CodingTest.Search.BinarySearch;

import java.io.*;
import java.util.*;

public class Question03 {
    public static void main(String[] args) throws IOException {
        /* 문제번호 10815번 문제 - https://www.acmicpc.net/problem/10815 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

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
            int start = 0;
            int end = dataSet.size() -1;
            boolean findFlag = false;

            while(start <= end){
                int midIdx = (start + end) / 2;
                int midVal = dataSet.get(midIdx);

                if(target > midVal){
                    start = midIdx + 1;
                }else if(target < midVal){
                    end = midIdx -1;
                }else{
                    findFlag = true;
                    break;
                }
            }
            if(findFlag){
                System.out.print(1 + " ");
            }else{
                System.out.print(0 + " ");
            }
        }
    }
}
