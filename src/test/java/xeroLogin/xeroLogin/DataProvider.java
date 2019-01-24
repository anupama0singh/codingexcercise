package xeroLogin.xeroLogin;

import org.junit.Test;

public class DataProvider {
	@Test (dataProvider="DP")
	public void validateLogin(String username,String password)
	{
		System.out.println(username );
		System.out.println(password);
	}

}
