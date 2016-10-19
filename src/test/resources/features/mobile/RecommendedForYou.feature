@ios @reco
Feature: Recommended For You

 As a user, I want to see recommended posts at the bottom of post pages
 so that I'm encouraged to explore more content in the app.

 Scenario: Verify module is displayed

  Given I am on the post page
  Then River post recommended for you module is displayed

 Scenario: Click each of the five recommendations

  When I click the first river-post recommendation
  Then I am redirected to the post

  When I click the second river-post recommendation
  Then I am redirected to the post

  When I click the third river-post recommendation
  Then I am redirected to the post

  When I click the fourth river-post recommendation
  Then I am redirected to the post

  When I click the fifth river-post recommendation
  Then I am redirected to the post






