Feature: Home Page Navigation

  @admin
  Scenario: Create group and verify it exists in signup dropdown

    Given the user is logged in as an admin

    When the user navigates to Admin Panel
    And the user opens Groups section
    And the user clicks Create New Group button
    And the user enters group details

    Then the user should see group creation success message

    When the user clicks back to website button

    And the user logs out
    And the user clicks sign up link

    Then the group should exist in dropdown