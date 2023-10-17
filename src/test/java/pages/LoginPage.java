package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy (xpath="/html/body/section/main/section/div/div/div/p")
    public WebElement login_table_text;

    @FindBy(xpath="/html/body/section/main/section/div/div/div/div[2]/button[1]")
    public  WebElement google_login_button;
    @FindBy (xpath = "//*[@id=\"identifierId\"]")
    public WebElement email_box_google_account;
    @FindBy(id = "identifierNext")
    public WebElement next_button1;
    @FindBy(id = "password")
    public  WebElement password_box_google_account;
    @FindBy(id = "passwordNext")
    public WebElement next_button2;

    @FindBy(xpath="/html/body/section/main/section/div/div/div/div[2]/button[2]")
    public  WebElement twitter_login_button;
    @FindBy(xpath="/html/body/section/main/section/div/div/div/div[2]/button[3]")
    public  WebElement discord_login_button;
    @FindBy(id = "uid_6")
    public WebElement discord_emailbox;
    @FindBy(id = "uid_8")
    public WebElement discord_passwordbox;
    @FindBy(xpath = "//*[@id=\"app-mount\"]/div[2]/div[1]/div[1]/div/div/div/div/form/div[2]/div/div[1]/div[2]/button[2]")
    public WebElement discordPageLoginButton;
    @FindBy(xpath = "//*[@id=\"app-mount\"]/div[2]/div[1]/div[1]/div/div/div/div/div/div[2]/button[2]")
    public WebElement discord_authorize_button;
    @FindBy(xpath="/html/body/section/main/section/div/div/div/div[2]/a/button")
    public  WebElement mail_login_button;
    @FindBy(css="input#email")
    public WebElement maillogin_emailbox;
    @FindBy(xpath="/html/body/section/main/section/div/div/div/form/button")
    public WebElement entertheworldofthemovies_button;
    @FindBy(xpath = "/html/body/section/main/section/div/div/div/div/h1")
    public WebElement checkyouremail_text;
//
}
