import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UnderstandingWebelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\HP\\Desktop\\SeleniumSession2\\driver\\chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		WebElement userName = driver.findElement(By.cssSelector("#user-name"));
		userName.sendKeys("standard_user");
		WebElement passWord = driver.findElement(By.cssSelector("input[placeholder='Password']"));
		passWord.sendKeys("secret_sauce");
		// if two class----------------->.submit-button.btn_action
		// if one class ---------------->.submit-button
		// if general syntax ----------->input[class='submit-button btn_action']
		WebElement loginBtn = driver.findElement(By.cssSelector(".submit-button"));
		loginBtn.click();

		/**
		 * How to use WebElements -find elements
		 */
		// add to cart
		List<WebElement> addToCart = driver.findElements(By.cssSelector(".btn_small.btn_inventory"));
		int itemNumbers = addToCart.size();
		System.out.println("Size of List = " + addToCart.size());
//		addToCart.get(2).click();
		for (int i = 0; i < addToCart.size(); i++) {
			addToCart.get(i).click();
		}
		driver.findElement(By.cssSelector(".shopping_cart_link")).click();
		List<WebElement> products = driver.findElements(By.cssSelector(".cart_item"));
		int pNumber = products.size();
		System.out.println("Actual size of cart " + pNumber);
		// Actual, Expected

		Assert.assertEquals(pNumber, itemNumbers);
		driver.findElement(By.cssSelector("#checkout")).click();
		WebElement firstname = driver.findElement(By.cssSelector("#first-name"));
		firstname.sendKeys("Ingrid");
		
		WebElement lastname = driver.findElement(By.id("last-name"));
		lastname.sendKeys("Rodrigues");
		
		WebElement postalcode = driver.findElement(By.cssSelector("#postal-code"));
		postalcode.sendKeys("143521");
		
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("finish")).click();
		
		WebElement Text= driver.findElement(By.cssSelector("h2[class='complete-header'] "));
		System.out.println(Text.getText());
		
		WebElement subText= driver.findElement(By.cssSelector("div[class='complete-text']"));
		System.out.println(subText.getText());
		
		WebElement title = driver.findElement(By.cssSelector("span[class='title']"));
		System.out.println(title.getText());
		
		WebElement logo = driver.findElement(By.cssSelector("div[class='app_logo']"));
		System.out.println(logo.getText());
		
		Assert.assertEquals("Thank you for your order!", "Thank you for your order!");
		
		WebElement backHome = driver.findElement(By.cssSelector("#back-to-products"));
		System.out.println(backHome.getText());
		backHome.click();
		
	//	driver.close();
	}

}
