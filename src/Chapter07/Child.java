package Chapter07;

import Chapter07.Parent;

public class Child extends Parent {
    public String name;

    public Child() {
        this("홍길동");
        System.out.println("Child() Call");
    }

    public Child(String name) {
        this.name = name;
        System.out.println("Child(String name) call");
    }
}
/*
    public String field2;

    public void method3(){
        System.out.println("Child-method3()");
    }
 */