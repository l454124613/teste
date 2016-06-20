import base.murun;
import tools.Cmd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import static tools.Cmd.*;

public class Main {

    public static void main(String[] args) throws InterruptedException, IOException {
     //   System.setProperty("selenium-server-standalone-2.46.0.jar","D:\\teste\\lib\\selenium-server-standalone-2.46.0.jar");
        String a1="java -jar lib/selenium-server-standalone-2.46.0.jar -port 4444 -role hub  -maxSession 40";
        String a2="java -jar lib/selenium-server-standalone-2.46.0.jar   -Dwebdriver.chrome.driver=\"D:/teste/driver/chromedriver.exe\" -role node  -hub http://localhost:4444/grid/register  -browser browserName=chrome,maxInstances=5 -maxSession 30 ";
    //    List a= run("lib/hub.bat");
      //  List aa= run("cmd.exe /c "+a2);
    //    System.out.println(a);
      //  System.out.println(a.toString());
//        Thread.sleep(3000);
//      murun m= new murun();
//        for (int i = 0; i <5 ; i++) {
//
//            m.qu.add(String.valueOf(i));
//        }
//        m.run();
        Thread t1=new Thread(new Cmd(a1));
        t1.start();
        Thread.sleep(3000);
       Thread t2=new Thread(new Cmd(a2));
        t2.start();
        murun m= new murun();

        for (int i = 0; i <7 ; i++) {

            m.qu.add(String.valueOf(i));
        }
        Thread.sleep(3000);
        m.run();
//        t1.interrupt();
//        t2.interrupt();
    }





}
