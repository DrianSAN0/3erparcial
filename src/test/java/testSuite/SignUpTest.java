package testSuite;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import session.Session;

import java.util.Date;

public class SignUpTest extends BaseTestTodoLy{

    @Test
    public void verifySignUpSuccessfully() throws InterruptedException {
        mainPage.signUpButton.click();
        signUpFormSection.login("pruebweb"+ new Date().getTime() +"@prueba.com","12345", "email1");
        settingsSection.settingsButton.click();
        String newEmail = "pruebweb"+ new Date().getTime() +"@prueba.com";
        profileSection.changeEmail(newEmail);

        Alert alert = Session.getInstance().getBrowser().switchTo().alert();
        alert.accept();
        Thread.sleep(2000);
        mainPage.loginButton.click();
        loginSection.login(newEmail, "12345");

        Assertions.assertTrue(menuSection.logoutButton.isControlDislayed(),
                "ERROR! la actualizacion fallo");
    }


}
