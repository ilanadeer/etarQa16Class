package com.tran.qa16;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupCreationTest  extends TestBase {
    @Test
    public  void testGroupCreation(){
        goToGroupsPage();
        int before = getGroupsCount();
        initGroupCreation();
        fillGroupForm(
                new GroupData()
                        .setGroupName("TestGroupName1")
                        .setGroupHeader("TestGroupHeader1")
                        .setGroupFooter("TestGroupFooter1"));
        confirmGroupCreation();
        returnToGroupsPage();
        int after = getGroupsCount();

        Assert.assertEquals(after, before+1);
    }


}
