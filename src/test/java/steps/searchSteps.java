package steps;

import appium.App;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import objectModels.MastHeadObject;
import objectModels.PostResultObject;
import objectModels.SearchObject;
import objectModels.VerticalObject;
import org.apache.log4j.Logger;

/**
 * Created by Khadijaislam on 07/08/2016.
 */
public class searchSteps {

    SearchObject search = new SearchObject();
    PostResultObject postResultObject = new PostResultObject();
    //@Given("I am on the homepage^")
   // public void

    @When("^I click the search icon$")
    public void i_click_the_search_icon() throws Throwable {
        search.OpenSearch();
    }

    @Then("^I enter text The Two Apples$")
     public void i_enter_text$() throws  Throwable {
        search.search("The Two Apples");

    }


    @Then("^I click the search result$")
    public void  result_clicked() throws Throwable {
        search.clickSearchResult();
    }

    @And("^I compare search result$")
    public void compare_result() throws Throwable {
        postResultObject.isArticle("The Two Apples");


    }
}

