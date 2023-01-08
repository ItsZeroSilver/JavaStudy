package Chapter14;

public class YieldExample {
    public static void main(String[] args) {
        WorkThread workThreadA = new WorkThread("workThreadA");
        WorkThread workThreadB = new WorkThread("workThreadB");
        workThreadA.start();
        workThreadB.start();

        try{Thread.sleep(50000);} catch (InterruptedException e) {}
        workThreadA.work = false;

        try{Thread.sleep(100000);} catch (InterruptedException e) {}
        workThreadB.work = true;

    }
}
