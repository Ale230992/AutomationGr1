package tests.RegisterTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.*;


public class RegisterTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(RegisterTest.class);
    private String newUrl = getBaseUrl() + "Register.html";
    String fname = "Alexandra";
    String lname = "Nicoara";
    String adress = "Str.Luptei,nr.2, jud.Sibiu, Sibiu";
    String emailaddress = "alexandranicoara92@yahoo.ro";
    String phone = "0746 563 895";
    String language = "Romanian";
    String skill = "Java";
    String country = "India";
    String year = "1992";
    String month = "February";
    String day = "21";
    String firstPassword = "BlaBla";
    String secondPassword = "BlaBla";

    @Test
    public void register() {
        driver.get(newUrl);

        LOG.info("Complete the First name and Last name");
        registerPage.firstNameField(fname);
        registerPage.lastNameField(lname);
        sleep(3000);

        LOG.info("Complete the Adress");
        registerPage.adressField(adress);
        sleep(3000);

        LOG.info("Complete the Email Address");
        registerPage.emailAddressField(emailaddress);
        sleep(3000);

        LOG.info("Complete the Phone");
        registerPage.phoneField(phone);
        sleep(3000);

        LOG.info("Click gender radio button");
        registerPage.clickMaleGender();
        sleep(3000);

        LOG.info("Click gender radio button");
        registerPage.clickFeMaleGender();
        sleep(3000);

        LOG.info("Click checkbox button");
        registerPage.clickCricket();
        sleep(3000);

        LOG.info("Click checkbox button");
        registerPage.clickMovies();
        sleep(3000);

        LOG.info("Click checkbox button");
        registerPage.clickHockey();
        sleep(3000);

        LOG.info("Click languages radio button");
        registerPage.selectLanguage(language);
        sleep(3000);

        LOG.info("Click skill dropdown button");
        registerPage.selectSkill(skill);
        sleep(3000);

        LOG.info("Click 'Select country'");
        registerPage.clickSelectCountry(country);
        sleep(3000);

        LOG.info("Select Birth Date");
        registerPage.birthDate(year,month,day);
        sleep(3000);

        LOG.info("Confirm Password Fields");
        registerPage.confirmPasswordKey(firstPassword,secondPassword);
        sleep(3000);




    }
}


