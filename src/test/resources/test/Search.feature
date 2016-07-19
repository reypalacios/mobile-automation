@iOS
Feature: Search

 Scenario Outline: Verify search is working - one keyword, two keywords
  When I search for <text>
  Then I see post with title <posttitle> in the search results
  When I click post with title, <posttitle>
  Then Verify post loads and title is <posttitle>
  Examples:
   | text | posttitle |
   | Automation | Google and Facebook are using automation to remove extremist content |
   | The Two Apples | The Two Apples |

