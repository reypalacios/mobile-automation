@ios @save
Feature: Saved Articles

 As a user, I want to see the saved posts added to the top of the Saved Articles section instead of the bottom
 so I can access more recently saved posts more easily.

 Scenario: I save a post
  When I am on the post page
  Then I save the post

  When I go the the Saved Articles section
  Then Saved post is available

 @androidbug
 Scenario: I delete a post via post page
  When I am on a saved post
  Then I unsave the post



