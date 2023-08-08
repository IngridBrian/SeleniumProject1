package basicSeleProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DifBrowser {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browser = "chrome";
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\HP\\Desktop\\SeleniumSession2\\driver\\chromeDriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\HP\\Desktop\\SeleniumSession2\\driver\\msedgedriver.exe");
			driver = new EdgeDriver();

		}
		driver.manage().window().maximize();
		driver.get("https://www.obsqurazone.com/");
//		String pagesource = driver.getPageSource();
//		System.out.println(pagesource);
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
	}

}
