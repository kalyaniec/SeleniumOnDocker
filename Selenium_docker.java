package docker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DockerWithChrome {

	public static void main(String[] args) throws MalformedURLException
	{
		
		DesiredCapabilities dc =new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME, "firefox");	
		URL url=new URL("http://localhost:4444/wd/hub");
		
		RemoteWebDriver driver=new RemoteWebDriver(url,dc);
		driver.get("https://google.com");
		System.out.print(driver.getTitle());
		driver.quit();
		
		
			
	}
	
	
}
