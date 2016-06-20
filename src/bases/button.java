package bases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by lixuecheng on 2016/6/16.
 * 按钮相关
 */
public class button {
    WebElement ele;

    public button(By by) {
        ele = element.find(by);
    }

    public void click() {
        ele.click();
    }

    public boolean isEnabled() {
        return ele.isEnabled();
    }
}
