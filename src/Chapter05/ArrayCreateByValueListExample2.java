package Chapter05;

public class ArrayCreateByValueListExample2 {
    public static void main(String[] args) {
        int[] scores;
        scores = new int[]{83, 90, 87};
        int sum1 = 0;

        for(int i=0;i< scores.length;i++){
        //for (int i=0;i<3;i++){
            sum1 += scores[i];
        }
        System.out.println("sum1 = " + sum1);

        double avg = (double) sum1 / scores.length;
        System.out.println("avg = " + avg);

        int sum2 = add(new int[]{83,90,87});
        System.out.println("sum2 = " + sum2);
    }
    
    public static int add(int[] scores){
        int sum = 0;
        for (int i=0;i<scores.length;i++){
        //for (int i=0;i<3;i++){
            sum +=scores[i];
        }
        return sum;
    }
}
