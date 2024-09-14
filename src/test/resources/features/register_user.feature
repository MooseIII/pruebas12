Feature: As a user, I want register in page orange to access the content

  @Register
  Scenario Outline: Registrarme en pagina de orange
    Given Accedo a la pagina principal de orange
    When completo la informacion del registro con el <nombre>
    Then Valido que logre acceder al contenido de la pagina
    Examples:
      | nombre |
      | Andres |