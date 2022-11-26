package Chapter07;

public abstract class Phone {
    //필드 선언
    String owner;

    //생성자 선언
    public Phone(String owner) {
        this.owner = owner;
    }

    //메소드 선언
    void turnOn(){
        System.out.println("폰 전원을 킵니다.");
    }

    void turnOff(){
        System.out.println("폰 전원을 끕니다.");
    }
}

/*
    //필드 선언
    public String model;
    public String color;

    public Phone() {
        System.out.println("Phone() 생성자 실행");
    }

    //메소드 선언
    public void bell(){
        System.out.println("벨이 울립니다.");
    }

    public void sendVoice(String message){
        System.out.println("자기: " + message);
    }

    public void receiveVoice(String message){
        System.out.println("상대방: " + message);
    }

    public void hangUp() {
        System.out.println("전화를 끓습니다.");
    }
 */