package bases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.pagefactory.ByAll;

/**
 * Created by lixuecheng on 2016/6/23.
 */
public class Widget {
    private  String title="";

    public boolean istitle() {
        return istitle;
    }

    private   boolean istitle=false;
    public Widget(String... a) {
        if(a!=null&&a.length>0) {
            if (a[0].equalsIgnoreCase("title")) {
                title=a[1];
                istitle=true;
            } else {
                Switch.frame(bases.By.getBy(a[0], a[1]));
            }
        }


        }
      void switchToWin(){
        Switch.window(title);//"百度一下，你就知道"

    }


    }

