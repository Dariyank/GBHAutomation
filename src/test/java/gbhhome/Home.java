package gbhhome;


import browser.BrowserGetter;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(PER_CLASS)
public class Home {
    private WebDriver driver;
    private final BrowserGetter browser = new BrowserGetter();

    @BeforeTest
    void beforeClass() throws InterruptedException {
        driver = browser.getChromeDriver();
        driver.manage().window().maximize();
        String example = "GBH | Servicios informáticos en República Dominicana";
        driver.get("https://gbh.com.do/es/");
        Thread.sleep(10000);
        assertEquals(example, driver.getTitle());
    }

    @Test(priority = 1)
    public void inicio() throws InterruptedException{
        /*inicioElms elems = new inicioElms();
        elems.checkElems(driver);
        Thread.sleep(5000);*/
    }

    @Test(priority = 2)
    public void soluciones() throws InterruptedException {
        Solution step1 = new Solution();
        step1.solutionAll(driver);
        Thread.sleep(5000);
    }

    @Test(priority = 3)
    public void quienesSomos() throws InterruptedException{
        QuienesSomos step2 = new QuienesSomos();
        step2.quienesSomosAll(driver);
        Thread.sleep(5000);
    }

    @Test(priority = 4)
    public void casosDeEstudios() throws InterruptedException {
        CasosDeEstudio step3 = new CasosDeEstudio();
        step3.casosDeEst(driver);
        Thread.sleep(5000);
    }

    @Test(priority = 5)
    public void empleos() throws InterruptedException {
        Empleos step4 = new Empleos();
        step4.empleos(driver);
        Thread.sleep(5000);
    }

    @AfterTest
    void afterClass() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}