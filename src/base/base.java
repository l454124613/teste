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
    public void setimplicitlyWait(int time) {
        driver.get_driver().manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);

    }
/*
* 设置页面页面加载超时时间
*
* */
    public void setpageLoadTimeout(int time) {
        driver.get_driver().manage().timeouts().pageLoadTimeout(time, TimeUnit.SECONDS);

    }
/*
* 设置全屏
* */
    public void setMaxScreen() {
        driver.get_driver().manage().window().maximize();


    }

    /*
  * 关闭当前窗口
  */
 public  void close(){
     driver.get_driver().close();

 }

    /*
 * 关闭所有窗口
 */
    public  void quit(){
        driver.get_driver().quit();

    }

}
