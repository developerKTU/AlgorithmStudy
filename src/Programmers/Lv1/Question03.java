package Programmers.Lv1;

import java.util.*;

/* 프로그래머스 - K번째수  */
public class Question03 {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        // 가변길이의 배열을 answer 배열에 담기 위한 ArrayList 선언
        List<Integer> resultArr = new ArrayList<>();

        // commands 배열을 순회하며 필요한 변수 초기화
        for(int x = 0; x < commands.length; x++){
            // 데이터를 정렬하기 위한 arrayList 선언
            List<Integer> sortableArr = new ArrayList<>();

            // 시작 위치 : N 번째로 주어지지만 배열 인덱스는 0부터 시작하므로 - 1 해줌
            int i = commands[x][0] - 1;
            // 끝 위치 : N 번째로 주어지지만 배열 인덱스는 0부터 시작하므로 - 1 해줌
            int j = commands[x][1] - 1;
            // 출력하고자 하는 최종 위치 : N 번째로 주어지지만 배열 인덱스는 0부터 시작하므로 - 1 해줌
            int k = commands[x][2] - 1;

            // array 배열을 i에서 j만큼 자른 후 sortableArr에 담는다.
            for(int y = i; y <= j; y++){
                sortableArr.add(array[y]);
            }

            // sortableArr 오름차순 정렬
            Collections.sort(sortableArr);

            // 정렬된 배열의 k번째 수를 get하여 resultArr 리스트에 담음.
            resultArr.add(sortableArr.get(k));
        }

        // resultArr을 answer에 Migration
        answer = resultArr.stream().mapToInt(Integer::new).toArray();

        return answer;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int[] result = solution(array,commands);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
