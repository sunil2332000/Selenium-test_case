package DragAndDrop_Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium tutorial\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/drop.html");
		
		//1.Drag and drop
		WebElement From_Drag=driver.findElement(By.id("draggable"));
		WebElement To_Drop=driver.findElement(By.id("droppable"));
		
		Actions action1=new Actions(driver);
		
		action1.dragAndDrop(From_Drag,To_Drop).build().perform();
		//action1.clickAndHold(From_Drag).moveToElement(To_Drop).release(To_Drop).build().perform();
				
		

	}

}
