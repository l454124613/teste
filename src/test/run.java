package test;

import bases.murun;

/**
 * Created by lixuecheng on 2016/6/16.
 */
public class run implements Runnable {
    public static  void main(String[] args) throws InterruptedException {
    baidu_page.connect();
        baidu_page.in().sendkeys("niahoa按时");
        baidu_page.baidu();
        baidu_page.quit();
        System.out.println("ok");
}

    @Override
    public void run() {

        baidu_page.connect();
        baidu_page.in().sendkeys("niahoa按时");
        baidu_page.baidu();
        baidu_page.quit();
        System.out.println("ok");
        murun.num++;
    }
}
