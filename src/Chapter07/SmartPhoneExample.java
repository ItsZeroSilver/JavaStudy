package Chapter07;

public class SmartPhoneExample {
    public static void main(String[] args) {
        //추상 클래스는 new 연산자로 직접 생성할 수 없음
        //Phone phone = new Phone("홍길동");
        //phone.turnOn();
        //phone.turnOff();

        SmartPhone smartPhone = new SmartPhone("홍길동");
        smartPhone.turnOn();
        smartPhone.turnOff();
        smartPhone.internetSerach();
    }
}
//SmartPhone 객체 생성
        /*
        SmartPhone myPhone = new SmartPhone("갤럭시", "은색");

        System.out.println("myPhone.model = " + myPhone.model);
        System.out.println("myPhone.color = " + myPhone.color);
        System.out.println("myPhone.wifi = " + myPhone.wifi);

        myPhone.bell();
        myPhone.sendVoice("여보세요");
        myPhone.receiveVoice("안녕하세요!. 저는 홍길동인데요");
        myPhone.sendVoice("아~ 네, 반갑습니다.");
        myPhone.hangUp();

        myPhone.setWifi(true);
        myPhone.internet();
         */