package com.vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage {
// no need to write explicitly write constructor, because it will use its parents constructor

@FindBy(css = "#user-menu>a")     // no need, there is getusername method in BasePage
public WebElement firstLastname;




}
