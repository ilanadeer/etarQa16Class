package com.tran.qa16.manager;

import com.tran.qa16.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GroupHelper extends HelperBase {

    public GroupHelper(WebDriver wd) {
        super(wd);

    }

    public void returnToGroupsPage() {
        click(By.linkText("group page"));
    }



    public void groupDeletion() {
        click(By.name("delete"));
    }

    public void selectGroup() {
        click(By.name("selected[]"));
    }

    public void selectGroupByIndex(int ind) {
        wd.findElements(By.name("selected[]")).get(ind).click();
     //  wd.findElements(By.name("selected[]")).get(ind).click();
    }

    public void goToGroupsPage() {
        if(!isElementPresent(By.xpath("//h1[contains(text(),'Groups')]"))
                && !isElementPresent(By.name("new"))){
            click(By.cssSelector("[href='group.php']"));
        }
    }

    public void confirmGroupModification() {
        click(By.name("update"));
    }

    public void fillGroupForm(GroupData group) {
        type(By.name("group_name"), group.getGroupName());
        type(By.name("group_header"), group.getGroupHeader());
        type(By.name("group_footer"), group.getGroupFooter());
    }

       public void initGroupModification() {
        click(By.xpath("//*[@name='edit'][2]"));
    }

    public void confirmGroupCreation() {
        click(By.name("submit"));
    }

    public void initGroupCreation() {
        click(By.xpath("//*[@value='New group'][2]"));
    }

    public int getGroupsCount() {
        return wd.findElements(By.cssSelector("span.group")).size();
    }

    public  boolean isGroupPresent(){
        return isElementPresent(By.name("selected[]"));
    }

    public void createGroup(){
        initGroupCreation();
        fillGroupForm(
                new GroupData()
                        .setGroupName("TestGroupName1")
                        .setGroupHeader("TestGroupHeader1")
                        .setGroupFooter("TestGroupFooter1"));
        confirmGroupCreation();
        returnToGroupsPage();
    }

}
