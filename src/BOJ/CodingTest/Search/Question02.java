package BOJ.CodingTest.Search;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Collections;

public class Question02 {
    // 그래프 데이터를 담을 인접리스트 선언
    static ArrayList<Integer>[] A;
    // 방문배열 선언
    static boolean[] visited;

    // DFS 함수 정의
    static void DFS(int node){
        // 현재 노드 출력
        System.out.print(node + " ");
        // 이미 방문한 노드라면 함수종료
        if(visited[node]){
            return;
        }
        // 방문한 노드가 아닐 경우 방문기록배열 true
        visited[node] = true;

        // 해당 노드와 연결된 노드들을 순회하며 방문하지 않은 노드가 있다면 DFS함수 재귀 호출
        for(int i : A[node]){
            if(!visited[i]){
                DFS(i);
            }
        }
    }

    // BFS 함수정의
    static void BFS(int node){
        // 노드를 담을 큐 선언
        Queue<Integer> queue = new LinkedList<>();
        // 시작노드 삽입
        queue.offer(node);
        // 시작노드 방문기록 true
        visited[node] = true;
        // 큐 사이즈가 0이 아닐때까지
        while(!queue.isEmpty()){
            // 큐에서 노드 꺼내기
            int nowNode = queue.poll();
            // 꺼낸 노드 출력
            System.out.print(nowNode + " ");

            // 해당 노드에 연결된 리스트들 순회
            for(int i : A[nowNode]){
                // 방문하지 않은 노드가 있다면
                if(!visited[i]){
                    // 큐에 해당 노드를 삽입
                    queue.offer(i);
                    // 방문배열에 기록
                    visited[i] = true;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        /* 백준 1260번 문제 https://www.acmicpc.net/problem/1260 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 정점의 갯수 N 선언
        int N = Integer.parseInt(st.nextToken());
        // 간선의 갯수 M 선언
        int M = Integer.parseInt(st.nextToken());
        // 시작노드 V 선언
        int V = Integer.parseInt(st.nextToken());

        // 인접리스트 초기화
        A = new ArrayList[N + 1];

        // 인접리스트 초기화
        for(int i = 1; i < N + 1; i++){
            A[i] = new ArrayList<Integer>();
        }

        // 각 노드에 연결된 ArrayList에 그래프 데이터 삽입
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            // 양방향 그래프 이므로 양쪽 다 삽입
            A[u].add(v);
            A[v].add(u);
        }

        // 작은 수부터 탐색하므로 그래프 데이터 오름차순 정렬
        for(int i = 1; i < N+1; i++){
            Collections.sort(A[i]);
        }

        // 방문배열 초기화
        visited = new boolean[N + 1];
        // DFS 실행
        DFS(V);
        System.out.println();

        // 방문배열 초기화
        visited = new boolean[N + 1];
        // BFS 실행
        BFS(V);
    }
}
