package testcases;

import booking.pages.*;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FlightandHotelTest extends WebAPI {
    BookingHomepage booking;
    FlightandHotelPage flight;
    CountriesPage countries;
    HotelbookingPage hotelbook;
    RegionPage region;


    @BeforeMethod
    public void getinit(){
        booking = PageFactory.initElements(driver, BookingHomepage.class);
        flight = PageFactory.initElements(driver, FlightandHotelPage.class);
        countries = PageFactory.initElements(driver, CountriesPage.class);
        hotelbook = PageFactory.initElements(driver, HotelbookingPage.class);
        region = PageFactory.initElements(driver, RegionPage.class);


    }

    //@Test(priority = 1)
    public void flighthoteltest(){

        booking.clickFlightnHotel();
        flight.typeinWherFrominputBox();
        flight.clickOnNewYork();
        flight.typeinWhereToinputbox();
        flight.selectPreferedCity();
        flight.clickonCalender();

        sleepFor(5);
    }
    //@Test(priority = 2)
    public void hotelBookingTest(){
        booking.clickCountriesbutton();
        countries.clickOnAlgeria();
        hotelbook.selectCheckIndate();
        hotelbook.selecCheckoutDate();
        hotelbook.clickOnguestinputButton();
        hotelbook.selectNumberOfAdultpassenger();
        hotelbook.selectNumberoFChildrenpass();
        hotelbook.clickOnSearchBoxbutton();
        hotelbook.verifResultPage();

        sleepFor(5);
    }
    @Test(priority = 3)
    public void californiaHotelTest(){
        booking.clickOnRegion();
        region.clickRegionButton();
        hotelbook.clickOncalederDate();
        hotelbook.clickOncalenderDate2();
        hotelbook.clickOnguestinputButton();
        hotelbook.addNumberofAdultGuest();
        hotelbook.clickOnSearchBoxbutton();
        hotelbook.verifResultPage();
        sleepFor(5);


    }



}
