package Chapter05;

public class EqualExample {
    public static void main(String[] args) {
        String refVar1 = "java";
        String refVar2 = "java2";
        String refVar3 = "java2";

        System.out.print("refVar1 == reVar2 결과: ");
        System.out.println(refVar1==refVar2);
        System.out.print("refVar1 != reVar2 결과: ");
        System.out.println(refVar1!=refVar2);

        System.out.print("refVar2 == reVar3 결과: ");
        System.out.println(refVar2==refVar3);
        System.out.print("refVar2 != reVar3 결과: ");
        System.out.println(refVar2!=refVar3);

    }
}
