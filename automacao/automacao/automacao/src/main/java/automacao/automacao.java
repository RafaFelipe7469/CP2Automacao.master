package automacao;
import org.openqa.selenium.By;

import java.util.List;

import org.openqa.selenium.*;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class automacao {
	public static void main(String[] args) {
		
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Desktop\\CP02Compliance\\automacao\\automacao\\automacao\\src\\main\\java\\automacao\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com.br/");


        WebElement busca = driver.findElement(By.id("twotabsearchtextbox"));
        	
        
        busca.sendKeys("Playstation 5");
        

        busca.submit();
        
        WebElement conta = driver.findElement(By.id("nav-link-accountList"));

        conta.click();
        
        WebElement criarContaBotao = driver.findElement(By.id("createAccountSubmit"));

        criarContaBotao.click();


       
   
//        WebDriverWait(driver, 20).until(EC.element_to_be_clickable((
//        
		// If you want to Close the browser, uncomment this line
		// driver.quit();
    }
}
