package Chapter05;

public class NullExample {
    public static void main(String[] args) {
        String refVar1 = "Java";
        String refVar2 = null;

        System.out.print("refVar1 == null 결과: ");
        System.out.println(refVar1==null);
        System.out.print("refVar1 != null 결과: ");
        System.out.println(refVar1!=null);

        System.out.print("refVar2 == null 결과: ");
        System.out.println(refVar2==null);
        System.out.print("refVar2 != null 결과: ");
        System.out.println(refVar2!=null);

        int[] intArray = null;
        try {
            intArray[0] = 10;
            System.out.println("intArray[0] = " + intArray[0]);
        }catch(NullPointerException e){
            System.out.println("NullPointException: " + e.getMessage());
        }

        String str = null;
        try{
            System.out.println("총 문자수: " + str.length());
        }catch(NullPointerException e){
            System.out.println("NullPointException: " + e.getMessage());
        }
    }
}
