package test;


import bases.base;
import bases.button;
import bases.driver;
import bases.input;
import org.openqa.selenium.By;

/**
 * Created by lixuecheng on 2016/6/16.
 */
public    class baidu_page extends bases.page {
    public  static  void connect(){
        driver.connect("www.baidu.com");
        base.setMaxScreen();
    }
    public  static button baidu(){
      return   new button(By.id("su"));
    }
    public  static input in(){
        return  new input(By.id("kw"));
    }

}
