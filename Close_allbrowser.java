package google_excercises;


import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 class Close_allbrowser 
{
  public static void main(String[] args)
  {
    WebDriver driver=new ChromeDriver();
    driver.get("http://www.timesofindia.indiatimes.com//");
    Set<String> allWH=driver.getWindowHandles();
    int count=allWH.size();
    System.out.println(count);
    for(String wh:allWH)
    {
      driver.switchTo().window(wh);
      String title=driver.getTitle();
      System.out.println(title);
      driver.close();
    }
  }
}
