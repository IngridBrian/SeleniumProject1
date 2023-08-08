package handlingguiselprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDrpDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\HP\\Desktop\\SeleniumSession2\\driver\\chromeDriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.get("https://selenium.obsqurazone.com/select-input.php");
		/**
		 * In order to select static drop down there must be a select tag and option tag
		 * We can use 3 methods to make selection of any element from static drop down
		 * herew we cannot manually enter any values.
		 * 
		 * selectByIndex() selectByValue() selectByVisivleText()
		 */
		WebElement dropdown = driver.findElement(By.xpath("//*[@id='single-input-field']"));
		Select staticdrop= new Select(dropdown);
		staticdrop.selectByIndex(1);
		staticdrop.selectByValue("Green");
		staticdrop.selectByVisibleText("Yellow");
		
		
	}

}
