package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);}
        
    @FindBy(css = "header > a:nth-child(2) > button")
    public WebElement login_button;

    @FindBy(css="main > section > div > div")
    public  WebElement login_table;

    @FindBy(css="div > div.ml-3.mt-4.hidden.text-3xl.font-bold.sm\\3a block")
    public WebElement homepage_button;


    @FindBy(css="div.hero-padding.container.mx-auto.flex.h-full.flex-col.items-center.justify-center.p-4.text-center > a > button")
    public  WebElement getStarted_button;

    @FindBy(css="div:nth-child(7) > div > a > button")
    public WebElement getGetStarted_sub_button;

    @FindBy(xpath="/html/body/section/footer/div/a[1]")
    public WebElement contactUs_button;

    @FindBy(css="footer > div > a:nth-child(2)")
    public WebElement privacypolicy_button;

    @FindBy(css="footer > div > a:nth-child(3)")
    public WebElement TermOfUse_button;

    @FindBy(xpath = "/html/body/section/main/section[1]/div[2]/h1")
    public WebElement FindYourPerfectMovieMatch_header;

    @FindBy(xpath = "/html/body/section/main/section[1]/div[2]/p")
    public WebElement FindYourPerfectMovieMatch_text;

    //First image information
    @FindBy(xpath = "/html/body/section/main/section[2]/div/div[1]/h2")
    public WebElement MoviesMirroringYourEmotions_header;

    @FindBy(xpath = "/html/body/section/main/section[2]/div/div[1]/p")
    public WebElement MoviesMirroringYourEmotions_text;

    @FindBy(xpath = "/html/body/section/main/section[2]/div/div[2]/img")
    public WebElement MoviesMirroringYourEmotions_image;

    //Second image information

    @FindBy(xpath = "/html/body/section/main/section[3]/div/div[1]/h2")
    public WebElement CuratedMovieCollections_header;

    @FindBy(xpath = "/html/body/section/main/section[3]/div/div[1]/p")
    public WebElement CuratedMovieCollections_text;

    @FindBy(xpath = "/html/body/section/main/section[3]/div/div[2]/img")
    public WebElement CuratedMovieCollections_image;

    //Third image information

    @FindBy(xpath = "/html/body/section/main/section[4]/div/div[1]/h2")
    public WebElement CalendarandWatchlistFeatures_header;

    @FindBy(xpath = "/html/body/section/main/section[4]/div/div[1]/p")
    public WebElement CalendarandWatchlistFeatures_text;

    @FindBy(xpath = "/html/body/section/main/section[4]/div/div[2]/img")
    public WebElement CalendarandWatchlistFeatures_image;

    //Forth image information
    @FindBy(xpath = "/html/body/section/main/section[5]/div/div[1]/h2")
    public WebElement DirectStreamingLinks_header;

    @FindBy(xpath = "/html/body/section/main/section[5]/div/div[1]/p")
    public WebElement DirectStreamingLinks_text;

    @FindBy(xpath = "/html/body/section/main/section[5]/div/div[2]/img")
    public WebElement DirectStreamingLinks_image;

    @FindBy(xpath = "/html/body/section/main/div[2]/div/p")
    public  WebElement Readytodiscoverhiddengemsthatyouveneverheardofbefore_text;

    //FAQ part

    @FindBy (css="div:nth-child(1) > button")
    public WebElement firstQuestion;

    @FindBy (xpath="/html/body/section/main/div[1]/section/div/div[1]/div/div")
    public WebElement firstAnswer;

    @FindBy (css="div:nth-child(2) > button")
    public WebElement secondQuestion;

    @FindBy (xpath="/html/body/section/main/div[1]/section/div/div[2]/div/div")
    public WebElement secondAnswer;
    @FindBy (css="div:nth-child(3) > button")
    public WebElement thirdQuestion;
    @FindBy (xpath="/html/body/section/main/div[1]/section/div/div[3]/div/div")
    public WebElement thirdAnswer;
    @FindBy (css="div:nth-child(4) > button")
    public WebElement forthQuestion;
    @FindBy (xpath="/html/body/section/main/div[1]/section/div/div[4]/div/div")
    public WebElement forthAnswer;
    @FindBy (css="div:nth-child(5) > button")
    public WebElement fifthQuestion;
    @FindBy (xpath="/html/body/section/main/div[1]/section/div/div[5]/div/div")
    public WebElement fifthAnswer;
    @FindBy (css="div:nth-child(6) > button")
    public WebElement sixthQuestion;
    @FindBy (xpath="/html/body/section/main/div[1]/section/div/div[6]/div/div")
    public WebElement sixthAnswer;










}
