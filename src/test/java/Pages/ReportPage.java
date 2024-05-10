package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReportPage extends BasePage{
    public ReportPage(WebDriver driver) {
        super(driver);
    }

    private final WebElement firstresult = FindElement(By.xpath("//*[@id="content"]/div[2]/div/section[1]/div[2]/ul/li[1]/div/h3/a"));
    private final WebElement report = FindElement(By.xpath("//*[@id="dataset-resources"]/ul/li[3]/div/a"))
    
    public void clickfisrtresult() throws InterruptedException {
        ExplicitTime();
        Click(firstresult);
    }

     public void downloadreport() throws InterruptedException {
        ExplicitTime();
        Click(report);
    }

    
