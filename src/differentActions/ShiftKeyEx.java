package differentActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ShiftKeyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","G:\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/autocomplete/");
		WebElement inputBox = driver.findElement(By.id("tags"));
		
		Actions actions = new Actions(driver);
		//action.keyDown(inputBox, Keys.SHIFT).sendKeys("blah").keyUp(inputBox, Keys.SHIFT).perform();
		
		actions.keyDown(inputBox, Keys.SHIFT).sendKeys("blah").keyUp(inputBox, Keys.SHIFT);
		
		Action action = actions.build();
		action.perform();
	}

}
