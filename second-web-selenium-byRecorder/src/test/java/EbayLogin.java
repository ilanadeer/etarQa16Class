import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class EbayLogin {

    private WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setUp(){
        driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void eBayLoginTest(){
        //driver.get///

    }



    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        // Thread.sleep(3000);
        driver.quit();
    }
}
