Feature: Prueba Tecnica
  Scenario Outline: Shopping

    Given the user in <page> o <navigator>
    Then the user search <product> 
    And validate search
    And validate the <car>
    Examples:
      | page | product |navigator| car  | 
      |https://catalog.data.gov/dataset/|electric_car|Chrome|tesla|