Feature: Life of Rey

 Scenario Outline: Drinking
    Given There are <start> cucumbers
    When I drank <drink> drink
    Then I should have <left> drink

    Examples:
      | start | drink | left |
      |  2     |  1    |  1   |




