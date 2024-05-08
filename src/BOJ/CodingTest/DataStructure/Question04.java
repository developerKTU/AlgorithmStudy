package BOJ.CodingTest.DataStructure;

import java.io.*;
import java.util.Queue;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Question04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int n = 0;
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String commend = st.nextToken();

            switch(commend){
                case "push":
                    n = Integer.parseInt(st.nextToken());
                    queue.add(n);
                    break;
                case "pop":
                    if(queue.isEmpty()){
                        System.out.println(-1);
                        break;
                    }else{
                        int popNum = queue.poll();
                        System.out.println(popNum);
                        break;
                    }
                case "size":
                    System.out.println(queue.size());
                    break;
                case "empty":
                    if(queue.isEmpty()){
                        System.out.println(1);
                        break;
                    }else{
                        System.out.println(0);
                        break;
                    }
                case "front":
                    if(queue.isEmpty()){
                        System.out.println(-1);
                        break;
                    }else{
                        System.out.println(queue.peek());
                        break;
                    }
                case "back":
                    if(queue.isEmpty()){
                        System.out.println(-1);
                        break;
                    }else{
                        System.out.println(n);
                        break;
                    }
            }
        }
    }
}
