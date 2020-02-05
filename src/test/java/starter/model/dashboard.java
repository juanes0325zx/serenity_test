package starter.model;

import org.openqa.selenium.By;
import starter.search.Xpath_element;

public class dashboard {

    public static By CREDIT_AVALIABLE = By.xpath(Xpath_element.getByTestAndClass("Credit Available","Balance-value"));
    public static By CREDIT_AVALIABLE2 = By.xpath("//div[contains(text(),'Credit Available')]/following-sibling::div[@class='Balance-value']");
}
