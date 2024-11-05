package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseDriver {
	
	public WebDriver driver;
	
	public void launchBrowser() {
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	}
	
	public void launchApplication(String url) {
		
		driver.get(url);
	}
}
