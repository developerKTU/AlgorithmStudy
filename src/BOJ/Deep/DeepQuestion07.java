package BOJ.Deep;

import java.io.*;

public class DeepQuestion07 {
    public static void main(String[] args) throws IOException {
        /* 문제번호 1316번 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String str;
        int prev = 0;

        for(int i = 0; i < n; i++){
            str = br.readLine();

            int[] alphabet = new int[26];

            for(int j = 0; j < str.length(); j++){
                int now = str.charAt(j);

                if(prev != now){
                    if(alphabet[now-97] == 0){
                        alphabet[now-97]++;
                        prev = now;
                    }else{
                        n--;
                        break;
                    }
                }
            }
        }

        bw.write(n+"");
        bw.close();
    }
}
