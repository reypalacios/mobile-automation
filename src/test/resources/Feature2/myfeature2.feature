Feature: Life of Rey

 Scenario Outline: Drinking
    Given There are <number> drinks
    When I drank <drink> cucumbers
    Then I should have <left> cucumbers

    Examples:
      | number | drink | left |
      |  14   |  5  |  7   |




