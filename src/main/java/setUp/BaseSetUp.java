package setUp;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseSetUp {
    public  AppiumDriver driver;

    public AppiumDriver baseSetUp(String appPackage,String appActivity) throws MalformedURLException {
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability("deviceName","OPPO A74 5G");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("udid","32d17b0a");
        capabilities.setCapability("platformVersion","12");
        capabilities.setCapability("appPackage",appPackage);
        capabilities.setCapability("appActivity",appActivity);
        capabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);

        URL url=new URL("http://127.0.0.1:4723/wd/hub");
        driver=new AppiumDriver(url, capabilities);
        System.out.println(" ******************** Application started **************************");
        return driver;
    }
}
