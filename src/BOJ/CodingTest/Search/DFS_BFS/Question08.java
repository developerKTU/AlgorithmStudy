package BOJ.CodingTest.Search.DFS_BFS;

import java.io.*;
import java.util.*;

public class Question08 {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int[][] A;
    static boolean[][] visited;
    static int N;

    static void BFS(int i, int j, int h){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i, j});
        visited[i][j] = true;

        while(!queue.isEmpty()){
            int[] nowLocation = queue.poll();

            for(int k = 0; k < 4; k++){
                int x = nowLocation[0] + dx[k];
                int y = nowLocation[1] + dy[k];

                if(x >= 0 && y >= 0 && x < N && y < N){
                    if(A[x][y] >= h && !visited[x][y]){
                        queue.offer(new int[]{x, y});
                        visited[x][y] = true;
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException{
        /* 문제번호 2468번 문제 https://www.acmicpc.net/problem/2468 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        A = new int[N][N];
        visited = new boolean[N][N];

        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                A[i][j] = Integer.parseInt(st.nextToken());

                if(A[i][j] < min){
                    min = A[i][j];
                }
                if(A[i][j] > max){
                    max = A[i][j];
                }
            }
        }

        int result = 0;
        // 주어진 높이의 최솟값부터 최댓값까지 모두 탐색해야함.
        for(int h = min; h < max+1; h++){
            // 최소 지형높이 케이스부터 하나하나씩 탐색해야 하므로 해당 지형높이 탐색이 끝나면 최댓값을 비교할 count와 visited배열 초기화
            int count = 0;
            visited = new boolean[N][N];

            for(int i = 0; i < N; i++){
                for(int j = 0; j < N; j++){
                    // 해당 높이보다 큰 지형들을 탐색한다.
                    if(A[i][j] >= h && !visited[i][j]){
                        count++;
                        BFS(i, j, h);
                    }
                }
            }

            // 안전지대의 최댓값을 구한다.
            result = Math.max(result, count);
        }

        System.out.println(result);
    }
}
