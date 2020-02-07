package starter.model.menu;

import org.openqa.selenium.By;
import starter.search.Xpath_element;

public class menu {
    public static By CREDIT_CARDS = By.xpath (Xpath_element.getByTextSpan ("Credit cards"));
    public static By DEBIT_CARDS = By.xpath (Xpath_element.getByTextSpan ("Debit cards"));
    public static By LENDING = By.xpath (Xpath_element.getByText_li_Class_Span ("sub-header", "Lending"));
    public static By LOANS = By.xpath (Xpath_element.getByTextSpan ("Loans"));
    public static By MORTAGAGES = By.xpath (Xpath_element.getByTextSpan ("Mortgages"));
}