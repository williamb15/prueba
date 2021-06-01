Feature: Consultar saldo en porvenir
  Yo como usuario de porvenir
  necesito consultar mi saldo
  Para realizar transacciones

  Scenario: Consultar Saldo
    Given el usuario se autentica en el canal
      | username   | password    |
      | williamb21 | Pragma2021+ |
    When el usuario consulta el saldo
    Then el podra ver su saldo disponible $ 0.01
