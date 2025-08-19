package Integration;

import org.testng.annotations.Test;

import com.maegen.baseTest.BaseClass;
import com.maegen.objectrepository.AboutHoverPage;
import com.maegen.objectrepository.GiftPage;
import com.maegen.objectrepository.HomePage;

import junit.framework.Assert;

public class IntegrationTest extends BaseClass {
	@Test
	public void HomeToJournal() {
		HomePage hp=new HomePage(driver);
		hp.closePopUp();
		hp.getGiftCardLnk().click();
		GiftPage gp=new GiftPage(driver);
		String TITLE = gp.title();
		Assert.assertEquals(TITLE, "Maegan Homeware Gift Card");		
	}
	@Test
	public void HomeToOurStory() {
		HomePage hp=new HomePage(driver);
		hp.closePopUp();
		hp.getAboutLnk().click();
		AboutHoverPage ahp=new AboutHoverPage(driver);
		ahp.getStoryLnk().click();
		String TITLE = ahp.title();
		Assert.assertEquals(TITLE, "Our Story");		
	}
}
