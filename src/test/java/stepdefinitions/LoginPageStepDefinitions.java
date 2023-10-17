package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.BasePage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public  class LoginPageStepDefinitions {
    BasePage basePage =new BasePage();
    LoginPage loginPage=new LoginPage();

    @Given("User sees login text in login table")
    public void userSeesLoginTextInLoginTable() {
        basePage.login_button.click();
        Assert.assertTrue(loginPage.login_table_text.isDisplayed());
    }

    @Given("When User clicks Google button, it opens login page with google account")
    public void whenUserClicksGoogleButtonItOpensLoginPageWithGoogleAccount() {
        basePage.login_button.click();
        loginPage.google_login_button.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("accounts.google"));
        /*loginPage.email_box_google_account.click();
        loginPage.email_box_google_account.sendKeys(ConfigReader.getProperty("ValidUserEmail"));
        ReusableMethods.wait(2);
        loginPage.next_button1.click();
        ReusableMethods.wait(2);
        loginPage.password_box_google_account.click();
        loginPage.password_box_google_account.sendKeys("Amasya05");
        ReusableMethods.wait(2);
        loginPage.next_button2.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(homePage.magicWand_text.isDisplayed());*/



    }

    @Given("When User clicks Twitter button, it opens login page with twitter account")
    public void whenUserClicksTwitterButtonItOpensLoginPageWithTwitterAccount() {
        basePage.login_button.click();
        loginPage.twitter_login_button.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("twitter.com"));

    }

    @Given("When User clicks Discord button, it opens login page with discord account")
    public  void whenUserClicksDiscordButtonItOpensLoginPageWithDiscordAccount() {
        basePage.login_button.click();
        loginPage.discord_login_button.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("discord"));
       /* ReusableMethods.wait(2);
        loginPage.discord_emailbox.click();
        loginPage.discord_emailbox.sendKeys(ConfigReader.getProperty("ValidUserEmail"));
        loginPage.discord_passwordbox.click();
        loginPage.discord_passwordbox.sendKeys(ConfigReader.getProperty("ValidUserPassword"));
        ReusableMethods.wait(2);
        loginPage.discordPageLoginButton.click();
        ReusableMethods.wait(3);
        loginPage.discord_authorize_button.click();
        ReusableMethods.wait(3);
        String actual_title=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actual_title.contains("what"));*/



    }

    @Given("When User clicks Email button, it opens login page with email")
    public void whenUserClicksEmailButtonItOpensLoginPageWithEmail() {
        basePage.login_button.click();
        loginPage.mail_login_button.click();



    }

    @And("User enter a valid email in sendbox and click to  Enter the world of movies button")
    public void userEnterAValidEmailInSendboxAndClickToEnterTheWorldOfMoviesButton() {
        loginPage.maillogin_emailbox.sendKeys("abcdef@gmail.com");
        loginPage.entertheworldofthemovies_button.click();

    }

    @Then("User sees Check your email text")
    public void userSeesCheckYourEmailText() {
        Assert.assertTrue(loginPage.checkyouremail_text.isDisplayed());
    }



}
