package BOJ.CodingTest.Search.DFS_BFS;

import java.io.*;
import java.util.*;

public class Question07 {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int[][] A;
    static boolean[][] visited;
    static int M;
    static int BFS(int i, int j){
        int cnt = 0;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i, j});
        visited[i][j] = true;

        // 파라미터로 들어오는 좌표부터 시작이므로 카운트를 1 증가 시켜준다. -> 변수 초기화를 애초에 1로 해줘도 되지만, 직관성을 위해 로직 분리
        cnt++;

        while(!queue.isEmpty()){
            int[] nowLocation = queue.poll();

            for(int k = 0; k < 4; k++){
                int x = nowLocation[0] + dx[k];
                int y = nowLocation[1] + dy[k];

                if(x >= 0 && y >= 0 && x < M && y < M){
                    if(A[x][y] != 0 && !visited[x][y]){
                        queue.offer(new int[]{x, y});
                        visited[x][y] = true;
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args) throws IOException{
        /* 문제번호 2667 - https://www.acmicpc.net/problem/2667 */ /* ★ */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        M = Integer.parseInt(br.readLine());
        A = new int[M][M];
        visited = new boolean[M][M];

        for(int i = 0; i < M; i++){
            String s = br.readLine();
            for(int j = 0; j < M; j++){
                A[i][j] = Character.getNumericValue(s.charAt(j));
            }
        }

        int result = 0;
        int cnt = 0;
        List<Integer> arr = new LinkedList<>();
        for(int i = 0; i < M; i++){
            for(int j = 0; j < M; j++){
                if(A[i][j] != 0 && !visited[i][j]){
                    result++;
                    cnt = BFS(i, j);
                    arr.add(cnt);
                }
            }
        }

        // 출력 조건에 맞추기 위해 오름차순 정렬
        Collections.sort(arr);

        StringBuilder sb2 = new StringBuilder();
        for(int i : arr){
            sb2.append(i).append('\n');
        }

        sb.append(result).append('\n').append(sb2);
        System.out.println(sb);
    }
}
