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
  "duration": 38478106748,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "I save a post",
  "description": "",
  "id": "saved-articles;i-save-a-post",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I am on the post page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I save the post",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I go the the Saved Articles section",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Saved post is available",
  "keyword": "Then "
});
formatter.match({
  "location": "RecommendedForYou.I_am_on_the_post_page()"
});
formatter.result({
  "duration": 10627570709,
  "status": "passed"
});
formatter.match({
  "location": "SavedArticles.i_save_the_post()"
});
formatter.result({
  "duration": 18744509323,
  "status": "passed"
});
formatter.match({
  "location": "SavedArticles.i_go_the_the_Saved_Articles_section()"
});
formatter.result({
  "duration": 10344213237,
  "status": "passed"
});
formatter.match({
  "location": "SavedArticles.saved_post_is_available()"
});
formatter.result({
  "duration": 3246342400,
  "status": "passed"
});
formatter.before({
  "duration": 70234,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "I delete a post via post page",
  "description": "",
  "id": "saved-articles;i-delete-a-post-via-post-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "I am on a saved post",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I unsave the post",
  "keyword": "Then "
});
formatter.match({
  "location": "SavedArticles.i_am_on_a_saved_post()"
});
formatter.result({
  "duration": 3758084643,
  "status": "passed"
});
formatter.match({
  "location": "SavedArticles.i_unsave_the_post()"
});
