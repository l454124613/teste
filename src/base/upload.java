package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by lixuecheng on 2016/6/16.
 */
public class upload {
    WebElement ele;
    public upload(By by) {ele = element.find(by);
    }


    public void send(String file){
    ele.sendKeys(file);
    }
}
