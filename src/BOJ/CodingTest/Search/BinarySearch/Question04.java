package BOJ.CodingTest.Search.BinarySearch;

import java.io.*;
import java.util.*;

public class Question04 {
    public static void main(String[] args) throws IOException{
        /* 문제번호 1654 - https://www.acmicpc.net/problem/1654 */
        /* 전통적인 이분탐색 */
        /* 특정값에 대한 배열의 특정 인덱스를 찾기 위함 -> start 인덱스와 end인덱스가 같아지면 찾았음을 의미 */
        /* 중간값을 찾을때는 (start + end) / 2 계산으로 중간인덱스를 정의하고 배열에서 중간 인덱스를 참조해 값을 찾음. */
        /* 범위를 좁히는 방식은 target값과 midVal을 비교하여 범위를 좁혀나감. */

        /* 이번 이분탐색 응용문제 */
        /* 인덱스를 찾는게 아니고 '길이'를 찾아야함. -> 이분 탐색의 범위는 인덱스가 아닌 랜선의 길이를 의미함. */
        /* '길이'를 찾아야 하므로, 중간 길이는 (최소길이 + 최대길이) / 2 계산을 해줘야함.  */
        /* target값은 만들고자하는 랜선의 갯수를 의미한다. 따라서 target 갯수(입력받은 N값)와 중간길이의 갯수를 비교하여 좁혀나간다. */
        /* 이번 문제에서는 upperBound 함수를 이용해야한다. upperBound는 중복되는 값보다 초과하는 값의 첫 인덱스를 반환한다.
           따라서 중복되는 길이보다 초과되는 첫번째 길이가 반환되는 것이다. 따라서 upperBound에서 -1을 해줘야 구하고자하는 최대길이가 반환된다.  */
        /* 예를들어, 길이가 198cm 일때는 필요한 갯수는 11개이고, 200cm 일때도 필요한 갯수는 11개이다. 하지만 길이가 201cm일때는 필요한 갯수는 10개이다
           따라서, upperBound 함수를 통해 201cm가 반환되고, 그 반환값에 -1을 해줘야 정답이 출력되는 것이다. */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 가지고 있는 랜선의 갯수
        int K = Integer.parseInt(st.nextToken());
        // 필요한 랜선의 갯수
        int N = Integer.parseInt(st.nextToken());
        // 쉬운 이해를 위해 N을 targetAmount로 사용
        int targetAmount = N;
        // 영식이 가지고 있는 랜선의 길이를 담을 리스트 선언
        List<Integer> dataSet = new ArrayList<>();

        long maxLength = 0;

        for(int i = 0; i < K; i++){
            dataSet.add(Integer.parseInt(br.readLine()));
            
            // 입력과 동시에 maxLength값을 찾음 (리스트 오름차순 정렬과 같은 효과)
            if(maxLength < dataSet.get(i)){
                maxLength = dataSet.get(i);
            }
        }

        // upperBound는 항상 특정 자연수보다 1큰 값이 나오므로 자연수 탐색은 0 ~ max + 1이 되어야한다.
        // (이는 이전 문제에서 dataSet.size()에 -1을 하지 않는 것과 같은 논리이다.)
        // 그렇지 않으면 mid가 0일때 0을 나누는 상황이 발생한다.
        maxLength++;
        long minLength = 0;

        while(minLength < maxLength){
            long midLength = (minLength + maxLength) / 2;
            // 영식이가 가지고 있는 랜선의 갯수를 담을 변수 선언 및 초기화
            long count = 0;

            // 영식이가 가지고 있는 랜선의 길이들을 중간 길이로 나누면서 총 갯수 구함.
            for(int i = 0; i < dataSet.size(); i++){
                count += (dataSet.get(i) / midLength);
            }

            // mid 길이로 잘랐을때의 갯수가 만들고자 하는 갯수보다 작으면 만들고자하는 갯수를 늘리기 위해 최대길이를 줄인다.
            if(targetAmount > count){
                maxLength = midLength;
            }else{
                // mid 길이로 잘랐을때의 갯수가 만들고자 하는 갯수보다 크거나 같으면 만들고자하는 갯수를 줄이기 위해 최소 길이를 늘린다.
                minLength = midLength + 1;
            }
        }

        // upperBound 로직은 찾고자하는 길이의 바로 다음값이 나오므로, -1을 해준다.
        System.out.println(minLength - 1);
    }
}
