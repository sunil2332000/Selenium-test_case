package google_search;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;


public class Findingwebelement {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium tutorial\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.co.in");
		//enter a search term
		
		driver.findElement(By.name("q")).sendKeys("prithvi missile" + Keys.ENTER);
		driver.get("https://en.wikipedia.org ");
		driver.findElement(By.linkText("Prithvi (missile) - Wikipedia")).click();
		
		
		//driver.quit();
	}
}