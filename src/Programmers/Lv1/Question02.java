package Programmers.Lv1;

import java.io.*;

public class Question02 {
    // 그리디 알고리즘 : 최소한의 개미병력으로 구성해야하므로 최대한 공격력이 제일 높은 장군개미로 구성!
    public static int solution(int hp){
        int answer = 0;

        // hp가 0보다 클때까지 loop
        while(hp > 0){
            // 일개미의 공격력은 1이므로 초기 조건으로 세팅
            if(hp < 3){
                answer++;
                hp -= 1;
            }

            // 최소한의 개미병력으로 세틸해야 하므로 공격력이 제일 높은 장군개미로 세팅!
            if(hp % 5 == 0){
                answer += (int)hp / 5;
                hp = 0;
                break;
            }

            // 그 다음 공격력이 높은 병정개미로 세팅!
            // 장군개미처럼 3의 배수로 세틸하지 않는 이유는 3의 배수이면서 5의 배수인 hp만 조건을 타므로 병정개미는 누적차로 계산
            answer++;
            hp -= 3;
        }

        return answer;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int hp = Integer.parseInt(br.readLine());

        int result = solution(hp);

        System.out.println(result);
    }
}
