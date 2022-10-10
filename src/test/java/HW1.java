import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class HW1 {

    WebDriver wd;
    @BeforeMethod
    public void Seaching(){
        wd = new ChromeDriver();
        wd.navigate().to("https://www.w3schools.com/css/css_table.asp");
    }

    @Test

    public void FrCh()
    {
        /*WebElement FranCh = wd.findElement(By.cssSelector("tr:nth-child(4) td:nth-child(2)"));
        String text1 = FranCh.getText();
        System.out.println(text1);
        Assert.assertEquals(text1,"Francisco Chang");*/
    }

    @Test

    public void PrintFromTable(){
        /*List<WebElement> Naims = wd.findElements(By.cssSelector("#customers tr"));
        System.out.println(Naims.size());

        for(WebElement naime:Naims){
            System.out.println(naime.getText());
        }

        List<WebElement> countries = wd.findElements(By.cssSelector("#customers td:last-child"));
        System.out.println(countries.size());

        for (WebElement country:countries){
            System.out.println(country.getText());
        }
        List<WebElement> companes = wd.findElements(By.cssSelector("#customers td:nth-child(1),#customers th:first-child"));
        System.out.println(companes.size());
        for (WebElement company:companes)
        {
            System.out.println(company.getText());
        }*/
        List<WebElement> row33 = wd.findElements(By.cssSelector("#customers tr:nth-child(3)"));
        for (WebElement row:row33){
        System.out.println(row.getText());}

        //Assert.assertEquals(shura,"Berglunds snabbköp Christina Berglund Sweden");


        {
            
        }


    }

    @AfterMethod
    public void tearDown()
    {
        wd.quit();
    }

}
