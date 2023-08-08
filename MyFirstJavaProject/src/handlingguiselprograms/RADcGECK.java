package handlingguiselprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RADcGECK {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\HP\\Desktop\\SeleniumSession2\\driver\\chromeDriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement checkBox = driver.findElement(By.xpath("//*[@id='gridCheck']"));
		System.out.println("IS CHECKBOX SELECTED: " + checkBox.isSelected());
		checkBox.click();
		Thread.sleep(2000);
		System.out.println("IS CHECKBOX SELECTED: " + checkBox.isSelected());
		driver.findElement(By.partialLinkText("Radio Buttons Demo")).click();
		WebElement rdbtn = driver.findElement(By.xpath("//*[@id='inlineRadio2']"));
		System.out.println("IS rd SELECTED: " + rdbtn.isSelected());
		rdbtn.click();
		Thread.sleep(2000);
		System.out.println("IS rd SELECTED: " + rdbtn.isSelected());

	}

}
