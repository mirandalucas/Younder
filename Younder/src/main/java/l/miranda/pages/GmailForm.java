package l.miranda.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import l.miranda.core.BasePage;
import l.miranda.core.DriverFactory;

public class GmailForm extends BasePage
	{
		public void gmailHomePage()
		{
			DriverFactory.getDriver().get("https://accounts.google.com/ServiceLogin/identifier"
					+ "?service=mail&passive=true&rm=false&continue="
					+ "https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc"
					+ "=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName"
					+ "=GlifWebSignIn&flowEntry=ServiceLogin");
		}
		
		public void createAccount()
		{
//			clicarBotao("//*[@id='ow309']/span/span");
//			new WebDriverWait(DriverFactory.getDriver(), 20).until(ExpectedConditions.presenceOfElementLocated(
//					By.xpath("//*[@id='ow309']/span/span")));
//			DriverFactory.getDriver().findElement(By.xpath("//*[@id='ow309']/span/span")).click();
			
			clicarBotao("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[2]/div/div/span/span");
		}
	}
