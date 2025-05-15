package setUp;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.options.BaseOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseSetUp {
    public  AppiumDriver driver;

    public AppiumDriver baseSetUp(String appPackage,String appActivity) throws MalformedURLException {
        BaseOptions options = new BaseOptions();
        options.setCapability("deviceName","OPPO A74 5G");
        options.setCapability("platformName","Android");
        options.setCapability("udid","32d17b0a");
        options.setCapability("platformVersion","12");
        options.setCapability("appPackage",appPackage);
        options.setCapability("appActivity",appActivity);
        options.setCapability("autoGrantPermissions", true);

        URL url=new URL("http://127.0.0.1:4723/wd/hub");
        driver=new AppiumDriver(url, options);
        System.out.println(" ******************** Application started **************************");
        return driver;
    }
}
