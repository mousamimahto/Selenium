package dataDriven2D;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProvider2D {
	
	@Test(dataProvider="datadriven")

public void fillData(String username, String passwords)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://wordpress.com/log-in");
		
		WebElement userName= driver.findElement(By.id("usernameOrEmail"));
		userName.sendKeys(username);
		
		WebElement password= driver.findElement(By.id("password"));
		password.sendKeys(passwords);
		
	}
	
	@DataProvider (name="datadriven")
	public Object[][] getData()
	{
	Object[][] data= new Object[2][2]	;
	
	data[0][0]= "username1";
	data[0][1]= "password1";
	
	data[1][0]="username2";
	data[1][1]="password2";
	
		return data;
	}
}
