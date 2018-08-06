package qa16.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLoginTrello extends TestBase{
@Test
    public void testLogin(){

        app.getSessionHelper().login("", "");



//Assert.assertTrue(app.isElementPresent());
}
}
