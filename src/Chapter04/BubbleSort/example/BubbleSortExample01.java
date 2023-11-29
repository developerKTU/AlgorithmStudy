package Chapter04.BubbleSort.example;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSortExample01 {

    public static void show(ArrayList<Integer> arr) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("배열 출력 : ");
        for(int i : arr){
            bw.write(i + " ");
        }
        bw.newLine();
        bw.flush();
    }

    public static void main(String[] args) throws IOException {
        /* ========== 오름차순 정렬 ========== */
        /* 배열선언 */
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(5,4,3,2,1));
        /* 임시 데이터를 저장할 변수 선언 */
        int temp = 0;

        /* 버블정렬 로직 수행 */
        for(int i = 0; i < arr.size()-1; i++){
            for(int j = 0; j < arr.size()-1-i; j++){
                if(arr.get(j) > arr.get(j+1)){
                    temp = arr.get(j);
                    arr.set(j, arr.get(j+1));
                    arr.set(j+1, temp);
                }//if end
            }//for loop end
        }//for loop end

        /* 배열출력 */
        show(arr);


        /* ========== 내림차순 정렬 ========== */
        /* 배열 선언 */
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 5));
        temp = 0;

        /* 버블정렬 로직 수행 - 뒤에서부터 정렬 */
        for(int i=0; i<arr2.size()-1; i++){
            for(int j = arr2.size()-1; j>=i+1; j--){
                if(arr2.get(j-1) < arr2.get(j)){
                    temp = arr2.get(j);
                    arr2.set(j, arr2.get(j-1));
                    arr2.set(j-1, temp);
                }//if end
            }//for loop end
        }//for loop end

        /* 배열출력 */
        show(arr2);
    }
}
