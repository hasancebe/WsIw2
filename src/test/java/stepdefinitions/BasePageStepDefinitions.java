package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.BasePage;
import utilities.Driver;
import utilities.ReusableMethods;
import static stepdefinitions.Hooks.open_website;
import static stepdefinitions.Hooks.teardown;
public class BasePageStepDefinitions {
    BasePage basePage =new BasePage();


    @Given("User goes to What should I watch webpage")
    public static void userGoesToWhatShouldIWatchWebpage() {
        open_website();
    }


    @And("Close all drivers")
    public void closeAllDrivers() {
        teardown();
    }




    @And("Title appears to be What should I watch")
    public void titleAppearsToBeWhatShouldIWatch() {
        String expected_title="What should I watch";
        String actual_title=Driver.getDriver().getTitle();
        Assert.assertEquals(actual_title,expected_title);
    }

    @Given("User clicks on the What should I watch button and access the main page.")
    public void userClicksOnTheWhatShouldIWatchButtonAndAccessTheMainPage() {
        basePage.homepage_button.click();
        String expected_Url="https://what-should-i-watch.vercel.app/";
        String actual_Url=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actual_Url,expected_Url);
    }

    @Given("User clicks the Login button, the login page opens")
    public void userClicksTheLoginButtonTheLoginPageOpens() {
        basePage.login_button.click();
        Assert.assertTrue(basePage.login_table.isDisplayed());
        ReusableMethods.wait(2);
    }

    @Given("User clicks the Get started button, the login page opens")
    public void userClicksTheGetStartedButtonTheLoginPageOpens() {

        basePage.homepage_button.click();
        ReusableMethods.wait(1);
        basePage.getStarted_button.click();
        Assert.assertTrue(basePage.login_table.isDisplayed());
        ReusableMethods.wait(2);

    }
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    @Given("User clicks Get started button at end of the page, the login page opens")
    public void userClicksGetStartedButtonAtEndOfThePageTheLoginPageOpens() {
        basePage.homepage_button.click();

        js.executeScript("window.scrollBy(0, 1000);");

        basePage.getGetStarted_sub_button.click();
        ReusableMethods.wait(1);
        Assert.assertTrue(basePage.login_table.isDisplayed());
        ReusableMethods.wait(2);

    }

    @Given("User clicks the Contact Us button, the relevant page opens")
    public void userClicksTheContactUsButtonTheRelevantPageOpens() {
        basePage.contactUs_button.click();
        ReusableMethods.wait(2);
        String expected_Url="https://what-should-i-watch.vercel.app/contact-us";
        String actual_Url=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actual_Url,expected_Url);
    }

    @And("User clicks the Privacy Policy button, the relevant page opens")
    public void userClicksThePrivacyPolicyButtonTheRelevantPageOpens() {
       basePage.privacypolicy_button.click();
        String expected_Url="https://what-should-i-watch.vercel.app/privacy-policy";
        String actual_Url=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actual_Url,expected_Url);
    }

    @Then("User clicks the Term Of Use button, the relevant page opens")
    public void userClicksTheTermOfUseButtonTheRelevantPageOpens() {
        basePage.TermOfUse_button.click();
        String expected_Url="https://what-should-i-watch.vercel.app/termsof-use";
        String actual_Url=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actual_Url,expected_Url);
    }

    @Given("Find Your Perfect Movie Match title and alt text should be visible")
    public void findYourPerfectMovieMatchTitleAndAltTextShouldBeVisible() {
        Assert.assertTrue(basePage.FindYourPerfectMovieMatch_header.isDisplayed());
        Assert.assertTrue(basePage.FindYourPerfectMovieMatch_text.isDisplayed());
        js.executeScript("window.scrollBy(0, 200);");

    }

    @And("Movies Mirroring Your Emotions title sub-text and related image should be visible")
    public void moviesMirroringYourEmotionsTitleSubTextAndRelatedImageShouldBeVisible() {
        Assert.assertTrue(basePage.MoviesMirroringYourEmotions_header.isDisplayed());
        Assert.assertTrue(basePage.MoviesMirroringYourEmotions_text.isDisplayed());
        Assert.assertTrue(basePage.MoviesMirroringYourEmotions_image.isDisplayed());
        js.executeScript("window.scrollBy(0, 200);");

    }

    @And("Curated Movie Collections title sub-text and related image should be visible")
    public void curatedMovieCollectionsTitleSubTextAndRelatedImageShouldBeVisible() {
        Assert.assertTrue(basePage.CalendarandWatchlistFeatures_header.isDisplayed());
        Assert.assertTrue(basePage.CalendarandWatchlistFeatures_text.isDisplayed());
        Assert.assertTrue(basePage.CalendarandWatchlistFeatures_image.isDisplayed());
        js.executeScript("window.scrollBy(0, 200);");



    }

    @And("Calendar and Watchlist Features title sub-text and related image should be visible")
    public void calendarAndWatchlistFeaturesTitleSubTextAndRelatedImageShouldBeVisible() {
        Assert.assertTrue(basePage.CalendarandWatchlistFeatures_header.isDisplayed());
        Assert.assertTrue(basePage.CalendarandWatchlistFeatures_text.isDisplayed());
        Assert.assertTrue(basePage.CalendarandWatchlistFeatures_image.isDisplayed());
        js.executeScript("window.scrollBy(0, 200);");


    }

    @Then("Direct Streaming Links title sub-text and related image should be visible")
    public void directStreamingLinksTitleSubTextAndRelatedImageShouldBeVisible() {
        Assert.assertTrue(basePage.DirectStreamingLinks_header.isDisplayed());
        Assert.assertTrue(basePage.DirectStreamingLinks_text.isDisplayed());
        Assert.assertTrue(basePage.DirectStreamingLinks_image.isDisplayed());
        js.executeScript("window.scrollBy(0, 400);");

    }

    @And("Ready to discover hidden gems that you've never heard of before text should be visible")
    public void readyToDiscoverHiddenGemsThatYouVeNeverHeardOfBeforeTextShouldBeVisible() {
        Assert.assertTrue(basePage.Readytodiscoverhiddengemsthatyouveneverheardofbefore_text.isDisplayed());

    }

    @Given("User sees answers when clicking on the questions in the FAQ section")
    public void userSeesAnswersWhenClickingOnTheQuestionsInTheFAQSection() {
        js.executeScript("window.scrollBy(0, 500);");
        basePage.firstQuestion.click();
        Assert.assertTrue(basePage.firstAnswer.isDisplayed());
        basePage.secondQuestion.click();
        Assert.assertTrue(basePage.secondAnswer.isDisplayed());
        basePage.thirdQuestion.click();
        Assert.assertTrue(basePage.thirdAnswer.isDisplayed());
        basePage.forthQuestion.click();
        Assert.assertTrue(basePage.forthAnswer.isDisplayed());
        basePage.fifthQuestion.click();
        Assert.assertTrue(basePage.fifthAnswer.isDisplayed());
        basePage.sixthQuestion.click();
        Assert.assertTrue(basePage.sixthAnswer.isDisplayed());
    }
    @Given("User goes to What should I watch homepage")
    public void userGoesToWhatShouldIWatchHomepage() {
        String expected_Url="https://what-should-i-watch.vercel.app/";
        String actual_Url=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actual_Url,expected_Url);

    }


}
