Feature: Home Page Navigation

  @admin
  Scenario: Navigate to Admin Panel

    Given the user is logged in as an admin
    When the user clicks on the my profile dropdown
    And the user selects "Admin Panel" from the dropdown menu