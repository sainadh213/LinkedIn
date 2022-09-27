package com.linkedIn.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.linkedIngenericLib.BaseTest;

public class Valid {
	@FindBy(id="username") private WebElement untb;
	@FindBy(name="pwd") private WebElement pwtb;
	@FindBy(xpath = "//div[text()='Login ']") private WebElement loginBtn;
	
	
	public Valid()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}


	public WebElement getUntb() {
		return untb;
	}


	public void setUntb(WebElement untb) {
		this.untb = untb;
	}


	public WebElement getPwtb() {
		return pwtb;
	}


	public void setPwtb(WebElement pwtb) {
		this.pwtb = pwtb;
	}


	public WebElement getLoginBtn() {
		return loginBtn;
	}


	public void setLoginBtn(WebElement loginBtn) {
		this.loginBtn = loginBtn;
	}
	public void signin(String un,String pwd)
	{
		untb.sendKeys(un);
		pwtb.sendKeys(pwd);
		loginBtn.click();
	}
	

}
