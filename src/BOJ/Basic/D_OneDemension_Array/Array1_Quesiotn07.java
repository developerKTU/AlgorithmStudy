package BOJ.Basic.D_OneDemension_Array;

import java.io.*;

public class Array1_Quesiotn07 {
    /* 배열 활용시 인덱스에도 입력받아 활용할 수 있음을 숙지하자. */

    final static int CLASS_NUM = 30;
    final static int PASS_NUM = 28;

    public static void main(String[] args) throws IOException {
        /* 문제번호 5597번 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        /* 인덱스에 출석번호 30번 학생도 들어가야 하므로 배열을 31까지 선언. */
        Boolean[] total = new Boolean[CLASS_NUM + 1];

        for(int i = 1; i < CLASS_NUM + 1; i++){
            total[i] = false;
        }

        for(int i = 0; i < PASS_NUM; i++){
            total[Integer.parseInt(br.readLine())] = true;
        }

        for(int i = 1; i < total.length; i++){
            if(!total[i]){
                bw.write(i+"\n");
            }
        }

        bw.close();
    }
}
