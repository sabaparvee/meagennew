package Gift;

import org.testng.annotations.Test;

import com.maegen.baseTest.BaseClass;
import com.maegen.objectrepository.CheckoutPage;
import com.maegen.objectrepository.GiftPage;
import com.maegen.objectrepository.HomePage;

public class GiftTest extends BaseClass{
	@Test
	public void fTest() throws InterruptedException {
		HomePage hp=new HomePage(driver);
		hp.closePopUp();
		hp.getGiftCardLnk().click();
		GiftPage gp=new GiftPage(driver);
		gp.SelectGift("£50.00").click();
		gp.getPlusBtn().click();
		gp.addtoCart();
		hp.getCartLnk().click();
		CheckoutPage chk=new CheckoutPage(driver);
		chk.getCheckoutBtn().click();
		

	}
}
