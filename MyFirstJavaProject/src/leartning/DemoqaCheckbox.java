package leartning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoqaCheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Desktop\\SeleniumSession2\\driver\\chromeDriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/elements");
		driver.findElement(By.xpath("//*[@id='item-1']")).click();
		WebElement checkbox = driver.findElement(By.cssSelector(".rct-checkbox"));
		System.out.println("Is my checkbox selected: " + checkbox.isSelected());
		checkbox.click();
		System.out.println("Is my checkbox selected: " + checkbox.isSelected());

	}

}
