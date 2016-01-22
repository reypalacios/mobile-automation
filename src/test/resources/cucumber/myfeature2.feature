Feature: Life of Rey

 Scenario Outline: Drinking
    Given There are <number> drinks
    When I drank <drink> drink
    Then I should have <left> drink

    Examples:
      | number | drink | left |
      |  2     |  1    |  1   |




