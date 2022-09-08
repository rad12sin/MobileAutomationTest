package test.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import setUp.BaseSetUp;

import java.net.MalformedURLException;

public class CalculatorPage extends BaseSetUp {
    public CalculatorPage() throws MalformedURLException {
        AppiumDriver driver = baseSetUp("com.coloros.calculator","com.android.calculator2.Calculator");
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "com.coloros.calculator:id/digit_2")
    public WebElement twoButton;

    @FindBy(id = "com.coloros.calculator:id/digit_4")
    public WebElement fourButton;

    @FindBy(id = "com.coloros.calculator:id/op_add")
    public WebElement addButton;

    @FindBy(id = "com.coloros.calculator:id/eq")
    public WebElement equalButton;

    @FindBy(id = "com.coloros.calculator:id/result")
    public WebElement calculatorResult;

    public int addTwoNumber() throws InterruptedException {
        Thread.sleep(3000);
        twoButton.click();
        addButton.click();
        fourButton.click();
        equalButton.click();
        return Integer.parseInt(calculatorResult.getText());
    }

}
