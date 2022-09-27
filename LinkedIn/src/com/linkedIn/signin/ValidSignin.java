package com.linkedIn.signin;


import org.testng.annotations.Test;

import com.linkedIn.Pages.LoginPage;
import com.linkedIn.Pages.Valid;
import com.linkedIngenericLib.BaseTest;
import com.linkedIngenericLib.FileLib;

public class ValidSignin extends BaseTest{
	@Test
	public void signintoApp() throws Throwable
	{
		LoginPage lp=new LoginPage();
	 //FileLib fl=new  FileLib();
	/*String un= fl.readPropertyData(PROP_PATH, "username");
	String pd= fl.readPropertyData(PROP_PATH, "password");
	 lp.signin(un,pwd);*/
	/* lp.login(fl.readPropertyData(PROP_PATH,"username"),
			 fl.readPropertyData(PROP_PATH, "password"));*/
	//LoginPage lp=new LoginPage();
	 //Valid lp=new Valid();
	FileLib flib=new FileLib();
	lp.login(flib.readPropertyData(PROP_PATH, "username"), 
			flib.readPropertyData(PROP_PATH, "password"));

}
}
