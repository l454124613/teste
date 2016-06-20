package bases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by lixuecheng on 2016/6/16.
 */
public class select {
    WebElement ele;
    public select(By by) {
        ele = element.find(by);

    }

    public boolean isEnabled() {
        return ele.isEnabled();
    }

    public  void chioce(int index){
        Select select=new Select(ele);
        select.selectByIndex(index);

    }
}
