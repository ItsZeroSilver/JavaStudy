package Chapter05;

public class ArrayCopyByForExample {
    public static void main(String[] args) {
        int[] oldIntArray = {1,2,3};
        int[] newIntArray = new int[5];

        //int 배열 복사
        for(int i=0;i<oldIntArray.length;i++){
            newIntArray[i] = oldIntArray[i];
        }
        //int 배열의 기본 초기값 0이 그대로 유지
        for(int i=0;i<newIntArray.length;i++){
            System.out.print(newIntArray[i] +", ");
        }
        System.out.println();


        String[] oldStrArray = {"java", "array", "copy"};
        String[] newStrArray = new String[5];

        //String복사
        //System.arraycopy(Object src, int scrPos, Object dest, int destPost, int length);
        System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);

        for(int i=0;i< newStrArray.length;i++){
            System.out.print(newStrArray[i]+", ");
        }

    }
}
