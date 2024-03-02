package BOJ.Basic.E_String;

import java.io.*;

public class String_Question08 {
    public static void main(String[] args) throws IOException {
        /* 문제번호 5622번 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        char[] charArr = s.toCharArray();

        int result = 0;
        for(char c : charArr){
            switch(c) {
                case 'A':
                case 'B':
                case 'C':
                    result += 3;
                    break;
                case 'D':
                case 'E':
                case 'F':
                    result += 4;
                    break;
                case 'G':
                case 'H':
                case 'I':
                    result += 5;
                    break;
                case 'J':
                case 'K':
                case 'L':
                    result += 6;
                    break;
                case 'M':
                case 'N':
                case 'O':
                    result += 7;
                    break;
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    result += 8;
                    break;
                case 'T':
                case 'U':
                case 'V':
                    result += 9;
                    break;
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    result += 10;
                    break;
                default:
                    break;
            }
        }
        bw.write(result+"");
        bw.close();
    }
}
