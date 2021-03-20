package credit;

import common.WebAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import static credit.CreditCardsPageElements.*;
import static homepage.HomePageWebElement.*;


public class CreditCardsPage extends WebAPI {


    @FindBy(how = How.CSS, using = creditCardsTab)
    public WebElement creditCards;
    @FindBy(how = How.CSS, using = shopAllCreditCardsOnTable)
    public WebElement shopAllCreditCards;
    //
    @FindBy(how = How.XPATH, using = addCompareCashRewardCard)
    public WebElement addCompareCashReward;
    @FindBy(how = How.XPATH, using = addCompareTravelRewardsCard)
    public WebElement addCompareTravelReward;
    @FindBy(how = How.XPATH, using = firstCardContainerForComparison)
    public WebElement firstCardContainer;
    @FindBy(how = How.XPATH, using = secondCardContainerForComparison)
    public WebElement secondCardContainer;
    @FindBy(how = How.XPATH, using = clickCompareButton)
    public WebElement compareButton;

    @FindBy(how = How.CSS, using = addThirdCard)
    public WebElement addThird;
    @FindBy(how = How.CSS, using = cardCategoryDropDown)
    public WebElement cardCategory;
    @FindBy(how = How.CSS, using = allCardsOption)
    public WebElement allCards;
    @FindBy(how = How.CSS, using = chooseCardFunnel)
    public WebElement chooseCard;
    @FindBy(how = How.XPATH, using = usPrideCardOption)
    public WebElement usPrideCard;
    @FindBy(how = How.XPATH, using = compareCardAfterThirdAdded)
    public WebElement compareCardAfterThird;
    @FindBy(how = How.CSS, using = thirdContainerCardPresent)
    public WebElement thirdContainerCard;

    @FindBy(how = How.CSS, using = viewAllCardsTab)
    public WebElement viewAllCards;
    @FindBy(how = How.CSS, using = filterCardsDropDown)
    public WebElement filterCards;
    @FindBy(how = How.XPATH, using = noAnnualFeeCheckBox)
    public WebElement noAnnualFee;

    @FindBy(how = How.XPATH, using = visaRadioButton)
    public WebElement visaRadio;

    @FindBy(how = How.CSS, using = searchCardsAfterFilterOptions)
    public WebElement searchCardsAfterFilter;

    @FindBy(how = How.XPATH, using = checkNoAnnualText)
    public WebElement checkNoAnnualTextOnPage;

    @FindBy(how = How.XPATH, using = glassSliderForPrice)
    public WebElement glassSlider;

    @FindBy(how = How.CSS, using = calculateRewardsInBlue)
    public WebElement calculateRewards;

    @FindBy(how = How.CSS, using = sliderNumberValue)
    public WebElement sliderNumber;

    @FindBy(how = How.CSS, using = footerElementDisplay)
    public WebElement footerElement;

    @FindBy(how = How.CSS, using = twitterFooterElement)
    public WebElement twitterFooter;

    @FindBy(how = How.XPATH, using = faceBookFooterElement)
    public WebElement faceBookFooter;

    @FindBy(how = How.CSS, using = connectToTwitterButton)
    public WebElement connectToTwitter;

    @FindBy(how = How.CSS, using = connectToFacebookButton)
    public WebElement connectToFacebook;

    @FindBy(how = How.CSS, using = airlinesFooterCard)
    public WebElement airlinesFooter;

    @FindBy(how = How.CSS, using = pointsRewardsCardOnCreditCardMenu)
    public WebElement pointsRewardsCardOnCreditMenu;

    @FindBy(how = How.CSS, using = applyNowButton)
    public WebElement applyNow;

    @FindBy(how = How.CSS, using = footerForHomeButton)
    public WebElement footerForHome;

    @FindBy(how = How.CSS, using = footerPrivacyPage)
    public WebElement footerPrivacy;

    @FindBy(how = How.CSS, using = careersFromFooter)
    public WebElement careersFooter;

    @FindBy(how = How.CSS, using = siteMapFromFooter)
    public WebElement siteMapFooter;


    public void calculateRewards() {
        calculateRewards.click();
    }

    public void navigateToCreditCards() {
        creditCards.click();
        shopAllCreditCards.click();
    }

    public void creditCardPageValidation() {
        String actualTitleText = driver.getTitle();
        Assert.assertEquals(actualTitleText, expectedTitleText, "Failed: Title does not match");
    }

    public void compareCards() {
        addCompareCashReward.click();
        Actions actions = new Actions(driver);
        actions.moveToElement(addCompareTravelReward).click().build().perform();
    }

    public boolean elementHasClass(WebElement element, String active) {
        return element.getAttribute("class").contains(active);
    }

    public void clickOnCompare() {
        compareCards();
        Actions actions = new Actions(driver);
        actions.moveToElement(compareButton).click().build().perform();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void comparePageValidation() {
        String actual = driver.getTitle();
        String expected = comparePageTitle;
        Assert.assertEquals(actual, expected, "Failed: Title does not match");
    }

    public void addOneMoreCard() {
        clickOnCompare();
        addThird.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Select objSelect = new Select(cardCategory);
        objSelect.selectByValue("allCards");
        allCards.click();
        chooseCard.click();
        usPrideCard.click();
        compareCardAfterThird.click();
    }

    public boolean classIsNotEmpty(WebElement element, String full) {
        return element.getAttribute("class").contains(full);
    }

    public void selectVisaRadioButton() {
        viewAllCards.click();
        filterCards.click();
        Actions act = new Actions(driver);
        act.moveToElement(visaRadio).click().build().perform();
    }

    public void visaRadioButtonSelected() {
        boolean visaIsSelected = visaRadio.isSelected();
        Assert.assertTrue(visaIsSelected, "Failed: Visa radio button not selected");
    }

    public void noAnnualFeeSelected() {
        viewAllCards.click();
        filterCards.click();
        noAnnualFee.click();
    }

    public void noAnnualFeeValidation() {
        boolean noAnnualSelected = noAnnualFee.isSelected();
        Assert.assertTrue(noAnnualSelected, "Failed:No annual fee not selected");
    }

    public void searchFilters() {
        noAnnualFeeSelected();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        searchCardsAfterFilter.click();
    }

    public void noAnnualFeeOnPageFound() {
        String actual = checkNoAnnualTextOnPage.getText();
        String expected = noAnnualExpected;
        Assert.assertEquals(actual, expected, "Failed: Text does not say no annual fee");
    }

    public void checkGlassSlider() {
        calculateRewards();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();", glassSlider);
        Actions move = new Actions(driver);
        move.dragAndDropBy(glassSlider, 100, 0).release().perform();
    }

    public void glassSliderNineHundred() {
        String actual = sliderNumber.getText();
        String expected = "$900";
        Assert.assertEquals(actual, expected, "Failed: Number is not 900");
    }

    public void dragSliderToHighest() {
        calculateRewards();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();", glassSlider);
        Actions move = new Actions(driver);
        move.dragAndDropBy(glassSlider, 530, 0).release().perform();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void glassSliderOnHighestAmount() {
        String actual = sliderNumber.getText();
        String expected = "$5,000";
        Assert.assertEquals(actual, expected, "Failed: highest amount not $5,000");
    }

    public void scrollDownPage() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();", footerElement);
    }

    public void scrollDownDisplaysFooter() {
        boolean footerIsDisplayed = footerElement.isDisplayed();
        Assert.assertTrue(footerIsDisplayed);
    }

    public void scrollDownToTwitter() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();", twitterFooter);
    }

    public void scrollDownDisplaysTwitter() {
        boolean footerIsDisplayed = twitterFooter.isDisplayed();
        Assert.assertTrue(footerIsDisplayed);
    }

    public void scrollDownToFaceBook() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();", faceBookFooter);
    }

    public void scrollDownDisplaysFaceBook() {
        boolean footerIsDisplayed = faceBookFooter.isDisplayed();
        Assert.assertTrue(footerIsDisplayed);
    }

    public void connectToTwitterPage() {
        scrollDownToTwitter();
        twitterFooter.click();
    }

    public void acceptTwitterPopup() {
        boolean continueTwitterDisplayed = connectToTwitter.isDisplayed();
        Assert.assertTrue(continueTwitterDisplayed);
        driver.navigate().refresh();
    }

    public void navigateToTwitter() {
        connectToTwitterPage();
        connectToTwitter.click();
    }

    public void navigateToTwitterTitle() {
        String actual = driver.getTitle();
        String expected = twitterTitle;
        Assert.assertEquals(actual, expected, "Failed:Title not for Twitter");
    }

    public void continueFacebookPopUp() {
        scrollDownToFaceBook();
        faceBookFooter.click();
    }

    public void acceptFacebookPopup() {
        boolean continueFBDisplayed = connectToFacebook.isDisplayed();
        Assert.assertTrue(continueFBDisplayed);
    }

    public void navigateToFacebook() {
        continueFacebookPopUp();
        connectToFacebook.click();
        ArrayList<String> secondTab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(secondTab.get(1));
    }

    public void navigateToFacebookTitle() {
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        String actual = driver.getTitle();
        String expected = facebookTitle;
        Assert.assertEquals(actual, expected, "Failed:Title not for Facebook");
    }

    public void airlinesInFooterClick() {
        airlinesFooter.click();
    }

    public void airlinesFooterPageTitle() {
        String actual = driver.getTitle();
        String expected = airlinesPageTitle;
        Assert.assertEquals(actual, expected, "Failed:Title does not match Airlines");
    }

    public void pointsRewardFromMenu() {
        pointsRewardsCardOnCreditMenu.click();
    }

    public void pointsRewardTitle() {
        String actual = driver.getTitle();
        String expected = rewardsPageTitle;
        Assert.assertEquals(actual, expected, "Failed:Title does not match");
    }

    public void typeValueInsteadSlider() {
        sliderNumber.sendKeys("200");
    }

    public void numberBoxValue() {
        String actual = "200";
        String expected = sliderNumber.getText();
        Assert.assertEquals(actual, expected, "Failed");
    }

    public void applyNowClick() {
        calculateRewards();
        applyNow.click();
    }

    public void applyNowValidation() {
        String actual = driver.getTitle();
        String expected = applicationPageTitle;
        Assert.assertEquals(actual, expected, "Failed");
    }

    public void navigateToHomeFromFooter() {
        footerForHome.click();
    }

    public void homeFromFooterValidation() {
        String actual = driver.getTitle();
        String expected = homePageTitle;
        Assert.assertEquals(actual, expected, "Failed");
    }

    public void privacyPageNavigation() {
        footerPrivacy.click();
    }

    public void privacyPageValidation() {
        String actual = driver.getTitle();
        String expected = privacyPageTitle;
        Assert.assertEquals(actual, expected, "Failed");
    }

    public void careersPageNavigation() {
        careersFooter.click();
    }

    public void careersPageValidation() {
        String actual = driver.getTitle();
        String expected = careerPageTitle;
        Assert.assertEquals(actual, expected, "Failed");
    }


    public void siteMapPageNavigation() {
        siteMapFooter.click();
    }

    public void sieMapPageValidation() {
        String actual = driver.getTitle();
        String expected = siteMapPageTitle;
        Assert.assertEquals(actual, expected, "Failed");
    }


}
