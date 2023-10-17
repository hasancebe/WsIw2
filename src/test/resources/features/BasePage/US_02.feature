@wip
Feature: Buttons and links on the home page should redirect to related pages


    Scenario: The What should I watch button should redirect to the main page.

      Given User clicks on the What should I watch button and access the main page.

    Scenario: Login button should open the login page

      Given User clicks the Login button, the login page opens

    Scenario: GetStarted button should open the login page

      Given User clicks the Get started button, the login page opens

    Scenario: GetStarted button at the end of page should open the login page

      Given  User clicks Get started button at end of the page, the login page opens

    Scenario: Contact Us, Privacy Policy and Term Of Use buttons should redirect to the relevant page

      Given User clicks the Contact Us button, the relevant page opens
      And  User clicks the Privacy Policy button, the relevant page opens
      Then  User clicks the Term Of Use button, the relevant page opens