package Chapter04.InsertionSort.question;

import java.io.*;
import java.util.StringTokenizer;

/* 백준 - 11399번 문제 */
public class InsertionSortQuestion01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        /*사람 수 N 입력*/
        int N = Integer.parseInt(br.readLine());
        /*대기시간 입력*/
        StringTokenizer st = new StringTokenizer(br.readLine());
        /*각각의 시간을 담을 배열선언*/
        int[] arr = new int[N];
        /*배열 데이터 삽입*/
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        /*삽입정렬로 오름차순 정렬 수행*/
        for(int i = 1; i < N; i++){
            /* 삽입 대상 인덱스 -> 삽입 정렬은 첫 삽입대상을 두번째 인덱스로 잡는다. */
            int insertPoint = i;
            /* 삽입 대상 값 (두번째 인덱스의 값) */
            int insertValue = arr[i];
            /* j : 삽입을 진행할 이전까지의 인덱스 */
            for(int j = i-1; j >= 0; j--){
                /*
                  삽입할 값이 삽입할 이전의 값보다 크면 (오름차순 기준 정렬된 상태)
                  해당 이전 인덱스의 다음 자리(삽입 위치) 인덱스로 갱신 후 break
                 */
                /*삽입할 값과 삽입할 이전의 값이 같으면 아무 동작없이 다음 loop로 넘어감.(같은 데이터는 정렬할 필요 없으므로.)*/
                if(arr[i] > arr[j]){
                    insertPoint = j + 1;
                    break;
                }
                /* 삽입할 값이 삽입할 이전의 값보다 작고, 첫번째 값을 삽입할 경우 인덱스를 0으로 초기화.
                   (첫 loop부터 insertPoint는 두번째 인덱스로 초기화 되기때문) */
                if(j == 0){
                    insertPoint = 0;
                }
            }
            /* 삽입을 위해 데이터를 한칸씩 뒤로 밀기 */
            for(int j = i; j > insertPoint; j--){
                arr[j] = arr[j-1];
            }
            /* 삽입 위치에 삽입대상 값 갱신(정렬된 데이터라면 그냥 본인의 원래 데이터 삽입)*/
            arr[insertPoint] = insertValue;
        }

        /*합배열 s 만들기*/
        int[] s = new int[arr.length];
        s[0] = arr[0];
        for(int i = 1; i < s.length; i++){
            s[i] = s[i-1] + arr[i];
        }

        /*합배열 총합 출력*/
        int total = 0;
        for(int i : s){
            total += i;
        }
        bw.write(String.valueOf(total)+"\n");
        bw.close();
    }

}

