import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SearchTest extends BaseUI {
    String currentUrlSearch;


@Test
    public void searchpage3() {
        driver.findElement(Locators.LINK_SEARCH).click();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, Data.expectedUrlSearch);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Select select = new Select(driver.findElement(By.xpath("//div[@class='form-inline']//select")));
        select.selectByValue("date_created");

    }
@Test
    public void searchpage4() {
        driver.findElement(Locators.LINK_SEARCH).click();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, Data.expectedUrlSearch);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Select select = new Select(driver.findElement(By.xpath("//div[@class='form-inline']//select")));
        select.selectByIndex(3);

    }
    @Test
    public void searchpageage() {
        driver.findElement(Locators.LINK_SEARCH).click();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, Data.expectedUrlSearch);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /*Select select = new Select(driver.findElement(By.xpath("//div[@class='form-inline']//select")));
        select.selectByValue("date_created");*/

        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
    Locators.getDropDownListByText(dropDownListSortBy,"Views");

    }
    @Test
    public void searchpageage2() {
        driver.findElement(Locators.LINK_SEARCH).click();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, Data.expectedUrlSearch);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /*Select select = new Select(driver.findElement(By.xpath("//div[@class='form-inline']//select")));
        select.selectByValue("date_created");*/

        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
    Locators.getDropDownListByIndex(dropDownListSortBy,1);

    }






















    public static void getDropDownListByValue (WebElement element, String value) {
        Select select = new Select(element);
        select.selectByValue(value);
    }
}


