import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class FormularioTest {
    WebDriver driver;

    @Test
    public void preencherFormulariosComSucesso(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Muriel Guedes\\Documents\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//escolher o browser/abrir o browser
        driver.get("https://ultimateqa.com/filling-out-forms/");//digitar a url
        driver.findElement(By.id("et_pb_contact_name_0")).click();
        driver.findElement(By.id("et_pb_contact_name_0")).sendKeys("Muriel");//preencher o campo nome 1
        driver.findElement(By.id("et_pb_contact_message_0")).click();
        driver.findElement(By.id("et_pb_contact_message_0")).sendKeys("Sucesso");//preencher o campo mensagem 1
        driver.findElement(By.xpath("//*[@id=\"et_pb_contact_form_1\"]/div[2]/form/div/button")).click();//clicar no botão 1
        //assertEquals("Thanks for contacting us", driver.findElement(By.className("et-pb-contact-message")));//assert para validar a mensagem de sucesso
        //preencher o campo nome 2
        //preencher o campo mensagem 2
        //preencher campo da soma
        //clicar no botão 2



    }

}
