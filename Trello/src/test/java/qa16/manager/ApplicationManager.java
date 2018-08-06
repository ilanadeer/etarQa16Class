package qa16.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    SessionHelper sessionHelper;

    private WebDriver wd;

    public void start() {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        sessionHelper= new SessionHelper(wd);
        sessionHelper.openSite("https://trello.com");
      //  sessionHelper.login("admin", "secret");

    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }

    public void stop() {
        wd.quit();
    }

    public boolean isElementPresent(By locator) {
        try {
            wd.findElement(locator);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public  boolean isElementsPresent(By locator){
        return wd.findElements(locator).size()>0;
    }



    public SessionHelper getSessionHelper() {
        return sessionHelper;
    }
}
