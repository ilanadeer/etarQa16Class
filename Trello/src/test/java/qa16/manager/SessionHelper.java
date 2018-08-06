package qa16.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends  HelperBase{

    public SessionHelper(WebDriver wd) {
        super(wd);
    }

    public void openSite(String url) {
        wd.navigate().to(url);
    }

    public void login(String userName, String password) {
       type(By.id("user"),userName);
       type(By.id("password"),password);

        //click on the button login
        click(By.id("login"));
    }

//    public void fillNameField(String name){
//
//    }
}
