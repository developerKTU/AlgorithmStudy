package Programmers.Lv2;

import java.util.*;

/* 프로그래머스 - 기능개발 */
public class Question01 {
    public static int[] solution(int[] progresses, int[] speeds){
        int[] answer = {};
        // 배포 작업들을 담을 배포큐 선언.
        Queue<Integer> deployQueue = new LinkedList<>();
        // 가변길이의 답안을 담기 위해 ArrayList 선언.
        List<Integer> arr = new ArrayList<>();

        // 각 작업의 100% 도달 일수를 구함
        for(int i = 0; i < progresses.length; i++){
            // 작업소요 시간
            int pgrsDay = 0;

            // 하루 작업 수행률이 100%와 딱 맞아떨어지는 경우는 몫을 그대로 초기화
            if((100 - progresses[i]) % speeds[i] == 0){
                pgrsDay = (100 - progresses[i]) / speeds[i];
                // 해당 작업의 총 소요일수를 큐에 담음
                deployQueue.offer(pgrsDay);
            }else{
                // 하루 작업 수행률이 100%와 맞아 떨이지지 않고 나머지가 생기는 경우 + 1일을 더해줌
                // 예를 들어 30% 완수되어 있고 하루에 30%씩 완수되는 경우는 2일째는 90%이므로 3일째 나머지 10%를 완수해야함.
                pgrsDay = (100 - progresses[i]) / speeds[i] + 1;
                // 해당 작업의 총 소요일수를 큐에 담음
                deployQueue.offer(pgrsDay);
            }
        }

        // 큐가 비어있지 않을때까지 loop
        while(!deployQueue.isEmpty()){
            // 배포 작업 갯수
            int pgrsCount = 0;
            // 배포 했으므로 배포큐에서 poll() 후 작업일수를 가져온다.
            int nowPrgsDay = deployQueue.poll();
            // 현재 작업은 무조거 배포해야하므로 +1한다.
            pgrsCount++;

            // 큐가 비어있지 않을때 가장 아래의 작업일수를 비교
            // 현재 작업소요일수가 다음 작업들의 총 소요일수보다 크면 같이 배포해야 하므로 작업갯수 + 1함.
            while(!deployQueue.isEmpty() && deployQueue.peek() <= nowPrgsDay){
                // 현재 작업과 같이 배포해야하므로 배포작업개수 +1
                pgrsCount++;
                // 배포했으므로 poll()
                deployQueue.poll();
            }

            arr.add(pgrsCount);
        }

        answer = arr.stream().mapToInt(Integer::new).toArray();

        return answer;
    }

    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};

        int result[] = solution(progresses, speeds);

        sb.append('[');
        for (int i = 0; i < result.length - 1; i++) {
            sb.append(result[i]).append(',');
        }
        sb.append(result[result.length - 1]).append(']');

        System.out.println(sb.toString());
    }

}
