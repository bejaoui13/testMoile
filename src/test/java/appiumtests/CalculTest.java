package appiumtests;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
 
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class CalculTest {

	
	static AppiumDriver driver;
 
	public static void main(String[] args) throws IOException {

		try {
			openalculator();
		} catch (Exception e) {
			e.getCause();
			e.getMessage();
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void openalculator() throws Exception
	{
		DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Galaxy A12S");
        capabilities.setCapability("udid", "R58R2425WNZ");
        capabilities.setCapability("appium-version", "1.22.3");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "12");
      //  capabilities.setCapability("waitForAppLaunch", "false");
       // capabilities.setCapability("uiautomator2ServerInstallTimeout", "1000");
       // capabilities.setCapability("noReset", "true");
       // capabilities.setCapability("skipServerInstallation", true);
       capabilities.setCapability("skipDeviceInitialization", true);
        //dcap.setCapability("automationName", "UiAutomator1");

        capabilities.setCapability("adbExecTimeout", "200000");
      capabilities.setCapability("appPackage", "com.sec.android.app.popupcalculator");
     capabilities.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
	       URL urld =  new URL("http://127.0.0.1:4723/wd/hub");

		driver = new AndroidDriver(urld, capabilities); 
 
        System.out.println("Application Started....");
        


	}
	     
	 
}
