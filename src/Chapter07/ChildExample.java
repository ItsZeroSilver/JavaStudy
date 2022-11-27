package Chapter07;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
    }
}
/*
        //자동 타입 변환
        Child parent = new Child();
        //부모 필드랑 메소드만 사용 가능
        parent.field1 = "data";
        parent.method1();
        parent.method2();
        //parent.field2 = "data";
        //parent.method3();

        //강제 타입 변환
        Child child;
        child = parent;
        //자식 필드랑 메소드 사용 가능
        child.field2 = "data";
        child.method3();

    }
 */