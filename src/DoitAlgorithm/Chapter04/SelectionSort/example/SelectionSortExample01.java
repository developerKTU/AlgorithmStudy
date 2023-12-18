package DoitAlgorithm.Chapter04.SelectionSort.example;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSortExample01 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(5, 4, 3, 2, 1));
        int min = 0;
        int temp = 0;

        /* 선택정렬 로직 수행 */
        for(int i = 0; i < arr.size(); i++){
            min = i;
            for(int j = i+1; j < arr.size(); j++){
                if(arr.get(min) > arr.get(j)){
                    min = j;
                }//if end
            }//for loop end
            if(arr.get(i) > arr.get(min)){
                temp = arr.get(i);
                arr.set(i, arr.get(min));
                arr.set(min, temp);
            }//if end
        }//for loop end

        /* 배열 출력 */
        for(int i : arr){
            bw.write(String.valueOf(i)+" ");
        }
        bw.close();
    }
}
