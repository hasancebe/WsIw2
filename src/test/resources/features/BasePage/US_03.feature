Feature: Titles, descriptions and images used in site promotion should be visible on the home page


  Scenario: Website promotional texts and images should be visible

    Given Find Your Perfect Movie Match title and alt text should be visible
    And Movies Mirroring Your Emotions title sub-text and related image should be visible
    And Curated Movie Collections title sub-text and related image should be visible
    And Calendar and Watchlist Features title sub-text and related image should be visible
    Then Direct Streaming Links title sub-text and related image should be visible
    And Ready to discover hidden gems that you've never heard of before text should be visible

  Scenario: In the FAQ section, questions should be visible, clickable,
  when clicked, the answer to the relevant question should be visible

    Given User sees answers when clicking on the questions in the FAQ section
