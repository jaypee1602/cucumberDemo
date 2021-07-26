package TestCode;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.AfterClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class VopakDemo {

    static WebDriver driver;
    WebElement element;
    JavascriptExecutor jse = (JavascriptExecutor)driver;

    @AfterClass
    public void teardown() {
        driver.close();
        driver.quit();
    }

    @Given("Chrome browser is open")
    public void loginPageIsVisible() {
        System.out.println("Check if browser is open");
        System.setProperty("webdriver.chrome.driver", "/Users/ryanmori/IdeaProjects/SeleniumCucumber/src/test/resources/drivers/chromedriver");
        driver = new ChromeDriver();
    }

    @When("User navigates to Vopak")
    public void userIsOnLoginPage() throws InterruptedException {
        System.out.println("User is on login page");
        driver.navigate().to("https://www.vopak.nl/");
        Thread.sleep(2000);
    }

    @Then("The Vopak homepage is visible")
    public void userIsNavigatedToHomePage() throws InterruptedException {
        System.out.println("Verify and accept cookies");
        driver.findElement(By.id("mainMenu"));
        if(driver.findElement(By.xpath("//*[@id='CybotCookiebotDialogBodyLevelButtonAccept']"))!= null){
            System.out.println("Cookie notification is visible, clicking OK");
            driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonAccept")).click();
            Thread.sleep(1000);
        }else{
            System.out.println("Cookie notification is NOT visible.");
        }
    }
    @Given("User is on Vopak homepage")
    public void UserIsOnVopakHomepage() {
        driver.findElement(By.id("mainMenu"));
    }

    @When("The career tab is clicked")
    public void theCareerTabIsClicked() {
        driver.findElement(By.xpath("//*[@id='block-vopak-base-v2-mainnavigationvopaknl']/span[7]/a")).click();
    }
    @And("A new tab wil be opened and redirected to werken bij vopak")
    public void newTabCareers() {
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://www.werkenbijvopak.nl/" );
    }
    @Then("The Career page is visible")
    public void careerPageVisible() {
        driver.findElement(By.xpath("//*[@class='button-container align-left']"));
    }

    @Given("News tab is visible")
    public void NewsTabVisible() {
        driver.findElement(By.xpath("//*[@href='/nieuws']")).isDisplayed();
    }

    @When("User clicks on news tab")
    public void clickOnNewsTab() {
        driver.findElement(By.xpath("//*[@href='/nieuws']")).click();
    }

    @Then("The news content is visible")
    public void newsContentVisible() throws InterruptedException {
        jse.executeScript("window.scrollBy(0,250)");
        Thread.sleep(500);
        jse.executeScript("window.scrollBy(0,250)");
        Thread.sleep(500);
        jse.executeScript("window.scrollBy(0,-250)");
        Thread.sleep(500);
        jse.executeScript("window.scrollBy(0,-250)");
        Thread.sleep(500);
    }

    @Given("Security tab is visible")
    public void SecurityTabVisible() {
        driver.findElement(By.xpath("//*[@href='/veiligheid-duurzaamheid']")).isDisplayed();
    }

    @When("User clicks on security tab")
    public void clickOnSecurityTab() {
        driver.findElement(By.xpath("//*[@href='/veiligheid-duurzaamheid']")).click();
    }

    @Then("The content of security page is visible")
    public void VerifySecurityContent() throws InterruptedException {
        jse.executeScript("window.scrollBy(0,250)");
        Thread.sleep(500);
        jse.executeScript("window.scrollBy(0,250)");
        Thread.sleep(500);
        jse.executeScript("window.scrollBy(0,-250)");
        Thread.sleep(500);
        jse.executeScript("window.scrollBy(0,-250)");
        Thread.sleep(500);
    }

   @Given("Customer tab is visible")
    public void customerTabVisible() {
       driver.findElement(By.xpath("//*[@href='/klanten']")).isDisplayed();
   }

   @When("User clicks on customer tab")
    public void clickOnCustomerTab() {
       driver.findElement(By.xpath("//*[@href='/klanten']")).click();
   }

   @Then("The content of customer page is visible")
    public void contentCustomerPage () throws InterruptedException {
       jse.executeScript("window.scrollBy(0,250)");
       Thread.sleep(500);
       jse.executeScript("window.scrollBy(0,250)");
       Thread.sleep(500);
       jse.executeScript("window.scrollBy(0,-250)");
       Thread.sleep(500);
       jse.executeScript("window.scrollBy(0,-250)");
       Thread.sleep(500);
   }

   @Given("Transporter tab is visible")
    public void transporterTabVisible() {
       driver.findElement(By.xpath("//*[@href='/vervoerdersinformatie']")).isDisplayed();
   }

   @When("User clicks on transporter tab")
    public void clickOnTransporterTab () {
       driver.findElement(By.xpath("//*[@href='/vervoerdersinformatie']")).click();
   }

   @Then("The content of transporter page is visible")
    public void contentTransporterPage() throws InterruptedException {
       jse.executeScript("window.scrollBy(0,250)");
       Thread.sleep(500);
       jse.executeScript("window.scrollBy(0,250)");
       Thread.sleep(500);
       jse.executeScript("window.scrollBy(0,-250)");
       Thread.sleep(500);
       jse.executeScript("window.scrollBy(0,-250)");
       Thread.sleep(500);
   }

   @Given("About us tab is visible")
    public void aboutUsTabVisible () {
       driver.findElement(By.xpath("//*[@href='/over-ons']")).isDisplayed();
   }

   @When("User clicks on about us tab")
    public void clickOnAboutUsTab() {
       driver.findElement(By.xpath("//*[@href='/over-ons']")).click();
   }

   @Then("The content of about us page is visible")
    public void contentAboutUsePage() throws InterruptedException {
       jse.executeScript("window.scrollBy(0,250)");
       Thread.sleep(500);
       jse.executeScript("window.scrollBy(0,250)");
       Thread.sleep(500);
       jse.executeScript("window.scrollBy(0,-250)");
       Thread.sleep(500);
       jse.executeScript("window.scrollBy(0,-250)");
       Thread.sleep(500);
   }

   @Given("Locations tab is visible")
    public void locationsTabIsVisible () {
       driver.findElement(By.xpath("//*[@href='/locaties-nederland']")).isDisplayed();
   }

   @When("User clicks on locations tab")
    public void clickOnLocatgionsTab() {
       driver.findElement(By.xpath("//*[@href='/locaties-nederland']")).click();
   }

   @Then("The content of locations is visible")
    public void contentLocationsPage () throws InterruptedException {
       jse.executeScript("window.scrollBy(0,250)");
       Thread.sleep(500);
       jse.executeScript("window.scrollBy(0,250)");
       Thread.sleep(500);
       jse.executeScript("window.scrollBy(0,-250)");
       Thread.sleep(500);
       jse.executeScript("window.scrollBy(0,-250)");
       Thread.sleep(500);
   }
}

