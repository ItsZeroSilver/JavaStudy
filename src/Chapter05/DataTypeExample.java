package Chapter05;

public class DataTypeExample {
    public static void main(String[] args) {
        char v1 = 'A';

        if(v1=='A'){
            int v2 = 100;
            double v3 = 3.14;
            //Stack: v1, v2, v3
            System.out.println("v2 = " + v2);
            System.out.println("v3 = " + v3);
        }
        //System.out.println("v2 = " + v2);
        //System.out.println("v3 = " + v3);
        boolean v4 = true;
        //Stack: v1, v4
    }
}
