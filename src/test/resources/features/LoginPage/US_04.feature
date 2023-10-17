Feature: User should be able to log in with the registration options directed to the site.


  Scenario: Text 'Join the limitless world of movies and TV shows.' should be
  visible on the login page.

    Given User sees login text in login table

  Scenario: Google button should redirect to the relevant login page.

    Given When User clicks Google button, it opens login page with google account


  Scenario:  Twitter button should redirect to the relevant login page.

    Given When User clicks Twitter button, it opens login page with twitter account

  Scenario:  Discord button should redirect to the relevant login page.

    Given When User clicks Discord button, it opens login page with discord account

  Scenario:  Email button should redirect to the relevant login page.

    Given When User clicks Email button, it opens login page with email
    And User enter a valid email in sendbox and click to  Enter the world of movies button
    Then User sees Check your email text

