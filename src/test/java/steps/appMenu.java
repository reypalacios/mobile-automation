package steps;

import appium.App;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import objectModels.MastHeadObject;
import objectModels.VerticalObject;

/**
 * Created by rpalacios on 11/13/15.
 */
public class appMenu {

//    Logger logger = Logger.getLogger(this.getClass());
    MastHeadObject masthead = new MastHeadObject();
    VerticalObject verticals = new VerticalObject();

    @Given("^Hamburger menu is open$")
    public void hamburger_menu_is_open() throws Throwable {
        masthead.clickHamburgerMenu();
    }

    @When("^I click the Favorites$")
    public void i_click_the_Favorites() throws Throwable {
        verticals.clickFavorites();
    }

    @Then("^Verify Favorites is rendered$")
    public void verify_Favorites_is_rendered() throws Throwable {
        masthead.isCurrentTitle("Favorites");
        App.driver.navigate().back();
    }

    @When("^I click the Latest$")
    public void i_click_the_Latest() throws Throwable {
        verticals.clickLatest();
    }

    @Then("^Verify (Latest|LATEST) is rendered$")
    public void verify_Latest_is_rendered(String arg) throws Throwable {
        masthead.isCurrentTitle(arg);
    }

    @When("^I click the HOME$")
    public void i_click_the_HOME() throws Throwable {
        verticals.clickhome();
    }

    @Then("^Verify HOME is rendered$")
    public void verify_HOME_is_rendered() throws Throwable {
        masthead.isCurrentTitle("HOME");
    }

    @When("^I click the TECH$")
    public void i_click_the_TECH() throws Throwable {
        verticals.clicktech();
        Thread.sleep(1000);
    }

    @Then("^Verify TECH is rendered$")
    public void verify_TECH_is_rendered() throws Throwable {
        masthead.isCurrentTitle("TECH");
    }

    @When("^I click the Enterprise$")
    public void i_click_the_Enterprise() throws Throwable {
        verticals.clickenterprise();
    }

    @Then("^Verify (Enterprise|ENTERPRISE) is rendered$")
    public void verify_Enterprise_is_rendered(String arg) throws Throwable {
        masthead.isCurrentTitle(arg);
    }

    @When("^I click the Science$")
    public void i_click_the_Science() throws Throwable {
        verticals.clickScience();
    }

    @Then("^Verify (Science|SCIENCE) is rendered$")
    public void verify_Science_is_rendered(String arg) throws Throwable {
        masthead.isCurrentTitle(arg);
    }

    @When("^I click the FINANCE$")
    public void i_click_the_FINANCE() throws Throwable {
        verticals.clickfinance();
    }

    @Then("^Verify FINANCE is rendered$")
    public void verify_FINANCE_is_rendered() throws Throwable {
        masthead.isCurrentTitle("FINANCE");
    }

    @When("^I click the Markets$")
    public void i_click_the_Markets() throws Throwable {
        verticals.clickMarkets();
    }

    @Then("^Verify (Markets|MARKETS) is rendered$")
    public void verify_Markets_is_rendered(String arg) throws Throwable {
        masthead.isCurrentTitle(arg);
    }

    @When("^I click the Your Money$")
    public void i_click_the_Your_Money() throws Throwable {
        verticals.clickYourMoney();
    }

    @Then("^Verify (Your Money|YOUR MONEY) is rendered$")
    public void verify_Your_Money_is_rendered(String arg) throws Throwable {
        masthead.isCurrentTitle(arg);
    }

    @When("^I click the Wealth Advisor$")
    public void i_click_the_Wealth_Advisor() throws Throwable {
        verticals.scrolldown(verticals.wealthadvisor);
        verticals.clickWealthAdvisor();
    }

    @Then("^Verify (Wealth Advisor|WEALTH ADVISOR) is rendered$")
    public void verify_Wealth_Advisor_is_rendered(String arg) throws Throwable {
        masthead.isCurrentTitle(arg);
    }

    @When("^I click the POLITICS$")
    public void i_click_the_POLITICS() throws Throwable {
        verticals.clickpolitics();
    }

    @Then("^Verify POLITICS is rendered$")
    public void verify_POLITICS_is_rendered() throws Throwable {
        masthead.isCurrentTitle("POLITICS");
    }

    @When("^I click the Military & Defense$")
    public void i_click_the_Military_Defense() throws Throwable {
        verticals.clickmilitarydefense();
        Thread.sleep(1000);
    }

    @Then("^Verify (Military & Defense|MILITARY & DEFENSE) is rendered$")
    public void verify_Military_Defense_is_rendered(String arg) throws Throwable {
        masthead.isCurrentTitle(arg);
    }

    @When("^I click the Law & Order$")
    public void i_click_the_Law_Order() throws Throwable {
        verticals.clicklaworder();
    }

    @Then("^Verify (Law & Order|LAW & ORDER) is rendered$")
    public void verify_Law_Order_is_rendered(String arg) throws Throwable {
        masthead.isCurrentTitle(arg);
    }

    @When("^I click the STRATEGY$")
    public void i_click_the_STRATEGY() throws Throwable {
        verticals.clickstrategy();
    }

    @Then("^Verify STRATEGY is rendered$")
    public void verify_STRATEGY_is_rendered() throws Throwable {
        masthead.isCurrentTitle("STRATEGY");
    }

    @When("^I click the Careers$")
    public void i_click_the_Careers() throws Throwable {
        verticals.clickCarrers();
    }

    @Then("^Verify (Careers|CAREERS) is rendered$")
    public void verify_Careers_is_rendered(String arg) throws Throwable {
        masthead.isCurrentTitle(arg);
    }

    @When("^I click the Advertising$")
    public void i_click_the_Advertising() throws Throwable {
        verticals.clickAdvertising();
    }

    @Then("^Verify (Advertising|ADVERTISING) is rendered$")
    public void verify_Advertising_is_rendered(String arg) throws Throwable {
        masthead.isCurrentTitle(arg);
    }

    @When("^I click the Retail$")
    public void i_click_the_Retail() throws Throwable {
        verticals.clickRetail();
    }

    @Then("^Verify (Retail|RETAIL) is rendered$")
    public void verify_Retail_is_rendered(String arg) throws Throwable {
        masthead.isCurrentTitle(arg);
    }

    @When("^I click the Small Business$")
    public void i_click_the_Small_Business() throws Throwable {
        verticals.clickSmallBusiness();
    }

    @Then("^Verify (Small Business|SMALL BUSINESS) is rendered$")
    public void verify_Small_Business_is_rendered(String arg) throws Throwable {
        masthead.isCurrentTitle(arg);
    }

    @When("^I click the LIFE$")
    public void i_click_the_LIFE() throws Throwable {
        verticals.clickLife();
    }

    @Then("^Verify LIFE is rendered$")
    public void verify_LIFE_is_rendered() throws Throwable {
        masthead.isCurrentTitle("LIFE");
    }

    @When("^I click the Transportation$")
    public void i_click_the_Transportation() throws Throwable {
        verticals.scrolldown(verticals.transportation);
        verticals.clickTransportation();
    }

    @Then("^Verify (Transportation|TRANSPORTATION) is rendered$")
    public void verify_Transportation_is_rendered(String arg) throws Throwable {
        masthead.isCurrentTitle(arg);
    }

    @When("^I click the Education$")
    public void i_click_the_Education() throws Throwable {
        verticals.clickEducation();
    }

    @Then("^Verify (Education|EDUCATION) is rendered$")
    public void verify_Education_is_rendered(String arg) throws Throwable {
        masthead.isCurrentTitle(arg);
    }

    @When("^I click the ENTERTAINMENT$")
    public void i_click_the_ENTERTAINMENT() throws Throwable {
        verticals.clickEntertainment();
    }

    @Then("^Verify ENTERTAINMENT is rendered$")
    public void verify_ENTERTAINMENT_is_rendered() throws Throwable {
        masthead.isCurrentTitle("ENTERTAINMENT");
    }

    @When("^I click the Sports$")
    public void i_click_the_Sports() throws Throwable {
        verticals.clickSports();
    }

    @Then("^Verify (Sports|SPORTS) is rendered$")
    public void verify_Sports_is_rendered(String arg) throws Throwable {
        masthead.isCurrentTitle(arg);
    }

}