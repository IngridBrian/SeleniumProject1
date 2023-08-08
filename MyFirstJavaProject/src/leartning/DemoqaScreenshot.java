package leartning;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoqaScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\HP\\Desktop\\SeleniumSession2\\driver\\chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		/**
		 * Cast your driver to TakesScreenshot Interface
		 * call getScreenshot method and you can recieve a file as an output
		 * copy the file in your desired directory/folder
		 */
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		 File source = screenshot.getScreenshotAs(OutputType.FILE);
		 File dest= new File("C:\\Users\\HP\\git\\SeleniumProject1\\MyFirstJavaProject\\demoschreenshot.png");
		 FileUtils.copyFile(source, dest);
	}

}
