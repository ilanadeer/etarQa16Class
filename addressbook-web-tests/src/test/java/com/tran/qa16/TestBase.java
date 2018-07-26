package com.tran.qa16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver wd;

    @BeforeClass
    public void setUp(){
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        wd.navigate().to("http://localhost/addressbook");

        wd.findElement(By.name("user")).click();
        wd.findElement(By.name("user")).clear();
        wd.findElement(By.name("user")).sendKeys("admin");

        wd.findElement(By.name("pass")).click();
        wd.findElement(By.name("pass")).clear();
        wd.findElement(By.name("pass")).sendKeys("secret");

    //click on the button login
        wd.findElement(By.xpath("//*[@value='Login']")).click();
    }

    @AfterClass
    public void tearDown(){
        wd.quit();
    }

    public void returnToGroupsPage() {
        wd.findElement(By.linkText("group page")).click();
    }

    public void groupDeletion() {
        wd.findElement(By.name("delete")).click();
    }

    public void selectGroup() {
        wd.findElement(By.name("selected[]")).click();
    }
    public void selectGroupByIndex(int ind) {
       wd.findElements(By.name("selected[]")).get(ind).click();
    }

    public void goToGroupsPage() {
        wd.findElement(By.cssSelector("[href='group.php']")).click();
    }


    public void confirmGroupModification() {
        wd.findElement(By.name("update")).click();
    }

    public void fillGroupForm(GroupData group) {
        wd.findElement(By.name("group_name")).click();
        wd.findElement(By.name("group_name")).clear();
        wd.findElement(By.name("group_name")).sendKeys(group.getGroupName());

        wd.findElement(By.name("group_header")).click();
        wd.findElement(By.name("group_header")).clear();
        wd.findElement(By.name("group_header")).sendKeys(group.getGroupHeader());

        wd.findElement(By.name("group_footer")).click();
        wd.findElement(By.name("group_footer")).clear();
        wd.findElement(By.name("group_footer")).sendKeys(group.getGroupFooter());
    }

    public void initGroupModification() {
        wd.findElement(By.xpath("//*[@name='edit'][2]")).click();
    }

    public void confirmGroupCreation() {
        wd.findElement(By.name("submit")).click();
    }

    public void initGroupCreation() {
        wd.findElement(By.xpath("//*[@value='New group'][2]")).click();
    }

    public int getGroupsCount() {
        return wd.findElements(By.cssSelector("span.group")).size();
    }
}
