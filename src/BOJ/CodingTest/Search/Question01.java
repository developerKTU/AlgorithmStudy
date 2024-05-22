package BOJ.CodingTest.Search;

import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Question01 {
    static ArrayList<Integer>[] A;     // ArrayList<Integer>형 배열 A 선언
    static boolean[] visited;          // 방문배열 선언
    static void DFS(int x){
        if(visited[x]){                // vistied[x]가 true이므로 이미 방문했다는 의미니까 return
            return;
        }
        visited[x] = true;             // 방문하지 않은 노드를 방문처리하기 위해 true로 값 변경

        for(int i : A[x]){             // 해당 노드의 인접리스트를 돌면서 방문하지 않은 노드가 있다면 DFS 재귀호출
            if(!visited[i]){
                DFS(i);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        /* 백준 11724번 문제 https://www.acmicpc.net/problem/11724 */
        /* 연결요소 : 한 번의 DFS가 끝날때까지 탐색한 모든 노드의 집합 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 배열 및 리스트는 0번째 인덱스에서 시작함. 햇갈리니까 1번째 인덱스에서 시작
        A = new ArrayList[N+1];         // 배열 사이즈가 N+1개인 ArrayList형 배열 A (제네릭은 여기서 선언하지 않음)
        visited = new boolean[N+1];     // 정답배열도 인접리스트 사이즈 (노드갯수)만큼 초기화

        for(int i = 1; i < N+1; i++){
            A[i] = new ArrayList<Integer>();    // A배열 각 요소에 그래프 데이터를 담을 ArrayList<Integer> 객체 생성
        }

        for(int i = 0; i < M; i++){     // 간선의 양끝 노드 u, v이므로 간선의 갯수만큼 for-loop
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            // 양방향(무방향) 그래프 이므로 양쪽 다 추가
            // 예를 들어 1, 2를 입력했을때 1 노드의 인접리스트에 2 노드를 넣고 2 노드의 인접리스트에 1 노드를 넣음.
            A[u].add(v);
            A[v].add(u);
        }

        int result = 0;     // 정답 출력 변수 선언

        for(int i = 1; i < N+1; i++){
            if(!visited[i]){    // false일때 즉, 방문하지 않은 노드가 있을때
                result++;       // 연결요소 1증가
                DFS(i);         // 해당 노드부터 DFS 시작
                // DFS 함수를 수행하면서 인접한 노드집합들은 다 방문배열에 기록됨
                // DFS 함수를 빠져나왔다는 의미는 한 번의 DFS가 다 끝났다는 의미이므로 다음 loop때 연결요소 1증가 되거나 loop 종료.
            }
        }

        System.out.println(result);
    }
}
