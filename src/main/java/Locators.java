import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Locators {
    //Media page
    public static final By LINK_MEDIA = By.cssSelector("a[href='https://romanceabroad.com/media/index']");

    //Registration
    public static final By BUTTON_REGISTRATION = By.xpath("//button[@id='show-registration-block']");
    public static final By BUTTON_NEXT = By.xpath("//button[@data-action='next-page'][text()='Next']");
    public static final By TEXT_FIELD_EMAIL = By.cssSelector("input#email");
    public static final By TEXT_FIELD_PASSWORD = By.cssSelector("input#password");
    public static final By TEXT_FIELD_NICKNAME = By.cssSelector("#nickname");
    public static final By TEXT_FIELD_PHONE = By.cssSelector("input[name='data[phone]']");

    //Search Page
    public static final By LINK_SEARCH = By.xpath("//a[@href='https://romanceabroad.com/users/search']");
    public static final By DROP_DOWN_LIST_SORT_BY = By.xpath("//div[@class='form-inline']//select");
    public static final By DROP_DOWN_LIST_AGE = By.xpath("//select[@id='age_min']");
    public static final By DROP_DOWN_LIST_AGE2 = By.xpath("//select[@id='age_max']");


    //Blog Page
    public static final By LINK_BLOG = By.cssSelector("a[href='https://romanceabroad.com/content/view/blog']");


    //Flowers Page
    public static final By LINK_GIFTS = By.cssSelector("a[href='https://romanceabroad.com/store/category-sweets']");
    public static final By LINK_FLOWERS = By.cssSelector("a[href='https://romanceabroad.com/store/sweets/12-flower_basket']");
    public static final By BEST_SELLERS = By.cssSelector("#bestsellers-title");
    public static final By LINK_SPA = By.cssSelector("a[href='https://romanceabroad.com/store/sweets/2-massage_spa']");
    public static final By LINK_TEDDYBEAR = By.cssSelector("a[href='https://romanceabroad.com/store/sweets/11-teddy_bear']");

    //How We Work Page
    public static final By LINK_HOW_WE_WORK = By.xpath("//a[@href='https://romanceabroad.com/content/view/how-it-works']");
    public static final By LINK_PRIVACYPOLICY = By.cssSelector("a[href='https://romanceabroad.com/content/view/advertising']");


    //Photos Page
    public static final By LINK_PHOTOS = By.cssSelector("a[href='https://romanceabroad.com/media/index']");
    public static final By DROP_DOWN_LIST_PHOTOS = By.xpath("//select[@class='form-control']");

    //Tour Page
    public static final By LINK_TOUR_TO_UKRAINE = By.cssSelector("a[href='https://romanceabroad.com/store/sweets/20-tour_to_ukraine']");

    //MEDIAPAGE
    public static final By LINK_VIDEO = By.cssSelector("a[href='https://romanceabroad.com/media/video']");
    public static final By LINK_ALBUMS = By.cssSelector("a[href='https://romanceabroad.com/media/albums']");
    public static final By LINK_ALL = By.cssSelector("a[href='https://romanceabroad.com/media/all']");
    public static final By LINK_YOUTUBE = By.xpath("//iFrame[@src='https://www.youtube.com/embed/RRECuJzm3IY?start=85']");


    public static void getDropDownListByIndex (WebElement element, int index){
        Select select = new Select(element);
        select.selectByIndex(index);
    }
    public static void getDropDownListByText (WebElement element, String text){
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }
    public static void getDropDownListByValue (WebElement element, String value) {
        Select select = new Select(element);
        select.selectByValue(value);
    }
    }



