Feature: Search by keyword

  Scenario: test ejemplo
    Given Sergey ejemplo test
    When el buscan "blid guardian"
    Then validar titulos "cucumber"