package Chapter04.QuickSort.example;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class QuickSortExample01 {

    /* 배열 전역변수 선언 및 초기화 */
    static ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(6, -8, 1, 12, 8, 3, 7, -7));

    /* 값을 서로 바꿀 swap 함수 */
    private static void swap(int a, int b){
        int temp = 0;
        temp = arr.get(a);
        arr.set(a, arr.get(b));
        arr.set(b, temp);
    }

    /* 퀵정렬 수행 함수 */
    private static void quickSorter(int st, int en){
        /* 수열의 길이가 1이하면 알고리즘 종료 (base condition) */
        /* en 포인터가 작을때 : 애초에 en과 st가 역전된 상태, en과 st가 같을때 : 수열의 길이가 1인 상태  */
        if(en <= st+1) return;
        /* 피벗데이터 : 가장 왼쪽 데이터로 선정 */
        int pivot = arr.get(st);
        /* 피벗데이터를 제외한 가장 왼쪽 포인터 */
        int l = st + 1;
        /* 피벗데이터를 제외한 가장 오른쪽 포인터 */
        int r = en-1;
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
            swap(l, r);
        }//while loop end

        /* l 포인터가 r 포인터보다 더 크다면 피벗데이터와 r 데이터를 swap */
        swap(st, r);
        /* 쪼개진 배열에서 첫번째 부터 r번째까지 퀵정렬 수행 */
        quickSorter(st, r);
        /* 쪼개진 배열에서 r의 다음번째 부터 마지막까지 퀵정렬 수행 */
        quickSorter(r+1, en);
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        quickSorter(0, arr.size());

        for(int i : arr){
            bw.write(String.valueOf(i) + " ");
        }
        bw.close();
    }//main end
}// class end
