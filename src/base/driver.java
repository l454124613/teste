package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Arrays;


/**
 * Created by lixuecheng on 2016/6/16.
 * <p/>
 * driver 相关
 */
public class driver {
    private static WebDriver webDriver;
    static {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");//设置驱动的位置
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability("chrome.switches", Arrays.asList("--incognito"));
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--test-type");
       // capabilities.setCapability("chrome.binary", "src/ucBrowserDrivers/chromedriver.exe");
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        webDriver=new ChromeDriver(capabilities);

    }


    public static  WebDriver get_driver(){
    return webDriver;
    }

    public  static  void  connect(String url){


        if(url.contains("http")){
            webDriver.get(url);

        }else {
            webDriver.get("http://" + url);

        }
    }


}
