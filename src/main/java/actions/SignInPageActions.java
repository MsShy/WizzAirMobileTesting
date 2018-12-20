package actions;

import pages.SignInPage;

import static org.testng.Assert.assertEquals;

public class SignInPageActions extends BasePageActions {

	SignInPage signInPage=new SignInPage();


	public SignInPageActions verifyTitleSignIn() {

		String actualTitle = signInPage.getTitleSignIn().getText();

		LOGGER.log(level, "title signIn ="+actualTitle);
		assertEquals(actualTitle.toLowerCase(),"sign in");
		return this;
	}
}
