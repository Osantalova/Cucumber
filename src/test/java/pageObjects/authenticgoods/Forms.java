package pageObjects.authenticgoods;

import StepDefinitions.CommonPage;
import org.openqa.selenium.By;
public class Forms extends CommonPage{

    public Forms(){
        super();
    }


    public void navigateTo(String arg0) {
        driver.navigate().to(arg0);
    }

    // Basic Form
    public void setEmail(String value){
        By Locator = By.id("exampleInputEmail1");
        getElement(Locator).sendKeys(value);
    }

    public void setPassword(String value){
        By Locator = By.id("exampleInputPassword1");
        getElement(Locator).sendKeys(value);
    }

    public void setFile(String value){
        By Locator = By.id("exampleInputFile");
        getElement(Locator).sendKeys(value);
    }

    public void clickButton(){
        By Locator = By.className("btn-primary");
        getElement(Locator).click();
    }


}



