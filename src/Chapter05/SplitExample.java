package Chapter05;

public class SplitExample {
    public static void main(String[] args) {
        String board = "1, 자바 학습, 참조 타입 String 학습합니다., 홍길동";
        
        //문자열 분리
        String[] tokens = board.split(",");
        
        //인덱스별로 읽기
        System.out.println("tokens[0] = " + tokens[0]);
        System.out.println("tokens[1] = " + tokens[1]);
        System.out.println("tokens[2] = " + tokens[2]);
        System.out.println("tokens[3] = " + tokens[3]);
        System.out.println();
        
        //for문 통해서 읽기
        for (String token:tokens){
            System.out.println("token = " + token);
        }

    }
}
