import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTests {
    WebDriver driver;
    @Before
    public void abreBrowser(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muriel Guedes\\Documents\\driver\\chromedriver.exe");
        driver = new ChromeDriver(); //criamos um objeto e o nome e driver
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);// aguardar o browser abrir
    }

    @Test
    public void cadastroComSucesso(){// criamos um metodo: tipo do metodo (public), retorno do metodo (void) e nome do metodo

        driver.get("https://inscricoes.agilebrazil.com/users/sign_in");//Abre URL
        //Aguardar um tempo
        driver.findElement(By.linkText("Registro")).click(); // clicar no link registro
        //Aguardar um tempo
        driver.findElement(By.id("user_first_name")).sendKeys("Muriel");// inserir o nome
        driver.findElement(By.id("user_last_name")).sendKeys("Guedes");// inserir sobrenome
        driver.findElement(By.id("user_email")).sendKeys("muriguedes@mailnator.com");//inserir email
        driver.findElement(By.id("user_password")).sendKeys("1234567");//inserir senha
        driver.findElement(By.id("user_password_confirmation")).sendKeys("1234567");//inserir confirmação de senha
        driver.findElement(By.xpath("//*[@id=\"new_user\"]/div[6]/input")).click(); //Clicar Registro
    }
    @Test
    public void loginSemSucesso(){// criamos um metodo: tipo do metodo (public), retorno do metodo (void) e nome do metodo


    }


}