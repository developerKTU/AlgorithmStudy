package OOP.Code.Bicycle;

public class FrameBody {
    private String type;

    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }

    public void frameBodyInfo(){
        System.out.println(type + " 소재의 프레임바디 입니다.");
    }
}
