package base;

import java.util.concurrent.TimeUnit;

/**
 * Created by lixuecheng on 2016/6/16.
 * 页面基本数据
 */
public class base {
/*
* 设置等待元素超时时间
*
* */
    public static void setimplicitlyWait(int time) {
        driver.get_driver(Thread.currentThread().getId()).manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);

    }
/*
* 设置页面页面加载超时时间
*
* */
    public static void setpageLoadTimeout(int time) {
        driver.get_driver(Thread.currentThread().getId()).manage().timeouts().pageLoadTimeout(time, TimeUnit.SECONDS);

    }
/*
* 设置全屏
* */
    public static void setMaxScreen() {
        driver.get_driver(Thread.currentThread().getId()).manage().window().maximize();


    }

    /*
  * 关闭当前窗口
  */
 public static void close(){
     try {
         driver.get_driver(Thread.currentThread().getId()).close();
     } catch (Exception e) {

     }

 }

    /*
 * 关闭所有窗口
 */
    public static void quit(){
        driver.get_driver(Thread.currentThread().getId()).quit();

    }

}
