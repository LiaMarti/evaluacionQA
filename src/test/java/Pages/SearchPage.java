package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SearchPage extends BasePage{
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    private final WebElement labelsearch = FindElement(By.xpath("//*[@id="dataset-search"]/span/label"));
    private final WebElement buttonSeacrch = FindElement(By.xpath("//*[@id="dataset-search"]/span/button"));
   
    public void inputTextWithoutZipCode(String product) throws InterruptedException {
        Type(labelsearch, product);
        ExplicitTime(3);
        Click(buttonSearch);
    }

