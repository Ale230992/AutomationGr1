package tests.SignInTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class SignUpTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(SignUpTest.class);

    @Test
    public void signUp() {
        String email = "automation@grupa1.com";

        LOG.info("Check Logo Sign Up");
        Assert.assertTrue(signInPage.isLogoSignUpDisplayed(), "Logo is not displayed");

        LOG.info("CLick button");
        signInPage.clickSkipSignInButton();

        LOG.info("Navigate back");
        signInPage.clickBack();

        LOG.info("Insert email");
        signInPage.typeInSignUpEmailField(email);

        LOG.info("Click enter sign up button");
        signInPage.clickEnterSignUpButton();


    }


}
