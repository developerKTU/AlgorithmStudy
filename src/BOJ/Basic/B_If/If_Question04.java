package BOJ.Basic.B_If;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;

public class If_Question04 {
    public static void main(String[] args) throws IOException {
        /* 문제번호 14681번 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        if(x > 0 && y > 0) {
            bw.write("1");
        }else if(x < 0 && y > 0){
            bw.write("2");
        }else if(x < 0 && y < 0){
            bw.write("3");
        }else{
            bw.write("4");
        }

        bw.close();
    }
}
