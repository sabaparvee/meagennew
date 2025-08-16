package Fragrance;

import org.testng.annotations.Test;

import com.maegen.baseTest.BaseClass;
import com.maegen.objectrepository.CheckoutPage;
import com.maegen.objectrepository.FragrancePage1;
import com.maegen.objectrepository.HomePage;
import com.maegen.objectrepository.ProductPage;

public class FragranceTest extends BaseClass {
	@Test
public void fTest() throws InterruptedException {
	HomePage hp=new HomePage(driver);
	hp.closePopUp();
	hp.getFragranceLnk().click();
	FragrancePage1 fg=new FragrancePage1(driver);
	fg.scrollPrice("3");
	fg.SortBy2("Price, low to high", "Room Spray | Green Tea & Lemon");
	Thread.sleep(3000);
	ProductPage pp=new ProductPage(driver);
	pp.clickPlusIcon();
	pp.clickAddToCart();
	hp.getCartLnk().click();
	CheckoutPage chk=new CheckoutPage(driver);
	chk.getDecreaseProductQuantity("Room Spray | Green Tea & Lemon").click();
	chk.getCheckoutBtn().click();
	

}
}
