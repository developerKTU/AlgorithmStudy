package Chapter03.question;

import java.util.Scanner;

public class ArrayAndList02 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] scoreArr = new int[N];
        int M = 0;
        int tot = 0;

        for(int i = 0; i < N; i++){
            scoreArr[i] = sc.nextInt();
            tot += scoreArr[i];
        }

        sc.close();

        for(int i : scoreArr){
            if(i > M){
                M = i;
            }
        }

        System.out.println( (double)(tot * 100)/M/N );

    }
}
