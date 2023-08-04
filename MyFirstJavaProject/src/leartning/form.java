package leartning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class form {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\HP\\Desktop\\SeleniumSession2\\driver\\chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/form-submit.php");
		/*
		 * whenever we need to handle any element with mouse
		 * we need to make object of Actions class
		 */
		Actions act = new Actions(driver);
		WebElement listbox = driver.findElement(By.cssSelector("#list0box"));
		act.moveToElement(listbox).build().perform();	
		
		/*
		 * whenever we need to handle any element with keyboard
		 * we need to make object of Actions class
		 */
		
		WebElement firstname = driver.findElement(By.xpath("//input[@id='validationCustom01']"));
		act.moveToElement(firstname).click().keyDown(Keys.SHIFT).sendKeys("ingrid").build().perform();
		WebElement Lastname = driver.findElement(By.xpath("//*[@placeholder='Last name']"));
		Thread.sleep(2000);
	
		act.moveToElement(Lastname).click().sendKeys("rodri").build().perform();
		
	}

}
