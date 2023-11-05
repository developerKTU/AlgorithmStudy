package Chapter01.example;

public class TimeComplexityExample2 {
    public static void main(String[] args){
        /* 알고리즘에는 다양한 시간복잡도를 가지고 있음 (N!, NlogN, 2^N 등등..) */
        /* 상수는 시간복잡도 계산에서 제외된다. */
        /* 가장 많이 중첩된 반복문의 수행 횟수가 시간 복잡도의 기준이 된다. */

        int N = 1000000;

        // 아래의 경우 시간복잡도는 O(3N)이다. 하지만 시간복잡도는 상수를 계산하지 않으므로 결국 시간복잡도는 O(N)이다.
        for(int i = 0; i < N; i++){
            System.out.println(i + " : 1번째");
        }

        for(int i = 0; i < N; i++){
            System.out.println(i + " : 2번째");
        }

        for(int i = 0; i < N; i++){
            System.out.println(i + " : 3번째");
        }

        // 아래의 경우 시간복잡도는 O(N*N) 즉, O(N^2)이다.
        int cnt = 0;

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                System.out.println("중첩 반복문 연산횟수 : " + cnt);
            }
        }

    }
}