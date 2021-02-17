Feature: Test different forms

  Background:
    Given Navigate to: "http://authenticgoods.co/wrapbootstrap/themes/neuboard-v1.4.3/Angular_full_version/#/forms/components"

  Scenario: I am on basic form
    Then I will enter the text into Email address field "oksanasantalova@gmail.com"
    Then I will enter the text into Password field: "Password"
    Then Attach file: "/Users/ksu/Downloads/NewYorkMap.jpeg"
    Then Press on Submit button







