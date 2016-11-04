package stepDefinitions.ios;

import commands.window;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.MastHeadObject;
import pageObjects.MenuObject;
import setUpClasses.App;

/**
 * Created by rpalacios on 11/13/15.
 */
public class appMenu extends App{

    MastHeadObject masthead = new MastHeadObject();
    MenuObject verticals = new MenuObject();

    @Given("^Hamburger menu is open$")
    public void hamburger_menu_is_open() throws Throwable {
        masthead.clickHamburgerMenu();
    }

    @When("^I click (.*) option$")
    public void  i_click_vertical(String arg) throws Throwable {
        verticals.clickVertical(arg);
    }

    @Then("^Verify (.*) is rendered$")
    public void verify_vertical_is_rendered(String vertical) throws Throwable {
        vertical=vertical.toLowerCase();
        if(vertical.equals("home"))
            vertical="business insider";
        masthead.isCurrentTitle(vertical);
    }

    @When("^I click the Latest$")
    public void i_click_the_Latest() throws Throwable {
        verticals.latest.click();
    }

    @When("^I click the HOME$")
    public void i_click_the_HOME() throws Throwable {
        verticals.home.click();
    }

    @When("^I click the TECH$")
    public void i_click_the_TECH() throws Throwable {
        verticals.tech.click();
        Thread.sleep(1000);
    }

    @When("^I click the Enterprise$")
    public void i_click_the_Enterprise() throws Throwable {
        verticals.enterprise.click();
    }

    @When("^I click the Science$")
    public void i_click_the_Science() throws Throwable {
        verticals.science.click();
    }

    @When("^I click the FINANCE$")
    public void i_click_the_FINANCE() throws Throwable {
        verticals.finance.click();
    }

    @When("^I click the Markets$")
    public void i_click_the_Markets() throws Throwable {
        verticals.markets.click();
    }

    @When("^I click the Your Money$")
    public void i_click_the_Your_Money() throws Throwable {
        verticals.yourmoney.click();
    }

    @When("^I click the Wealth Advisor$")
    public void i_click_the_Wealth_Advisor() throws Throwable {
        window.scrolldown(MenuObject.wealthadvisor);
        verticals.wealthadvisor.click();
    }

    @When("^I click the POLITICS$")
    public void i_click_the_POLITICS() throws Throwable {
        verticals.politics.click();
    }

    @When("^I click the Military & Defense$")
    public void i_click_the_Military_Defense() throws Throwable {
        verticals.militarydefense.click();
        Thread.sleep(1000);
    }

    @When("^I click the Law & Order$")
    public void i_click_the_Law_Order() throws Throwable {
        verticals.laworder.click();
    }

    @When("^I click the STRATEGY$")
    public void i_click_the_STRATEGY() throws Throwable {
        verticals.strategy.click();
    }

    @When("^I click the Careers$")
    public void i_click_the_Careers() throws Throwable {
        verticals.careers.click();
    }

    @When("^I click the Advertising$")
    public void i_click_the_Advertising() throws Throwable {
        verticals.advertising.click();
    }

    @When("^I click the Retail$")
    public void i_click_the_Retail() throws Throwable {
        verticals.retail.click();
    }

    @When("^I click the Small Business$")
    public void i_click_the_Small_Business() throws Throwable {
        verticals.smallbusiness.click();
    }

    @When("^I click the LIFE$")
    public void i_click_the_LIFE() throws Throwable {
        verticals.life.click();
    }

    @When("^I click the Transportation$")
    public void i_click_the_Transportation() throws Throwable {
        window.scrolldown(MenuObject.transportation);
        verticals.transportation.click();
    }

    @When("^I click the Education$")
    public void i_click_the_Education() throws Throwable {
        verticals.education.click();
    }

    @When("^I click the ENTERTAINMENT$")
    public void i_click_the_ENTERTAINMENT() throws Throwable {
        verticals.entertainment.click();
    }

    @When("^I click the Sports$")
    public void i_click_the_Sports() throws Throwable {
        verticals.sports.click();
    }
}