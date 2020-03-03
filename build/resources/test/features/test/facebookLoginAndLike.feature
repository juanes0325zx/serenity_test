Feature: createUser

  Scenario Outline: Facebook Login And Like


    Given "<email>" login user "<password>"
    When "<Publication>" publicacion a darle like
    Then  serra sección


    Examples:
      | email                  | password         | Publication      |
      | juanes9444@hotmail.com | 1994juanes | https://www.facebook.com/photo.php?fbid=10219983675638494&set=a.4219660566042&type=3&theater |
