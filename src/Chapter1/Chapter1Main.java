package Chapter1;

public class Chapter1Main {

    public static int sum(int x, int y){
        return x+y;
    }

    public static void main(String[] args){
        int a = 10;
        int b = 20;
        String s = "Hello";

        if ("Hello~".equals(s)){
            System.out.println("Hi");
        }else{
            System.out.println("Bye~");
        }


        if(s.equals("Hello")){

        }


        int result = sum(a, b);

        System.out.println(result);

    }
}
