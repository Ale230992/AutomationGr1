package tests.SignInTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class SignInTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(SignInTest.class);

    @Test
    public void SignIn() {
        String email = "grupa1@automation.com";
        String email2 = "grupa1@automation.com";
        String password = "parola";
        String password2 = "parola";

        LOG.info("Check 'Sign in' button");
        Assert.assertTrue(signInPage.isSignInButtonDisplayed(), "Button is not displayed");

        LOG.info("Click button");
        signInPage.clickSignInButton();
//        sleep (3000);


        LOG.info("Check Logo");
        Assert.assertTrue(signInPage.isLogoDisplayed(), "Logo is not displayed");
//        sleep (3000);

        LOG.info("Click Enter and check message");
        signInPage.clickEnterButton();
        Assert.assertTrue(signInPage.isErrorMessageDisplayed(), "Error msg is not displayed");
//        sleep (3000);

        LOG.info("Complete the fields");
        signInPage.typeInSignInEmailField(email);
        signInPage.typeInSignInPasswordField(password);
//        sleep (3000);

        LOG.info("Click Enter and check message");
        signInPage.clickEnterButton();
        Assert.assertTrue(signInPage.isErrorMessageDisplayed(), "Error msg is not displayed");
//        sleep (3000);

        LOG.info("Complete the fields");
        signInPage.typeInSignInEmailField(email2);
        signInPage.typeInSignInPasswordField(password2);
//        sleep (3000);

        LOG.info("Click Enter and check message");
        signInPage.clickEnterButton();
        Assert.assertTrue(signInPage.isErrorMessageDisplayed(), "Error msg is not displayed");
//        sleep (3000);






    }
}
