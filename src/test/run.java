package test;

import base.driver;
import base.murun;

/**
 * Created by lixuecheng on 2016/6/16.
 */
public class run implements Runnable {
    public static  void main(String[] args) throws InterruptedException {
    page.con();
        page.in().sendkeys("niahoa按时");
        page.baidu();
        page.close();
        System.out.println("ok");
}

    @Override
    public void run() {

        page.con();
        page.in().sendkeys("niahoa按时");
        page.baidu();
        page.close();
        System.out.println("ok");
        murun.num++;
    }
}
