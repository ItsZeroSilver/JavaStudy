package Chapter09;

public class A {
    //로컬 변수를 로컬 클래스에서 사용할 경우 로컬 변수는 final특성을 갖게 되므로 값을 읽을 수만 있고 수정할 수 없게 된다.
    public void method1 (int arg){//final int arg
        //로컬 변수
        int var = 1;//final int var = 1;

        //로컬 클래스
        class B {
            void method2(){
                System.out.println("arg: "+ arg);
                System.out.println("var: "+ var);
            }
        }
        //로컬 객체 생성
        B b = new B();
        //로컬 객체 메소드 호출
        b.method2();
    }
}

/*
    int field1;
    void method1(){}

    static int field2;
    static void method2(){}

    class B {
        void method(){
            field1= 10;
            method1();
            field2=10;
            method2();
        }
    }

    static class C {
        void method(){
            //field1= 10;
            //method1();
            field2=10;
            method2();
        }
    }
 */
