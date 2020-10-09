import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MediaTest extends BaseUI {
    String currentUrlMedia;


    @Test
    public void mediapage() {
        driver.findElement(Locators.LINK_MEDIA).click();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        currentUrlMedia = driver.getCurrentUrl();
        System.out.println(currentUrlMedia);
        Assert.assertEquals(currentUrlMedia, Data.expectedUrlMedia);

    }

    @Test
    public void mediapage2() {
        driver.findElement(Locators.LINK_PHOTOS).click();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        currentUrlMedia = driver.getCurrentUrl();
        System.out.println(currentUrlMedia);
        Assert.assertEquals(currentUrlMedia, Data.expectedUrlMedia);
    }
}
