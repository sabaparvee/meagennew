package SmokeTesting;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.maegen.baseTest.BaseClass;
import com.maegen.objectrepository.CheckoutPage;
import com.maegen.objectrepository.FragrancePage1;
import com.maegen.objectrepository.HomePage;
import com.maegen.objectrepository.ProductPage;

import junit.framework.Assert;

public class SmokeTest extends BaseClass{
	@Test
	public void SmokeAddCart() throws EncryptedDocumentException, IOException, InterruptedException {
		String SORTBY=elib.getStringDataFromExcel("Fragrance", 1, 2);
		String PRODUCTNAME=elib.getStringDataFromExcel("Fragrance", 1, 1);
		HomePage hp=new HomePage(driver);
		hp.closePopUp();
		hp.getFragranceLnk().click();
		FragrancePage1 fg=new FragrancePage1(driver);
		fg.SortBy2(SORTBY,PRODUCTNAME);
		Thread.sleep(3000);
		ProductPage pp=new ProductPage(driver);
		pp.clickPlusIcon();
		pp.clickAddToCart();
		hp.getCartLnk().click();
		CheckoutPage chk=new CheckoutPage(driver);
		chk.getDecreaseProductQuantity(PRODUCTNAME).click();
		String ACTUALPRODUCTNAME=chk.productName();
		Assert.assertEquals(PRODUCTNAME, ACTUALPRODUCTNAME);
	}
	@Test
	public void SmokeRemoveFromCart() throws EncryptedDocumentException, IOException, InterruptedException {
		String SORTBY=elib.getStringDataFromExcel("Fragrance", 1, 2);
		String PRODUCTNAME=elib.getStringDataFromExcel("Fragrance", 1, 1);
		HomePage hp=new HomePage(driver);
		hp.closePopUp();
		hp.getFragranceLnk().click();
		FragrancePage1 fg=new FragrancePage1(driver);
		fg.SortBy2(SORTBY,PRODUCTNAME);
		Thread.sleep(3000);
		ProductPage pp=new ProductPage(driver);
		pp.clickPlusIcon();
		pp.clickAddToCart();
		hp.getCartLnk().click();
		CheckoutPage chk=new CheckoutPage(driver);
		String ACTUALPRODUCTNAME=chk.productName();
		Assert.assertEquals(PRODUCTNAME, ACTUALPRODUCTNAME);
		chk.getRemoveProduct(PRODUCTNAME).click();
		String CARTINFO=chk.emptyCart();
		Assert.assertEquals(CARTINFO, "Your cart is empty");
		
	}

}
