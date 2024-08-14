package Programmers.Lv0;


/* 프로그래머스 - 숨어있는 숫자의 덧셈 (1) */
public class Question02 {
    public static int solution(String my_string){
        int answer = 0;

        // my_string 문자열을 순회하며 한 글자씩 꺼낸다.
        for(int i = 0; i < my_string.length(); i++){
            // Character를 하나씩 꺼내면서 0~9까지의 아스키코드에 속해있다면
            if((int)my_string.charAt(i) >= 48 && (int)my_string.charAt(i) <= 57){
                // 해당 Character를 int로 변환하고 누적합
                answer += Character.getNumericValue(my_string.charAt(i));
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String my_string = "1a2b3c4d123";

        int result = solution(my_string);

        System.out.println(result);
    }
}
