public class selenium {
//
//import org.testng.annotations.Test;
//import pages.CreateCarPage;
//import pages.LoginPage;
//import pages.VehiclesPage;
//import tests.TestBase;
//    @FindBy(name = "custom_entity_type[Location]")
//    public WebElement locationElement;	    public WebElement locationElement;
//
//
//    @FindBy(xpath = "//div[@class='btn-group pull-right open']/button[contains(text(),'Save and Close')]")	    @FindBy(css = "[class='btn btn-success action-button']")
//    public WebElement saveAndCloseButtonElement;	    public WebElement saveAndCloseButtonElement;
//
//
//    @FindBy(css = "div[id*='FuelType']")	    @FindBy(css = "div[id*='FuelType']")
//    public class CreateCarTests extends TestBase {
//
//        @Test(description = "Create some random car")
//        public void test1(){
//            extentTest = extentReports.createTest("Create a new car");
//
//            LoginPage loginPage = new LoginPage();
//            VehiclesPage vehiclesPage = new VehiclesPage();
//            CreateCarPage createCarPage = new CreateCarPage();
//
//            loginPage.login("storemanager85", "UserUser123");
//            loginPage.navigateTo("Fleet", "Vehicles");
//
//            loginPage.waitUntilLoaderMaskDisappear();
//
//            vehiclesPage.clickToCreateACar();
//
//            loginPage.waitUntilLoaderMaskDisappear();
//
//            createCarPage.licensePlateElement.sendKeys("Random");
//            createCarPage.selectTags("Compact");
//            createCarPage.selectFuelType("Diesel");
//
//            loginPage.waitUntilLoaderMaskDisappear();
//            createCarPage.saveAndCloseButtonElement.click();
//
//            extentTest.pass("New car was created");
        }


