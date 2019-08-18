package datePicker;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/datepicker");
		
		WebElement date = driver.findElement(By.id("datepicker"));
		date.click();
		date.sendKeys("05/10/2016");
		date.sendKeys(Keys.RETURN);
	}

}
