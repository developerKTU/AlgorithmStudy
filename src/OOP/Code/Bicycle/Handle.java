package OOP.Code.Bicycle;

public class Handle {
    private String type;

    public void setType(String type) {
        this.type = type;
    }

    public String getType(){
        return type;
    }

    public void handleInfo(){
        System.out.println(type + "의 헨들을 장착했습니다.");
    }
}
