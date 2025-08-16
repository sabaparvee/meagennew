package Tableware;
import com.maegen.baseTest.BaseClass;
import org.testng.annotations.Test;

import com.maegen.objectrepository.CheckoutPage;
import com.maegen.objectrepository.HomePage;
import com.maegen.objectrepository.ProductPage;
import com.maegen.objectrepository.TablewarePage;

public class TablewareTest extends BaseClass {
	@Test
	public void fTest() throws InterruptedException {
		HomePage hp=new HomePage(driver);
		hp.closePopUp();
		hp.getTablewareLnk().click();
		TablewarePage tp=new TablewarePage(driver);
		//fg.clickCategory("Home Fragrances");
		
		tp.SortBy2("Price, low to high", "Coaster | Olive");
		Thread.sleep(3000);
		//fg.clickProduct("");
		ProductPage pp=new ProductPage(driver);
		pp.clickPlusIcon();
		pp.clickAddToCart();
		hp.getCartLnk().click();
		CheckoutPage chk=new CheckoutPage(driver);
		chk.getDecreaseProductQuantity("Coaster | Olive").click();
		//chk.getIncreaseProductQuantity("Alchemist Candle | Sweet Pea & Honeysuckle").click();
		//chk.clickProduct("Alchemist Candle | Sweet Pea & Honeysuckle");
		chk.getCheckoutBtn().click();
		

	}
}
