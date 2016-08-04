package stepDefinitions.mobile;

import setUpClasses.App;
import commands.command;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import objectModels.MastHeadObject;
import objectModels.MenuObject;

/**
 * Created by rpalacios on 11/13/15.
 */
public class appMenu extends App{

//    Logger logger = Logger.getLogger(this.getClass());
    MastHeadObject masthead = new MastHeadObject();
    MenuObject verticals = new MenuObject();

    @Given("^Hamburger menu is open$")
    public void hamburger_menu_is_open() throws Throwable {
        masthead.clickHamburgerMenu();
    }

//    @When("^I click the Favorites$")
//    public void i_click_the_Favorites() throws Throwable {
//        verticals.clickFavorites();
//    }
//
//    @Then("^Verify Favorites is rendered$")
//    public void verify_Favorites_is_rendered() throws Throwable {
//        masthead.isCurrentTitle("Favorites");
//        App.driver.navigate().back();
//    }

    @When("^I click (.*) option$")
    public void i_click_vertical(String arg) throws Throwable {
        verticals.clickVertical(arg);
    }

    @Then("^Verify (.*) is rendered$")
    public void verify_vertical_is_rendered(String vertical) throws Throwable {
        if(vertical.equals("HOME"))
            vertical="BUSINESS INSIDER";
        if(App.launchOn.equals("iOS") && vertical.equals("Legal Fine Print")){

        }
        masthead.isCurrentTitle(vertical);
    }

    @When("^I click the Latest$")
    public void i_click_the_Latest() throws Throwable {
        verticals.clickLatest();
    }

    @When("^I click the HOME$")
    public void i_click_the_HOME() throws Throwable {
        verticals.clickhome();
    }

    @When("^I click the TECH$")
    public void i_click_the_TECH() throws Throwable {
        verticals.clicktech();
        Thread.sleep(1000);
    }

    @When("^I click the Enterprise$")
    public void i_click_the_Enterprise() throws Throwable {
        verticals.clickenterprise();
    }

    @When("^I click the Science$")
    public void i_click_the_Science() throws Throwable {
        verticals.clickScience();
    }

    @When("^I click the FINANCE$")
    public void i_click_the_FINANCE() throws Throwable {
        verticals.clickfinance();
    }

    @When("^I click the Markets$")
    public void i_click_the_Markets() throws Throwable {
        verticals.clickMarkets();
    }

    @When("^I click the Your Money$")
    public void i_click_the_Your_Money() throws Throwable {
        verticals.clickYourMoney();
    }

    @When("^I click the Wealth Advisor$")
    public void i_click_the_Wealth_Advisor() throws Throwable {
        command.scrolldown(MenuObject.wealthadvisor);
        verticals.clickWealthAdvisor();
    }

    @When("^I click the POLITICS$")
    public void i_click_the_POLITICS() throws Throwable {
        verticals.clickpolitics();
    }

    @When("^I click the Military & Defense$")
    public void i_click_the_Military_Defense() throws Throwable {
        verticals.clickmilitarydefense();
        Thread.sleep(1000);
    }

    @When("^I click the Law & Order$")
    public void i_click_the_Law_Order() throws Throwable {
        verticals.clicklaworder();
    }

    @When("^I click the STRATEGY$")
    public void i_click_the_STRATEGY() throws Throwable {
        verticals.clickstrategy();
    }

    @When("^I click the Careers$")
    public void i_click_the_Careers() throws Throwable {
        verticals.clickCarrers();
    }

    @When("^I click the Advertising$")
    public void i_click_the_Advertising() throws Throwable {
        verticals.clickAdvertising();
    }

    @When("^I click the Retail$")
    public void i_click_the_Retail() throws Throwable {
        verticals.clickRetail();
    }

    @When("^I click the Small Business$")
    public void i_click_the_Small_Business() throws Throwable {
        verticals.clickSmallBusiness();
    }

    @When("^I click the LIFE$")
    public void i_click_the_LIFE() throws Throwable {
        verticals.clickLife();
    }

    @When("^I click the Transportation$")
    public void i_click_the_Transportation() throws Throwable {
        command.scrolldown(MenuObject.transportation);
        verticals.clickTransportation();
    }

    @When("^I click the Education$")
    public void i_click_the_Education() throws Throwable {
        verticals.clickEducation();
    }

    @When("^I click the ENTERTAINMENT$")
    public void i_click_the_ENTERTAINMENT() throws Throwable {
        verticals.clickEntertainment();
    }

    @When("^I click the Sports$")
    public void i_click_the_Sports() throws Throwable {
        verticals.clickSports();
    }
}