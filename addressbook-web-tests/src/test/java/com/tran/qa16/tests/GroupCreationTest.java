package com.tran.qa16.tests;

import com.tran.qa16.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupCreationTest  extends TestBase {
    @Test
    public  void testGroupCreation(){
        app.getGroupHelper().goToGroupsPage();
        int before = app.getGroupHelper().getGroupsCount();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(
                new GroupData()
                        .setGroupName("TestGroupName1")
                        .setGroupHeader("TestGroupHeader1")
                        .setGroupFooter("TestGroupFooter1"));
        app.getGroupHelper().confirmGroupCreation();
        app.getGroupHelper().returnToGroupsPage();
        int after = app.getGroupHelper().getGroupsCount();

        Assert.assertEquals(after, before+1);
    }


}
