package StepDefinitions;

import org.apache.tools.ant.taskdefs.WaitFor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import pageObjects.authenticgoods.Forms;
import utils.LocalDriver;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class CommonPage {
   public WebDriver driver;
   Wait<WebDriver> wait;

   public CommonPage(){
       this.driver = new LocalDriver().LocalDriver();
       wait = new FluentWait<>(driver)
               .withTimeout(Duration.ofSeconds(10))
               .pollingEvery(Duration.ofMillis(50))
               .ignoring(NoSuchElementException.class);
   }

   public WebElement getElement(By Locator){
       return wait.until(new Function<WebDriver, WebElement>(){
           public WebElement apply(WebDriver driver){
               return driver.findElement(Locator);
           }
       });
   }
}
