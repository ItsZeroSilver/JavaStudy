package Chapter07.protectedTest2;

import Chapter07.protectedTest.A;

//다른 패키지 내에서는 protected 접근 불가능
//객체 생성, 필드 접근, 메소드 접근 불가능
public class C {
    public void method(){
        //A a = new A();
        //a.field = "value";
        //a.method();
    }
}
