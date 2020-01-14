package l.miranda.pages;

import org.openqa.selenium.By;

import l.miranda.core.BasePage;

public class UserInfo extends BasePage
	{
		public String name;
		public String phone;
		public String countryCode;
		public String birthday;
		public String userName;
		public String pwd;
	
		public void getName()
			{
				name = obterTexto(By.xpath("//*[@id=\"details\"]/div[2]/div[2]/div/div[1]/h3"));
			}
		
		public void getphone()
			{
				phone = obterTexto(By.xpath("//*[@id=\"details\"]/div[2]/div[2]/div/div[2]/dl[4]/dd"));
			}
		
		public void getCountryCode()
			{
				countryCode = obterTexto(By.xpath("//*[@id=\"details\"]/div[2]/div[2]/div/div[2]/dl[5]/dd"));
			}
		
		public void getBirthday()
			{
				birthday = obterTexto(By.xpath("//*[@id=\"details\"]/div[2]/div[2]/div/div[2]/dl[6]/dd"));
			}
		
		public void getUserName()
			{
				userName = obterTexto(By.xpath("//*[@id=\"details\"]/div[2]/div[2]/div/div[2]/dl[10]/dd"));
			}
		
		public void getPwd()
			{
				pwd = obterTexto(By.xpath("//*[@id=\"details\"]/div[2]/div[2]/div/div[2]/dl[11]/dd"));
			}
	}