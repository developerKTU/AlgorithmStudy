package OOP.Code.Bicycle;

import java.io.*;

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

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 자전거 선택 프로그램
        boolean loopFlag = true;
        String frameBodyType = null;
        int gearType = 0;
        String handleType = null;
        int wheelSize = 0;

        int choice = 0;

        while(loopFlag) {
            System.out.println("자전거 프레임바디를 선택하세요");
            System.out.println("1. Carbon Fiber\n2. Aluminium\n3. Titanium\n4. Steel");
            System.out.println();

            choice = Integer.parseInt(br.readLine());

            switch (choice) {
                case 1:
                    frameBodyType = "Carbon Fiber";
                    loopFlag = false;
                    break;
                case 2:
                    frameBodyType = "Aluminium";
                    loopFlag = false;
                    break;
                case 3:
                    frameBodyType = "Titanium";
                    loopFlag = false;
                    break;
                case 4:
                    frameBodyType = "Steel";
                    loopFlag = false;
                    break;
                default:
                    System.out.println("다시 시도해주세요.\n");
                    break;
            }
        }

        loopFlag = true;
        while(loopFlag) {
            System.out.println("자전거 기어를 선택하세요");
            System.out.println("1. 3단\n2. 4단\n3. 5단\n4. 6단");
            System.out.println();

            choice = Integer.parseInt(br.readLine());

            switch (choice) {
                case 1:
                    gearType = 3;
                    loopFlag = false;
                    break;
                case 2:
                    gearType = 4;
                    loopFlag = false;
                    break;
                case 3:
                    gearType = 5;
                    loopFlag = false;
                    break;
                case 4:
                    gearType = 6;
                    loopFlag = false;
                    break;
                default:
                    System.out.println("다시 시도해주세요.\n");
                    break;
            }
        }

        loopFlag = true;
        while(loopFlag) {
            System.out.println("자전거 핸들을 선택하세요");
            System.out.println("1. Carbon Fiber\n2. Plastic");
            System.out.println();

            choice = Integer.parseInt(br.readLine());

            switch (choice) {
                case 1:
                    handleType = "Carbon Fiber";
                    loopFlag = false;
                    break;
                case 2:
                    handleType = "Plastic";
                    loopFlag = false;
                    break;
                default:
                    System.out.println("다시 시도해주세요.\n");
                    break;
            }
        }

        loopFlag = true;
        while(loopFlag) {
            System.out.println("자전거 휠 사이즈를 입력하세요. 저희 회사는 세세한 자전거 휠 사이즈를 제작해드립니다.");

            wheelSize = Integer.parseInt(br.readLine());

            if(wheelSize < 10){
                System.out.println("10인치 미만은 선택하실 수 없습니다.");
            }else{
                loopFlag = false;
            }

        }

        // 자전거 생성
        FrameBody frameBody1 = new FrameBody();
        frameBody1.setType(frameBodyType);

        Handle handle1 = new Handle();
        handle1.setType(handleType);

        Gear gear1 = new Gear();
        gear1.setDan(gearType);

        Wheel wheel1 = new Wheel();
        wheel1.setSize(wheelSize);

        // 자전거 조립 & 생성
        Bicycle bicycle1 = new Bicycle(frameBody1, handle1, gear1, wheel1);
        System.out.println(bicycle1);
    }
}
