package test;

import base.base;
import base.button;
import base.driver;
import base.input;
import org.openqa.selenium.By;

/**
 * Created by lixuecheng on 2016/6/16.
 */
public  class page {
    public  static  void con(){
        driver.connect("www.baidu.com");
        base.setMaxScreen();
    }
    public  static button baidu(){
      return   new button(By.id("su"));
    }
    public  static input in(){
        return  new input(By.id("kw"));
    }
    public static void close(){
base.quit();
    }
}
