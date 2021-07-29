package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Opengoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.open chrome
		//2.google home page
		System.setProperty("webdriver.chrome.driver", "D:\\selenium tutorial\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.co.in");
		String google;
		google=driver.getTitle();
		System.out.println(google);

	}

}

