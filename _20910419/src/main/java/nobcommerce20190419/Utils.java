package nobcommerce20190419;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.NoSuchElementException;

public class Utils extends Basepage {
    static String actualResult;
    static Select value;
    static String timestamp;
    private Object WebElement;
    private By element;
    private String data;
    private Object Integer;
    private URI destination_folder;
    private String expectedResult;
    private Object ShootingStrategies;

    //1) Clicking element
    public static void clickElementBy(By by) {
        driver.findElement(by).click();
    }

    //2) Enter Text form inout box/area
    public static void enterText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    //3) Enter text in input field
    public static void enterText(By by) {
        driver.findElement(by).sendKeys("text");
    }

    //4) Clear and enter text in input field
    public static void clearAndEnterTextElement(By by) {
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys("text");
    }

    //5) Checking WebElement present in DOM
    public String elementPresent(By by) {
        try {
            driver.findElement(by).isEnabled();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
        //6) Checking WebElemnt displayed or not
        public boolean elementDisplayed (By by)
        {
            try {
                driver.findElement(by).isDisplayed();
                return true;
            } catch (NoSuchElementException e) {
                return false;
            }
        }
        //7) Wait for fixed time given in seconds
        public static void waitForWebElementToBeClickable (WebElement element,int seconds){
            WebDriverWait wait = new WebDriverWait(driver, seconds);
            wait.until(ExpectedConditions.elementToBeClickable(element));
        }
        //8) Try to click element three times if not available in first go
        public boolean retryForElement (By by){
        boolean result = false;
        int attempt = 0;
        while (attempt < 3) {
        try {
        Thread.sleep(10);
        driver.findElement(by).click();
        result = true;
        break;
        }
        catch (Exception e) {
        }
        attempt++;
        }
        return result;
        }
        //is dropdown present
        //select by text name from dropdown
        public static void selectBytext (By by, String data){
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(data);
        }
        //select by index value from dropdown
        public static void selectBytext (By by, Integer data){
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(data);
        }
        //select by index value from dropdown
        public static void selectByValue (By by, String data){
        Select select = new Select(driver.findElement(by));
        select.selectByValue(data);
        }
        //Wait for locator to be clickable for given time in seconds
        public static void waitForLocatorToBeClickable (By by,int seconds){
            WebDriverWait wait = new WebDriverWait(driver, seconds);
            wait.until(ExpectedConditions.elementToBeClickable(by));
        }
        //Wait for element to be clickable for given time in seconds
        //wait for visibility of element with given time
        public static void explicitWaitForVisibility (By by,int seconds){
            WebDriverWait wait = new WebDriverWait(driver, seconds);
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        }
        //date stamp short
        public static String ShortTimeStamp() {
        DateFormat dateFormat = new SimpleDateFormat("DD.MM.YY");
        Date date = new Date();
        String shortdate = dateFormat.format(date);
        return shortdate;
        }
        //date stamp long
        public static String LongTimeStamp() {
            DateFormat dateFormat = new SimpleDateFormat("DD.MMM.YYYY.HH.MM.SS");
            Date date = new Date();
            String longdate = dateFormat.format(date);
            return longdate;
        }
        // wait for element to be invisible
        public static void elementToBeInvisible(WebElement element, int seconds) {
        WebDriverWait wait = new WebDriverWait(driver, seconds);
        wait.until(ExpectedConditions.invisibilityOf(element));
        }
        // select from visible text
        public static void select (By by, String data){
            Select value = new Select(driver.findElement(by));
            value.selectByVisibleText(data);
        }
        // select from visible Number
        public static void selectVisibleNumber(By by, Integer data) {
        Select value = new Select(driver.findElement(by));
        value.selectByIndex(java.lang.Integer.parseInt(data));
        }
        // Select text from value
        public static String getActualText(By by) {
        return actualResult = driver.findElement(by).getText();
        }
        // scroll to view element
        public void scrollToElement(By by, WebElement element, int seconds) {
        try {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        driver.findElement(by);
        Thread.sleep(seconds);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        }
        // scroll to element and click
        public void scrollTillElementFoundAndClick(By by, WebElement element) {
       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
       driver.findElement(by).click();
        }

        // Wait for alert to display
        public boolean isAlertPresent() {
        boolean present = false;
        try {
       // Check the presence of alert
        Alert alert = driver.switchTo().alert();
       // Alert present; set the flag
        present = true;
       // if present consume the alert
        alert.accept();
        } catch (NoAlertPresentException ex) {
       // Alert not present
       ex.printStackTrace();
        }
       return present;
        }

       // get attribute of element
        public static String getAttributeOfElement(WebElement element, String attr) {
        String value = element.getAttribute(attr);
        return value;
        }

        // get css property of element
        public String getCssPropOfElement(WebElement element, String css) {
        String value = element.getCssValue(css);
        return value;
        }

        //  take screenshot of browser
        public void takeScreenShotOfBrowser(String destination_folder) throws IOException {
        com.sun.java.util.jar.pack.Package.File source_folder = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source_folder, new File(destination_folder));
        }

        // take screenshot of current display (full)
        public void takeScreenShotOfCurrentDisplayFull(String destination_folder) throws IOException {
        Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(500)).takeScreenshot(BasePage.driver);
        ImageIO.write(screenshot.getImage(), "JPG", new File(destination_folder));
        }

        // convert date to string
        public String dateToString() {
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("ddmmyy");
        String strDate = dateFormat.format(date);
       return strDate;
        }
        // find the element
        public static void findElementBy (By by){
            driver.findElement(by);
        }

        //select the element
        public static void selectBy (By by){
            driver.findElement(by).isSelected();
        }

        //get the text value from the element
        public static String getActualText (By by){
            return actualResult = driver.findElement(by).getText();
        }
        //assert with expected and actual result
        public static void validation (String expectedResult)
        {
            Assert.assertEquals(actualResult, expectedResult);
        }
        
        //wait for Webelement to be clickable for given time in seconds
        //Wait for fixed time given in seconds
        public static void waitForLocatorToBeclickable (By by,int seconds){
            WebDriverWait wait = new WebDriverWait(driver, seconds);
            wait.until(ExpectedConditions.elementToBeClickable(by));
        }
    }

    }



