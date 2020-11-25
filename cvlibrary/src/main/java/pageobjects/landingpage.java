package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingpage {
	
	public WebDriver driver;
	By keyword=By.id("keywords");
	By place =By.id("location");
    By findjob = By.xpath("//input[@type='submit']");
    By dropdown =By.id("distance"); 

public landingpage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	
	this.driver=driver;
}


public WebElement Jobtitle()
{
	return driver.findElement(keyword);
	
}

public WebElement Address()
{
	
	return driver.findElement(place);
	
}
	

public WebElement findjobs()
{
	
	return driver.findElement(findjob);
	
}
public WebElement Distance()
{
	
	return driver.findElement(dropdown);
	
}


}
