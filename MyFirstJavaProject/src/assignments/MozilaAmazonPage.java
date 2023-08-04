package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MozilaAmazonPage {
	static WebDriver driver;

	public static void main(String[] args) {

//		System.setProperty("Webdriver.firefox.driver",
//				"C:\\Users\\HP\\Desktop\\SeleniumSession2\\driver\\geckodriver.exe");
		System.setProperty("Webdriver.geckodriver.driver",
				"C:\\Users\\HP\\Desktop\\SeleniumSession2\\moz drive 64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		String title = driver.getTitle();
		System.out.println("title of page is " + title);
		String url = driver.getCurrentUrl();
		System.out.println("url is:" + url);
//		String ps=driver.getPageSource();
//		System.out.println("ps is:" + ps);

		driver.close();

	}
}
