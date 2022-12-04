package Chapter09;

public class Button {
    //정적 중첩 인터페이스
    public static interface ClickListener{
        void onClick();
    }

    //필드: 중첩 인터페이스를 필드로 선언
    private ClickListener clickListener;

    //메소드: 중첩 인터페이스를 setter로 선언
    public void setClickListener(ClickListener clickListener){
        this.clickListener = clickListener;
    }

    //Button이 클릭되었을때 실행할 메소드 선언
    public void click(){
        this.clickListener.onClick();
    }
}
