package base;

import org.openqa.selenium.By;

import java.util.Set;

/**
 * Created by lixuecheng on 2016/6/16.
 */
public class Switch {
    public  static  void defaultContent(){
        driver.get_driver().switchTo().defaultContent();

    }

    public  static  void frame(By by){
        driver.get_driver().switchTo().frame(element.find(by));

    }

    public  static  boolean window(String title_name){
       Set<String> s= driver.get_driver().getWindowHandles();

        for(String sa:s){
           if( driver.get_driver().switchTo().window(sa).getTitle().equals(title_name)){
               return  true;
           }
        }
        return  false;

    }

}
