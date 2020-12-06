package cucumber.test;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newuser {
    private WebDriver driver;


    @When("^Gloapp home page display$")
    public void gloappHomePageDisplay() {
        // Skonfiguruj sterownik przeglądarki
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");
        // Uruchom nowy egzemplarz przeglądarki Chrome
        driver = new ChromeDriver();
        // Zmaksymalizuj okno przeglądarki
        driver.manage().window().maximize();
        // Przejdź do Google
        driver.get("https://qloapps.coderslab.pl/");


    }

    @Then("^I click on sign in option$")
    public void iClickOnSignInOption() {
        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement element = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[7]/ul/li/a"));
        // Wyczyść tekst zapisany w elemencie
        element.click();



    }

    @And("^I click on Email address input and enetering email do\\.tomasza@wp\\.pl$")
    public void iClickOnEmailAddressInputAndEneteringEmailDoTomaszaWpPl() {

        WebElement element2 = driver.findElement(By.id("email_create"));
        // Wyczyść teskst zapisany w elemencie
        element2.clear();
        // Wpisz komentarz
        element2.sendKeys("do.tomasza@wp.pl");
        // Prześlij formularz
        element2.submit();


    }

    @And("^I click on create an account icon$")
    public void iClickOnCreateAnAccountIcon() {
        WebElement element3 = driver.findElement(By.cssSelector("input[type='email']"));

        element3.click();

    }

    @Then("^Gloapps should sent email confirmation$")
    public void gloappsShouldSentEmailConfirmation() {
    }


}
