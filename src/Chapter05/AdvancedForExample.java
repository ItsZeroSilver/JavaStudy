package Chapter05;

public class AdvancedForExample {
    public static void main(String[] args) {
        int[] scores;
        scores = new int[]{83, 90, 87};
        int sum = 0;

        for(int score:scores){
            sum += score;
        }
        System.out.println("sum = " + sum);
    }
}
