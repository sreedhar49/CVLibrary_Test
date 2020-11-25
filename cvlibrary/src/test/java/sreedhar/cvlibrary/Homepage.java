package sreedhar.cvlibrary;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

import pageobjects.landingpage;
import resources.Baseclass;

public class Homepage extends Baseclass {


	@Test(dataProvider="getdata")
	
	public void pagenavigation(String keyword, String location ) throws IOException
	
	{
	
		driver=instalizedriver();
        driver.get(prop.getProperty("url"));
       
		
		landingpage lp= new landingpage(driver);
		
		lp.Jobtitle().sendKeys(keyword);
		lp.Address().sendKeys(location);
		lp.Distance().click();
		Select s= new Select(lp.Distance());
		s.selectByValue("10");
		
		
		lp.findjobs().click();
		
		
	}
	
	@AfterTest
	public void teardown()
	{
		
		driver.close();
	}
	
	@DataProvider
	
	public Object[][] getdata()
	{
		
		Object[][] data = new Object[2][2];
		data[0][0]= "automation tester";
		data[0][1]=	"london";	
		
		data[1][0]= "manual tester";
		data[1][1]= "fleet";
		
		
		return data;
				
				
		
		
	}
	
}


