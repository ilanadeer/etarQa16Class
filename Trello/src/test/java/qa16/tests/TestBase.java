package qa16.tests;

import qa16.manager.ApplicationManager;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

   protected static ApplicationManager app = new ApplicationManager();

    @BeforeSuite
    public void setUp(){
        app.start();

    }

    @AfterSuite
    public void tearDown(){
        app.stop();
    }


}
