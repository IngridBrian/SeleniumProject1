package handlinggui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardMouseAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\HP\\Desktop\\SeleniumSession2\\driver\\chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		
		/**
		 * whenever we need to handle any element with keyboard and mouse 
		 * we need to make object of Actions class
		 */
		
		Actions act = new Actions(driver);
		WebElement others=driver.findElement(By.cssSelector("#others"));
		/**
		 * Hover over a webelement
		 */
		act.moveToElement(others).build().perform();
		
		WebElement textBox = driver.findElement(By.cssSelector("[placeholder='Message']"));
		//textBox.sendKeys("misha");
		act.moveToElement(textBox).click().sendKeys("jasmine").build().perform();
		act.moveToElement(textBox).click().keyDown(Keys.SHIFT).sendKeys("misha").build().perform();
		act.moveToElement(others).build().perform();
		
	}

}