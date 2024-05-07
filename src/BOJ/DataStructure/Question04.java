package BOJ.DataStructure;

import java.io.*;
import java.util.Queue;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Question04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();

        int n = 0;
        for(int i = 0; i < T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            String commend = st.nextToken();

            if("push".equals(commend)){
                n = Integer.parseInt(st.nextToken());
                queue.add(n);
            }else if("pop".equals(commend)){
                if(queue.isEmpty()){
                    System.out.println(-1);
                }else{
                    int popNum = queue.poll();
                    System.out.println(popNum);
                }
            }else if("size".equals(commend)){
                System.out.println(queue.size());
            }else if("empty".equals(commend)){
                if(queue.isEmpty()){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }else if("front".equals(commend)){
                if(queue.isEmpty()){
                    System.out.println(-1);
                }else{
                    System.out.println(queue.peek());
                }
            }else if("back".equals(commend)){
                if(queue.isEmpty()){
                    System.out.println(-1);
                }else{
                    System.out.println(n);
                }
            }

        }

    }
}
