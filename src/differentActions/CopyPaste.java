package differentActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyPaste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		WebElement textBox = driver.findElement(By.name("userName"));
		textBox.sendKeys("batman");
		
		Actions action = new Actions(driver);
		
		action.doubleClick(textBox).build().perform();
		textBox.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		
		//driver.findElement(By.name("password")).sendKeys(Keys.CONTROL+"v");
		driver.findElement(By.name("password")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
		
		driver.findElement(By.name("login")).sendKeys(Keys.ENTER);
	}

}
