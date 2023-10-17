Feature: Buttons and search box on the HomePage should work.
  Background:
   And Login WhatshouldIwatch website

  Scenario: Home, Profile, History, Settings buttons should redirect to the relevant page.

    Given Clicking the Home button opens the home page
    And Clicking the Profile button opens the profile page
    And Clicking the History button opens the history page
    And Clicking the Settings button opens the settings page
    And Clicking the logout button opens the base page

  Scenario: Search button on the page should be textable and the search icon should work.

    Given User enters a phrase in the search box

  Scenario: Magic Wand button should be clickable
  and user should be able to see recommendation sentences

    Given User clicks Magic Wand button
    And User sees a suggestion sentence for search

