package OOP.Code.Bicycle;

public class Bicycle {
    private FrameBody frameBody;
    private Handle handle;
    private Gear gear;
    private Wheel wheel;

    public Bicycle(FrameBody frameBody, Handle handle, Gear gear, Wheel wheel){
        this.frameBody = frameBody;
        this.handle = handle;
        this.gear = gear;
        this.wheel = wheel;
    }

    @Override
    public String toString(){
        return "FrameBody : " + frameBody.getType() + ", Handle : " + handle.getType() + ", Gear : " + gear.getDan() + "단, Wheel : " + wheel.getSize()
                + "인치의 자전거가 완성되었습니다.";
    }

}
