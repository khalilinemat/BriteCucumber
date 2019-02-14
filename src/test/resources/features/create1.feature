
Feature: BriteERP Login Test

  @cucTest
  Scenario: Verify the empty message on login home page

    Given user is on BritERP home page
    When  user clicks on Manufacturing module
    Then user should see new page
    And user should be able to see the empty message