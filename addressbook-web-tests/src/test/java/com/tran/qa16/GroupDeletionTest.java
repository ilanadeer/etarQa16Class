package com.tran.qa16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GroupDeletionTest extends TestBase {
    @Test
    public void test1(){
        goToGroupsPage();
        int before = getGroupsCount();
        selectGroupByIndex(before-1);
        groupDeletion();
        returnToGroupsPage();
        int after = getGroupsCount();

        Assert.assertEquals(after, before-1);
    }

}
