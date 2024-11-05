package testSuite;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.*;
import session.Session;

public class BaseTestTodoLy {

    MainPage mainPage = new MainPage();
    SignUpFormSection signUpFormSection = new SignUpFormSection();
    SettingsSection settingsSection = new SettingsSection();
    ProfileSection profileSection = new ProfileSection();
    LoginSection loginSection = new LoginSection();
    MenuSection menuSection = new MenuSection();

    @BeforeEach
    public void openBrowser(){
        Session.getInstance().getBrowser().get("https://todo.ly/");
    }

    @AfterEach
    public void closeBrowser(){
        Session.getInstance().closeSession();
    }


}
