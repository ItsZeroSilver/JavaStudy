package Chapter07;

public class Computer extends Calculator{
    //메소드 오버라이딩
    //상속된 메소드를 자식 클래스에서 재정의하는 것.
    //메소드 오버리이딩이 되었다면, 해당 부모 메소드는 숨겨지고, 자식 메소드가 우선적으로 사용된다.
    //부모 메소드의 선언부(리턴 타입, 메소드 이름, 매개변수)와 동일해야 한다.
    //접근 제한을 더 강하게 오버라이딩 할 수 없다.(public -> private으로 변경 불가)
    //새로운 예외를 throws 할 수 없다.
    //메소드를 재정의하면, 부모 메소드는 숨겨지고 자식 메소드만 사용되기 때문에 비록 부모 메소드의 일부만 변경된다 하더라도 중복된 내용을 자식 메소드도 가지고 있어야 한다.
    //자식 메소드 내에서 부모 메서도를 호출 하는 것 super.method()사용하여 호출할 수 있다.
    @Override
    public double areaCircle(Double r) {
        System.out.println("Computer 객체의 areaCircle() 실행");
        return Math.PI * r * r;
    }
}
