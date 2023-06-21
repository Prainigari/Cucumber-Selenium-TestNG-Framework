package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import javax.xml.xpath.XPath;

public class AmazonLogin {
    public AmazonLogin(WebDriver webDriver) {
        PageFactory.initElements(new AjaxElementLocatorFactory(webDriver, 15), this);
    }
    @FindBy (xpath="//a[@id='nav-hamburger-menu']")
   public WebElement Hamburger;
    @FindBy(xpath= "//div[text()='TV, Appliances, Electronics']")
    public WebElement Electronics;
    @FindBy (xpath = "//a[text()='Televisions']")
    public WebElement TV;
    @FindBy (xpath= "//span[text()='Top Brands']")
    public WebElement TopBrands;
    @FindBy (xpath ="//span[text()='Samsung']")
    public WebElement Samsung;
     @FindBy (xpath = "//span[text()='Featured']")
     public WebElement SortbyFeatured;

     @FindBy (xpath = "//a[text()='Price: High to Low']")
     public WebElement HightoLow;
     @FindBy (xpath = "//span[@data-component-type='s-search-results']//img[@data-image-index=2]")
     public WebElement SecondHighestPriceTV;
    @FindBy (xpath = "//h1[normalize-space(text()) ='About this item']")
    public WebElement AboutThisItem;
}

