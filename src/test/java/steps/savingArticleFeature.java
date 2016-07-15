//package steps;
//
//import appium.App;
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import objectModels.MastHeadObject;
//import objectModels.PostResultObject;
//import objectModels.SearchObject;
//import objectModels.VerticalObject;
//import org.apache.log4j.Logger;
//
//
///**
// * Created by khadijaislam on 7/10/16.
// */
//public class savingArticleFeature {
//
//    Logger logger = Logger.getLogger(this.getClass());
//    MastHeadObject masthead = new MastHeadObject();
//    VerticalObject verticals = new VerticalObject();
//    SearchObject search = new SearchObject();
//    PostResultObject postResultObject = new PostResultObject();
//
//    @Given("^$")
//    public void i_click_the_searchIcon$() throws Throwable {
//        search.OpenSearch();
//    }
//
//    @And("^click the search result$")
//    public void  result_clicked() throws Throwable {
//        search.clickSearchResult();
//    }
//
//    @Then("^compare Search result$")
//    public void compare_result() throws Throwable {
//        postResultObject.isArticle("The Two Apples");
//    }
//}
//
//
//
