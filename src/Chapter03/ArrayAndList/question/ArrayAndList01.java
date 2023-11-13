package Chapter03.ArrayAndList.question;

import java.util.Scanner;

public class ArrayAndList01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String sNum = sc.next();
        char[] cNum = sNum.toCharArray();
        int tot = 0;

        for (char c : cNum) {
            tot += c - '0';
        }

        System.out.println(tot);

    }
}
