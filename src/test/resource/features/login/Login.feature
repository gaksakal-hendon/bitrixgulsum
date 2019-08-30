@VYT-4121
Feature: As user I want to login under different roles
# So hook will take care of this action
#  Hook will open main page
#  Background:
#    Given user is on the landing page


  @helpdesk
  Scenario: Login as a helpdesk
    Given user is on the landing pages
    Then user logs in as a helpdesks
    And user verifies that "Activity Stream" page name is displayeds

@negative
 Scenario: Verify warning message for invalid credentials
  Given  user is on the landing page
  Then  user logs in with "wrong" username and "wrong" password
  And user verifies that "Incorrect login or password" warning message is displayed