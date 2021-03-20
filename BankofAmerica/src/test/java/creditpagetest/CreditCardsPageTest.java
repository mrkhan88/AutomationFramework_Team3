package creditpagetest;

import credit.CreditCardsPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static common.WebAPI.driver;
import static common.WebAPI.sleepFor;

public class CreditCardsPageTest {

    CreditCardsPage creditCardsPage;

    @BeforeMethod
    public void getInit() {
        creditCardsPage = PageFactory.initElements(driver, CreditCardsPage.class);
        creditCardsPage.navigateToCreditCards();
    }

    @Test
    public void creditCardNavigation() {
        creditCardsPage.creditCardPageValidation();
    }

    @Test
    public void cardsToCompareIsActive() {
        creditCardsPage.compareCards();
        creditCardsPage.elementHasClass(creditCardsPage.firstCardContainer, "active");
        creditCardsPage.elementHasClass(creditCardsPage.secondCardContainer, "active");
    }

    @Test
    public void compareCardsPageTitle() {
        creditCardsPage.clickOnCompare();
        creditCardsPage.comparePageValidation();
    }

    @Test
    public void thirdCardIsAddedToCompare() {
        creditCardsPage.addOneMoreCard();
        creditCardsPage.classIsNotEmpty(creditCardsPage.thirdContainerCard, "dyn-content");
    }

    @Test
    public void noAnnualFeeTest() {
        creditCardsPage.noAnnualFeeSelected();
        creditCardsPage.noAnnualFeeValidation();
    }

    @Test
    public void visaRadioButtonTest() {
        creditCardsPage.selectVisaRadioButton();
        creditCardsPage.visaRadioButtonSelected();
    }

    @Test
    public void noAnnualFeeResultsT() {
        creditCardsPage.searchFilters();
        creditCardsPage.noAnnualFeeOnPageFound();
    }

    @Test
    public void glassSliderClickable() {
        creditCardsPage.calculateRewards();
        creditCardsPage.checkGlassSlider();
    }

    @Test
    public void glassSliderToNineHundred() throws InterruptedException {
        creditCardsPage.checkGlassSlider();

        creditCardsPage.glassSliderNineHundred();
        sleepFor(4);
    }

    @Test
    public void dragSliderToFiveThousand() {
        creditCardsPage.dragSliderToHighest();
        creditCardsPage.glassSliderOnHighestAmount();
    }

    @Test
    public void scrollToFooter() {
        creditCardsPage.scrollDownPage();
        creditCardsPage.scrollDownDisplaysFooter();
    }

    @Test
    public void scrollDownToTwitter() {
        creditCardsPage.scrollDownToTwitter();
        creditCardsPage.scrollDownDisplaysTwitter();
    }

    @Test
    public void scrollDownToFB() {
        creditCardsPage.scrollDownToFaceBook();
        creditCardsPage.scrollDownDisplaysFaceBook();
    }

    @Test
    public void connectToTwitterOfBOA() {
        creditCardsPage.connectToTwitterPage();
        creditCardsPage.acceptTwitterPopup();
    }

    @Test
    public void clickAndNavigateToTwitter() {
        creditCardsPage.navigateToTwitter();
        creditCardsPage.navigateToTwitterTitle();
    }

    @Test
    public void continueToFBPopUp() {
        creditCardsPage.continueFacebookPopUp();
        creditCardsPage.acceptFacebookPopup();
    }

    @Test
    public void navigateToFacebook() {
        creditCardsPage.navigateToFacebook();
        creditCardsPage.navigateToFacebookTitle();
    }

    @Test
    public void airlinesPageTest() {
        creditCardsPage.airlinesInFooterClick();
        creditCardsPage.airlinesFooterPageTitle();
    }

    @Test
    public void rewardsPageTitleTest() {
        creditCardsPage.pointsRewardFromMenu();
        creditCardsPage.pointsRewardTitle();
    }

    @Test
    public void insertValueWithoutSlider() {
        creditCardsPage.typeValueInsteadSlider();
        creditCardsPage.numberBoxValue();
    }

    @Test
    public void applicationPageNavigation() {
        creditCardsPage.applyNowClick();
        creditCardsPage.applyNowValidation();
    }

    @Test
    public void goToHomePageFooter() {
        creditCardsPage.navigateToHomeFromFooter();
        creditCardsPage.homeFromFooterValidation();
    }

    @Test
    public void goToPrivacyPageFooter() {
        creditCardsPage.privacyPageNavigation();
        creditCardsPage.privacyPageValidation();
    }

    @Test
    public void goToCareersFromFooter() {
        creditCardsPage.careersPageNavigation();
        creditCardsPage.careersPageValidation();
    }

    @Test
    public void goToSiteMapFromFooter() {
        creditCardsPage.siteMapPageNavigation();
        creditCardsPage.sieMapPageValidation();


    }

}
