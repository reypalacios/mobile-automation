$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("posts_load_when_scrolling_down_vertical.feature");
formatter.feature({
  "line": 3,
  "name": "Posts load when scrolling down a vertical",
  "description": "\nIn order to browse posts in a vertical\nAs a user\nI want more posts to load when I scroll down a vertical",
  "id": "posts-load-when-scrolling-down-a-vertical",
  "keyword": "Feature",
  "tags": [
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
  "line": 20,
  "name": "",
  "description": "",
  "id": "posts-load-when-scrolling-down-a-vertical;i-scroll-down-a-vertical;",
  "rows": [
    {
      "cells": [
        "total"
      ],
      "line": 21,
      "id": "posts-load-when-scrolling-down-a-vertical;i-scroll-down-a-vertical;;1"
    },
    {
      "cells": [
        "8"
      ],
      "line": 22,
      "id": "posts-load-when-scrolling-down-a-vertical;i-scroll-down-a-vertical;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 22,
  "name": "I scroll down a vertical",
  "description": "",
  "id": "posts-load-when-scrolling-down-a-vertical;i-scroll-down-a-vertical;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@river"
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
  "name": "I scroll down 8 posts",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "more than 8 posts are displayed",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "PostsLoadWhenScrollingDownVertical.theFirstPayloadOfPostsDisplayInAVertical()"
});
formatter.result({
  "duration": 22831351581,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "8",
      "offset": 14
    }
  ],
  "location": "PostsLoadWhenScrollingDownVertical.iScrollDownToTheLastPostInTheFirstPayload(int)"
});
formatter.result({
  "duration": 15407902172,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "8",
      "offset": 10
    }
  ],
  "location": "PostsLoadWhenScrollingDownVertical.theNextPayloadOfPostsDisplay(int)"
});
formatter.result({
  "duration": 4837874654,
  "status": "passed"
});
});