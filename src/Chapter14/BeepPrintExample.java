package Chapter14;

import java.awt.*;

public class BeepPrintExample {
    public static void main(String[] args) {
        //순차적으로 실행하는 경우
        /*
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++) {
            toolkit.beep();
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
         */
        //Thread 클래스로 직접 생성
        //비프음 작업 스레드가 담당
        /*
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for ( int i=0;i<5;i++){
                    toolkit.beep();
                    try {Thread.sleep(500);} catch (Exception e) {}
                }
            }
        });
        thread.start();
        //프린팅 메인 스레드가 담당
        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {Thread.sleep(500);} catch (Exception e) {}
        }
         */

        //Thread 자식 클래스로 생성
        Thread thread = new Thread() {
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for ( int i=0;i<5;i++){
                    toolkit.beep();
                    try {Thread.sleep(500);} catch (Exception e) {}
                }
            }
        };
        thread.start();
        //프린팅 메인 스레드가 담당
        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {Thread.sleep(500);} catch (Exception e) {}
        }
    }
}
