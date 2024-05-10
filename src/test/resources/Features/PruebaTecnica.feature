Feature: Prueba QA
  Scenario Outline: Search car

    Given the user in <page> o <navigator>
    Then the user search <product> 
    And validate search
    And validate the <car>
    Examples:
      | page | product |navigator| car  | 
      |https://catalog.data.gov/dataset/|electric_car|Chrome|tesla|
