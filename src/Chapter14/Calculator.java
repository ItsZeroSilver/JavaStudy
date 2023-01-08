package Chapter14;

public class Calculator {
    private int memory;
    private int getMemory(){
        return memory;
    }
    //동기화 메소드
    public synchronized void setMemory1(int memory){
        this.memory = memory;
        try{
            Thread.sleep(2000);
        } catch(InterruptedException e){}
        System.out.println(Thread.currentThread().getName()+": "+this.memory);
    }
    //동기화 블록
    public void setMemory2(int memory){
        synchronized (this){
            this.memory = memory;
            try{
                Thread.sleep(2000);
            } catch(InterruptedException e){}
            System.out.println(Thread.currentThread().getName()+": "+this.memory);
        }
    }
}
