package basicSeleProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnCssloc {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\HP\\Desktop\\SeleniumSession2\\driver\\chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		/**
		 * Css Syntaxes
		 * 
		 * 1) if className is unique = .ClassName 2) if we have id = #id 3) if we have
		 * multiple classes we can commit space between them and use . operator eg
		 * <input class="button-1 login-button valid", name="password> css locator can
		 * be = .button-1.login-button
		 * 
		 * 4) if you have enough attributes ;general syntax for css locator is
		 * tagname[attribute ='value'] or [attribute='value']
		 * 
		 * 5) Tagname[@attribute=’value’]:nth-child(index)
		 *
		 * 6) using regular expressions = input[type*='pass']
		 */

		driver.findElement(By.cssSelector(".ico-login")).click();
		driver.findElement(By.cssSelector("#Email")).sendKeys("obsqura24@gmail.com");
		driver.findElement(By.cssSelector("#Password")).sendKeys("mypassword");
		driver.findElement(By.cssSelector(".button-1.login-button")).click();
		driver.findElement(By.xpath("//ul[@class='list']//li[5]//a")).click();
	//	driver.findElement(By.xpath("//img[@title='Show details for 3rd Album']")).click();
		driver.findElement(By.cssSelector("a[title*='3rd Album']")).click();

		WebElement qtyBox = driver.findElement(By.cssSelector("#addtocart_53_EnteredQuantity"));
		qtyBox.clear();
		qtyBox.sendKeys("3");
		driver.findElement(By.cssSelector("#add-to-cart-button-53")).click();
		driver.findElement(By.cssSelector(".ico-cart")).click();
		driver.findElement(By.cssSelector("#checkout")).click();

		WebElement checkBox = driver.findElement(By.cssSelector("#termsofservice"));
		System.out.println("Is my checkbox selected: " + checkBox.isSelected());

		checkBox.click();
		System.out.println("Is my checkbox selected: " + checkBox.isSelected());
	}
}
