import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GiftsTest extends BaseUI {
    String currentUrlGifts;


    @Test
    public void testgliftsflowers() {
        driver.findElement(Locators.LINK_GIFTS).click();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        currentUrlGifts = driver.getCurrentUrl();
        System.out.println(currentUrlGifts);
        Assert.assertEquals(currentUrlGifts, Data.expectedUrlGifts);
        WebElement checkbestSellerTable = driver.findElement(Locators.BEST_SELLERS);
        driver.findElement(By.xpath("//div[contains(@class,'text-overflow')]")).click();



    }
    @Test
    public void testgiftsspa() {
        driver.findElement(Locators.LINK_GIFTS).click();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        currentUrlGifts = driver.getCurrentUrl();
        System.out.println(currentUrlGifts);
        Assert.assertEquals(currentUrlGifts, Data.expectedUrlGifts);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.LINK_SPA).click();




    }
    @Test
    public void testgiftsteddyear() {
        driver.findElement(Locators.LINK_GIFTS).click();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        currentUrlGifts = driver.getCurrentUrl();
        System.out.println(currentUrlGifts);
        Assert.assertEquals(currentUrlGifts, Data.expectedUrlGifts);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.LINK_TEDDYBEAR).click();




    }
}
