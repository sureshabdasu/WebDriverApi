package org.openqa.selenium.ie;

import org.openqa.selenium.WebDriver;

public class InternetExplorerDriver implements WebDriver  {
	
	public InternetExplorerDriver() {
		
		System.out.println("Launching IE");
	}
	
    public void get(String url) {
		
		System.out.println("Navigating to the URL in IE");
	}

    public void getTitle() {
		
		System.out.println("Getting the title from current page in IE");
	}
	
	public void click() {
		
		System.out.println("Clicking on an Element in IE");
		
	}
	
	public void sendKeys() {
		
		System.out.println("Typing in an Element in IE");
		
	}

	@Override
	public void senKeys() {
		// TODO Auto-generated method stub
		
	}
}
