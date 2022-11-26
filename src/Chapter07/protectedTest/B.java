package Chapter07.protectedTest;
//같은 패키지 내에서는 protected 접근 가능
//객체 생성, 필드 접근, 메소드 접근 가능
public class B {
    public void method(){
        A a = new A();
        a.field = "value";
        a.method();
    }
}
