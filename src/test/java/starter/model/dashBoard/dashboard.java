package starter.model.dashBoard;

import org.openqa.selenium.By;
import starter.search.Xpath_element;

public class dashboard {

    public static By CREDIT_AVALIABLE = By.xpath(Xpath_element.getByTestAndClass("Credit Available","balance-value"));
    public static By TOTAL_BALANCE = By.xpath(Xpath_element.getByTestAndClass("Total Balance","balance-value"));

    //public static By CREDIT_AVALIABLE2 = By.xpath("//div[contains(text(), 'Credit Available')]/following-sibling::div[@class='balance-value']");




    //By.xpath("//div[contains(text(),'Credit Available')]/following-sibling::div[@class='Balance-value']");
    //By.xpath("//div[contains(text(), 'Credit Available')]/following-sibling::div[@class='balance-value']");
}
