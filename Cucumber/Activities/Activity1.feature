@SmokeTest
  Feature: Opening a WebPage

    Scenario: Opening is searching for something
      Given User is on Google Home Page
      When User types in Cheese and hits ENTER
      And Show how many search results were shown
      And Close the browser

