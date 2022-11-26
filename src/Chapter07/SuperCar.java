package Chapter07;

public class SuperCar extends Car{
    @Override
    public void speedUp(){
        speed += 10;
    }
    //클래스를 선언할 때 final 키워드를 class 앞에 붙이면 최종적인 클래스이므로 더 이상 상속할 수 없는 클래스가 된다.
    //대표적인 예가 String 클래스이다.
    //메서드도 앞에 final이 붙으면 상속할 수 없다.
    //Stop()은 오버라이딩 할 수 없음.
}
