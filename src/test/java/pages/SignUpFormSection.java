package pages;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class SignUpFormSection {
    public TextBox emailTxtBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxEmail"));
    public TextBox pwdTxtBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxPassword"));
    public TextBox fullNameTxtBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxFullName"));

    public  Button checkButton = new Button(By.id("ctl00_MainContent_SignupControl1_CheckBoxTerms"));
    public  Button loginButton = new Button(By.id("ctl00_MainContent_SignupControl1_ButtonSignup"));

    public void login(String email, String pwd, String fullName){
        this.emailTxtBox.setText(email);
        this.pwdTxtBox.setText(pwd);
        this.fullNameTxtBox.setText(fullName);
        this.checkButton.click();
        this.loginButton.click();
    }
}
