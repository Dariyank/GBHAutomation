package gbhhome;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class QuienesSomos {
    Actions actions;

    @Deprecated
    public void wait(WebDriver driver, String id){
        WebDriverWait wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
    }

    @Test
    public void quienesSomosAll(WebDriver driver) throws InterruptedException {
        sobreNosotros(driver);
        Thread.sleep(3000);
        nosDiferencia(driver);
        Thread.sleep(3000);
        blog(driver);
        Thread.sleep(3000);
    }

    @Test
    public void quienesSomos(WebDriver driver){
        actions = new Actions(driver);
        wait(driver, "menu-item-4132");
        WebElement quienesS = driver.findElement(By.id("menu-item-4132"));
        actions.moveToElement(quienesS).perform();
    }

    @Test
    public void sobreNosotros(WebDriver driver) throws InterruptedException {
        quienesSomos(driver);

        wait(driver, "menu-item-4133");
        WebElement subMenu = driver.findElement(By.id("menu-item-4133"));
        actions.moveToElement(subMenu);
        subMenu.click();
        String example = "Sobre Nosotros | GBH";
        assertEquals(driver.getTitle(), example);
        wait(driver, "menu-item-2977");

        WebElement inicio = driver.findElement(By.id("menu-item-2977"));
        inicio.click();
    }

    @Test
    public void nosDiferencia(WebDriver driver) throws InterruptedException {
        quienesSomos(driver);

        wait(driver, "menu-item-4134");
        WebElement subMenu = driver.findElement(By.id("menu-item-4134"));
        actions.moveToElement(subMenu);
        subMenu.click();
        String example = "Lo que nos diferencia | GBH";
        assertEquals(driver.getTitle(), example);
        wait(driver,"menu-item-2977");

        WebElement inicio = driver.findElement(By.id("menu-item-2977"));
        inicio.click();
    }

    @Test
    public void blog(WebDriver driver) throws InterruptedException {
        quienesSomos(driver);

        wait(driver, "menu-item-4664");
        WebElement subMenu = driver.findElement(By.id("menu-item-4664"));
        actions.moveToElement(subMenu);
        subMenu.click();
        String example = "Blog | GBH";
        assertEquals(driver.getTitle(), example);
        wait(driver, "menu-item-2977");

        WebElement inicio = driver.findElement(By.id("menu-item-2977"));
        inicio.click();
    }
}
