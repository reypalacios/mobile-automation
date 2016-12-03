$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("PostsLoadWhenScrollingDownVertical.feature");
formatter.feature({
  "line": 3,
  "name": "Posts load when scrolling down a vertical",
  "description": "\nIn order to browse posts in a vertical\nAs a user\nI want more posts to load when I scroll down a vertical",
  "id": "posts-load-when-scrolling-down-a-vertical",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@ios"
    },
    {
      "line": 1,
      "name": "@river"
    }
  ]
});
formatter.scenarioOutline({
  "line": 9,
  "name": "I scroll down a vertical",
  "description": "",
  "id": "posts-load-when-scrolling-down-a-vertical;i-scroll-down-a-vertical",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "the first payload of posts display in a vertical",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I scroll down \u003ctotal\u003e posts",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "more than \u003ctotal\u003e posts are displayed",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "posts-load-when-scrolling-down-a-vertical;i-scroll-down-a-vertical;",
  "rows": [
    {
      "cells": [
        "total"
      ],
      "line": 16,
      "id": "posts-load-when-scrolling-down-a-vertical;i-scroll-down-a-vertical;;1"
    },
    {
      "cells": [
        "18"
      ],
      "line": 17,
      "id": "posts-load-when-scrolling-down-a-vertical;i-scroll-down-a-vertical;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 141279,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "I scroll down a vertical",
  "description": "",
  "id": "posts-load-when-scrolling-down-a-vertical;i-scroll-down-a-vertical;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@river"
    },
    {
      "line": 1,
      "name": "@ios"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "the first payload of posts display in a vertical",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I scroll down 18 posts",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "more than 18 posts are displayed",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "PostsLoadWhenScrollingDownVertical.theFirstPayloadOfPostsDisplayInAVertical()"
});
formatter.result({
  "duration": 3755370376,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "18",
      "offset": 14
    }
  ],
  "location": "PostsLoadWhenScrollingDownVertical.iScrollDownToTheLastPostInTheFirstPayload(int)"
});
