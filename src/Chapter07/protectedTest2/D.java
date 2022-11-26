package Chapter07.protectedTest2;

import Chapter07.protectedTest.A;

//자식 클래스의 경우
//객체 생성은 불가능 super로 A 생정자를 호출할 수 있다.
public class D extends A {
    public D(){
        super();//A 생성자 호출
    }

    public void method1(){
        //A a = new A();
        this.field = "value";//상속을 통해서만 사용 가능
        this.method();//상속을 통해서만 사용 가능
    }

    //직접 객체 생성해서 사용하는 것은 안됨.
    public void method2(){
        //A a = new A();
        //a.field = "value";
        //a.method();
    }

}
