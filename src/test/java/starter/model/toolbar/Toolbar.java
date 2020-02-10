package starter.model.toolbar;

import org.openqa.selenium.By;
import starter.search.Xpath_element;

public class Toolbar {

    public static By searchBox = By.xpath(Xpath_element.getByClassInputPlaceHolder ("element-search autosuggest-search-activator","Start typing to search..."));
}
