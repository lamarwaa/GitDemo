package myFirstProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver" , "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "http://toolsqa.com/automation-practice-table/" ;
		driver.get(url);
		System.out.println("Hello");
		

		

	}

}
