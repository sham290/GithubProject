package GithubWeb;

import Base.BaseClass;
import Pages.LoginPages;
import org.testng.annotations.Test;

public class GithubTest extends BaseClass {
    @Test
    public void loginPageMethod() throws InterruptedException {
        LoginPages login = new LoginPages(driver);

        login.openGitUrl();
        login.clickOnSignInBtn();
        Thread.sleep(300);
    }

    @Test
    public void SignUpMethod() throws InterruptedException {
        LoginPages SignUp = new LoginPages(driver);
        SignUp.openGitUrl();
        SignUp.clickOnSignUpBtn();
        Thread.sleep(300);
        SignUp.clickOnTermsBtn();
        Thread.sleep(1000);
        SignUp.openGitUrl();
        SignUp.clickOnSignUpBtn();
        Thread.sleep(300);
        SignUp.clickOnGitHubPrivacyStatementBtn();
        Thread.sleep(1000);
    }
    
}