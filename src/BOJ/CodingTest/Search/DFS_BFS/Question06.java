package BOJ.CodingTest.Search.DFS_BFS;

import java.io.*;
import java.util.*;

public class Question06 {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static char[][] A;
    static boolean[][] visited;
    static int N;

    /* 기존 미로형식의 BFS인 경우 1인 경우만 찾아가면 되므로 A[x][y] != 0 이런식으로 조건을 걸면 되는데,
     * 해당 문제에선 R, G, B 모두 체크해야 하므로, 해당 위치의 값을 파라미터로 받아서 로직 구현 */
    static void BFS(int i, int j, char c){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i, j});
        visited[i][j] = true;

        while(!queue.isEmpty()){
            int[] nowLocation = queue.poll();

            for(int k = 0; k < 4; k++){
                int x = nowLocation[0] + dx[k];
                int y = nowLocation[1] + dy[k];

                if(x >= 0 && y >= 0 && x < N && y < N){
                    // 기존 미로문제에선 1인 경로만 찾아가면 되지만,
                    // 해당 문제에선 R, G, B 모두 체크해야하므로 파라미터로 받아서 로직 구현
                    if(A[x][y] == c && !visited[x][y]){
                        queue.offer(new int[]{x, y});
                        visited[x][y] = true;
                    }
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        A = new char[N][N];

        for(int i = 0; i < N; i++){
            String s = br.readLine();
            for(int j = 0; j < N; j++){
                A[i][j] = s.charAt(j);
            }
        }

        visited = new boolean[N][N];
        // 정상인일 경우
        int result = 0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(A[i][j] == 'R' && !visited[i][j]){
                    result++;
                    BFS(i, j, A[i][j]);
                }else if(A[i][j] == 'G' && !visited[i][j]){
                    result++;
                    BFS(i, j, A[i][j]);
                }else if(A[i][j] == 'B' && !visited[i][j]){
                    result++;
                    BFS(i, j, A[i][j]);
                }
            }
        }
        sb.append(result).append(' ');

        // 적록색약인 경우
        visited = new boolean[N][N];
        // 적록색약인 경우는 R, G 구분이 안되므로, G를 R로 통합.
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(A[i][j] == 'G'){
                    A[i][j] = 'R';
                }
            }
        }

        result = 0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(A[i][j] == 'R' && !visited[i][j]){
                    result++;
                    BFS(i, j, A[i][j]);
                }else if(A[i][j] == 'B' && !visited[i][j]){
                    result++;
                    BFS(i, j, A[i][j]);
                }
            }
        }
        sb.append(result);
        System.out.println(sb);
    }
}
