package completeForm;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Form {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/form");
		
		WebElement fName= driver.findElement(By.xpath(".//input[@id='first-name']"));
		fName.sendKeys("mousami");
		
		WebElement lName= driver.findElement(By.xpath(".//input[@id='last-name']"));
		lName.sendKeys("mahto");
		
		WebElement jobTitle= driver.findElement(By.xpath(".//input[@id='job-title']"));
		jobTitle.sendKeys("Test Analyst");
		
		WebElement education= driver.findElement(By.cssSelector("input[value='radio-button-3']"));
		education.click();
		
		WebElement sex= driver.findElement(By.id("checkbox-2"));
		sex.click();
		
		WebElement yearOfExp= driver.findElement(By.id("select-menu"));
		yearOfExp.click();
		Select dropDown= new Select(yearOfExp);
		
		dropDown.selectByVisibleText("5-9");
		
		WebElement date= driver.findElement(By.id("datepicker"));
		date.click();
		date.sendKeys("10/10/2019");
		date.sendKeys(Keys.RETURN);
		
		WebElement submit= driver.findElement(By.tagName("a"));
		submit.click();
		
		

	}

}
