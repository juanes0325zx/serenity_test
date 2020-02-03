Feature: Search by keyword

  Scenario: login test
    Given Sergey ejemplo test
    When el buscan "cucumber"
    Then validar titulos "cucumber"