package Chapter05;

public class SubStringExample {
    public static void main(String[] args) {
        String ssn = "880815-1234567";

        String firstNum = ssn.substring(0,6);//0부터 6앞까지 잘라내기
        System.out.println(firstNum);

        String secondNum = ssn.substring(7);//7부터 끝까지 잘라내기
        System.out.println(secondNum);
    }
}
