package BOJ.Deep;

import java.io.*;

public class DeepQuestion05 {
    public static void main(String[] args) throws IOException {
        /* 문제번호 1157번 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] asciiArr = new int[122];

        String str = br.readLine();
        char[] cArr = str.toCharArray();
        
        char result = 0;

        /* ascii 코드에서 각 알파벳 갯수를 담을 배열 선언 */
        for(int i = 0; i < 122; i++){
            asciiArr[i] = 0;
        }

        /* 소문자 알파벳을 대문자 알파벳으로 변경 */
        for(int i = 0; i < cArr.length; i++){
            if(cArr[i] >= 97 && cArr[i] <= 122){
                cArr[i] = (char)((int)cArr[i] - 32);
            }

            /* 입력한 문자열에 해당되는 알파벳이 있다면 배열값에 1을 더해줌 */
            asciiArr[(int)cArr[i]] = asciiArr[(int)cArr[i]] + 1;
        }

        /* 가장 많이 나온 알파벳 갯수를 구함. */
        int max = asciiArr[0];
        for(int i = 0; i < asciiArr.length; i++){
            if(max < asciiArr[i]){
                max = asciiArr[i];
            }
        }

        /* 가장 많이 입력된 갯수에 해당하는 인덱스(아스키코드)를 구함 */
        int resultCnt = 0;
        for(int i = 0; i < asciiArr.length; i++){
            if(asciiArr[i] == max){
                resultCnt++;
                result = (char)i;
            }
        }

        /* 정답출력 */
        if(resultCnt == 1){
            bw.write(result+"");
        }else{
            bw.write("?");
        }
        
        bw.close();
    }
}
