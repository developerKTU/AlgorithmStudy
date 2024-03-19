package BOJ.Deep;

import java.io.*;

public class DeepQuestion03 {
    public static void main(String[] args) throws IOException {
        /* 문제번호 2444번 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int starCount = Integer.parseInt(br.readLine());

        int blankCount = starCount;

        /* 별출력 - 정방향 */
        for(int i = 1; i < starCount+1; i++){
            /* 공백찍기 */
            for(int j = blankCount-i; j > 0; j--){
                bw.write(" ");
            }

            /* 별찍기 */
            for(int k = 0; k < (2*i)-1; k++){
                bw.write("*");
            }
            bw.newLine();
        }

        /* 별출력 - 역방향 */
        blankCount = starCount;
        for(int i = starCount-1; i > 0; i--){
            /* 공백찍기*/
            for(int j = 0; j < blankCount-i; j++){
                bw.write(" ");

            }

            /* 별찍기 */
            for(int k = (2*i)-1; k > 0; k--){
                bw.write("*");
            }
            bw.newLine();
        }

        bw.close();
    }
}
