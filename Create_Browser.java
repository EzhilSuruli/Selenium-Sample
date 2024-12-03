package google_excercises;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Create_Browser
{
  public static void main(String[] args)
  {
    try (var sc = new Scanner(System.in)) {
		System.out.println("Enter browser?GC/FF/IE");
		String browser=sc.next();
		WebDriver driver;
		
		if(browser.equals("GC"))
		{
		  System.setProperty("webdriver.chrome.driver","E:\\\\\\\\\\\\\\\\Selenium Learning\\\\\\\\\\\\\\\\chromedriver-win64\\\\\\\\\\\\\\\\chromedriver.exe");
		  driver=new ChromeDriver();
		}
		
		else if(browser.equals("IE"))
		{
		  System.setProperty("webdriver.ie.driver","E:\\\\\\\\\\\\\\\\Selenium Learning\\\\\\\\\\\\\\\\chromedriver-win64\\\\\\\\\\\\\\\\chromedriver.exe");
		  driver=new InternetExplorerDriver();
		}

		else
		{
		  driver=new FirefoxDriver();
		}
		
		driver.get("https://www.google.co.in");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}
  }
}
