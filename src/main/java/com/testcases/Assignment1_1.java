package com.testcases;
//Assignment1:

//Use https://letskodeit.teachable.com/p/practice
//1.Enter name in "Enter Your Name" field.Click on Confirm button.Check value entered in the field indeed exists in the messaage
//shown by confirmation window.Close confirmation window by clicking on No button

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.keywords.Keywords;
import propertyutils.Propertyfile;

public class Assignment1_1 {
	@Test(priority = 1,enabled = true)
	public void TC_01() throws FileNotFoundException {
		Keywords.openBrowser(Propertyfile.getProperty("browsername"));
		Keywords.openURL(Propertyfile.getProperty("baseURL"));
		Keywords.maximizeBrowser();
		Assert.assertEquals(Propertyfile.getProperty("baseURL"), "https://letskodeit.teachable.com/p/practice");
		System.out.println("Assert is Passed");
	}
		@Test(priority = 2,enabled = true)
        public void TC_02() throws InterruptedException, IOException {
		Keywords.enterText(Propertyfile.getLocator("enterText")[0], Propertyfile.getLocator("enterText")[1],"Priyanka");
		Keywords.clickonElement(Propertyfile.getLocator("clickonsearch")[0],Propertyfile.getLocator("clickonsearch")[1]);
		Keywords.applyWait();
		Keywords.ifAlert();
		Keywords.closeBrowser();
}
	}


