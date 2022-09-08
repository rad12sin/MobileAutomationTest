package test.pageTest;

import io.appium.java_client.AppiumDriver;
import setUp.BaseSetUp;
import test.pages.CalculatorPage;

import java.net.MalformedURLException;

public class CalculatorTest {
    public static CalculatorPage calculatorPage;

    static {
        try {
            calculatorPage = new CalculatorPage();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        //AppiumDriver driver = baseSetUp.baseSetUp("com.coloros.calculator","com.android.calculator2.Calculator");
        int sum=calculatorPage.addTwoNumber();
        System.out.println("sum= "+sum);
    }
}
