package DropDownExample;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium tutorial\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		
		//1.selectByIndex
		WebElement DropDown1=driver.findElement(By.id("dropdown1"));
		Select select1=new Select(DropDown1);
		select1.selectByIndex(2);
		
		
		//2.selectByVisibleText
		WebElement DropDown2=driver.findElement(By.name("dropdown2"));
		Select select2=new Select(DropDown2);
		select2.selectByVisibleText("Selenium");
		
		
		
		//3.selectByValue
		WebElement DropDown3=driver.findElement(By.id("dropdown3"));
		Select select3=new Select(DropDown3);
		select3.selectByValue("3");
		
		
		
		//4.Get the number of DropDown options
		WebElement DropDown4=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/select"));
		List<WebElement> list_of_options=new Select(DropDown4).getOptions();
		int size=list_of_options.size();
		System.out.println("Numbers of options:"+size);
		
		
		
		//5.Using SendKeys to select
		WebElement DropDown5=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/select"));
		DropDown5.sendKeys("Appium");
		
		
		
		//6.MultiSelection
		WebElement DropDown6=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
		Select multi_select=new Select(DropDown6);
		multi_select.selectByIndex(1);
		multi_select.selectByIndex(2);
		multi_select.selectByIndex(3);
		
		
		
	}
}