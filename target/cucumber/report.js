$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("PostsLoadWhenScrollingDownVertical.feature");
formatter.feature({
  "line": 2,
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
  "line": 8,
  "name": "I scroll down a vertical",
  "description": "",
  "id": "posts-load-when-scrolling-down-a-vertical;i-scroll-down-a-vertical",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 9,
  "name": "the first payload of posts display in a vertical",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I scroll down \u003ctotal\u003e posts",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "more than \u003ctotal\u003e posts are displayed",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "posts-load-when-scrolling-down-a-vertical;i-scroll-down-a-vertical;",
  "rows": [
    {
      "cells": [
        "total"
      ],
      "line": 15,
      "id": "posts-load-when-scrolling-down-a-vertical;i-scroll-down-a-vertical;;1"
    },
    {
      "cells": [
        "18"
      ],
      "line": 16,
      "id": "posts-load-when-scrolling-down-a-vertical;i-scroll-down-a-vertical;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 280411,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
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
  "line": 9,
  "name": "the first payload of posts display in a vertical",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I scroll down 18 posts",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
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
  "duration": 4828859397,
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
formatter.result({
  "duration": 213484610823,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "18",
      "offset": 10
    }
  ],
  "location": "PostsLoadWhenScrollingDownVertical.theNextPayloadOfPostsDisplay(int)"
});
formatter.result({
  "duration": 27287555222,
  "status": "passed"
});
formatter.uri("PushPermissionRequest.feature");
formatter.feature({
  "line": 2,
  "name": "Push Permission Request",
  "description": "\nAs a user, I want to have a more informative push notification request so I can\nunderstand what the benefit is for me to enable push for the app.",
  "id": "push-permission-request",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@ios"
    },
    {
      "line": 1,
      "name": "@android"
    },
    {
      "line": 1,
      "name": "@push"
    }
  ]
});
formatter.before({
  "duration": 95679,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "User opts-in push notifications",
  "description": "",
  "id": "push-permission-request;user-opts-in-push-notifications",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I open the app for the first time",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I see the push permission request screen",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Two call to actions are available, to opt-in \"Enable alerts\" and to opt-out \"Maybe later\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I tap on \"Enable alerts\"",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "The \u0027Push Notifications\u0027 Setting in the app is set to ON",
  "keyword": "Then "
});
formatter.match({
  "location": "PushPermissionRequest.i_open_the_app_for_the_first_time()"
});
formatter.result({
  "duration": 52271910699,
  "status": "passed"
});
formatter.match({
  "location": "PushPermissionRequest.i_see_the_push_permission_request_screen()"
});
formatter.result({
  "duration": 32831124911,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Enable alerts",
      "offset": 46
    },
    {
      "val": "Maybe later",
      "offset": 77
    }
  ],
  "location": "PushPermissionRequest.two_call_to_actions_are_available_to_opt_in_and_to_opt_out(String,String)"
});
formatter.result({
  "duration": 10548483592,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Enable alerts",
      "offset": 10
    }
  ],
  "location": "PushPermissionRequest.i_tap_on(String)"
});
formatter.result({
  "duration": 7617520902,
  "status": "passed"
});
formatter.match({
  "location": "PushPermissionRequest.the_Push_Notifications_Setting_in_the_app_is_set_to_ON()"
});
formatter.result({
  "duration": 25067123552,
  "status": "passed"
});
formatter.before({
  "duration": 68968,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "User opts-out push notifications",
  "description": "",
  "id": "push-permission-request;user-opts-out-push-notifications",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "I open the app for the first time",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I see the push permission request screen",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Two call to actions are available, to opt-in \"Enable alerts\" and to opt-out \"Maybe later\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I tap on \"Maybe Later\"",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "The \u0027Push Notifications\u0027 Setting in the app is set to OFF",
  "keyword": "Then "
});
formatter.match({
  "location": "PushPermissionRequest.i_open_the_app_for_the_first_time()"
});
formatter.result({
  "duration": 31116684554,
  "status": "passed"
});
formatter.match({
  "location": "PushPermissionRequest.i_see_the_push_permission_request_screen()"
});
formatter.result({
  "duration": 32058866190,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Enable alerts",
      "offset": 46
    },
    {
      "val": "Maybe later",
      "offset": 77
    }
  ],
  "location": "PushPermissionRequest.two_call_to_actions_are_available_to_opt_in_and_to_opt_out(String,String)"
});
formatter.result({
  "duration": 11929804212,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Maybe Later",
      "offset": 10
    }
  ],
  "location": "PushPermissionRequest.i_tap_on(String)"
});
formatter.result({
  "duration": 3260996480,
  "status": "passed"
});
formatter.match({
  "location": "PushPermissionRequest.the_Push_Notifications_Setting_in_the_app_is_set_to_OFF()"
});
formatter.result({
  "duration": 37545135894,
  "status": "passed"
});
formatter.before({
  "duration": 53638,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Push notification setting remains after app upgrade",
  "description": "",
  "id": "push-permission-request;push-notification-setting-remains-after-app-upgrade",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@update"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "I open previous app version for first time",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "I tap on \"Enable alerts\"",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "I upgrade my app",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "I do not see the push permission request screen again",
  "keyword": "Then "
});
formatter.match({
  "location": "PushPermissionRequest.i_open_previous_app_version_for_first_time()"
});
formatter.result({
  "duration": 29285145651,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Enable alerts",
      "offset": 10
    }
  ],
  "location": "PushPermissionRequest.i_tap_on(String)"
});
formatter.result({
  "duration": 7336210769,
  "status": "passed"
});
formatter.match({
  "location": "PushPermissionRequest.i_upgrade_my_app()"
});
formatter.result({
  "duration": 119726540712,
  "status": "passed"
});
formatter.match({
  "location": "PushPermissionRequest.i_do_not_see_the_push_permission_request_screen_again()"
});
formatter.result({
  "duration": 20220580114,
  "status": "passed"
});
formatter.uri("RecommendedForYou.feature");
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
  "duration": 79002,
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
  "duration": 9684084954,
  "status": "passed"
});
formatter.match({
  "location": "RecommendedForYou.river_post_recommended_for_you_module_is_displayed()"
});
formatter.result({
  "duration": 23180953515,
  "status": "passed"
});
formatter.before({
  "duration": 39019,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Click each of the five recommendations",
  "description": "",
  "id": "recommended-for-you;click-each-of-the-five-recommendations",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "I click the first river-post recommendation",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I am redirected to the post",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I click the second river-post recommendation",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I am redirected to the post",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I click the third river-post recommendation",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "I am redirected to the post",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "I click the fourth river-post recommendation",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "I am redirected to the post",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "I click the fifth river-post recommendation",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "I am redirected to the post",
  "keyword": "Then "
});
formatter.match({
  "location": "RecommendedForYou.i_click_the_first_river_post_recommendation()"
});
formatter.result({
  "duration": 27085564409,
  "status": "passed"
});
formatter.match({
  "location": "RecommendedForYou.i_am_redirected_to_the_post()"
});
formatter.result({
  "duration": 10398301859,
  "status": "passed"
});
formatter.match({
  "location": "RecommendedForYou.i_click_the_second_river_post_recommendation()"
});
formatter.result({
  "duration": 75996573250,
  "status": "passed"
});
formatter.match({
  "location": "RecommendedForYou.i_am_redirected_to_the_post()"
});
formatter.result({
  "duration": 9637849591,
  "status": "passed"
});
formatter.match({
  "location": "RecommendedForYou.i_click_the_third_river_post_recommendation()"
});
formatter.result({
  "duration": 42433538660,
  "status": "passed"
});
formatter.match({
  "location": "RecommendedForYou.i_am_redirected_to_the_post()"
});
formatter.result({
  "duration": 8005616540,
  "status": "passed"
});
formatter.match({
  "location": "RecommendedForYou.i_click_the_fourth_river_post_recommendation()"
});
formatter.result({
  "duration": 38917298977,
  "error_message": "org.openqa.selenium.NoSuchElementException: Can\u0027t locate an element by this strategy: Locator map: \n- native content: \"By.xpath: //UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAElement[1]/UIAScrollView[1]/UIAWebView[1]/UIAStaticText[1]\" \n- html content: \"by id or name \"title\"\"\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b1534ae328c771e0856c93e187490ca824\u0027, time: \u00272016-03-15 10:43:46\u0027\nSystem info: host: \u0027rpalacios-MacBookPro12,1\u0027, ip: \u0027192.168.2.130\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.12.1\u0027, java.version: \u00271.8.0_66\u0027\nDriver info: driver.version: unknown\n\tat io.appium.java_client.pagefactory.AppiumElementLocator.findElement(AppiumElementLocator.java:97)\n\tat io.appium.java_client.pagefactory.interceptors.InterceptorOfASingleElement.intercept(InterceptorOfASingleElement.java:52)\n\tat io.appium.java_client.ios.IOSElement$$EnhancerByCGLIB$$1b1f86e4.getText(\u003cgenerated\u003e)\n\tat stepDefinitions.ios.RecommendedForYou.i_click_the_fourth_river_post_recommendation(RecommendedForYou.java:62)\n\tat ✽.When I click the fourth river-post recommendation(RecommendedForYou.feature:21)\n",
  "status": "failed"
});
formatter.match({
  "location": "RecommendedForYou.i_am_redirected_to_the_post()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RecommendedForYou.i_click_the_fifth_river_post_recommendation()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RecommendedForYou.i_am_redirected_to_the_post()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("SavedArticles.feature");
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
  "duration": 65521564879,
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
  "duration": 9987926789,
  "status": "passed"
});
formatter.match({
  "location": "SavedArticles.i_save_the_post()"
});
formatter.result({
  "duration": 16644894553,
  "status": "passed"
});
formatter.match({
  "location": "SavedArticles.i_go_the_the_Saved_Articles_section()"
});
formatter.result({
  "duration": 11205437538,
  "status": "passed"
});
formatter.match({
  "location": "SavedArticles.saved_post_is_available()"
});
formatter.result({
  "duration": 3087064661,
  "status": "passed"
});
formatter.before({
  "duration": 60224,
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
  "duration": 3566962883,
  "status": "passed"
});
formatter.match({
  "location": "SavedArticles.i_unsave_the_post()"
});
formatter.result({
  "duration": 19177214008,
  "status": "passed"
});
formatter.uri("Search.feature");
formatter.feature({
  "line": 2,
  "name": "Search",
  "description": "",
  "id": "search",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@ios"
    },
    {
      "line": 1,
      "name": "@search"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Verify search is working - one keyword, two keywords",
  "description": "",
  "id": "search;verify-search-is-working---one-keyword,-two-keywords",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I search for \u003ckeyword\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I see post with title \u003cposttitle\u003e in the search results",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I click post with title, \u003cposttitle\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Verify post loads and title is \u003cposttitle\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "search;verify-search-is-working---one-keyword,-two-keywords;",
  "rows": [
    {
      "cells": [
        "keyword",
        "posttitle"
      ],
      "line": 10,
      "id": "search;verify-search-is-working---one-keyword,-two-keywords;;1"
    },
    {
      "cells": [
        "Automation",
        "Google and Facebook are using automation to remove extremist content"
      ],
      "line": 11,
      "id": "search;verify-search-is-working---one-keyword,-two-keywords;;2"
    },
    {
      "cells": [
        "The Two Apples",
        "The Two Apples"
      ],
      "line": 12,
      "id": "search;verify-search-is-working---one-keyword,-two-keywords;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 72595,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Verify search is working - one keyword, two keywords",
  "description": "",
  "id": "search;verify-search-is-working---one-keyword,-two-keywords;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@search"
    },
    {
      "line": 1,
      "name": "@ios"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I search for Automation",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I see post with title Google and Facebook are using automation to remove extremist content in the search results",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I click post with title, Google and Facebook are using automation to remove extremist content",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Verify post loads and title is Google and Facebook are using automation to remove extremist content",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Automation",
      "offset": 13
    }
  ],
  "location": "Search.i_search_for_text(String)"
});
formatter.result({
  "duration": 20051610155,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Google and Facebook are using automation to remove extremist content",
      "offset": 22
    }
  ],
  "location": "Search.i_see_post_with_title_in_the_search_results(String)"
});
formatter.result({
  "duration": 1483388411,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Google and Facebook are using automation to remove extremist content",
      "offset": 25
    }
  ],
  "location": "Search.i_click_the_post_with_title(String)"
});
formatter.result({
  "duration": 4447849733,
  "error_message": "org.openqa.selenium.NoSuchElementException: An element could not be located on the page using the given search parameters. (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 1.42 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b1534ae328c771e0856c93e187490ca824\u0027, time: \u00272016-03-15 10:43:46\u0027\nSystem info: host: \u0027rpalacios-MacBookPro12,1\u0027, ip: \u0027192.168.2.130\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.12.1\u0027, java.version: \u00271.8.0_66\u0027\nDriver info: setUpClasses.App$2\nCapabilities [{app\u003d/Users/rpalacios/Library/Developer/Xcode/DerivedData/iPhoneBI-cujhzgeypvptwgcnxpynvnbdlmld/Build/Products/Debug-iphonesimulator/iPhoneBI.app, networkConnectionEnabled\u003dfalse, noReset\u003dtrue, bundleId\u003dcom.businessinsider.iphone, databaseEnabled\u003dfalse, deviceName\u003diPhone 6, launchTimeout\u003d500000, platform\u003dMAC, showIOSLog\u003dtrue, appium-version\u003d1.0, nativeInstrumentsLib\u003dtrue, desired\u003d{app\u003d/Users/rpalacios/Library/Developer/Xcode/DerivedData/iPhoneBI-cujhzgeypvptwgcnxpynvnbdlmld/Build/Products/Debug-iphonesimulator/iPhoneBI.app, showIOSLog\u003dtrue, appium-version\u003d1.0, noReset\u003dtrue, nativeInstrumentsLib\u003dtrue, newCommandTimeout\u003d250, platformVersion\u003d9.2, bundleId\u003dcom.businessinsider.iphone, platformName\u003diOS, deviceName\u003diPhone 6, launchTimeout\u003d500000}, newCommandTimeout\u003d250, platformVersion\u003d9.2, webStorageEnabled\u003dfalse, locationContextEnabled\u003dfalse, browserName\u003d, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, platformName\u003diOS}]\nSession ID: 0f5a8791-4302-45b1-bcb3-83121244bdd9\n*** Element info: {Using\u003daccessibility id, value\u003dGoogle and Facebook are using automation to remove extremist content}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\n\tat io.appium.java_client.DefaultGenericMobileDriver.execute(DefaultGenericMobileDriver.java:43)\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:1)\n\tat io.appium.java_client.ios.IOSDriver.execute(IOSDriver.java:1)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElementByAccessibilityId(DefaultGenericMobileDriver.java:140)\n\tat io.appium.java_client.AppiumDriver.findElementByAccessibilityId(AppiumDriver.java:1)\n\tat io.appium.java_client.ios.IOSDriver.findElementByAccessibilityId(IOSDriver.java:1)\n\tat pageObjects.RiverFeedObject.clickPost(RiverFeedObject.java:142)\n\tat stepDefinitions.ios.Search.i_click_the_post_with_title(Search.java:40)\n\tat ✽.When I click post with title, Google and Facebook are using automation to remove extremist content(Search.feature:7)\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Google and Facebook are using automation to remove extremist content",
      "offset": 31
    }
  ],
  "location": "Search.verify_post_loads_and_title_is_post_title(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.before({
  "duration": 77187,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Verify search is working - one keyword, two keywords",
  "description": "",
  "id": "search;verify-search-is-working---one-keyword,-two-keywords;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@search"
    },
    {
      "line": 1,
      "name": "@ios"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I search for The Two Apples",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I see post with title The Two Apples in the search results",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I click post with title, The Two Apples",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Verify post loads and title is The Two Apples",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "The Two Apples",
      "offset": 13
    }
  ],
  "location": "Search.i_search_for_text(String)"
});
formatter.result({
  "duration": 1605683394,
  "error_message": "org.openqa.selenium.NoSuchElementException: Can\u0027t locate an element by this strategy: Locator map: \n- native content: \"By.AccessibilityId: searchPostsButton\" \n- html content: \"by id or name \"search\"\"\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b1534ae328c771e0856c93e187490ca824\u0027, time: \u00272016-03-15 10:43:46\u0027\nSystem info: host: \u0027rpalacios-MacBookPro12,1\u0027, ip: \u0027192.168.2.130\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.12.1\u0027, java.version: \u00271.8.0_66\u0027\nDriver info: driver.version: unknown\n\tat io.appium.java_client.pagefactory.AppiumElementLocator.findElement(AppiumElementLocator.java:97)\n\tat io.appium.java_client.pagefactory.interceptors.InterceptorOfASingleElement.intercept(InterceptorOfASingleElement.java:52)\n\tat io.appium.java_client.ios.IOSElement$$EnhancerByCGLIB$$1b1f86e4.click(\u003cgenerated\u003e)\n\tat stepDefinitions.ios.Search.i_search_for_text(Search.java:24)\n\tat ✽.When I search for The Two Apples(Search.feature:5)\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "The Two Apples",
      "offset": 22
    }
  ],
  "location": "Search.i_see_post_with_title_in_the_search_results(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "The Two Apples",
      "offset": 25
    }
  ],
  "location": "Search.i_click_the_post_with_title(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "The Two Apples",
      "offset": 31
    }
  ],
  "location": "Search.verify_post_loads_and_title_is_post_title(String)"
});
formatter.result({
  "status": "skipped"
});
});