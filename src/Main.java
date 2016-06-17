import base.murun;

public class Main {

    public static void main(String[] args) throws InterruptedException {
      murun m= new murun();
        for (int i = 0; i <5 ; i++) {

            m.qu.add(String.valueOf(i));
        }
        m.run();
    }
}
