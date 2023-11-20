package Chapter03.ArrayAndList.question;

import java.io.*;
import java.util.Scanner;

/* 백준 - 11720번 문제 */
public class ArrayAndList01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String sNum = br.readLine();
        char[] cNum = sNum.toCharArray();
        int tot = 0;

        for (char c : cNum) {
            tot += c - '0';
        }

        bw.write(String.valueOf(tot));
        bw.close();
    }
}
