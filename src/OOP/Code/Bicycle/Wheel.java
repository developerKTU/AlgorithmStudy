package OOP.Code.Bicycle;

public class Wheel {
    private int size;

    public void setSize(int size){
        if(size >= 10){
            this.size = size;
        }else{
            System.out.println("10인치 미만의 바퀴는 장착할 수 없습니다.");
        }
    }

    public int getSize(){
        return size;
    }

    public void wheelInfo(){
        System.out.println(size + "사이즈의 휠을 장착했습니다.");
    }

}
