package Chapter04.BubbleSort.question;

import java.io.*;
import java.util.ArrayList;

/* 백준 - 2750번 문제 */
public class BubbleSortQuestion01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        /* 배열크기 N 입력 */
        int N = Integer.parseInt(br.readLine());
        /* 배열선언 */
        ArrayList<Integer> arr = new ArrayList<>();
        /* 배열에 데이터 삽입 */
        for(int i = 0; i < N; i++) arr.add(i, Integer.parseInt(br.readLine()));
        /* 임시값을 담을 변수 temp 선언 */
        int temp = 0;

        /* 버블정렬 수행 */
        for(int i = 0; i < arr.size()-1; i++){  /* 버블정렬에서 loop 수는 배열사이즈의 -1 만큼 수행한다. */
            for(int j = 0; j < arr.size()-1-i; j++){  /* 이미 정렬 완료된 데이터를 하나씩 loop에서 제외해야 하므로 i 만큼 뺀 횟수 loop */
                if(arr.get(j) > arr.get(j+1)){
                    temp = arr.get(j);
                    arr.set(j, arr.get(j+1));
                    arr.set(j+1, temp);
                }
            }
        }

        for(int i : arr){
            bw.write(String.valueOf(i) +"\n");
        }
        bw.close();
    }
}
