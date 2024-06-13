package BOJ.CodingTest.Search.DFS_BFS;

import java.io.*;
import java.util.*;

public class Question05 {
    // 미로 탐색을 위한 dx 배열 생성
    static int[] dx = {0, 1, 0, -1};
    // 미로 탐색을 위한 dy 배열 생성
    static int[] dy = {1, 0, -1, 0};
    // 배추밭 배열 A 선언
    static int[][] A;
    // 방문배열 선언
    static boolean[][] visited;
    // 배추밭 사이즈 변수 선언
    static int N, M;
    // 너비우선탐색 구현 함수
    static void BFS(int i, int j){
        // 이전 미로탐색의 BFS 구현과 거의 동일함.
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i, j});
        visited[i][j] = true;

        while(!queue.isEmpty()){
            int[] nowLocation = queue.poll();

            for(int k = 0; k < 4; k++){
                int x = nowLocation[0] + dx[k];
                int y = nowLocation[1] + dy[k];

                if(x >= 0 && y >= 0 && x < N && y < M){
                    if(A[x][y] != 0 && !visited[x][y]){
                        queue.offer(new int[]{x, y});
                        visited[x][y] = true;
                    }
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 테스트케이스 입력
        int T = Integer.parseInt(br.readLine());

        // 테스트 케이스만큼 loop
        for(int tc = 0; tc < T; tc++){
            // 배추흰지렁이 마릿수 출력 변수 초기화
            int result = 0;
            st = new StringTokenizer(br.readLine());

            // 배추밭 사이즈 입력 (행열 사이즈)
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            // 배추갯수 입력
            int K = Integer.parseInt(st.nextToken());

            // 일단 배추밭을 입력한 사이즈만큼 0으로 초기화
            A = new int[N][M];
            // 방문배열 false 초기화
            visited = new boolean[N][M];

            // 배추 갯수 만큼 loop
            for(int i = 0; i < K; i++){
                // 배추가 존재하는 행열 위치 입력
                st = new StringTokenizer(br.readLine());
                int S = Integer.parseInt(st.nextToken());
                int E = Integer.parseInt(st.nextToken());

                // 해당 배추밭 행열위치를 0에서 1로 변경
                A[S][E] = 1;
            }

            // 배추밭을 모두 돌면서 배추가 존재하면서 방문하지 않은 위치가 있다면 배추흰지렁이 마리수를 1 증가해주고, BFS 수행
            for(int i = 0; i < N; i++){
                for(int j = 0; j < M; j++){
                    if(A[i][j] == 1 && !visited[i][j]){
                        result++;
                        BFS(i, j);
                    }
                }
            }
            // 최소 배추흰지렁이 마릿수 출력
            System.out.println(result);
        }
    }
}
