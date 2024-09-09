package BOJ.CodingTest.sort.QuickSort;

import java.util.*;

public class Question01 {
    public void quickSort(int[] arr, int start, int end){
        // start가 end보다 크거나 같을 경우 정렬할 원소가 없거나 한개이므로 return
        if(start >= end){
            return;
        }

        // 배열 정렬 후 start와 end가 만나는 지점을 피벗의 위치로 반환
        int pivot = partition(arr, start, end);

        // 분할된 두 집합에 대해 다시 퀵정렬 수행
        quickSort(arr, start, pivot - 1);   // 다시 배열의 시작위치 부터 피벗 위치의 직전까지 퀵정렬 수행
        quickSort(arr, pivot + 1, end);     // 다시 피벗의 직후 위치부터 배열의 마지막까지 퀵정렬 수행
    }

    public static int partition(int[] arr, int start, int end){
        // 피벗은 배열의 가장 마지막 값으로 설정
        int pivot = start;
        // 시작값은 배열의 첫번째 위치로 설정
        int s = start;
        // 마지막 값은 배열의 마지막 요소로 설정
        int e = end;

        // 시작값과 마지막값이 엇갈릴때까지 loop
        while(s < e){
            // 마지막값이 피벗보다 크면 마지막값을 왼쪽으로 이동
            while(arr[e] > arr[pivot] && s < e){
                e--;
            }

            // 시작값이 피벗보다 작으면 시작값을 오른쪽으로 이동
            while(arr[s] <= arr[pivot] && s < e){
                s++;
            }

            // 두 while 문을 빠져나왔단 의미는 시작값이 피벗보다 큰 수를 만난 경우이고 마지막값이 피벗보다 작은 값을 만났다는 의미임.
            // 즉, 시작값과 마지막값이 swap 되는 경우임
            swap(arr, s, e);
        }

        // 제일 밖 while을 빠져나왔던 의미는 start와 end 위치가 만났다는 의미이므로 start와 end 둘 중 한 요소와 swap
        swap(arr, pivot, e);

        return e;
    }

    public static void swap(int[] arr, int t1, int t2){
        int temp = arr[t1];
        arr[t1] = arr[t2];
        arr[t2] = temp;
    }

    public static void main(String[] args){
        int[] arr = {-7, 1, -10, 4, 2, 7, 10};

        Question01 q1 = new Question01();

        q1.quickSort(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
