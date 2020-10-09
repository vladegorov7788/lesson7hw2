import org.testng.Assert;
import org.testng.annotations.Test;

public class TourToUkraineTest extends BaseUI {
    String currentUrlTourToUkraine;



    @Test
    public void testtourtoukraine() {
        driver.findElement(Locators.LINK_TOUR_TO_UKRAINE).click();
        currentUrlTourToUkraine = driver.getCurrentUrl();
        System.out.println(currentUrlTourToUkraine);
        Assert.assertEquals(currentUrlTourToUkraine, Data.expectedUrlTourToUkraine);

    }
}
