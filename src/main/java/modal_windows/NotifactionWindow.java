package modal_windows;

import org.openqa.selenium.By;
import actions.BasePageActions;
import actions.MainPageActions;


public class NotifactionWindow extends BasePageActions {


	public MainPageActions setNotifactionsOptions() {
		waitClickable((By.id("android:id/button2"))).click();
		return new MainPageActions();
	}
}
