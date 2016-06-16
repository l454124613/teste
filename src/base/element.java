package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by lixuecheng on 2016/6/16.
 * 元素相关
 */
public class element {

   static WebElement find(By by){
      return  driver.get_driver().findElement(by);

    }


}
