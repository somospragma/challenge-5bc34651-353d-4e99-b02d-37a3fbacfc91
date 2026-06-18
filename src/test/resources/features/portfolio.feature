Feature: Portfolio Management
  Scenario: Create a new portfolio
    Given a user wants to create a new portfolio
    When the user provides a name for the portfolio
    Then the portfolio should be created with the given name
  Scenario: Get all portfolios
    Given a user wants to view all portfolios
    When the user requests all portfolios
    Then the user should see a list of all portfolios