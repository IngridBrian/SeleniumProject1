import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\HP\\Desktop\\SeleniumSession2\\driver\\chromeDriver.exe");
		// below statement : initiates a driver and open the browser window
		WebDriver driver = new ChromeDriver();
		// to maximize the screen
		driver.manage().window().maximize();
		// get is used to open the page or link
		driver.get("https://www.saucedemo.com/");
		// find element is used to find web element & syntax used to pass the web
		// element value
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.className("submit-button")).click();
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);
		// 2sec
		driver.findElement(By.linkText("About")).click();
		System.out.println("title about is" + driver.getTitle());
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Logo")).click();
		System.out.println("title logout is " + driver.getTitle());
		String text = driver.findElement(By.className("login_logo")).getText();
		System.out.println(text);
		driver.quit();
	}

}
