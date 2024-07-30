package BOJ.CodingTest.sort.selectionSort;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Question01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        List<Integer> arr = new ArrayList<>();
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            arr.add(Integer.parseInt(st.nextToken()));
        }

        for(int i = 0; i < N - 1; i++){
            int minIdx = i;

            for(int j = i + 1; j < N; j++){
                if(arr.get(j) < arr.get(minIdx)){
                    minIdx = j;
                }
            }
            int temp = arr.get(minIdx);
            arr.set(minIdx, arr.get(i));
            arr.set(i, temp);
        }

        for (Integer i : arr) {
            sb.append(i).append(' ');
        }

        System.out.println(sb);
    }
}
