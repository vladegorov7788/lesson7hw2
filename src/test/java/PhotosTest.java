import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class PhotosTest extends BaseUI {
    String currentUrlPhotos;


    @Test
    public void testPhotos() {
        driver.findElement(Locators.LINK_PHOTOS).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        currentUrlPhotos = driver.getCurrentUrl();
        System.out.println(currentUrlPhotos);
        Assert.assertEquals(currentUrlPhotos, Data.expectedUrlPhotos);

    }
}
