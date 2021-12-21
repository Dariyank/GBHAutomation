package gbhhome;

import org.junit.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(PER_CLASS)
public class Solution {
    Actions actions;

    @Deprecated
    public void wait(WebDriver driver, String id){
        WebDriverWait wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
    }

    @Test
    public void solutionAll(WebDriver driver) throws InterruptedException {
        inovation(driver);
        Thread.sleep(5000);
        businesT(driver);
        Thread.sleep(5000);
        customSoftDev(driver);
        Thread.sleep(5000);
        agentChgStaffArg(driver);
        Thread.sleep(5000);
        soporteTi(driver);
        Thread.sleep(5000);
        protecionTi(driver);
        Thread.sleep(5000);
        comparacionPro(driver);
        Thread.sleep(5000);
        networkIt(driver);
        Thread.sleep(5000);
        microsoft(driver);
        Thread.sleep(5000);
    }

    public void solution(WebDriver driver){
        actions = new Actions(driver);
        wait(driver, "menu-item-4135");
        WebElement solution = driver.findElement(By.id("menu-item-4135"));
        actions.moveToElement(solution).perform();
    }

    public void inovation(WebDriver driver) throws InterruptedException {
        solution(driver);

        wait(driver, "menu-item-4139");
        WebElement subMenu = driver.findElement(By.id("menu-item-4139"));
        actions.moveToElement(subMenu).perform();
        subMenu.click();
        String example = "Innovation Squad | GBH";
        assertEquals(driver.getTitle(), example);
        wait(driver, "menu-item-2977");

        WebElement inicio = driver.findElement(By.id("menu-item-2977"));
        inicio.click();
    }

    public void businesT(WebDriver driver) throws InterruptedException {
        solution(driver);

        wait(driver, "menu-item-4140");
        WebElement subMenu = driver.findElement(By.id("menu-item-4140"));
        actions.moveToElement(subMenu).perform();
        subMenu.click();
        String example = "VCIO | GBH";
        assertEquals(driver.getTitle(), example);
        wait(driver, "menu-item-2977");

        WebElement inicio = driver.findElement(By.id("menu-item-2977"));
        inicio.click();
    }

    public void customSoftDev(WebDriver driver) throws InterruptedException {
        solution(driver);

        wait(driver, "menu-item-4141");
        WebElement subMenu = driver.findElement(By.id("menu-item-4141"));
        actions.moveToElement(subMenu).perform();
        subMenu.click();
        String example = "Custom Software Development | GBH";
        assertEquals(driver.getTitle(), example);
        wait(driver, "menu-item-2977");

        WebElement inicio = driver.findElement(By.id("menu-item-2977"));
        inicio.click();
    }

    public void agentChgStaffArg(WebDriver driver) throws InterruptedException {
        solution(driver);

        wait(driver, "menu-item-4142");
        WebElement subMenu = driver.findElement(By.id("menu-item-4142"));
        actions.moveToElement(subMenu).perform();
        subMenu.click();
        String example = "Staff Augmentation | GBH";
        assertEquals(driver.getTitle(), example);
        wait(driver, "menu-item-2977");

        WebElement inicio = driver.findElement(By.id("menu-item-2977"));
        inicio.click();
    }

    public void soporteTi(WebDriver driver) throws InterruptedException {
        solution(driver);

        wait(driver, "menu-item-4143");
        WebElement subMenu = driver.findElement(By.id("menu-item-4143"));
        actions.moveToElement(subMenu).perform();
        subMenu.click();
        wait(driver, "menu-item-4146");
        WebElement subSubMenu = driver.findElement(By.id("menu-item-4146"));
        actions.moveToElement(subMenu).perform();
        subSubMenu.click();
        String example = "Soporte de TI | GBH";
        assertEquals(driver.getTitle(), example);
        wait(driver, "menu-item-2977");

        WebElement inicio = driver.findElement(By.id("menu-item-2977"));
        inicio.click();
    }

    public void protecionTi(WebDriver driver) throws InterruptedException {
        solution(driver);

        wait(driver, "menu-item-4143");
        WebElement subMenu = driver.findElement(By.id("menu-item-4143"));
        actions.moveToElement(subMenu).perform();
        subMenu.click();
        wait(driver, "menu-item-4144");
        WebElement subSubMenu = driver.findElement(By.id("menu-item-4144"));
        actions.moveToElement(subMenu).perform();
        subSubMenu.click();
        String example = "IT Protection & Support | GBH";
        assertEquals(driver.getTitle(), example);
        wait(driver, "menu-item-2977");

        WebElement inicio = driver.findElement(By.id("menu-item-2977"));
        inicio.click();
    }

    public void comparacionPro(WebDriver driver) throws InterruptedException {
        solution(driver);

        wait(driver, "menu-item-4143");
        WebElement subMenu = driver.findElement(By.id("menu-item-4143"));
        actions.moveToElement(subMenu).perform();
        subMenu.click();
        wait(driver, "menu-item-4145");
        WebElement subSubMenu = driver.findElement(By.id("menu-item-4145"));
        actions.moveToElement(subMenu).perform();
        subSubMenu.click();
        String example = "Servicios de soporte de TI | GBH";
        assertEquals(driver.getTitle(), example);
        wait(driver, "menu-item-2977");

        WebElement inicio = driver.findElement(By.id("menu-item-2977"));
        inicio.click();
    }

    public void networkIt(WebDriver driver) throws InterruptedException {
        solution(driver);

        wait(driver, "menu-item-4160");
        WebElement subMenu = driver.findElement(By.id("menu-item-4160"));
        actions.moveToElement(subMenu).perform();
        subMenu.click();
        String example = "Network Solutions | GBH";
        assertEquals(driver.getTitle(), example);
        wait(driver, "menu-item-2977");

        WebElement inicio = driver.findElement(By.id("menu-item-2977"));
        inicio.click();
    }

    public void microsoft(WebDriver driver) throws InterruptedException {
        solution(driver);

        wait(driver, "menu-item-6198");
        WebElement subMenu = driver.findElement(By.id("menu-item-6198"));
        actions.moveToElement(subMenu).perform();
        subMenu.click();
        String example = "Microsoft 365 | GBH";
        assertEquals(driver.getTitle(), example);
        wait(driver, "menu-item-2977");

        WebElement inicio = driver.findElement(By.id("menu-item-2977"));
        inicio.click();
    }

}
