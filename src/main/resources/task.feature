@smoke
  Feature: F01_Register
    Scenario: happy scenario
      When user enter first name
      And user enter last name
      And user enter business name
      And user enter email
      And user enter valid result
      And user click submit
      Then user check that successfully registered

