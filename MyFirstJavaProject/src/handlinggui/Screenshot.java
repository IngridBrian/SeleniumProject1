package handlinggui;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\HP\\Desktop\\SeleniumSession2\\driver\\chromeDriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.get("https://www.amazon.ca/");

		/**
		 * Cast your driver to TakesScreenshot Interface
		 * call getScreenshot method and you can recieve a file as an output
		 * copy the file in your desired directory/folder
		 */
		
		TakesScreenshot scrshot = (TakesScreenshot) driver;
		// we want screenshot in file
		 File srcfile = scrshot.getScreenshotAs(OutputType.FILE);
		// to get destn: path project-rc-[propert-source]
		File destfile = new File("C:\\Users\\HP\\git\\SeleniumProject1\\MyFirstJavaProject\\amzonscreenshot.png");
		//downloaded apache coomon jar -take in class path
		FileUtils.copyFile(srcfile, destfile);

		driver.quit();

	}
}
