package Chapter01.example;

public class TimeComplexityExample1 {
    /* 시간복잡도 : 주어진 문제를 해결하기 위한 연산횟수 (1억번 연산 = 1초) */
    /* 문제에서는 시간제한으로 주어짐. */
    /* 시간복잡도는 알고리즘 선택의 기준이 된다. */

    public static void main(String[] args){

        /* 예제코드 */
        int findNumber = (int)(Math.random() * 100);

        for(int i = 0; i < 100; i++){
            if(i == findNumber){
                System.out.println(i);
                break;
            }
        }

        /* 빅 오메가 (최상) : 한번만에 찾는 경우 (1) -> 랜덤 숫자가 0이 나오는 경우 딱 for문을 딱 한번만 수행 */
        /* 빅 세타 (평균) : 50번 정도의 연산 (N/2) -> 랜덤 숫자가 50이 나오는 경우 딱 for문을 절반만 수행 */
        /* 빅오 (최악) : 100번 연산 (N) -> 랜덤 숫자가 99가 나오는 경우 그러면 0부터 99까지 for문을 다 수행함 */

        /* 코딩테스트땐 빅오 표기법으로 사용한다! (항상 최악의 상황을 염두에 두고 코딩) */
    }

}
