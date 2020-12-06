import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Googlesearch {
    private WebDriver driver;

    @Given(value = "an open browser with google")
    public void anOpenBrowserWithGoogleCom() {
        // Uruchom nowy egzemplarz przeglądarki Chrome
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        // Zmaksymalizuj okno przeglądarki
        driver.manage().window().maximize();
        // Przejdź do Google
        driver.get("http://www.google.com");


    }

    @When("a keyword (.*) selenium is entered in input field")
    public void aKeywordSeleniumIsEnteredInInputField() {

            // Znajdź element wprowadzania tekstu na podstawie jego nazwy
            WebElement element = driver.findElement(By.name("q"));
            // Wyczyść tekst zapisany w elemencie
            element.clear();
            // Wpisz informacje do wyszukania
            element.sendKeys(keyword);
            // Prześlij formularz
            element.submit();
        }



    @Then("the first one should contain (.*)")
    public void theFirstOneShouldContainKeyword(String expectedText) {
        System.out.println(expectedText);
    }

    @And("close browser")
    public void closeBrowser(){
        driver.quit();
    }
}



    }
}