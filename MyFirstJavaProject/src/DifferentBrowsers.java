import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DifferentBrowsers {
	static WebDriver driver;

	public static void main(String[] args) {

		String browser = "edge";
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\HP\\Desktop\\SeleniumSession2\\driver\\chromeDriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {

			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\HP\\Desktop\\SeleniumSession2\\driver\\msedgedriver.exe");
			driver = new EdgeDriver();
		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.firefox.driver",
					"C:\\Users\\HP\\Desktop\\SeleniumSession2\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.out.println("please select correct driver");
		}

		driver.manage().window().maximize();
		driver.get("https://www.obsqurazone.com/");
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
		driver.close();
	}

}
