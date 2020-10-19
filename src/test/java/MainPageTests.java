import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class MainPageTests extends BaseUI {

    @Test
    public void mainPageTests() {
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        WebElement ele = driver.findElement(Locators.LINK_YOUTUBE);
        driver.switchTo().frame(ele);
        driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button']")).click();

        //   driver.switchTo().frame("fm");

    }
}
