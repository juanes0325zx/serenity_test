Feature: createUser

  Scenario Outline: Facebook Register


    Given "<email>" usuario nuevo con "<password>"
    When "<name>" nombre ,"<lastname>" apellido
    Then  crear el usurio "<phone>"


    Examples:
      | name      | lastname                    | email                  | password         | phone      |
      | ANDRES | MONTOYA                 | AndresR5445655@mailboxt.com | **fghfg5151_M** | 3042016808 |
     