Feature: Push Permission Request

  As a user, I want to have a more informative push notification request so I can understand what the benefit is for me to enable push for the app.

  Scenario: User opts-in push notifications

    When I open the app for the first time
    Then I see the push permission request screen
    And Two call to actions are available, to opt-in "Enable alerts" and to opt-out "Maybe later"

    When I tap on "Enable alerts"
    Then The 'Push Notifications' Setting in the app is set to ON

  Scenario: User opts-out push notifications

    When I open the app for the first time
    Then I see the push permission request screen
    And Two call to actions are available, to opt-in "Enable alerts" and to opt-out "Maybe later"

    When I tap on "Maybe Later"
    Then The 'Push Notifications' Setting in the app is set to OFF

  Scenario: Push notification setting remains after app upgrade

    When I upgrade my app
    Then I do not see the push permission request screen again

  Scenario: Push notification remains prompting until user either opts-in or opts-out

    When I put the app in the background and re-open it again
    Then I see the push permission request screen

    When I close the app and re-open it
    Then I see the push permission request screen







