package BOJ.CodingTest.sort.selectionSort;

import java.io.*;
import java.util.*;

public class Question02 {
    public static void main(String[] args) throws IOException{
        /* 백준 문제번호 1427번 문제 - https://www.acmicpc.net/problem/1427 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        List<Integer> arr = new ArrayList<>();

        for(int i = 0; i < s.length(); i++){
            arr.add(Character.getNumericValue(s.charAt(i)));
        }

        for(int i = 0; i < arr.size() - 1; i++){
            int maxIdx = i;

            for(int j = i + 1; j < arr.size(); j++){
                if(arr.get(j) > arr.get(maxIdx)){
                    maxIdx = j;
                }
            }

            int temp = arr.get(i);
            arr.set(i, arr.get(maxIdx));
            arr.set(maxIdx, temp);
        }

        for (Integer i : arr) {
            System.out.print(i);
        }
    }
}
