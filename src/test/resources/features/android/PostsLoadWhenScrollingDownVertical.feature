@river

Feature: Posts load when scrolling down a vertical

In order to browse posts in a vertical
As a user
I want more posts to load when I scroll down a vertical

  Scenario Outline: I scroll down a vertical
    Given the first payload of posts display in a vertical
    When I scroll down <total> posts
    Then more than <total> posts are displayed

    @android
    Examples:
      | total |
      | 8     |
