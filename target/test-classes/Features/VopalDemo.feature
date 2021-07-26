Feature: Demo voor opdracht bij Vopak

  Scenario: Open chrome browser and navigate to Vopak homepage
    Given Chrome browser is open
    When User navigates to Vopak
    Then The Vopak homepage is visible

  Scenario: Verify News page
    Given News tab is visible
    When User clicks on news tab
    Then The news content is visible

  Scenario: Verify security page
    Given Security tab is visible
    When User clicks on security tab
    Then The content of security page is visible

  Scenario: Verify customer page
    Given Customer tab is visible
    When User clicks on customer tab
    Then The content of customer page is visible

  Scenario: Verify transporter page
    Given Transporter tab is visible
    When User clicks on transporter tab
    Then The content of transporter page is visible

  Scenario: Verify about us page
    Given About us tab is visible
    When User clicks on about us tab
    Then The content of about us page is visible

  Scenario: Verify locations page
    Given Locations tab is visible
    When User clicks on locations tab
    Then The content of locations is visible

