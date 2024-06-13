package BOJ.CodingTest.Search.DFS_BFS;

import java.io.*;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

public class Question03 {

    // 상하좌우 탐색을 위한 dx, dy 선언
    // dx, dy 같은 인덱스로 매칭.
    // dx가 0이고 dy가 1이면 아래로 탐색
    // dx가 1이고 dy가 0이면 오른쪽으로 탐색
    // dx가 0이고 dy가 -1이면 위로 탐색
    // dx가 -1이고 dy가 0이면 왼쪽으로 탐색
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    // 방문배열 선언
    static boolean[][] visited;
    // 미로 선언
    static int[][] A;
    // BFS 함수에서도 미로 사이즈가 필요하기 때문에 static 변수로 선언
    static int N, M;

    static void BFS(int i, int j){  // 시작 x, y 좌표를 파라미터로 받아온다.
        // 시작 위치의 좌표를 담을 큐 선언
        Queue<int[]> queue = new LinkedList<>();
        // 시작점 삽입
        queue.offer(new int[]{i, j});
        // 시작점 방문기록
        visited[i][j] = true;

        while(!queue.isEmpty()){   // 더이상 BFS 탐색을 할 수 없을때까지
            // 현재 위치 꺼내옴 (시작점부터)
            int nowLocation[] = queue.poll();
            // 상하좌우 DFS 탐색
            for(int k = 0; k < 4; k++){
                // 현재 좌표에서 상하좌우로 이동한 x, y 좌표 초기화
                int x = nowLocation[0] + dx[k]; // nowLocation[0] : 현재 x값 + dx[k] : 0 1  0 -1
                int y = nowLocation[1] + dy[k]; // nowLocation[1] : 현재 y값 + dy[k] : 1 0 -1  0

                // x, y 좌표가 유효한지 확인
                // x, y 좌표가 0보다 크고 x와 y가 각각 N, M 보다 작으면 (2차원 배열을 벗어나지 않으면)
                if(x >= 0 && y >= 0 && x < N && y < M){
                    // 2차원 배열 중 0인 곳은 탐색하지 못하고 이미 방문한 곳이면 안됨
                    if(A[x][y] != 0 && !visited[x][y]){
                        // 이제 탐색 가능 -> 탐색가능한 위치는 depth로 기록한다.
                        // (depth는 1부터 시작해서 탐색가능한 좌표가 나올때마다 1씩 증가)
                        A[x][y] = A[nowLocation[0]][nowLocation[1]] + 1;    // 새로 탐색하는 곳은 직전 탐색 depth의 +1로 기록한다.
                        // 상하좌우(유효한)로 이동한 위치 좌표배열을 큐에 삽입
                        queue.offer(new int[]{x, y});
                        // 해당 좌표를 방문기록에 남김
                        visited[x][y] = true;
                    }
                }
            }
        }
    }
    public static void main(String[] args) throws IOException{
        /* 백준 2178번 문제 https://www.acmicpc.net/problem/2178 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());

        // 미로의 가로, 세로 길이를 입력받는다.
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        // 미로 크기 정의
        A = new int[N][M];
        // 방문배열 초기화
        visited = new boolean[N][M];

        // 미로 생성
        for(int i = 0; i < N; i++){
            String s = br.readLine();
            for(int j = 0; j < s.length(); j++){
                A[i][j] = Character.getNumericValue(s.charAt(j));
            }
        }

        // 탐색시작
        BFS(0, 0);

        // 인덱스가 0부터 시작하므로 도착점은 미로 크기 인덱스의 -1을 해줌
        System.out.println(A[N-1][M-1]);
    }
}
