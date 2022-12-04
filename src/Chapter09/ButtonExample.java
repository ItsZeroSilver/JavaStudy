package Chapter09;

public class ButtonExample {
    public static void main(String[] args) {
        //Ok버튼 객체 생성
        Button btnOk = new Button();

        //Ok 버튼 클릭 이벤트름 처리할 ClickListner 구현 클래스(로컬 클래스)
        /*
        class OkListener implements Button.ClickListener{
            @Override
            public void onClick() {
                System.out.println("Ok 버튼을 클릭했습니다.");
            }
        }

        //Ok 버튼 객체에 ClickListener 구현 객체 주입
        btnOk.setClickListener(new OkListener());
         */

        btnOk.setClickListener(new Button.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("Ok 버튼을 클릭했습니다.");
            }
        });

        //OK 버튼 클릭하기
        btnOk.click();

        Button btnCancel = new Button();

        /*
        class CancelListener implements Button.ClickListener{
            @Override
            public void onClick() {
                System.out.println("Cancel 버튼을 클릭했습니다.");
            }
        }

        btnCancel.setClickListener(new CancelListener());
        */
        btnCancel.setClickListener(new Button.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("Cancel 버튼을 클릭했습니다.");
            }
        });

        btnCancel.click();

    }
}
