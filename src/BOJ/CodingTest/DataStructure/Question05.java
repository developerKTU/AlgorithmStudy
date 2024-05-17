package BOJ.CodingTest.DataStructure;

import java.io.*;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

public class Question05 {
    public static void main(String[] args) throws IOException {
        /* 백준 1158번 문제 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();     // 단순한 줄력이 아닌, 출력 형식을 만들어야할때 StringBuilder append 사용하면 됨.

        Queue<Integer> queue = new LinkedList<>();

        int N = Integer.parseInt(st.nextToken());
        for(int i = 1; i < N+1; i++){   // 큐에 정수 삽입
            queue.offer(i);
        }

        int K = Integer.parseInt(st.nextToken());
        sb.append("<");
        while(queue.size() != 1){   // 큐 사이즈가 1이될때까지 loop
            for(int j = 0; j < K-1; j++){
                queue.offer(queue.poll());  // K번째 요소를 가져와야하므로 K-1번째까지 poll
            }
            sb.append(queue.poll() + ", "); // K번째 요소를 출력 빌더에 추가
        }

        sb.append(queue.poll() + ">");  // 큐 사이즈가 1개 남았을때는 마지막 요소이므로 요소출력 후 닫힘 꺽쇠 concat

        bw.write(sb.toString());    // 정답 출력
        bw.close();                 // 출력 스트림 종료
    }
}
