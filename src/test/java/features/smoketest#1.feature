Feature: smoke test #1, go through the service to Yandex-pay-page

  Scenario: go through the service
    Given I open http://riskmarket.ru page
    And I login as feodan@yandex.ru with password roBbfEyB
    And I select countries Шенген, Финляндия, Китай
    And I specify date of journey
    And I specify birthday of tourists 18.06.1984
    When I press Calculate button
    Then I see the Results page

    When I click Buy
    And I fill last TESTOVIY and first TEST names
    And I check Agree
    And I click Submit on Details page
    And I click Submit on Bonus page
    Then url is https://form.payonlinesystem.com/default/draft/form#card
    And Card Number field is enabled
