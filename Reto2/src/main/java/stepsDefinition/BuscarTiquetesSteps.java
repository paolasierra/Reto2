package stepsDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BuscarTiquetesPpal;

public class BuscarTiquetesSteps {
	private WebDriver driver;
	BuscarTiquetesPpal Principal;
	@Before
	
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Principal=new BuscarTiquetesPpal(driver);

		
	}

	@Given ("El usuario esta en la pagina de Despegar")
	public void ingresarPaginaDespegar() {
		driver.get("https://www.despegar.com.co/");
	}
    @When ("el usuario ingrese a buscar vuelos")
    public void ingresarBusquedaVuelos() {
    	Principal.cerrarEmergente();
    	Principal.Vuelos();
    	Principal.seleccionarOrigen();
    	Principal.ingresarDestino();
    	Principal.fechaInicio();
    	Principal.fechaRegreso();
    	Principal.numeroViajeros();
    	Principal.buscar();
    }
    @And ("selecciona origen")
    public void seleccionarOrigen() {
    	
    }
    @And ("ingresa destino")
    public void ingresarDestino() {
    	
    }
    @And ("escoge fecha inicio")
    public void escogerFechaInicio() {
    	
    }
    @And ("selecciona fecha regreso")
    public void seleccionarFechaRegreso() {
    	
    }
    @And ("escoge numero viajeros")
    public void escogerNumeroViajeros() {
    	
    }
    @And ("da click en botón buscar")
    public void clickenBuscar() {
    	
    }
    @And ("el usuario almacena los precios mas baratos en un Excel")
    public void almacenarPreciosExcel() {
    	
    }
    @Then ("el usuario visualiza en excel el tiquete mas barato resaltado en verde")
    public void visualizarMasBaratoExcel() {
    	
    }
}

