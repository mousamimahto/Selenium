package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/dropdown");
		
		WebElement dropDown = driver.findElement(By.id("dropdownMenuButton"));
		dropDown.click();
		Select value= new Select(dropDown);
		value.selectByVisibleText("Modal");//we have selected the value 
		
		//we will check the value selected is correct
		WebElement sel_val= value.getFirstSelectedOption();
		sel_val.click();
	
		System.out.println("Selected value is" +sel_val.getText());
		

	}

}
