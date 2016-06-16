package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by lixuecheng on 2016/6/16.
 * 选择相关
 */
public class chioce {
    WebElement ele;
    public chioce(By by) {
        ele = element.find(by);
    }
    public void click() {
        ele.click();
    }

    public boolean isEnabled() {
        return ele.isEnabled();
    }
    public boolean isSelected() {
        return ele.isSelected();
    }
}
