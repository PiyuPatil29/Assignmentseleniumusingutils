package com.testcases;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import com.keywords.Keywords;

import propertyutils.Propertyfile;

public class Assignment1_2 {
	
	
		@Test(priority = 1,enabled = true)
		public void TC_01() throws FileNotFoundException {
			Keywords.openBrowser(Propertyfile.getProperty("browsername"));
			Keywords.openURL(Propertyfile.getProperty("baseURL"));
			
			
	}

}
