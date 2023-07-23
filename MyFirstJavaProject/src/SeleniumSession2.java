import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSession2 {

	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Desktop\\SeleniumSession2\\driver\\chromeDriver.exe");
		// below statement : initiates a driver and open the browser window
		WebDriver driver = new ChromeDriver();
		// to maximize the screen
		driver.manage().window().maximize();
		// get is used to open the page or link
		driver.get("https://www.obsqurazone.com/");
//		driver.quit();
//		driver.close();
//		System.out.println(driver);
		// get title
		String title = driver.getTitle();
		System.out.println("title of page is:" + title);
		String url = driver.getCurrentUrl();
		System.out.println("Current Url is:" + url);
		driver.navigate().back();
		driver.navigate().forward();
		/*
		 * close - close only current window, but if there is only 1 window opened in
		 * browser it will close.
		 */
//		driver.close();
		/*
		 * quit close the entire browser, bcz it kills the driver scope.
		 */
		// driver.quit();

	}
}
