package org.openqa.selenium.firefox;

import org.openqa.selenium.WebDriver;

//Way2automation.com selenium firefox - com.w2a.selenium.firefox

public class FireFoxDriver implements WebDriver {
	
	public FireFoxDriver() {
		
		System.out.println("Launching Firefox");
		
	}
	
	public void get(String url) {
		
		System.out.println("Navigating to the URL in Firefox");
	}
	
	
	public void getTitle() {
	
		System.out.println("Getting the title from current page in Firefox");
	}
	
	public void click() {
		
		System.out.println("Clicking on an Element in Firefox");
		
	}
	
	public void sendKeys() {
		
		System.out.println("Typing in an Element in Firefox");
		
	}

	@Override
	public void senKeys() {
		// TODO Auto-generated method stub
		
	}
	
	


}
