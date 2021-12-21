package gbhhome;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Empleos {
    Actions actions;

    @Deprecated
    public void wait(WebDriver driver, String id){
        WebDriverWait wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
    }

    @Test
    public void empleos(WebDriver driver){
        actions = new Actions(driver);
        wait(driver, "menu-item-2980");
        WebElement casosDeEst = driver.findElement(By.id("menu-item-2980"));
        actions.moveToElement(casosDeEst).perform();
        casosDeEst.click();
        String example = "Empleos | GBH";
        assertEquals(driver.getTitle(), example);
        wait(driver, "menu-item-2977");

        WebElement inicio = driver.findElement(By.id("menu-item-2977"));
        inicio.click();
    }
}