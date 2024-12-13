package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.FormPage;
import pages.LoginPage;

public class APITests {

    private LoginPage loginPage;
    private FormPage formPage;

    @BeforeClass
    public void setup() {
        loginPage = new LoginPage();
        formPage = new FormPage();
    }

    @Test(priority = 1)
    public void loginTest() {
        loginPage.login("testuser", "password123");
        System.out.println("Login successful!");
    }

    @Test(priority = 2, dependsOnMethods = "loginTest")
    public void fillFormTest() {
        formPage.submitForm("John Doe", "johndoe@example.com", "This is a test message.");
        System.out.println("Form submitted successfully!");
    }
}