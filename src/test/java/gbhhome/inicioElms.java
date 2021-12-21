package gbhhome;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/*import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.remote.RemoteWebElement;*/
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.testng.Assert.assertTrue;

public class inicioElms {

    @Deprecated
    /*public void wait(WebDriver driver, String id){
        WebDriverWait wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(id)));
    }*/

    @SuppressWarnings("unchecked")
    @Test
    public void checkElems(WebDriver driver){
        //wait(driver, "//*[@id=\"et-boc\"]/div/div/div");
        List<WebElement> inicioElementos = driver.findElements(By.xpath("//*[@id=\"et-boc\"]/div/div/div"));
        int size = inicioElementos.size();
        System.out.println("El tamaño de la lista es: " + size);
        /*for (WebElement elem : inicioElementos) {
            assert(elem.getText(), "");
        }*/
        String example = "GBH | Servicios informáticos en República Dominicana";
        assertEquals(driver.getTitle(), example);
    }
}
