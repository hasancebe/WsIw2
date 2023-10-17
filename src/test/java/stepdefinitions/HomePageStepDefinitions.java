package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.HomePage;
import utilities.ConfigReader;
import org.junit.Assert;
import utilities.Driver;
import utilities.ReusableMethods;

public class HomePageStepDefinitions {
    HomePage homePage=new HomePage();

    @And("Login WhatshouldIwatch website")
    public void loginWhatshouldIwatchWebsite() {
        Hooks.login_website();
    }
    //

    @Given("Clicking the Home button opens the home page")
    public void clickingTheHomeButtonOpensTheHomePage() {
        homePage.home_button.click();
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),"https://what-should-i-watch.vercel.app/app");
    }

    @And("Clicking the Profile button opens the profile page")
    public void clickingTheProfileButtonOpensTheProfilePage() {
        homePage.profile_button.click();
        ReusableMethods.wait(2);
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),"https://what-should-i-watch.vercel.app/profile");
        homePage.goBackHome_button.click();
        ReusableMethods.wait(1);
    }

    @And("Clicking the History button opens the history page")
    public void clickingTheHistoryButtonOpensTheHistoryPage() {
        homePage.history_button.click();
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),"https://what-should-i-watch.vercel.app/app/history");
        ReusableMethods.wait(1);
    }

    @And("Clicking the Settings button opens the settings page")
    public void clickingTheSettingsButtonOpensTheSettingsPage() {
        homePage.settings_button.click();
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),"https://what-should-i-watch.vercel.app/settings");
        ReusableMethods.wait(1);
        homePage.goBackHome_button.click();
    }

    @And("Clicking the logout button opens the base page")
    public void clickingTheLogoutButtonOpensTheBasePage() {
        homePage.logout_button.click();
        ReusableMethods.wait(2);
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),"https://what-should-i-watch.vercel.app/");
    }



    @Given("User enters a phrase in the search box")
    public void userEntersAPhraseInTheSearchBox() {
        homePage.searchbox.sendKeys("ghost");
        ReusableMethods.wait(2);
        homePage.searchbox_submit.click();
    }

    @Given("User clicks Magic Wand button")
    public void userClicksMagicWandButton() {
        homePage.magicWand_text.click();
       ReusableMethods.wait(3);
    }

    @And("User sees a suggestion sentence for search")
    public void userSeesASuggestionSentenceForSearch() {
        Assert.assertTrue(!(homePage.searchbox.getText().contains("Find your next movie..."))&& (homePage.searchbox.getText()!=null));

    }
}
