package leartning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoqaRadio {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Desktop\\SeleniumSession2\\driver\\chromeDriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.get("https://demoqa.com/radio-button");
	//	driver.findElement(By.xpath("//ul[@class='menu-list']//li[3]")).click();
		driver.get("https://demoqa.com/elements");
		driver.findElement(By.xpath("//*[@id='item-2']")).click();
		WebElement radiobtn = driver.findElement(By.cssSelector("#impressiveRadio"));
		Thread.sleep(2000);
		System.out.println("Is my radio selected: " + radiobtn.isSelected());
		radiobtn.click();
		System.out.println("Is my radio selected: " + radiobtn.isSelected());

	}

}
