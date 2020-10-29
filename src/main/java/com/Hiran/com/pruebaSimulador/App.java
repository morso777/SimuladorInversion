package com.Hiran.com.pruebaSimulador;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
	   
	   
    public static void main( String[] args ){
    WebDriver driver;  
    
    By perfil			= By.name("perfil");
	By valorAplicar   	= By.id("valorAplicar");
    By valorInvestir  	= By.id("valorInvestir");
    By tempo       		= By.id("tempo");
    By simular     		= By.xpath("//*[@id=\"formInvestimento\"]/div[5]/ul/li[2]/button");  
    					  
    By btnRefazer 		= By.xpath("/html/body/div[3]/div/div/div[1]/div/div[2]/a");
    By anos				= By.xpath("//*[@id=\"formInvestimento\"]/div[4]/div[2]/div[2]/ul/li[2]/a");
    By dropdown			= By.xpath("//*[@id=\"formInvestimento\"]/div[4]/div[2]/div[2]/a/span[4]");
    
    
    
      //Configurando webdriver
      System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
  	  driver = new ChromeDriver ();
  	  driver.get("https://www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/");
  	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	  JavascriptExecutor jse = (JavascriptExecutor)driver;
	  jse.executeScript("window.scrollBy(0,500)");
  	 
     	    	  
	 
	  //Perfil persona espacios en blanco
	  
	  //public void testUno() {
	  driver.findElement(simular).click();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.navigate().refresh();	
	  
	 
	//Perfil persona-inversion minima- ahorro minimo-tiempo minimo
	driver.findElement(perfil).click(); 
  	driver.findElement(valorAplicar).sendKeys("2000");
  	driver.findElement(valorInvestir).sendKeys("2000");
  	driver.findElement(tempo).sendKeys("1");
  	//simular
  	driver.findElement(simular).click();
  	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  	// Rehacer simulacion                          
  	driver.findElement(btnRefazer).click();
  	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  	
	  
	  //Perfil persona- inversion maxima- ahorro maximo- tiempo maximo
	  	driver.findElement(perfil).click();
	  	driver.findElement(valorAplicar).sendKeys ("999999900");
	  	driver.findElement(valorInvestir).sendKeys("999999900");
	  	driver.findElement(tempo).sendKeys("99");
	  	//click dropdown
	  	driver.findElement(dropdown).click();
	  	//selecciona años
	   	driver.findElement(anos).click();
	  	//simular
	  	driver.findElement(simular).click();
	  		
	  	driver.navigate().refresh();
	  
	  	     	
  	
  	
  	    //Perfil persona- inversion superior maxima- ahorro superior maximo- tiempo superior maximo
	  	driver.findElement(perfil).click();
	  	driver.findElement(valorAplicar).sendKeys ("999999901");
	  	driver.findElement(valorInvestir).sendKeys("999999901");
	  	driver.findElement(tempo).sendKeys("100");
	  	//dropdown
	  	driver.findElement(dropdown).click();
	  	//selecciona años
	  	driver.findElement(anos).click();
	  	//simular
	  	driver.findElement(simular).click();
	  	driver.navigate().refresh();
  	  
	  	
	  	  
	     //Perfil persona- caracteres raros meses
	  	driver.findElement(perfil).click();
	  	driver.findElement(valorAplicar).sendKeys ("$%&");
	  	driver.findElement(valorInvestir).sendKeys("$%&");
	  	driver.findElement(tempo).sendKeys("$%&");
	  	//simular
	  	driver.findElement(simular).click();
	  	driver.navigate().refresh();
	  
	  	
	  	 //Perfil persona- caracteres raros años
	  	driver.findElement(perfil).click();
	  	driver.findElement(valorAplicar).sendKeys ("$%&");
	  	driver.findElement(valorInvestir).sendKeys("$%&");
	  	driver.findElement(tempo).sendKeys("$%&");
	  	//dropdown
	  	driver.findElement(dropdown).click();
	  	//selecciona años
	  	driver.findElement(anos).click();
	  	//simular
	  	driver.findElement(simular).click();
	  	driver.navigate().refresh();
	  
    }
}
  	
  	

     


    


