package september07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragElement {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/draggable/");
		
		WebElement draggable = driver.findElement(By.id("draggable"));
		
		Actions action = new Actions(driver);
		
		action.dragAndDropBy(draggable, 50, 0).build().perform();
		Thread.sleep(2000);
		action.dragAndDropBy(draggable, 50, 0).build().perform();
		Thread.sleep(2000);
		action.dragAndDropBy(draggable, 0, 50).build().perform();
		Thread.sleep(2000);
		action.dragAndDropBy(draggable, 0, 50).build().perform();
	}

}
