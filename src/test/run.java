package test;

import base.driver;

/**
 * Created by lixuecheng on 2016/6/16.
 */
public class run {
    public static  void main(String[] args) throws InterruptedException {
    page.con();
        page.in().sendkeys("niahoa按时");
        page.baidu();
        Thread.sleep(3000);
}}
