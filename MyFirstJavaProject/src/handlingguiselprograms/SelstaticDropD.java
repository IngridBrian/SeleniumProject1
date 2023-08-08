package handlingguiselprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SelstaticDropD {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\HP\\Desktop\\SeleniumSession2\\driver\\chromeDriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/select-input.php");

		Thread.sleep(2000);
		// staticd dropdown select -option in inspect source code
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select staticDropdown = new Select(dropdown);

		staticDropdown.selectByValue("Yellow");
		Thread.sleep(2000);
		GetValue(driver.findElement(By.xpath("//*[@id='message-one']")).getText(),"Yellow");

	}

	private static void GetValue(String str, String expected) {
		// TODO Auto-generated method stub
		String actualTest= str.split(": ")[1];
		System.out.println(actualTest);
		Assert.assertEquals(actualTest, expected);
		
	}

}
