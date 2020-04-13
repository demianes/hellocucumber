Feature: What the?
  Everybody wants to know when it's Friday

  @First
  Scenario: Sunday isn't Friday
    Given today is Sunday
    When I ask whether it's Friday yet
    Then I should be told "Nope"

  @Second
  Scenario: Monday is Monday
    Given today is Monday
    When I ask whether it's Monday yet
    Then I should be told "Yes"