package Link_example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_links  {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium tutorial\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//open leafground
		//Go to Home Page
		driver.get("http://www.leafground.com/pages/Link.html");
		driver.findElement(By.linkText("Go to Home Page")).click();
	}
}