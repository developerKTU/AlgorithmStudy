package Chapter1;

public class Calc {

    public int sum(int x, int y){
        return x+y;
    }

    public int minus(int x, int y){
        if(x-y >= 0){
            return x-y;
        }else{
            return (x-y) * (-1);
        }
    }

    public int multiply(int x, int y){
        return x*y;
    }

    public double divide(int x, int y){
        if(y != 0){
            return (double)x/y;
        }else {
            return 0;
        }
    }
}
