package Accessories;

import org.testng.annotations.Test;

import com.maegen.baseTest.BaseClass;
import com.maegen.objectrepository.AccessoriesPage;
import com.maegen.objectrepository.CheckoutPage;
import com.maegen.objectrepository.HomePage;
import com.maegen.objectrepository.ProductPage;

public class AccessoriesTest extends BaseClass {
	@Test
	public void fTest() throws InterruptedException {
		HomePage hp=new HomePage(driver);
		hp.closePopUp();
		hp.getAccessoriesLnk().click();
		AccessoriesPage ag=new AccessoriesPage(driver);
		ag.clickCategory("Incense Holders");
		Thread.sleep(3000);
		ag.SortBy2("Price, low to high", "Dimple | Blue");
		Thread.sleep(3000);
		//fg.clickProduct("");
		ProductPage pp=new ProductPage(driver);
		pp.clickPlusIcon();
		pp.clickAddToCart();
		hp.getCartLnk().click();
		CheckoutPage chk=new CheckoutPage(driver);
		chk.getDecreaseProductQuantity("Dimple | Blue").click();
		//chk.getIncreaseProductQuantity("Alchemist Candle | Sweet Pea & Honeysuckle").click();
		//chk.clickProduct("Alchemist Candle | Sweet Pea & Honeysuckle");
		chk.getCheckoutBtn().click();
		

	}
}
