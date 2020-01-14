package l.miranda.tests;

import org.junit.Test;

import l.miranda.core.BaseTest;
import l.miranda.pages.GmailForm;
import l.miranda.pages.UserInfo;

public class Buscar extends BaseTest {

	UserInfo user = new UserInfo();
	GmailForm gmail = new GmailForm();
	
	@Test
	public void getUserInfo()
	{
		user.getName();
		user.getUserName();
		user.getBirthday();
		user.getPwd();
		user.getCountryCode();
		user.getphone();
	}
	
	@Test
	public void createEmail()
	{
		gmail.gmailHomePage();
		gmail.createAccount();
	}
}