package Chapter03.PrefixSum.example;

public class PrefixSumExample {
    public static void main(String[] args){
        // 원본 배열 A 선언
        int[] A = new int[]{3, 10, 16, 21, 33};
        // 결과를 담을 변수 선언
        int result = 0;

        // 합배열 S 구하기
        int[] S = new int[A.length];
        S[0] = A[0];

        for(int i = 1; i < A.length; i++){
            S[i] = S[i-1] + A[i];
        }

        // A[1]부터 A[3] 까지 합 --> 47
        result = S[3] - S[0];  // S[j] - S[i-1] --> S[3] - s[1-1]

        System.out.println(result);
    }
}
