package leartning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\HP\\Desktop\\SeleniumSession2\\driver\\chromeDriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.findElement(By.xpath("//ul[@class='navbar-nav']/li[2]")).click();
		driver.findElement(By.linkText("Checkbox Demo")).click();
		WebElement checkbox = driver.findElement(By.cssSelector("#gridCheck"));
		System.out.println("Is my checkbox selected: " + checkbox.isSelected());
		checkbox.click();
		System.out.println("Is my checkbox selected: " + checkbox.isSelected());

	}

}
