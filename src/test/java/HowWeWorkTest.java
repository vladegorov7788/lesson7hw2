import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HowWeWorkTest extends BaseUI {
    String currentUrlHowWeWork;


    @Test
    public void testHowWeWork() {
        driver.findElement(Locators.LINK_HOW_WE_WORK).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        currentUrlHowWeWork = driver.getCurrentUrl();
        System.out.println(currentUrlHowWeWork);
        Assert.assertEquals(currentUrlHowWeWork, Data.expectedUrlHowWeWork);

    }

}
