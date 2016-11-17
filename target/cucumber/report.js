$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("RecommendedForYou.feature");
formatter.feature({
  "line": 2,
  "name": "Recommended For You",
  "description": "\nAs a user, I want to see recommended posts at the bottom of post pages\nso that I\u0027m encouraged to explore more content in the app.",
  "id": "recommended-for-you",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@ios"
    },
    {
      "line": 1,
      "name": "@recommended"
    }
  ]
});
formatter.before({
  "duration": 164853,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Verify module is displayed",
  "description": "",
  "id": "recommended-for-you;verify-module-is-displayed",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I am on the post page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "River post recommended for you module is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "RecommendedForYou.I_am_on_the_post_page()"
});
formatter.result({
  "duration": 6109856060,
  "status": "passed"
});
formatter.match({
  "location": "RecommendedForYou.river_post_recommended_for_you_module_is_displayed()"
});
