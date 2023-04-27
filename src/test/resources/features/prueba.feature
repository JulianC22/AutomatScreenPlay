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

    @TheExpensive
    Scenario: Select the most expensive subscription from a pricing table
      Given that Catalina want to buy the most expensive subscription
      When she enters in Pricing Table menu to select her expensive purchase
      Then she selects Ultra Subscription

    @TheCheapest
    Scenario: Select the cheapest subscription from a pricing table
      Given that Catalina want to buy the cheapest subscription
      When she enters in Pricing Table menu to select her cheapest purchase
      Then she selects Starter Subscription

    @FillTheForm
    Scenario: Fill the Masket Inputs Form
      Given that Catalina must to Fill her personal data in a form
      When she enters her personal data in the form
      Then she gives click in minimize button

