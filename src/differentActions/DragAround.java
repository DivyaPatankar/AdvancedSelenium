package differentActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAround {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/draggable/");
		
		WebElement box = driver.findElement(By.id("draggable"));
		
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.clickAndHold(box).moveByOffset(50, 0).release(box).build().perform();
		
		Thread.sleep(3000);
		action.clickAndHold(box).moveByOffset(0, 50).release(box).build().perform();

	}

}
