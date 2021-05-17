package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class CriarContaDeAcessoTest {

	@Test
	void testCriarContaDeUsuarioComSucesso() {
		
		/*
		 * Função de teste para o passo 1 do caso de teste
		 */
		
		//apontando o local onde esta o driver do googlechrome..
		System.setProperty("webdriver.chrome.driver", "c:\\drivers\\chromedriver.exe");
		
		//Abrindo o navegador do googlechrome..
		WebDriver driver = new ChromeDriver();
		
		//acessar a página que será utilizada para testes
		driver.get("https://lojaexemplod.lojablindada.com/customer/account/create/");
		
		//maximizar a janela do navegador
		driver.manage().window().maximize();		
		
		//preencha o campo 'Primeiro nome'
		driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Alcino");
		
		//preencha o campo 'Ultimo nome'
		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("da Silva");
		
		//preencha o campo 'Email'
		driver.findElement(By.xpath("//*[@id=\"email_address\"]")).sendKeys("alcinogbsat@gmail.com");
		
		//preencha o campo 'Senha'
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("adminadmin");
		
		//preencha o campo 'Confirme a Senha'
		driver.findElement(By.xpath("//*[@id=\"confirmation\"]")).sendKeys("adminadmin");
		
		//enviar formulário
		driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div[3]/button")).click();
		
		//ler a  mensagem de cadastro com sucesso
				String mensa = driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div[1]/div/div/ul/li/ul/li/span")).getText();
		//Comparar a mesnagem agora
				assertEquals(mensa, "Obrigado por se registrar com LOJA EXEMPLO de Livros");
		//fechar o navegador
		driver.close();
	
		
			}
	
}


