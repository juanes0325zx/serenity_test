Feature: Search by keyword

  Scenario: Searching on toutube
    Given Sergey ejemplo test
    When el buscan "blid guardian"
    Then all the result titles should contain the word "cucumber"