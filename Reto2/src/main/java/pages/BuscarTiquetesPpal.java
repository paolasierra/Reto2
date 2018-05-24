package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class BuscarTiquetesPpal {

WebDriver driver;
	
	//CONSTRUCTOR
	public BuscarTiquetesPpal(WebDriver driver) {
		this.driver = driver;  
	} 
	
	public void esperar(WebDriver driver, int segundos) {
		synchronized (driver) {
			try {
				driver.wait(segundos * 1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	} 
	public void cerrarEmergente() {
		driver.findElement(By.xpath("/html/body/div[16]/div/div[1]/span")).click();
	}
	
	public void Vuelos() {
		esperar(driver, 5);
		driver.findElement(By.xpath("/html/body/div[8]/div[2]/div/ul/li[2] ")).click();
	}
	
	public void seleccionarOrigen() {
			esperar(driver, 5);
			driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div[3]/div[2]/div[1]/div[1]/div/div[1]/div/div/div/input")).clear();
			driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div[3]/div[2]/div[1]/div[1]/div/div[1]/div/div/div/input")).sendKeys("Medellín, Antioquia, Colombia");
			esperar(driver, 5);
			driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div[3]/div[2]/div[1]/div[1]/div/div[1]/div/div/div/input")).sendKeys(Keys.ENTER);
		}
	
	public void ingresarDestino() {
		esperar(driver, 5);
		driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div[3]/div[2]/div[1]/div[1]/div/div[2]/div/div/div/div/input")).clear();
		driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div[3]/div[2]/div[1]/div[1]/div/div[2]/div/div/div/div/input")).sendKeys("Cartagena de Indias, Bolívar, Colombia");
		esperar(driver, 5);
		driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div[3]/div[2]/div[1]/div[1]/div/div[2]/div/div/div/div/input")).sendKeys(Keys.ENTER);
	}
	
	public void fechaInicio()
	{
		esperar(driver, 5);
		driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[2]/i")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[2]/i")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[2]/i")).click();
		esperar(driver, 5);
		driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[5]/div[4]/span[1]")).click();
	}
	
	public void fechaRegreso()
	{
		esperar(driver, 5);
		driver.findElement(By.xpath("html/body/div[4]/div/div[4]/div[5]/div[4]/span[29]")).click();
	}
	
	public void numeroViajeros()
	{
		esperar(driver, 5);
		driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div[3]/div[2]/div[1]/div[2]/div[2]/div[6]/div[2]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/div/div[1]/div/div[1]/div[2]/div/a[2]")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/a")).click();
	}
	
	public void buscar()
	{
	driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div[3]/div[2]/div[4]/div/a")).click();
	}
}


