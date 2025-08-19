package Gift;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.maegen.baseTest.BaseClass;
import com.maegen.objectrepository.CheckoutPage;
import com.maegen.objectrepository.GiftPage;
import com.maegen.objectrepository.HomePage;

public class GiftTest extends BaseClass{
	@Test
	public void fTest() throws InterruptedException, EncryptedDocumentException, IOException {
		String PRICE=elib.getStringDataFromExcel("GiftCard", 0, 2);

		HomePage hp=new HomePage(driver);
		hp.closePopUp();
		hp.getGiftCardLnk().click();
		GiftPage gp=new GiftPage(driver);
		gp.SelectGift(PRICE).click();
		gp.getPlusBtn().click();
		gp.addtoCart();
		hp.getCartLnk().click();
		CheckoutPage chk=new CheckoutPage(driver);
		chk.getCheckoutBtn().click();
		

	}
}
