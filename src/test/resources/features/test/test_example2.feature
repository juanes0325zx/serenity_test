Feature: Search by keyword

  Scenario: go to youtube
    Given Sergey ejemplo test
    When el buscan "cucumber"
    Then validar titulos "cucumber"