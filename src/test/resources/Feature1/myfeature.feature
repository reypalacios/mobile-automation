Feature: Life of king

 Scenario Outline: Eating
    Given There are <start> cucumbers
    When I eat <eat> cucumbers
    Then I should have <left> cucumbers

    Examples:
      | start | eat | left |
      |  14   |  5  |  7   |




