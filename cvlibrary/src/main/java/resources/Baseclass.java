package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver instalizedriver() throws IOException 
	{
		 prop= new Properties();
		FileInputStream fis= new FileInputStream("E:\\SELENIUM\\java\\cvlibrary\\src\\main\\java\\resources\\parameter.properties");
		prop.load(fis);
		String browsername = prop.getProperty("browser");
		if(browsername.equals("chrome"))
			
		{
			System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
			driver=new ChromeDriver();
		
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
		
	}

}
