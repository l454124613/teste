package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by lixuecheng on 2016/6/16.
 */
public class text {
    WebElement ele;
    String attr;

    public text(By by) {

        ele = element.find(by);

    }

    public text(By by, String attr) {

        ele = element.find(by);
        this.attr = attr;
    }

    public String getAttribute(){
      return   ele.getAttribute(attr);
    }

    public  String getText(){
        return ele.getText();
    }

}
