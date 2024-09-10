Feature: As a user, I want register in Utest.com to access the content

  @Register
  Scenario Outline: Registrarme en Utest.com
    Given Accedo a la pagina principal de Utest.com
    When completo la informacion del registro con el <nombre>
    Then Valido que logre acceder al contenido de la pagina
    Examples:
      | nombre |
      | Andres |