package BOJ.CodingTest.Search.DFS_BFS;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class Question04 {
    static ArrayList<Integer>[] A;
    static boolean[] visited;

    // 깊이우선으로 풀이 - 방문횟수를 알아야 하므로 재귀 대신 스택 사용
    static int DFS(int node){
        int returnVal = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(node);
        visited[node] = true;

        while(!stack.isEmpty()){
            int nowNode = stack.pop();

            for(int i : A[nowNode]){
                if(!visited[i]){
                    returnVal++;
                    stack.push(i);
                    visited[i] = true;
                }
            }

        }
        return returnVal;
    }

    // 너비우선으로 풀이
    static int BFS(int node){
        int returnVal = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(node);
        visited[node] = true;

        while(!queue.isEmpty()){
            int nowNode = queue.poll();
            visited[nowNode] = true;

            for(int i : A[nowNode]){
                if(!visited[i]){
                    returnVal++;
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
        return returnVal;
    }

    public static void main(String[] args) throws IOException {
        /* 백준 2606번 문제 https://www.acmicpc.net/problem/2606 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        A = new ArrayList[N+1];
        visited = new boolean[N+1];

        for(int i = 1; i < N+1; i++){
            A[i] = new ArrayList<Integer>();
        }

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());

            A[S].add(E);
            A[E].add(S);
        }

        // 너비우선탐색 풀이 답 출력
        int result1 = BFS(1);
        System.out.println(result1);

        // 깊이우선탐색 풀이 답 출력
        visited = new boolean[N+1];
        int result2 = DFS(1);
        System.out.println(result2);
    }
}
