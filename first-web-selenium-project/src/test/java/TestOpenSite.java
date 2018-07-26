import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestOpenSite {
    WebDriver driver;

    @BeforeMethod
   public void setUp(){

       driver = new ChromeDriver();



   }

   @Test
   public void openSiteTest(){
       driver.get("https://trello.com/");

       driver.findElement(By.id("query"));

       driver.findElements(By.name("selected"));



   }

   @AfterMethod
   public  void tearDown(){
       driver.quit();
   }


}
