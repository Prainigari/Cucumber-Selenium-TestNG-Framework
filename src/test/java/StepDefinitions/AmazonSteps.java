package StepDefinitions;

import PageObjects.AmazonLogin;
import Utilities.TestContext;
import io.cucumber.java.en.Given;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AmazonSteps {
    TestContext testContext;
    AmazonLogin amazonLogin;

    public AmazonSteps(TestContext context) {
        testContext = context;
        amazonLogin = testContext.getPageObjectManager().getAmazonLogin();
    }

    @Given("I click on Hamburger link")
    public void i_click_on_Hamburgerlink() {
    amazonLogin.Hamburger.click();
    }
    @Given("I click on Electronics link")
    public void i_click_on_Electronicslink() {
        // Write code here that turns the phrase above into concrete actions
      amazonLogin.Electronics.click();

    }
    @Given("I click on TV link")
    public void i_click_on_button() {
        // Write code here that turns the phrase above into concrete actions
        amazonLogin.TV.click();
    }
    @Given("I click on TopBrands checkbox")
    public void i_click_on_TopBrandscheckbox() {
        // Write code here that turns the phrase above into concrete actions
        amazonLogin.TopBrands.click();
    }
    @Given("I click on Samsung checkbox")
    public void i_click_on_Samsung() {
        // Write code here that turns the phrase above into concrete actions
        amazonLogin.Samsung.click();
    }
    @Given("I click on SortbyFeatured button")
    public void i_click_on_SortbyFeaturedbutton() {
        // Write code here that turns the phrase above into concrete actions
        amazonLogin.SortbyFeatured.click();
    }
    @Given("I click on HightoLow option")
    public void i_click_on_HightoLowoption() {
        // Write code here that turns the phrase above into concrete actions
        amazonLogin.HightoLow.click();
    }

    @Given("I click on SecondHighestPriceTV option")
    public void i_click_on_SecondHighestPriceTV() {
        // Write code here that turns the phrase above into concrete actions
        amazonLogin.SecondHighestPriceTV.click();
    }
    @Given("I switch to new tab")
    public void i_switch_to_new_tab() {
        // Write code here that turns the phrase above into concrete actions
        String CurrentWindow = testContext.getDriverManager().getDriver().getWindowHandle();
        Set listofwindows = testContext.getDriverManager().getDriver().getWindowHandles();
        Iterator itr= listofwindows.iterator();
        while (itr.hasNext()){
            String mainwindow = (String) itr.next();
            if (!(CurrentWindow == mainwindow)){
                testContext.getDriverManager().getDriver().switchTo().window(mainwindow);

            }

        }
    }
    @Given("I verify AboutThisItem element exists")
    public void i_verify_element_exists() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(amazonLogin.AboutThisItem.isDisplayed(), "element does not exists");
    }
}
