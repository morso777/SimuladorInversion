package com.Hiran.com.pruebaSimulador;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
	
	By perfil			= By.name("perfil");
	By valorAplicar   	= By.id("valorAplicar");
    By valorInvestir  	= By.id("valorInvestir");
    By Tempo       		= By.id("tempo");
    By simular     		= By.xpath("//*[@id=\"formInvestimento\"]/div[5]/ul/li[2]/button");
    By btnRefazer 		= By.xpath("/html/body/div[4]/div/div/div[1]/div/div[2]/a");
    
    
    		
    public static void main( String[] args ){
    WebDriver driver;  
    	
      //Configurando webdriver
      System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
  	  driver = new ChromeDriver ();
  	  driver.get("https://www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/");
  	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	  JavascriptExecutor jse = (JavascriptExecutor)driver;
	  jse.executeScript("window.scrollBy(0,500)");
  	 
	  //Perfil persona-inversion minima- ahorro minimo-tiempo minimo
  	driver.findElement(By.name("perfil")).click();
  	driver.findElement(By.id("valorAplicar")).sendKeys("2000");
  	driver.findElement(By.id("valorInvestir")).sendKeys("2000");
  	driver.findElement(By.id("tempo")).sendKeys("1");
  	driver.findElement(By.xpath("//*[@id=\"formInvestimento\"]/div[5]/ul/li[2]/button")).click();
  	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  	
  	driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/div/div[2]/a"));  	
  	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  	
  	/*
  	 //Perfil persona- inversion maxima- ahorro maximo- tiempo maximo
  	driver.findElement(By.name("perfil")).click();
  	driver.findElement(By.id("valorAplicar")).sendKeys("2000");
  	driver.findElement(By.id("valorInvestir")).sendKeys("2000");
  	driver.findElement(By.id("tempo")).sendKeys("99");
  	driver.findElement(By.name("seta")).click();
  	driver.findElement(By.xpath ("//*[@id=\"formInvestimento\"]/div[4]/div[2]/div[2]/ul/li[2]/a"));
  	driver.findElement(By.xpath("//*[@id=\"formInvestimento\"]/div[5]/ul/li[2]/button")).click();
  	 
  	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);*/
  	
    }
     

}
    


