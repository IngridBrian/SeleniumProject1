package leartning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Obsquara {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Desktop\\SeleniumSession2\\driver\\chromeDriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.obsqurazone.com/");
		driver.findElement(By.xpath("(//div[@class='course-content'])[1]/div[@class='course-content-categories']/a"))
				.click();
		driver.findElement(By.xpath("//*[@class='border-button']")).click();
		
		/*
		 * static drop down 
		 */
//		WebElement dropdown = driver.findElement(By.xpath("//select[@class='schedule-country-select']"));
//		Select staticdropdown = new Select(dropdown);
//		staticdropdown.selectByIndex(2);
//		Thread.sleep(2000);
		
		/*
		 * checkbox - after clicking still false
		 */
		driver.findElement(By.xpath("//div[@class='accordion-select']")).click();
		WebElement checkBox = driver.findElement(By.xpath("//div[@class='accordion-select']/div[2]/label[3]"));
		System.out.println("Is my checkbox selected: " + checkBox.isSelected());
		checkBox.click();
		Thread.sleep(2000);
		System.out.println("Is my checkbox selected: " + checkBox.isSelected());

		
		
		
	}

}
