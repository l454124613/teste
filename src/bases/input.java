package bases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by lixuecheng on 2016/6/16.
 */
public class input {
    WebElement ele;
    public input(By by) {ele = element.find(by);
    }
    public boolean isEnabled() {
        return ele.isEnabled();
    }
    public void sendkeys(String keys){
        ele.sendKeys(keys);

    }
    public void clear(){
        ele.clear();

    }
}
