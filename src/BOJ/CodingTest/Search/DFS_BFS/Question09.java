package BOJ.CodingTest.Search.DFS_BFS;

import java.io.*;
import java.util.*;

public class Question09 {
    // 기존 4way가 아닌 8way
    // 순서대로 하, 우, 상, 좌, 우측 대각선 위, 우측 대각선 아래, 좌측 대각선 위, 좌측 대각선 아래
    static int[] dx = {0, 1, 0, -1, 1, 1, -1, -1};
    // 기존 4way가 아닌 8way
    static int[] dy = {1, 0, -1 , 0, -1, 1, -1, 1};
    // 지도 배열
    static int[][] A;
    // 방문 배열
    static boolean[][] visited;
    static int w, h;
    // 기존 DFS 로직과 동일
    static void BFS(int i, int j){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i, j});
        visited[i][j] = true;

        while(!queue.isEmpty()){
            int[] nowLocation = queue.poll();

            for(int k = 0; k < 8; k++){
                int x = nowLocation[0] + dx[k];
                int y = nowLocation[1] + dy[k];

                if(x >= 0 && y >= 0 && x < h && y < w){
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

        // 우선 0 0 while loop 조건에 들기 위해 임의값 51 초기화
        w = 51;
        h = 51;

        // w, h 값이 0 0 이 아닐때까지 loop
        while(w != 0 && h != 0){
            st = new StringTokenizer(br.readLine());

            // 너비와 높이값을 입력받는다.
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            // 지도 배열 및 방문 배열 초기화
            A = new int[h][w];
            visited = new boolean[h][w];

            // 지도 생성
            for(int i = 0; i < h; i++){
                st = new StringTokenizer(br.readLine());
                for(int j = 0; j < w; j++){
                    A[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            // 섬의 갯수를 세는 count 변수 초기화
            int count = 0;

            // 지도를 순회하며 BFS 수행
            for(int i = 0; i < h; i++){
                for(int j = 0; j < w; j++){
                    if(A[i][j] != 0 && !visited[i][j]){
                        // 섬이면서 방문하지 않은 구역이 있다면 섬의 갯수 + 1
                        count++;
                        // BFS 수행
                        BFS(i, j);
                    }
                }
            }

            // 0 0이 아니라면 테스트 케이스 별로 섬의 갯수 출력
            if(w != 0 && h != 0){
                System.out.println(count);
            }
        }
    }
}
