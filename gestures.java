import java.net.MalformedURLException;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class gestures extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver=cap();
		
		driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Accessibility\"]").click();
		TouchAction t=new TouchAction(driver);
		
		
		
	}

}
