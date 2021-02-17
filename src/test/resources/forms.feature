Feature: Test different forms

  Background:
    Given Navigate to: "http://authenticgoods.co/wrapbootstrap/themes/neuboard-v1.4.3/Angular_full_version/#/forms/components"

  Scenario: I am on basic form
    Then I will enter the text into Email address field "oksanasantalova@gmail.com"
    Then I will enter the text into Password field: "Password"
    Then Attach file: "/Users/ksu/Downloads/NewYorkMap.jpeg"
    Then Press on Submit button

  Scenario: I am on horizontal form
    Then Fill out email: "oksanasantalova@gmail.com"
    Then Fill out password: "Password"
    Then Click on Sign In

  Scenario: I am on form elements
    Then I enter text: "Oksana"
    Then I enter password: "Password"
    Then I enter placeholder text: "Santalova"





