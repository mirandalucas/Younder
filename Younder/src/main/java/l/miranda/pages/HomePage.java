package l.miranda.pages;

import l.miranda.core.BasePage;
import l.miranda.core.DriverFactory;

public class HomePage extends BasePage 
	{
		public void acessarTelaInicial()
			{
				DriverFactory.getDriver().get("https://www.fakenamegenerator.com/gen-random-us-us.php");
			}
	}
