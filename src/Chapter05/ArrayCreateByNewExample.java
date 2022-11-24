package Chapter05;

public class ArrayCreateByNewExample {
    public static void main(String[] args) {
        int[] array = new int[3];
        for(int i=0;i<3;i++){
            System.out.println("array[" + i +"] = " + array[i]);
        }

        array[0] = 10;
        array[1] = 20;
        array[2] = 30;

        for(int i=0;i<3;i++){
            System.out.println("array[" + i +"] = " + array[i]);
        }
    }
}
