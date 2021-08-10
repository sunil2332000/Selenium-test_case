package ToolTip_Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class ToolTip_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium tutorial\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/tooltip.html");

		//1.get attribute text from tooltip
		WebElement tooltipText=driver.findElement(By.id("age"));
		String getText=tooltipText.getAttribute("title");
		System.out.println(getText);
	}

}
