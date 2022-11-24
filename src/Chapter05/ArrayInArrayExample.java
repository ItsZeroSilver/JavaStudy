package Chapter05;

public class ArrayInArrayExample {
    public static void main(String[] args) {
        int[][] javaScores = {{95,80},{92,96,80}};
        for (int i=0;i<javaScores.length;i++){
            for (int j=0;j< javaScores[i].length;j++){
                System.out.println("javaScores["+i+"]["+j+"] = " + javaScores[i][j]);
            }
        }
    }
}
