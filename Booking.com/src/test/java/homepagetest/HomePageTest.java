package homepagetest;

import common.WebAPI;
import homepage.BookingHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends WebAPI  {
    // Test class

    //instance of HomepageClass
    BookingHomePage bookingHomePage;

    @BeforeMethod
    public void getInit() throws InterruptedException {
        bookingHomePage = PageFactory.initElements(driver, BookingHomePage.class);
        sleepFor(5);

    }
    @Test(enabled = false)
    public void flightTab() throws InterruptedException {
        bookingHomePage.flightTab();
        sleepFor(5);

    }
    @Test(enabled = false)
        public void searchLondon() throws InterruptedException {
            bookingHomePage.search();
        }
    @Test(enabled = false)
    public void searchDropDown() throws InterruptedException {
        bookingHomePage.search2();
    }
    @Test(enabled = false)
    public void clickAndDrag() throws InterruptedException {
        bookingHomePage.clickAndDrag();
}
    @Test(enabled = false)
    public void clickCountries() throws InterruptedException {
        bookingHomePage.countries();
    }
    @Test(enabled = false)
    public void clickRegions() throws InterruptedException {
        bookingHomePage.regions();
    }
    @Test(enabled = false)
    public void clickCities() throws InterruptedException {
        bookingHomePage.cities();
    }
    @Test(enabled = false)
    public void clickDistricts() throws InterruptedException {
        bookingHomePage.districts();
    }
    @Test(enabled = false)
    public void clickAirports() throws InterruptedException {
        bookingHomePage.airports();
    }
    @Test(enabled = false)
    public void clickHotels() throws InterruptedException {
        bookingHomePage.hotels();
    }
    @Test(enabled = false)
    public void clickPlacesOfInterest() throws InterruptedException {
        bookingHomePage.placeOfInterest();
    }
    @Test(enabled = false)
    public void clickHomes() throws InterruptedException {
        bookingHomePage.homes();
    }    @Test(enabled = false)
    public void clickApartments() throws InterruptedException {
        bookingHomePage.apartments();
    }    @Test(enabled = false)
    public void clickResorts() throws InterruptedException {
        bookingHomePage.resorts();
    }    @Test(enabled = false)
    public void clickVillas() throws InterruptedException {
        bookingHomePage.villas();
    }    @Test(enabled = false)
    public void clickHostels() throws InterruptedException {
        bookingHomePage.hostels();
    }    @Test(enabled = false)
    public void clickBnBs() throws InterruptedException {
        bookingHomePage.bnbs();
    }    @Test(enabled = false)
    public void clickGuestHome() throws InterruptedException {
        bookingHomePage.guestHome();
    }    @Test(enabled = false)
    public void clickUniquePlacesToStay() throws InterruptedException {
        bookingHomePage.uniquePlacesToStay();
    }    @Test(enabled = false)
    public void clickAllDestinations() throws InterruptedException {
        bookingHomePage.allDestinations();
    }    @Test(enabled = false)
    public void clickReviews() throws InterruptedException {
        bookingHomePage.reviews();
    }    @Test(enabled = false)
    public void clickUnpacked() throws InterruptedException {
        bookingHomePage.unpacked();
    }    @Test(enabled = false)
    public void clickTravelCommunities() throws InterruptedException {
        bookingHomePage.travelCommunities();
    }    @Test(enabled = false)
    public void clickSeasonalAndHolidayDeals() throws InterruptedException {
        bookingHomePage.seasonalAndHolidayDeals();
    }    @Test(enabled = false)
    public void clickCarRentals() throws InterruptedException {
        bookingHomePage.carRentals();
    }    @Test(enabled = false)
    public void clickFlightFinder() throws InterruptedException {
        bookingHomePage.flightFinder();
    }    @Test(enabled = false)
    public void clickRestaurantReservations() throws InterruptedException {
        bookingHomePage.restaurantReservations();
    }    @Test(enabled = false)
    public void clickBookingForTravelAgents() throws InterruptedException {
        bookingHomePage.bookingForTravelAgents();
    }    @Test(enabled = false)
    public void clickCovid19Faqs() throws InterruptedException {
        bookingHomePage.covid19Faqs();
    } @Test(enabled = false)
    public void clickAboutbooking() throws InterruptedException {
        bookingHomePage.aboutbooking();
    } @Test(enabled = false)
    public void clickContactCustomerService() throws InterruptedException {
        bookingHomePage.contactCustomerService();
    } @Test(enabled = false)
    public void clickPartnerHelp() throws InterruptedException {
        bookingHomePage.partnerHelp();
    } @Test(enabled = false)
    public void clickCareers() throws InterruptedException {
        bookingHomePage.careers();
    } @Test(enabled = false)
    public void clickSustainability() throws InterruptedException {
        bookingHomePage.sustainability();
    } @Test(enabled = false)
    public void clickPressCenter() throws InterruptedException {
        bookingHomePage.pressCenter();
    } @Test(enabled = false)
    public void clickSafetyResourceCenter() throws InterruptedException {
        bookingHomePage.safetyResourceCenter();
    } @Test(enabled = false)
    public void clickInvestorRelations() throws InterruptedException {
        bookingHomePage.investorRelations();
    } @Test(enabled = false)
    public void clickTermsConditions() throws InterruptedException {
        bookingHomePage.termsConditions();
    } @Test(enabled = false)
    public void clickPartnerDispute() throws InterruptedException {
        bookingHomePage.partnerDispute();
    } @Test(enabled = false)
    public void clickPrivacyCookieStatement() throws InterruptedException {
        bookingHomePage.privacyCookieStatement();
    } @Test(enabled = true)
    public void clickCorporateContact() throws InterruptedException {
        bookingHomePage.corporateContact();
    }






















}
