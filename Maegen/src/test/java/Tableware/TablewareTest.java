package Tableware;
import com.maegen.baseTest.BaseClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import com.maegen.objectrepository.CheckoutPage;
import com.maegen.objectrepository.HomePage;
import com.maegen.objectrepository.PayPage;
import com.maegen.objectrepository.ProductPage;
import com.maegen.objectrepository.TablewarePage;

import junit.framework.Assert;

public class TablewareTest extends BaseClass {
	/*@Test
	public void TablewarewithCategory() throws InterruptedException, EncryptedDocumentException, IOException {
		String SORTBY=elib.getStringDataFromExcel("Tableware", 7, 2);
		String PRODUCTNAME=elib.getStringDataFromExcel("Tableware", 7, 1);
		String CATEGORY=elib.getStringDataFromExcel("Tableware", 7, 0);
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
		hp.getTablewareLnk().click();
		TablewarePage tp=new TablewarePage(driver);
		tp.clickCategory(CATEGORY);
		Thread.sleep(3000);
		tp.SortBy2(SORTBY, PRODUCTNAME);
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
		
		
	}*/
	@Test
	public void TablewarewithPrice() throws InterruptedException, EncryptedDocumentException, IOException {
		String SORTBY=elib.getStringDataFromExcel("Tableware", 10, 2);
		String PRODUCTNAME=elib.getStringDataFromExcel("Tableware", 10, 1);
		String PRICE=elib.getStringDataFromExcel("Tableware", 10, 3);
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
		hp.getTablewareLnk().click();
		TablewarePage tp=new TablewarePage(driver);
		tp.scrollPrice(PRICE);
		//tp.clickCategory(CATEGORY);
		Thread.sleep(3000);
		tp.SortBy2(SORTBY, PRODUCTNAME);
		Thread.sleep(3000);
		ProductPage pp=new ProductPage(driver);
		pp.clickPlusIcon();
		pp.clickAddToCart();
		hp.getCartLnk().click();
		CheckoutPage chk=new CheckoutPage(driver);
		chk.getDecreaseProductQuantityTableware(PRODUCTNAME).click();
		String ACTUALPRODUCTNAME=chk.productName();
		Assert.assertEquals(PRODUCTNAME, ACTUALPRODUCTNAME);
		chk.getCheckoutBtn().click();
		PayPage pap = new PayPage(driver);
		pap.Address(CONTACT,COUNTRY,FIRSTNAME,LASTNAME,ADDRESS,APARTMENT,STATE,CITY,PINCODE,PHONE);
		
		
	}
	@Test
	public void TablewarewithMultiPlePrice() throws InterruptedException, EncryptedDocumentException, IOException {
		String SORTBY=elib.getStringDataFromExcel("Tableware", 10, 2);
		String PRODUCTNAME=elib.getStringDataFromExcel("Tableware", 10, 1);
		String PRODUCTNAME1=elib.getStringDataFromExcel("Tableware", 11, 1);
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
		TablewarePage tp=new TablewarePage(driver);
		ProductPage pp=new ProductPage(driver);
		hp.closePopUp();
		hp.getTablewareLnk().click();
		Thread.sleep(3000);
		tp.SortBy2(SORTBY, PRODUCTNAME);
		pp.clickPlusIcon();
		pp.clickAddToCart();
		Thread.sleep(3000);
		hp.getTablewareLnk().click();
		Thread.sleep(3000);
		tp.SortBy2(SORTBY, PRODUCTNAME1);
		Thread.sleep(3000);
		pp.clickPlusIcon();
		pp.clickAddToCart();
		hp.getCartLnk().click();
		CheckoutPage chk=new CheckoutPage(driver);
		chk.getDecreaseProductQuantityTableware(PRODUCTNAME1).click();
		String ACTUALPRODUCTNAME=chk.productName();
		Assert.assertEquals(PRODUCTNAME1, ACTUALPRODUCTNAME);
		System.out.println(ACTUALPRODUCTNAME);
		chk.getCheckoutBtn().click();
		PayPage pap = new PayPage(driver);
		pap.Address(CONTACT,COUNTRY,FIRSTNAME,LASTNAME,ADDRESS,APARTMENT,STATE,CITY,PINCODE,PHONE);
		
	}
	/*@Test
	public void TablewareHover() throws InterruptedException, EncryptedDocumentException, IOException {
		String SORTBY=elib.getStringDataFromExcel("Tableware", 4, 2);
		String PRODUCTNAME=elib.getStringDataFromExcel("Tableware", 4, 1);
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
		hp.Hover(hp.getTablewareLnk());
		TablewareHoverPage ahg=new TablewareHoverPage(driver);
		Thread.sleep(4000);
		ahg.getCoastersLnk().click();
		TablewarePage ag=new TablewarePage(driver);
		Thread.sleep(4000);
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
		
		
	}*/
	
}
