package Selectable_Example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium tutorial\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		
		//1.Find size of selectable_lists
		List<WebElement> selectable=driver.findElements(By.xpath("//*[@id=\"selectable\"]/li"));
		int list_size=selectable.size();
		System.out.println(list_size);
		
		//2.Select all selectable_lists
		
		/*Actions action=new Actions(driver);
		action.keyDown(Keys.CONTROL)
		.click(selectable.get(0))
		.click(selectable.get(1))
		.click(selectable.get(2))
		.click(selectable.get(3))
		.click(selectable.get(4))
		.click(selectable.get(5))
		.click(selectable.get(6))
		.build().perform();*/
		
		Actions action=new Actions(driver);
		action.clickAndHold(selectable.get(0));
		action.clickAndHold(selectable.get(1));	
		action.clickAndHold(selectable.get(2));
		action.clickAndHold(selectable.get(3));
		action.clickAndHold(selectable.get(4));
		action.clickAndHold(selectable.get(5));
		action.clickAndHold(selectable.get(6));
		action.build().perform();
		
		
		
		
		

	}

}
