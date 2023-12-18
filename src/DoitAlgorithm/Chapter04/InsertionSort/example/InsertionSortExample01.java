package DoitAlgorithm.Chapter04.InsertionSort.example;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSortExample01 {
    public static void main (String[] args){
        /* 삽입정렬 연습 - 오름차순 정렬 */
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(4, 1, 3, 5, 2));

        /*삽입정렬 수행*/
        for(int i = 1; i < arr.size(); i++){
            int insertPoint = i;
            int insertValue = arr.get(i);
            for(int j = i-1; j >= 0; j--){
                if(arr.get(j) < arr.get(i)){
                    /* 대상 데이터 바로 이전 부터 첫번째 인덱스까지 loop를 돌면서 삽입 데이터(arr[i])가 이전 데이터(arr[j])보다 클 경우 */
                    /* 올바른 정렬 상태니까 j번째 바로 다음 인덱스(j+1번째)에 insertValue를 삽입해줘야함. */
                    /* 만약 삽입 데이터와 이전데이터가 같다면 아무 로직없이 loop 수행 후 본래 위치의 인덱스의 원래 데이터가 삽입됨.(즉, 변화 x) */
                    insertPoint = j + 1;
                    break;
                }
                /* 선택된 데이터의 앞 데이터가 더 크고, 그게 첫번째 인덱스(j)일 경우에는 삽입위치가 첫번째 인덱스 이므로
                   insertPoint를 0으로 초기화 (삽입정렬은 두번째 인덱스부터 시작하니까 첫번째 인덱스는 별도로 지정해줘야함.)*/
                if(j == 0){
                    insertPoint = 0;
                }
            }
            for(int j = i; j > insertPoint; j--){
                arr.set(j, arr.get(j-1));
            }
            arr.set(insertPoint, insertValue);
        }

        for(int i : arr){
            System.out.println(i);
        }

    }
}
