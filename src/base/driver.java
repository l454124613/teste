package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


/**
 * Created by lixuecheng on 2016/6/16.
 * <p/>
 * driver 相关
 */
public class driver {
    private  WebDriver webDriver;
private  static Map<Long,driver> mm =new HashMap<Long,driver>();
    private driver() throws MalformedURLException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");//设置驱动的位置
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
      capabilities.setCapability("chrome.switches", Arrays.asList("--incognito"));
        capabilities.setBrowserName("chrome");
    ChromeOptions options = new ChromeOptions();
      options.addArguments("--test-type");

      capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        webDriver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"),capabilities);
     //   webDriver=new ChromeDriver(capabilities);
    }


    public   static WebDriver get_driver(Long a){

    return mm.get(a).webDriver;
    }

    public  static   void  connect(String url){
           long a= Thread.currentThread().getId();
        driver d= null;
        try {
            d = new driver();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        mm.put(a,d);
        if(url.contains("http")){
            d.webDriver.get(url);

        }else {
            d.webDriver.get("http://" + url);

        }
    }


}
