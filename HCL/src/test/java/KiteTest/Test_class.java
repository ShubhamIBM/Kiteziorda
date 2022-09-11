package KiteTest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Base1;
import Kite1.Kitehome;
import Kite1.Kiteloginpage1;
import Kite1.Kiteloginpage2;
import Utility.Utility_class;

public class Test_class extends Base1 {
	//decleare all useful memberss as globle
	
	Kiteloginpage1 login1;
	Kiteloginpage2 login2;
	Kitehome home;
	
	@BeforeClass
	public void openbrowser() {
		initilizeBrowser();
		
		login1=new Kiteloginpage1(driver);
		login2=new Kiteloginpage2(driver);
		home= new Kitehome(driver);
		
	}
	@BeforeMethod
	public void loginToApp() throws Throwable {
		 login1.enterUN(Utility_class.getTD(0, 0));
		 login1.enterpassword(Utility_class.getTD(0, 1));
		 login1.clikLOGINBTN();
		 
		 login2.enterpin(Utility_class.getTD(0, 2));
		 login2.clickcntBtn();
		 
		 
	}
	@Test
	public void verifyuserID() throws Throwable {
		Reporter.log("running verify user ID ",true);
		String actID = home.verifyuserID();
				String ExpID = Utility_class.getTD(0, 0);
				Assert.assertEquals(ExpID, actID, "Both are diff TC failed");
	}
	@AfterMethod
	public void logoutApp() {
		Reporter.log("logout the application",true);
		system.out.prinln("shubham");
	}
	@AfterClass
	public void closebrowser() {
	 Reporter.log("close the app",true);
	}

	

}
