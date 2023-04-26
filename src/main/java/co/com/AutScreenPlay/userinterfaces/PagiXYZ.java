package co.com.AutScreenPlay.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("https://colorlib.com/polygon/metis/login.html")
public class PagiXYZ extends PageObject {

    public static final Target TXT_USER = Target.the("Type user")
            .located(By.xpath("//input[@placeholder='Username']")); // Refined locator.
    public static final Target TXT_PASS = Target.the("Type password")
            .located(By.xpath("//*[@id='login']/form/input[2]")); // Basic Xpath.

    public static final Target BTN_SING_IN = Target.the("Sing in button")
           .located(By.xpath("/html/body/div/div[2]/div[1]/form/button")); // Full Xpath.

    public static final Target LBL_MENU = Target.the("Menu")
            .located(By.xpath("//*[@id='menu']/li[1]")); // Basic Xpath.
}