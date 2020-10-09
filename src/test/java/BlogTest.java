import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BlogTest extends BaseUI {
    String currentUrlBlog;


    @Test
    public void testblog() {
        driver.findElement(Locators.LINK_BLOG).click();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        currentUrlBlog = driver.getCurrentUrl();
        System.out.println(currentUrlBlog);
        Assert.assertEquals(currentUrlBlog, Data.expectedUrlBlog);

    }
}