package Chapter04.SelectionSort.question;

import java.io.*;
import java.util.ArrayList;

public class SelectionSortQuestion01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        /* 숫자 입력 */
        String num = br.readLine();
        /* 숫자를 담을 배열 생성 */
        ArrayList<Integer> arr = new ArrayList<>();

        /* 배열에 데이터 담기 */
        for(int i = 0; i < num.length(); i++){
            arr.add(i, Integer.parseInt(num.substring(i, i+1)));
        }

        /* 최댓값 담을 max 변수 선언 */
        int max = 0;
        /* 임시 데이터를 담을 temp 변수 선언 */
        int temp = 0;

        /* 선택정렬 로직 수행 */
        for(int i = 0; i < arr.size(); i++){
            /* max를 현재 loop의 첫번째 인덱스로 설정. */
            max = i;
            /* 두번째 인덱스(i+1) 부터 loop 돌면서 첫번째 값(max값)과 비교하면서 최댓값 구하기
               (max인덱스는 비교 시 큰 수가 나올때마다 그 인덱스로 갱신됨 -> 결국 max는 최댓값의 인덱스가 됨.)  */
            for(int j = i+1; j < arr.size(); j++){
                if(arr.get(max) < arr.get(j)){
                    max = j;
                }
            }
            /* 현재 loop의 첫번째 값(i)과 최대값(max)을 비교해서 max값이 더 크면
               현재 loop의 첫번재 값과 max값 swap  */
            if(arr.get(i) < arr.get(max)){
                temp = arr.get(i);
                arr.set(i, arr.get(max));
                arr.set(max, temp);
            }
        }

        /* 배열 출력 */
        for(int i : arr){
            bw.write(String.valueOf(i));
        }

        bw.close();
    }
}
