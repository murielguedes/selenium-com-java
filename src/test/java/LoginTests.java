import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTests {

    @Before
    public void abreBrowser(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muriel Guedes\\Documents\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //criamos um objeto e o nome e driver
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);// aguardar o browser abrir
    }

    @Test
    public void loginComSucesso(){// criamos um metodo: tipo do metodo (public), retorno do metodo (void) e nome do metodo


    }
    @Test
    public void loginSemSucesso(){// criamos um metodo: tipo do metodo (public), retorno do metodo (void) e nome do metodo


    }


}