package keyBoardMouseInput;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardMouseInput {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/keypress");
		
		WebElement keyBoard= driver.findElement(By.xpath(".//input[@id='name']"));
		keyBoard.click();
		keyBoard.sendKeys("mousami");

		WebElement button= driver.findElement(By.id("button"));
		button.click();
	}

}
