package AutoComplete_Example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium tutorial\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		
		//Using autocomplete select the text
		WebElement input=driver.findElement(By.id("tags"));
		input.sendKeys("s");
		synchronized (driver) {
			try {
				driver.wait(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		List<WebElement> option_List=driver.findElements(By.xpath("//*[@id=\"ui-id-1\"]/li"));
		
		for (WebElement webElement : option_List) {
			if(webElement.getText().equals("Selenium"))
			{
				webElement.click();
				System.out.println("Successfully selected text");
				break;
			}
			else 
			{
				System.out.println("else part");
			}
		}
		
		
		
	}

}
