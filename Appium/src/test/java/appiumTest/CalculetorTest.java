package appiumTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CalculetorTest {
	static AppiumDriver<MobileElement> driver;
    
	public static void main(String[] args) {
		try {
			openClaculetor();
		} catch (Exception e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	public static void openClaculetor() throws Exception {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Galaxy Note 3");
		cap.setCapability("udid", "9f344e30");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "5.0");
		
		cap.setCapability("appPackage", "com.sec.android.app.popupcalculator");
		cap.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url, cap);

		System.out.println("Application Started....");
	}

}
