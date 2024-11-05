package pages;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class ProfileSection {


    public TextBox emailInput = new TextBox(By.xpath("//input[@id='EmailInput']"));
    public Button okProfileButton = new Button(By.xpath("//button[span[text()='Ok']]"));

    public void changeEmail(String email) throws InterruptedException {
        this.emailInput.clearSetText(email);
        this.okProfileButton.click();
        Thread.sleep(2000);
    }

//    public String getFullName() {
//        return this.fullNameInput.getText();
//    }

}
