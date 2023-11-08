package Chapter04.example;

public class PrefixSumExample {
    public static void main(String[] args){
        // 원본 배열 A 선언
        int[] A = {3, 10, 16, 21, 33};
        // 결과를 담을 변수 선언
        int result = 0;

        // 합배열 S 구하기
        int[] S = new int[A.length+1];
        S[0] = 0;

        for(int i = 0; i < A.length; i++){
            S[i+1] = S[i] + A[i];
        }

        // A배열의 첫번째 부터 세번째 까지 합 --> 47
        result = S[3] - S[1-1];  // S[j] - S[i-1]

        System.out.println(result);
    }
}
