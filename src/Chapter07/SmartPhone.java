package Chapter07;

//상속은 부모가 자식에게 물려주는 행위
//상속은 부모가 자식을 선택해서 물려주지만, 프로그램에서는 자식이 부모를 선택한다.
//자바는 다중 상속을 허용하지 않는다.
public class SmartPhone extends Phone{
    public boolean wifi;

    public SmartPhone(String model, String color){
        //super(); 부모 객체의 생성자 생성
        this.model = model;
        this.color = color;
        System.out.println("SmartPhone() 생성자 실행");
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
        System.out.println("와이파이 상태를 변경했습니다.");
    }

    public void internet(){
        System.out.println("인터넷을 연결합니다.");
    }
}
