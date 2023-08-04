package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DynamicDropdownAss1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\HP\\Desktop\\SeleniumSession2\\driver\\chromeDriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/index.php");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='navbar-nav'])/li[2]")).click();
		driver.findElement(By.partialLinkText("Jquery Select2")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@role='combobox'])[2]")).sendKeys("Ca");
		List<WebElement> states = driver.findElements(By.cssSelector(".select2-results__options li"));
		System.out.println("Total elements found= " + states.size());
		
		for (int i = 0; i < states.size(); i++) {
			if (states.get(i).getText().equalsIgnoreCase("California")) {

				states.get(i).click();
				break;

			}
		}

		WebElement actualText = driver.findElement(By.xpath("//*[@class='select2-selection__choice__display']"));
		System.out.println(actualText.getText());
		Assert.assertEquals(actualText.getText(), "California");
		System.out.println("Passed: option selected correctly");
		// driver.quit();

	}
}
