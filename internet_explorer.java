package google_excercises;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class internet_explorer {
  public static void main(String[] args)
  {
    // Mention here downloaded path of IEDriverServer.exe path
    System.setProperty("webdriver.ie.driver","E:\\Selenium Learning\\IEDriverServer.exe");
    InternetExplorerDriver driver=new InternetExplorerDriver();
    driver.get("https://www.google.co.in");
    driver.close();
  }
}
