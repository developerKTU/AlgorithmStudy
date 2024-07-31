package OOP.Code.Bicycle;

public class Gear {
    private int dan;

    public void setDan(int dan){
        this.dan = dan;
    }

    public int getDan(){
        return dan;
    }

    public void gearInfo(){
        System.out.println(dan + "단 기어를 장착했습니다.");
    }

}
