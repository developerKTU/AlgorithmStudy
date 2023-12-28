package BOJ.Basic.D_OneDemension_Array;

import java.io.*;
import java.util.StringTokenizer;

public class Array1_Quesiotn06 {
    public static void main(String[] args) throws IOException {
        /* 문제번호 10813번 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        for (int T = 0; T < N; T++) {
            arr[T] = T + 1;
        }

        int i, j, temp;
        for (int U = 0; U < M; U++) {
            st = new StringTokenizer(br.readLine());
            i = Integer.parseInt(st.nextToken());
            j = Integer.parseInt(st.nextToken());

            temp = arr[i - 1];
            arr[i - 1] = arr[j - 1];
            arr[j - 1] = temp;
        }

        for (int res : arr) {
            bw.write(res + " ");
        }
        bw.close();
    }
}
