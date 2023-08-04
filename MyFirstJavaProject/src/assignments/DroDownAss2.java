package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DroDownAss2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\HP\\Desktop\\SeleniumSession2\\driver\\chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		//driver.findElement(By.xpath("//ul[1]/li[1]/a")).click();
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown']"));
		Select staticDropdown = new Select(dropdown);
		Thread.sleep(2000);
		staticDropdown.selectByValue("1");
		Thread.sleep(2000);
		staticDropdown.selectByIndex(2);
		Thread.sleep(2000);
		driver.quit();
				    
		
	}
}
