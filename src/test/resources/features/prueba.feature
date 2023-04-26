#Autor: Julián Andrés Cuéllar Tovar
#language: en

  @UserStory1
  Feature: Verify correct login into the app XYZ
    As a user, I want to enter XYZ to verify my correct access

  @LoginCase
  Scenario: Verify correct login
    Given that Catalina enters the XYZ app
    When she enters her credentials to enters the app
      | user | password |
      | Catalina | cAtA975# |
      # | ManuelF | Manu123* |
    Then verify that she was able to log in correctly