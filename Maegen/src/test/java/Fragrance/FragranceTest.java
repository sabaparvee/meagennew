package Fragrance;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.maegen.baseTest.BaseClass;
import com.maegen.objectrepository.CheckoutPage;
import com.maegen.objectrepository.FragranceHoverPage;
import com.maegen.objectrepository.FragrancePage1;
import com.maegen.objectrepository.HomePage;
import com.maegen.objectrepository.PayPage;
import com.maegen.objectrepository.ProductPage;

import junit.framework.Assert;

public class FragranceTest extends BaseClass {
	@Test
	public void fTest() throws InterruptedException, EncryptedDocumentException, IOException {
		String SORTBY = elib.getStringDataFromExcel("Fragrance", 1, 2);
		String PRODUCTNAME = elib.getStringDataFromExcel("Fragrance", 1, 1);
		String CONTACT=elib.getStringDataFromExcel("Address", 0, 1);
		String COUNTRY=elib.getStringDataFromExcel("Address", 1, 1);
		String FIRSTNAME=elib.getStringDataFromExcel("Address", 2, 1);
		String LASTNAME=elib.getStringDataFromExcel("Address", 3, 1);
		String ADDRESS=elib.getStringDataFromExcel("Address", 4, 1);
		String APARTMENT=elib.getStringDataFromExcel("Address", 5, 1);
		String STATE=elib.getStringDataFromExcel("Address", 6, 1);
		String CITY=elib.getStringDataFromExcel("Address", 7, 1);
		String PINCODE=elib.getStringDataFromExcel("Address", 8, 1);
		String PHONE=elib.getStringDataFromExcel("Address", 9, 1);
		HomePage hp = new HomePage(driver);
		try {
			hp.closePopUp();	
		}catch(Exception e) {	
		}
		hp.getFragranceLnk().click();
		FragrancePage1 fg = new FragrancePage1(driver);
		fg.SortBy2(SORTBY, PRODUCTNAME);
		Thread.sleep(3000);
		ProductPage pp = new ProductPage(driver);
		pp.clickPlusIcon();
		pp.clickAddToCart();
		hp.getCartLnk().click();
		CheckoutPage chk = new CheckoutPage(driver);
		chk.getDecreaseProductQuantity(PRODUCTNAME).click();
		String ACTUALPRODUCTNAME = chk.productName();
		Assert.assertEquals(PRODUCTNAME, ACTUALPRODUCTNAME);
		chk.getCheckoutBtn().click();
		PayPage pap = new PayPage(driver);
		pap.Address(CONTACT,COUNTRY,FIRSTNAME,LASTNAME,ADDRESS,APARTMENT,STATE,CITY,PINCODE,PHONE);
		


	}

	/*@Test
	public void FragrancewithPrice() throws InterruptedException, EncryptedDocumentException, IOException {
		String PRICE = elib.getStringDataFromExcel("Fragrance", 13, 3);
		String PRODUCTNAME = elib.getStringDataFromExcel("Fragrance", 13, 1);
		String SORTBY = elib.getStringDataFromExcel("Fragrance", 13, 2);
		HomePage hp = new HomePage(driver);
		hp.closePopUp();
		hp.getFragranceLnk().click();
		FragrancePage1 fg = new FragrancePage1(driver);
		fg.scrollPrice(PRICE);
		fg.SortBy2(SORTBY, PRODUCTNAME);
		Thread.sleep(3000);
		ProductPage pp = new ProductPage(driver);
		pp.clickPlusIcon();
		pp.clickAddToCart();
		hp.getCartLnk().click();
		CheckoutPage chk = new CheckoutPage(driver);
		chk.getDecreaseProductQuantity(PRODUCTNAME).click();
		String ACTUALPRODUCTNAME = chk.productName();
		Assert.assertEquals(PRODUCTNAME, ACTUALPRODUCTNAME);
		chk.getCheckoutBtn().click();

	}*/

	@Test
	public void FragrancewithCategory() throws InterruptedException, EncryptedDocumentException, IOException {
		String PRODUCTNAME = elib.getStringDataFromExcel("Fragrance", 7, 1);
		String SORTBY = elib.getStringDataFromExcel("Fragrance", 7, 2);
		String CATEGORY = elib.getStringDataFromExcel("Fragrance", 7, 0);
		String CONTACT=elib.getStringDataFromExcel("Address", 0, 1);
		String COUNTRY=elib.getStringDataFromExcel("Address", 1, 1);
		String FIRSTNAME=elib.getStringDataFromExcel("Address", 2, 1);
		String LASTNAME=elib.getStringDataFromExcel("Address", 3, 1);
		String ADDRESS=elib.getStringDataFromExcel("Address", 4, 1);
		String APARTMENT=elib.getStringDataFromExcel("Address", 5, 1);
		String STATE=elib.getStringDataFromExcel("Address", 6, 1);
		String CITY=elib.getStringDataFromExcel("Address", 7, 1);
		String PINCODE=elib.getStringDataFromExcel("Address", 8, 1);
		String PHONE=elib.getStringDataFromExcel("Address", 9, 1);
		HomePage hp = new HomePage(driver);
		try {
			hp.closePopUp();	
		}catch(Exception e) {
		
		}
		hp.getFragranceLnk().click();
		FragrancePage1 fg = new FragrancePage1(driver);
		fg.clickCategory(CATEGORY);
		Thread.sleep(3000);
		// fg.scrollPrice(PRICE);
		fg.SortBy2(SORTBY, PRODUCTNAME);
		Thread.sleep(3000);
		ProductPage pp = new ProductPage(driver);
		pp.clickPlusIcon();
		pp.clickAddToCart();
		hp.getCartLnk().click();
		CheckoutPage chk = new CheckoutPage(driver);
		chk.getDecreaseProductQuantity(PRODUCTNAME).click();
		String ACTUALPRODUCTNAME = chk.productName();
		Assert.assertEquals(PRODUCTNAME, ACTUALPRODUCTNAME);
		chk.getCheckoutBtn().click();
		PayPage pap = new PayPage(driver);
		pap.Address(CONTACT,COUNTRY,FIRSTNAME,LASTNAME,ADDRESS,APARTMENT,STATE,CITY,PINCODE,PHONE);

		

	}

	@Test
	public void fragranceHover() throws InterruptedException, EncryptedDocumentException, IOException {
		String SORTBY = elib.getStringDataFromExcel("Fragrance", 10, 2);
		String PRODUCTNAME = elib.getStringDataFromExcel("Fragrance", 10, 1);
		String CONTACT=elib.getStringDataFromExcel("Address", 0, 1);
		String COUNTRY=elib.getStringDataFromExcel("Address", 1, 1);
		String FIRSTNAME=elib.getStringDataFromExcel("Address", 2, 1);
		String LASTNAME=elib.getStringDataFromExcel("Address", 3, 1);
		String ADDRESS=elib.getStringDataFromExcel("Address", 4, 1);
		String APARTMENT=elib.getStringDataFromExcel("Address", 5, 1);
		String STATE=elib.getStringDataFromExcel("Address", 6, 1);
		String CITY=elib.getStringDataFromExcel("Address", 7, 1);
		String PINCODE=elib.getStringDataFromExcel("Address", 8, 1);
		String PHONE=elib.getStringDataFromExcel("Address", 9, 1);
		HomePage hp = new HomePage(driver);
		try {
			hp.closePopUp();	
		}catch(Exception e) {
		
		}
		hp.Hover(hp.getFragranceLnk());
		FragranceHoverPage fhg = new FragranceHoverPage(driver);
		fhg.getDiffusersLnk().click();
		FragrancePage1 fg = new FragrancePage1(driver);
		fg.SortBy2(SORTBY, PRODUCTNAME);
		Thread.sleep(3000);
		ProductPage pp = new ProductPage(driver);
		pp.clickPlusIcon();
		pp.clickAddToCart();
		hp.getCartLnk().click();
		CheckoutPage chk = new CheckoutPage(driver);
		chk.getDecreaseProductQuantity(PRODUCTNAME).click();
		String ACTUALPRODUCTNAME = chk.productName();
		Assert.assertEquals(PRODUCTNAME, ACTUALPRODUCTNAME);
		chk.getCheckoutBtn().click();
		PayPage pap = new PayPage(driver);
		Thread.sleep(8000);
		pap.Address(CONTACT,COUNTRY,FIRSTNAME,LASTNAME,ADDRESS,APARTMENT,STATE,CITY,PINCODE,PHONE);

	}
}
