package pageScroll;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PageScroll {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/scroll");
		
		WebElement pageEnd= driver.findElement(By.id("name"));
		
		Actions action= new Actions(driver);
		action.moveToElement(pageEnd);
		pageEnd.sendKeys("mousami");

	}

}
