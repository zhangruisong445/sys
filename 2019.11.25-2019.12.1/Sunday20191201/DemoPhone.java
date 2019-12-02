package Sunday20191201;

public class DemoPhone {
    public static void main(String[] args) {
        Phone phone=new Phone(){

            @Override
            public void call() {
                System.out.println("6*6");
            }

            @Override
            public void game() {

            }
        };
        phone.call();
        phone.game();


    }
}
