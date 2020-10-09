import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class MainPageTests extends BaseUI {

        @Test
        public void mainpagetests() {
            driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
            WebElement ele = driver.findElement(Locators.LINK_YOUTUBE);

            driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button']")).click();

        }
    }
