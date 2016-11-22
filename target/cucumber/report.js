$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SavedArticles.feature");
formatter.feature({
  "line": 2,
  "name": "Saved Articles",
  "description": "\nAs a user, I want to see the saved posts added to the top of the Saved Articles section instead of the bottom\nso I can access more recently saved posts more easily.",
  "id": "saved-articles",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@ios"
    },
    {
      "line": 1,
      "name": "@save"
    }
  ]
});
formatter.before({
  "duration": 36515206033,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "I save a post",
  "description": "",
  "id": "saved-articles;i-save-a-post",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@river"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I am on the post page",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I save the post",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I go the the Saved Articles section",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Saved post is available",
  "keyword": "Then "
});
formatter.match({
  "location": "RecommendedForYou.I_am_on_the_post_page()"
});
formatter.result({
  "duration": 477031794,
  "error_message": "java.lang.AssertionError: expected [test1] but found [test]\n\tat org.testng.Assert.fail(Assert.java:94)\n\tat org.testng.Assert.failNotEquals(Assert.java:496)\n\tat org.testng.Assert.assertEquals(Assert.java:125)\n\tat org.testng.Assert.assertEquals(Assert.java:178)\n\tat org.testng.Assert.assertEquals(Assert.java:188)\n\tat commands.Window.assertChar(Window.java:300)\n\tat stepDefinitions.ios.RecommendedForYou.I_am_on_the_post_page(RecommendedForYou.java:23)\n\tat ✽.When I am on the post page(SavedArticles.feature:9)\n",
  "status": "failed"
});
formatter.match({
  "location": "SavedArticles.i_save_the_post()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SavedArticles.i_go_the_the_Saved_Articles_section()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SavedArticles.saved_post_is_available()"
});
formatter.result({
  "status": "skipped"
});
});