package leartning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoForm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Desktop\\SeleniumSession2\\driver\\chromeDriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.cssSelector("[placeholder='First Name']")).sendKeys("Ingrid");
		driver.findElement(By.cssSelector("[placeholder='Last Name']")).sendKeys("Rodrigues");
		driver.findElement(By.cssSelector("[id='userEmail']")).sendKeys("Ingrid@gmail.com");
		//radio
		//driver.findElement(By.xpath("//input[@value='Female']")).click();
		driver.findElement(By.cssSelector("label[for='gender-radio-2']")).click();
		
		driver.findElement(By.cssSelector("[id='userNumber']")).sendKeys("798");
		//sub
		//driver.findElement(By.cssSelector("[class='subjects-auto-complete__control css-yk16xz-control']")).sendKeys("computer");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[@class='custom-control-label'])[5]")).click();
		//adres
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("asf546456");
		
	}

}
