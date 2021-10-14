package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FireFoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBrowser {

	public static String browser = "chrome";
	public static WebDriver driver;

	public static void main(String[] args) {

		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FireFoxDriver();
		} else if (browser.equals("ie")) {
			driver = new InternetExplorerDriver();
		}

		WebDriver driver = new FireFoxDriver();
		driver.get("http://google.com");
		driver.getTitle();
		driver.click();
		driver.senKeys();

	}

}
