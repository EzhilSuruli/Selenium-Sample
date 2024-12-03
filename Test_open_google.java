package google_excercises;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_open_google {
  public static void main(String[] args) throws InterruptedException
  {
    // Mention here location of downloaded chrome driver path
    System.setProperty("webdriver.chrome.driver","E:\\\\Selenium Learning\\\\chromedriver-win64\\\\chromedriver.exe");
    ChromeDriver driver=new ChromeDriver();
    driver.get("https://www.google.co.in");
    driver.close();
  }
}

