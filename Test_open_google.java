package google_excercises;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_open_google {
  public static void main(String[] args) throws InterruptedException {
    // Mention here location of a downloaded chrome driver path
    System.setProperty("webdriver.chrome.driver","//Users//ezhilnishanthan//Downloads//chromedriver-mac-arm64//chromedriver");
    ChromeDriver driver=new ChromeDriver();
    driver.get("https://www.google.co.in");
    // Adding a sleep:test commit
    Thread.sleep(3000);
    driver.close();
  }
}

