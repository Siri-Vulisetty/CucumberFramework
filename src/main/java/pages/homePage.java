package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {
	
	WebDriver driver;
	
	public homePage(WebDriver driver){
		
		this.driver=driver;
	}
	
	By acceptCookies=By.id("banner-accept-cookies");
	
	public void clickOnAcceptCookies() {
		
	WebElement acceptCookie=driver.findElement(acceptCookies);
	
	acceptCookie.click();
	}
	
	
public String returntitle() {
		
		String title=driver.getTitle();
		
		return title;

	
}
	

}
