package Chapter04.QuickSort.example;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickSortExample01 {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(6, -8, 1, 12, 8, 3, 7, -7));
        /* 피벗포인터 */
        int pivotPointer = 0;
        /* 피벗데이터 */
        int pivot = arr.get(0);
        /* 피벗데이터를 제외한 가장 왼쪽 포인터 */
        int l = pivotPointer + 1;
        /* 피벗데이터를 제외한 가장 오른쪽 포인터 */
        int r = arr.size()-1;
        /* 임시변수 temp 선언 */
        int temp = 0;

        while(true){
            /* l 포인터가 r 포인터보다 왼쪽에 있고, 현재 l 데이터가 피벗 데이터보다 작으면 오른쪽으로 1칸 이동 */
            while((l <= r) && (arr.get(l) < pivot)) l++;
            /* r 포인터가 l 포인터보다 오른쪽에 있고, 현재 r 포인터가 피벗 데이터보다 크면 왼쪽으로 1칸 이동 */
            while((r >= l) && (arr.get(r) > pivot)) r--;

            /* l 포인터와 r 포인터가 역전되는 즉시 while loop 종료 */
            if(l > r) break;

            /* swap 연산 수행 (위의 두 while 문을 거치면서 swap 해야할 포인터들로 초기화 되어있음.) */
            temp = arr.get(l);
            arr.set(l, arr.get(r));
            arr.set(r, temp);
        }//while loop end

        /* l 포인터가 r 포인터보다 더 크다면 피벗데이터와 r 데이터를 swap */
        temp = arr.get(pivotPointer);
        arr.set(pivotPointer, arr.get(r));
        arr.set(r, temp);

        /* 배열 출력 */
        for(int i : arr){
            System.out.print(i+" ");
        }//for loop end
    }//main end
}// class end
