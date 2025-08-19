package Accessories;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.maegen.baseTest.BaseClass;
import com.maegen.objectrepository.AccessoriesHoverPage;
import com.maegen.objectrepository.AccessoriesPage;
import com.maegen.objectrepository.CheckoutPage;
import com.maegen.objectrepository.HomePage;
import com.maegen.objectrepository.PayPage;
import com.maegen.objectrepository.ProductPage;

import junit.framework.Assert;

public class AccessoriesTest extends BaseClass {
	/*@Test
	public void AccessoriesWithCategory() throws InterruptedException, EncryptedDocumentException, IOException {
		String SORTBY=elib.getStringDataFromExcel("Accessories", 13, 2);
		String PRODUCTNAME=elib.getStringDataFromExcel("Accessories", 13, 1);
		String CATEGORY=elib.getStringDataFromExcel("Accessories", 13, 0);
		HomePage hp=new HomePage(driver);
		hp.closePopUp();
		hp.getAccessoriesLnk().click();
		AccessoriesPage ag=new AccessoriesPage(driver);
		ag.clickCategory(CATEGORY);
		Thread.sleep(3000);
		ag.SortBy2(SORTBY, PRODUCTNAME);
		Thread.sleep(3000);
		ProductPage pp=new ProductPage(driver);
		pp.clickPlusIcon();
		pp.clickAddToCart();
		hp.getCartLnk().click();
		CheckoutPage chk=new CheckoutPage(driver);
		chk.getDecreaseProductQuantity(PRODUCTNAME).click();
		String ACTUALPRODUCTNAME=chk.productName();
		Assert.assertEquals(PRODUCTNAME, ACTUALPRODUCTNAME);
		chk.getCheckoutBtn().click();
		
	}*/
	@Test
	public void AccessorieswithPrice() throws InterruptedException, EncryptedDocumentException, IOException {
		String PRICE=elib.getStringDataFromExcel("Accessories", 16, 3);
		String SORTBY=elib.getStringDataFromExcel("Accessories", 16, 2);
		String PRODUCTNAME=elib.getStringDataFromExcel("Accessories", 16, 1);
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
		HomePage hp=new HomePage(driver);
		try {
			hp.closePopUp();	
		}catch(Exception e) {	
		}
		hp.getAccessoriesLnk().click();
		AccessoriesPage ag=new AccessoriesPage(driver);
		Thread.sleep(5000);
		ag.scrollPrice(PRICE);
		Thread.sleep(8000);
		ag.SortBy2(SORTBY, PRODUCTNAME);
		Thread.sleep(8000);
		ProductPage pp=new ProductPage(driver);
		pp.clickPlusIcon();
		pp.clickAddToCart();
		hp.getCartLnk().click();
		CheckoutPage chk=new CheckoutPage(driver);
		chk.getDecreaseProductQuantity(PRODUCTNAME).click();
		String ACTUALPRODUCTNAME=chk.productName();
		Assert.assertEquals(PRODUCTNAME, ACTUALPRODUCTNAME);
		chk.getCheckoutBtn().click();
		PayPage pap = new PayPage(driver);
		pap.Address(CONTACT,COUNTRY,FIRSTNAME,LASTNAME,ADDRESS,APARTMENT,STATE,CITY,PINCODE,PHONE);
		
	}
	@Test
	public void AccessoriesHover() throws InterruptedException, EncryptedDocumentException, IOException {
		String SORTBY=elib.getStringDataFromExcel("Accessories", 13, 2);
		String PRODUCTNAME=elib.getStringDataFromExcel("Accessories", 13, 1);
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
		HomePage hp=new HomePage(driver);
		try {
			hp.closePopUp();	
		}catch(Exception e) {	
		}
		hp.Hover(hp.getAccessoriesLnk());
		AccessoriesHoverPage ahg=new AccessoriesHoverPage(driver);
		ahg.getIncenseHoldersLnk().click();
		AccessoriesPage ag=new AccessoriesPage(driver);
		Thread.sleep(3000);
		ag.SortBy2(SORTBY, PRODUCTNAME);
		Thread.sleep(3000);
		ProductPage pp=new ProductPage(driver);
		pp.clickPlusIcon();
		pp.clickAddToCart();
		hp.getCartLnk().click();
		CheckoutPage chk=new CheckoutPage(driver);
		chk.getDecreaseProductQuantity(PRODUCTNAME).click();
		String ACTUALPRODUCTNAME=chk.productName();
		Assert.assertEquals(PRODUCTNAME, ACTUALPRODUCTNAME);
		chk.getCheckoutBtn().click();
		PayPage pap = new PayPage(driver);
		pap.Address(CONTACT,COUNTRY,FIRSTNAME,LASTNAME,ADDRESS,APARTMENT,STATE,CITY,PINCODE,PHONE);
		
	}
}
