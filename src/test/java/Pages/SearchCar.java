package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SearchCar extends BasePage{
    public SearchCar(WebDriver driver) {
        super(driver);
    }


    public void inputTextWithoutZipCode(String car) throws InterruptedException {
        File document = new File ("C:\Users\RositaMargarita\Downloads\rows.json");

        searchcar(document, car)
    }

    public void searchcar (document, string car){
        try {
            if(document.exists()){
                BufferedReader scandocument = new BufferedReader(newReader(document));
                String labelread;

                while((labelread = scandocument.readLine()) != null) {
                    labelfull = labelfull + 1;

                    for (int 1 = 0 ; 1 < label.length ; 1++) {
                        if (label(1).assertEquals(label){
                            totaly = totaly +1 ;
                            System.out.println(labelfull+totaly);
                         }
                    }
                }
            }
        }
    } 
    

}
