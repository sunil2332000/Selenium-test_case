<<<<<<< HEAD:src/google_search/Findingwebelement.java
package google_search;
=======
package webelement;
>>>>>>> 5e0ab643eb223b700df68a19924d284959c73ec2:src/webelement/Findingwebelement.java

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
		//click the wikipedia link
		driver.findElement(By.name("q")).sendKeys("prithvi missile" + Keys.ENTER);
		driver.get("https://en.wikipedia.org ");
		driver.findElement(By.linkText("Prithvi (missile) - Wikipedia")).click();
		
		
		//driver.quit();
	}
}
